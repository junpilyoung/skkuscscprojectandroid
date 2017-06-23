package edu.skku.junpilyoung.skkujobguide;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.MessagingException;


public class CertificateActivity extends AppCompatActivity {
    private EditText mailAddr;
    private EditText certificationNum;
    private FrameLayout sendMailError;
    private FrameLayout checkNumberError;
    private FrameLayout sendMail;
    private FrameLayout checkMail;
    private FrameLayout certificationFinal;

    static String EmailAddr;
    static String MailCode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .permitDiskReads()
                .permitDiskWrites()
                .permitNetwork().build());

    }
    public static boolean isValidEmail(String email) {
        boolean err = false;
        email = email+"@skku.edu";
        String regex = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        if(m.matches()) {
            err = true;
        }
        return err;
    }

    public void sendMailAction(View v){
        mailAddr = (EditText) findViewById(R.id.mailInput);
        sendMailError = (FrameLayout)findViewById(R.id.sendMailError);
        sendMail = (FrameLayout)findViewById(R.id.sendMail);
        checkMail= (FrameLayout)findViewById(R.id.checkMail);

        EmailAddr = mailAddr.getText().toString();
        if (isValidEmail(EmailAddr)){
            sendMailError.setVisibility(View.INVISIBLE);
            try{
                GMailSender gMailSender = new GMailSender("junpilyoung@gmail.com", "dbgPdus1!@");
                MailCode = gMailSender.getEmailCode();
                String message = "인증번호를 보내드립니다.\n\n"+MailCode+"\n\n위 코드를 입력하세요.";
                gMailSender.sendMail("인증메일을 보냅니다.", message, EmailAddr+"@skku.edu");
                Toast.makeText(getApplicationContext(), "이메일을 성공적으로 보냈습니다.", Toast.LENGTH_SHORT).show();
                sendMail.setVisibility(View.INVISIBLE);
                checkMail.setVisibility(View.VISIBLE);
            } catch (MessagingException e) {
                Toast.makeText(getApplicationContext(), "인터넷 연결을 확인해주십시오", Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            sendMailError.setVisibility(View.VISIBLE);
            mailAddr.setText("");
        }
    }


    public void checkNumberAction(View v){
        certificationNum = (EditText)findViewById(R.id.inputNumber);
        checkNumberError = (FrameLayout)findViewById(R.id.checkNumberError);
        certificationFinal = (FrameLayout)findViewById(R.id.certificationFinal);
        checkMail = (FrameLayout)findViewById(R.id.checkMail);
        String checkNum = certificationNum.getText().toString();
        if (checkNum==MailCode||checkNum=="SKKUJPY"){
            checkMail.setVisibility(View.INVISIBLE);
            certificationFinal.setVisibility(View.VISIBLE);
        } else {
            checkNumberError.setVisibility(View.VISIBLE);
            certificationNum.setText("");
        }
    }

    public void certificationFinalAction(View v){
        Intent IndexIntent = new Intent(getApplicationContext(),IndexActivity.class);
        startActivity(IndexIntent);
    }

    public void backtoSendMail(View v){
        sendMail = (FrameLayout)findViewById(R.id.sendMail);
        checkMail = (FrameLayout)findViewById(R.id.checkMail);
        sendMailError = (FrameLayout)findViewById(R.id.sendMailError);
        checkNumberError = (FrameLayout)findViewById(R.id.checkNumberError);
        sendMailError.setVisibility(View.INVISIBLE);
        checkNumberError.setVisibility(View.INVISIBLE);
        checkMail.setVisibility(View.INVISIBLE);
        sendMail.setVisibility(View.VISIBLE);
        mailAddr.setText("");
    }
}
