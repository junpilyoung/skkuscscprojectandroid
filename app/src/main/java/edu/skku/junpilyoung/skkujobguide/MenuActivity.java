package edu.skku.junpilyoung.skkujobguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onBackClick(View v){
        Toast.makeText(getApplicationContext(),"돌아가기",Toast.LENGTH_LONG).show();
        finish();
    }
}
