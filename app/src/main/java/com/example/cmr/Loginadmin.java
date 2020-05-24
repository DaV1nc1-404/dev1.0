package com.example.cmr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Loginadmin extends AppCompatActivity {
    String admun;
    String admPass;
    int c=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final EditText textadmun=(EditText)findViewById(R.id.admUn);
        final EditText textadmpass=(EditText)findViewById(R.id.admPass);
        Button admsi= (Button)findViewById(R.id.admSi);
        admsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                admun=textadmun.getText().toString();
                admPass=textadmpass.getText().toString();
                Intent admsin= new Intent(Loginadmin.this,Admin_home.class);
                if((admun.equals("admin")) && (admPass.equals("admin"))){
                    Toast.makeText(Loginadmin.this, "Login Success", Toast.LENGTH_SHORT).show();
                    startActivity(admsin);
                }
                else{
                    c--;
                    if(c==0){
                        Toast.makeText(Loginadmin.this, "you have eached max no of attempts!", Toast.LENGTH_SHORT).show();
                        Intent backint=new Intent(Loginadmin.this, MainActivity.class);
                        startActivity(backint);
                    }
                }
            }
        });
        setContentView(R.layout.activity_loginadmin);
    }
}
