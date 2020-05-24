package com.example.cmr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Complains extends AppCompatActivity {
    String complaint;
    String comDom;
    int c=1;
 Button compBtn;
 EditText comDomain;
 EditText comDescrp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complains);

        compBtn=(Button)findViewById(R.id.comBtn);
        comDomain=(EditText)findViewById(R.id.comDomain);
        comDescrp=(EditText)findViewById(R.id.comDescrp);
        compBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(c==1){
                    Toast.makeText(Complains.this, "Thanks!,your complain has been recieved!", Toast.LENGTH_SHORT).show();
                    complaint= comDescrp.getText().toString();
                    comDom=comDomain.getText().toString();
                    c=c+1;
                }
                else if(c>1){
                    Toast.makeText(Complains.this, "youve reached maximum limit", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
