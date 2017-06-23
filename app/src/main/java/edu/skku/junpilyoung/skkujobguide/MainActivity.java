package edu.skku.junpilyoung.skkujobguide;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    public class MyTimeTask extends TimerTask {
        @Override
        public void run() {
            goIndex(1);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timer t = new Timer(true);
        TimerTask task1 = new MyTimeTask();
        t.schedule(task1,2000);
    }

    public void goCertificate(int x){
        Intent i = new Intent(getApplicationContext(), CertificateActivity.class);
        startActivity(i);
    }

    public void goIndex(int x){
        Intent i = new Intent(getApplicationContext(), IndexActivity.class);
        startActivity(i);
    }
}