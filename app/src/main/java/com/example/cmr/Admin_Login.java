package com.example.cmr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Admin_Login extends AppCompatActivity {
  String admun;
  String admPass;
  private EditText textadmun;
  private EditText textadmpass;
  Button admsiup;
  int c=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin__login);
    textadmun=(EditText)findViewById(R.id.admUn);
    textadmpass=(EditText)findViewById(R.id.admPass);
    admsiup=(Button)findViewById(R.id.admSi);
    admsiup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            admun=textadmun.getText().toString();
            admPass=textadmpass.getText().toString();
            Intent admsin= new Intent(Admin_Login.this,Admin_home.class);
            if((admun.equals("admin")) && (admPass.equals("admin"))){
                Toast.makeText(Admin_Login.this, "Login Success", Toast.LENGTH_SHORT).show();
                startActivity(admsin);
            }
            else{
                c--;
                if(c==0){
                    Toast.makeText(Admin_Login.this, "you have eached max no of attempts!", Toast.LENGTH_SHORT).show();
                    Intent backint=new Intent(Admin_Login.this, MainActivity.class);
                    startActivity(backint);
                }
            }
        }
    });


}
}
