package com.example.apptonghop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button login;
    Button ql;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        login = (Button) findViewById(R.id.login1);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListMusic();
            }
        });

        ql=(Button) findViewById(R.id.ql_s_up);
        ql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUp();
            }
        });


    }

        public void openListMusic() {
            Intent it=new Intent(Login.this,ListMusic.class);
            startActivity(it);
        }
    public void openSignUp() {
        Intent ql=new Intent(Login.this,SignUp.class);
        startActivity(ql);
    }



}
