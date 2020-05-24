package com.example.cmr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button hsu;
    private EditText lgem;
    private EditText lgpass;
    private TextView info;
    private Button login;
    private Button admlog;
    private int  c=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lgem= (EditText) findViewById(R.id.admUn);
        lgpass= (EditText) findViewById(R.id.admPass);
        login =(Button) findViewById(R.id.mbtn);
        admlog= (Button) findViewById(R.id.admSi);
       admlog.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent admsin=new Intent(MainActivity.this,Admin_Login.class);
               startActivity(admsin);
           }
       });

        hsu=(Button)findViewById(R.id.hSu);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(lgem.getText().toString(), lgpass.getText().toString());
            }
        });
     hsu.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent sup= new Intent(MainActivity.this, RegActivity.class);
             startActivity(sup);
         }
     });
    }
    public void check( String uname, String pass){
        if((uname.equals("user")) && (pass.equals("user123"))){
            Intent hp= new Intent(MainActivity.this, Home.class);
            Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();
            startActivity(hp);
        }
        else{
            c--;
            info.setText("Attempts Remaining" + String.valueOf(c));
            if(c==0){
                Toast.makeText(this, "You've exceeds no of attempts", Toast.LENGTH_SHORT).show();
                login.setEnabled(false);
            }
        }
    }
}
