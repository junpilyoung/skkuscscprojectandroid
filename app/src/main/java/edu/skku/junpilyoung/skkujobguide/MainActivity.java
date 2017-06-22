package edu.skku.junpilyoung.skkujobguide;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goIndex();
    }

    public void goCertificate(){
        Intent i = new Intent(getApplicationContext(), CertificateActivity.class);
        startActivity(i);
    }

    public void goIndex(){
        Intent i = new Intent(getApplicationContext(), IndexActivity.class);
        startActivity(i);
    }
}