package edu.skku.junpilyoung.skkujobguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logo = new ImageView(this);
        logo.setImageResource(R.drawable.logo);
        setContentView(logo);
        ImageView back0 = new ImageView(this);
        back0.setImageResource(R.drawable.back_0);
        setContentView(back0);
    }

    public void onButton1Clicked(View v){
        Toast.makeText(getApplicationContext(),"시작 버튼이 눌림",Toast.LENGTH_LONG).show();
    }
    public void onButton3Clicked(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(i);
    }
    public void onButton2Clicked(View v){
        Intent i = new Intent(getApplicationContext(),MenuActivity.class);
        startActivity(i);
    }

    public void onButton4Clicked(View v){
        Intent i = new Intent(getApplicationContext(),IntroActivity.class);
        startActivity(i);
    }

}
