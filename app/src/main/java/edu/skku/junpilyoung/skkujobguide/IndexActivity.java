package edu.skku.junpilyoung.skkujobguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

    public void onBackButtonClick(View v){
        Intent backIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:00"));
        startActivity(backIntent);
    }

    public void onHomeButtonClick(View v){
        Intent homeIntent = new Intent(getApplicationContext(),IndexActivity.class);
        startActivity(homeIntent);
    }

}
