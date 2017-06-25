package edu.skku.junpilyoung.skkujobguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.LinearLayout;

public class IndexActivity extends AppCompatActivity {
    private LinearLayout SessionView;
    private LinearLayout RecrutingView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        Spinner dropdown1 = (Spinner)findViewById(R.id.SelectDivision);
        String[] items1 = new String[]{"전체", "리크루팅", "채용설명회"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        dropdown1.setAdapter(adapter1);

        Spinner dropdown2 = (Spinner)findViewById(R.id.SelectCampus);
        String[] items2 = new String[]{"캠퍼스전체", "인사캠", "자과캠"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        dropdown1.setAdapter(adapter2);

        Spinner dropdown3 = (Spinner)findViewById(R.id.SelectSearch);
        String[] items3 = new String[]{"기업명+제목", "기업명", "제목"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items3);
        dropdown1.setAdapter(adapter3);


    }

    public void onHomeButtonClick(View v){
        Intent homeIntent = new Intent(getApplicationContext(),IndexActivity.class);
        startActivity(homeIntent);
    }

    public void goContact(View v){
        Intent ContactIntent = new Intent(getApplicationContext(),ContactActivity.class);
        startActivity(ContactIntent);
    }

    public void SearchAction(View v){
        Intent ContactIntent = new Intent(getApplicationContext(),ContactActivity.class);
        startActivity(ContactIntent);
    }

    public void goRecruting(View v){
        SessionView = (LinearLayout)findViewById(R.id.SessionList);
        RecrutingView = (LinearLayout)findViewById(R.id.RecrutingList);
        SessionView.setVisibility(View.INVISIBLE);
        RecrutingView.setVisibility(View.VISIBLE);
    }

    public void goSession(View v){
        SessionView = (LinearLayout)findViewById(R.id.SessionList);
        RecrutingView = (LinearLayout)findViewById(R.id.RecrutingList);
        SessionView.setVisibility(View.VISIBLE);
        RecrutingView.setVisibility(View.INVISIBLE);
    }

    public void viewMore1(View v){
        Intent InfoIntent = new Intent(getApplicationContext(),AllInfoActivity.class);
        startActivity(InfoIntent);
    }
}
