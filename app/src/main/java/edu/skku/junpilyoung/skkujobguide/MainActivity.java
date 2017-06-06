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
}