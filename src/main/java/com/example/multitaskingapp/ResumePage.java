package com.example.multitaskingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResumePage extends AppCompatActivity {

    TextView PName,PPhone,PEmail,PAddress,PLinkedinID,PGithubID,PPostGradYear,PSchool,PGraduationYear,PCollage,PExperience,PSkill1,PSkill2,PSkill3,PProject1,PProject2,PLanguages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume_page);

        PName =findViewById(R.id.PName);
        PAddress=findViewById(R.id.PAddress);
        PPhone =findViewById(R.id.PPhone);
        PEmail=findViewById(R.id.PEmail);
        PLinkedinID=findViewById(R.id.PLinkedinID);
        PGithubID=findViewById(R.id.PGithubID);
        PPostGradYear=findViewById(R.id.PPostGradYear);
        PSchool=findViewById(R.id.PSchool);
        PGraduationYear=findViewById(R.id.PGraduationYear);
        PCollage=findViewById(R.id.PCollage);
        PExperience=findViewById(R.id.PExperience);
        PSkill1=findViewById(R.id.PSkill1);
        PSkill2=findViewById(R.id.PSkill2);
        PSkill3=findViewById(R.id.PSkill3);
        PProject1=findViewById(R.id.PProject1);
        PProject2=findViewById(R.id.PProject2);
        PLanguages=findViewById(R.id.PLanguages);




        String name = getIntent().getStringExtra("userName");
        String address = getIntent().getStringExtra("userAddress");
        String phone = getIntent().getStringExtra("userPhone");
        String email = getIntent().getStringExtra("userEmail");
        String linkedinID = getIntent().getStringExtra("userLinkedinId");
        String githubID = getIntent().getStringExtra("userGithubID");
        String postGradYear = getIntent().getStringExtra("userPostGradYear");
        String school = getIntent().getStringExtra("userSchool");
        String graduationYear = getIntent().getStringExtra("userGraduationYear");
        String collage = getIntent().getStringExtra("userCollage");
        String experience = getIntent().getStringExtra("userExperience");
        String skill1 = getIntent().getStringExtra("userSkill1");
        String skill2 = getIntent().getStringExtra("userSkill2");
        String skill3 = getIntent().getStringExtra("userSkill3");
        String project1 = getIntent().getStringExtra("userProject1");
        String project2 = getIntent().getStringExtra("userProject2");
        String languages = getIntent().getStringExtra("userLanguage");






        PName.setText(name);
        PPhone.setText(phone);
        PEmail.setText(email);
        PAddress.setText(address);
        PLinkedinID.setText(linkedinID);
        PGithubID.setText(githubID);
        PPostGradYear.setText(postGradYear);
        PSchool.setText(school);
        PGraduationYear.setText(graduationYear);
        PCollage.setText(collage);
        PLanguages.setText(experience);
        PSkill1.setText(skill1);
        PSkill2.setText(skill2);
        PSkill3.setText(skill3);
        PProject1.setText(project1);
        PProject2.setText(project2);
        PLanguages.setText(languages);
        PExperience.setText(experience);

    }
}