package com.example.imdad;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login_page extends AppCompatActivity {
     Button signup;
    TextView email;
 TextView password;
 Button SignUp;

    private String getColoredSpanned(String text, String color) {
        return "<font color=" + color + ">" + text + "</font>";
    }
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        signup=findViewById(R.id.signup);
        SignUp=findViewById(R.id.SignUp);
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Login_page.this,login_user.class);
                startActivity(intent);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login_page.this,Home_page.class);
                startActivity(intent);
            }
        });
        email=findViewById(R.id.textView4);
        password=findViewById(R.id.password);
        String mail=getColoredSpanned("Email","#2a2a2a");
        String as=getColoredSpanned("*","#E24B4B");
        email.setText(Html.fromHtml(mail+as));
        mail=getColoredSpanned("Password","#2a2a2a");
        as=getColoredSpanned("*","#E24B4B");
        password.setText(Html.fromHtml(mail+as));

    }
}