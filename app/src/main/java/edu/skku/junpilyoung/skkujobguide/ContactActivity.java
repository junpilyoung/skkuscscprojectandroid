package edu.skku.junpilyoung.skkujobguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;


import com.google.firebase.auth.FirebaseAuth;

public class ContactActivity extends AppCompatActivity {
    private FrameLayout SuwonView;
    private FrameLayout SeoulView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

    public void goSeoluMap(View v){
        SuwonView = (FrameLayout)findViewById(R.id.SuwonCampus);
        SeoulView = (FrameLayout)findViewById(R.id.SeoulCampus);
        SuwonView.setVisibility(View.INVISIBLE);
        SeoulView.setVisibility(View.VISIBLE);
    }

    public void goSuwonMap(View v){
        SuwonView = (FrameLayout)findViewById(R.id.SuwonCampus);
        SeoulView = (FrameLayout)findViewById(R.id.SeoulCampus);
        SuwonView.setVisibility(View.VISIBLE);
        SeoulView.setVisibility(View.INVISIBLE);
    }
}
