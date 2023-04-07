package com.example.multitaskingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectTaskPage extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_task_page2);

        button=(Button) findViewById(R.id.resumeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openResumeDetailsPage();
            }
        });

    }
    public void openResumeDetailsPage(){
        Intent intent= new Intent(this,ResumeDetailsPage.class);
        startActivity(intent);
    }
    }
