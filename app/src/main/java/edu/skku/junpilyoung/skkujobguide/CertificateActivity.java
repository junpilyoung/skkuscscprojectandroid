package edu.skku.junpilyoung.skkujobguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CertificateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);
    }

    public void certificateAction(){
        Intent ContactIntent = new Intent(getApplicationContext(),ContactActivity.class);
        startActivity(ContactIntent);
    }
}
