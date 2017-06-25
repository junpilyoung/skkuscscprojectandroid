package edu.skku.junpilyoung.skkujobguide;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    public class MyTimeTask extends TimerTask {
        @Override
        public void run() {
            goNext(1);
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

    public void goNext(int x){
        if (x==0){
            Intent i = new Intent(getApplicationContext(), CertificateActivity.class);
        } else {
            Intent i = new Intent(getApplicationContext(), IndexActivity.class);
        }
        startActivity(i);
    }

}