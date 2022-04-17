package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView btnCata ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCata = findViewById(R.id.btnCata);

    }
    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(R.id.btnCata == id){
            Intent textSwitcherActivity = new Intent(this, catagory.class);
            startActivity(textSwitcherActivity);
        }

    }
}
