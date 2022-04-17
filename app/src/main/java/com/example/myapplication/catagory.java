package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class catagory extends AppCompatActivity implements View.OnClickListener {
   TextView btnChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagory);

        btnChange = findViewById(R.id.btnChange);
    }
    @Override
    public void onClick(View v) {
        int id = v.getId();

        if(R.id.btnChange == id){
            Intent textSwitcherActivity = new Intent(this, lession.class);
            startActivity(textSwitcherActivity);
        }

    }

}

