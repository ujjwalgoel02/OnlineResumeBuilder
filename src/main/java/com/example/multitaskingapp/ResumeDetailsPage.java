package com.example.multitaskingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ResumeDetailsPage extends AppCompatActivity {
    private Button button;
    private EditText name,email,phone,linkedinId,address,experience,postGradYear,school,graduationYear,collage,language,skill1,skill2,skill3,project1,project2,githubId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume_details_page);

        button=(Button) findViewById(R.id.CreateResumeButton);
        name=findViewById(R.id.nameInput);
        email=findViewById(R.id.emailInput);
        phone=findViewById(R.id.phoneInput);
        linkedinId=findViewById(R.id.linkedinInput);
        address=findViewById(R.id.addressInput);
        experience=findViewById(R.id.experienceInput);
        postGradYear=findViewById(R.id.postGradInput);
        school=findViewById(R.id.schoolInput);
        graduationYear=findViewById(R.id.gradutionInput);
        collage=findViewById(R.id.collageInput);
        language=findViewById(R.id.languagesInput);
        skill1=findViewById(R.id.skill1Input);
        skill2=findViewById(R.id.skill2Input);
        skill3=findViewById(R.id.skill3Input);
        project1=findViewById(R.id.project1Input);
        project2=findViewById(R.id.project2Input);
        githubId=findViewById(R.id.githubInput);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userName=name.getText().toString();
                String userEmail=email.getText().toString();
                String userPhone=phone.getText().toString();
                String userLinkedinId=linkedinId.getText().toString();
                String userAddress=address.getText().toString();
                String userExperience=experience.getText().toString();
                String userPostGradYear=postGradYear.getText().toString();
                String userSchool=school.getText().toString();
                String userGraduationYear=graduationYear.getText().toString();
                String UserCollage=collage.getText().toString();
                String userLanguage=language.getText().toString();
                String userSkill1=skill1.getText().toString();
                String userSkill2=skill2.getText().toString();
                String userSkill3=skill3.getText().toString();
                String userProject1=project1.getText().toString();
                String userProject2=project2.getText().toString();
                String userGithub=githubId.getText().toString();



                Intent intent = new Intent(ResumeDetailsPage.this,ResumePage.class);

                intent.putExtra("userName",userName);
                intent.putExtra("userEmail",userEmail);
                intent.putExtra("userPhone",userPhone);
                intent.putExtra("userLinkedinId",userLinkedinId);
                intent.putExtra("userAddress",userAddress);
                intent.putExtra("userExperience",userExperience);
                intent.putExtra("userPostGradYear",userPostGradYear);
                intent.putExtra("userSchool",userSchool);
                intent.putExtra("userGraduationYear",userGraduationYear);
                intent.putExtra("userCollage",UserCollage);
                intent.putExtra("userLanguage",userLanguage);
                intent.putExtra("userSkill1",userSkill1);
                intent.putExtra("userSkill2",userSkill2);
                intent.putExtra("userSkill3",userSkill3);
                intent.putExtra("userProject1",userProject1);
                intent.putExtra("userProject2",userProject2);
                intent.putExtra("userGithubID",userGithub);

                startActivity(intent);

            }
        });

    }
    }

