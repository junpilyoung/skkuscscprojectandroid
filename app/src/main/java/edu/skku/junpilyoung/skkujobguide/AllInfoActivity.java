package edu.skku.junpilyoung.skkujobguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class AllInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_info);
    }

    public void goInfo(int x){
        Toast.makeText(getApplicationContext(), "준비중입니다.", Toast.LENGTH_SHORT).show();
    }
}
