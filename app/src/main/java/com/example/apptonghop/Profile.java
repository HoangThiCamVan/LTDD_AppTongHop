package com.example.apptonghop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {
    Button btLogout;
    Button ql_music;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        btLogout=(Button)findViewById(R.id.btLogout);
        btLogout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               openLogin();
            }
        });

        ql_music=(Button)findViewById(R.id.ql_music);
        ql_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListMusic();
            }
        });
    }
    public void openLogin(){
        Intent it=new Intent(Profile.this,Login.class);
        startActivity(it);
    }
    public void openListMusic(){
        Intent it=new Intent(Profile.this,ListMusic.class);
        startActivity(it);
    }
}
