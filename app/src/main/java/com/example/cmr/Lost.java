package com.example.cmr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lost extends AppCompatActivity {
    Button lost;
    Button found;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost);
        lost=(Button)findViewById(R.id.lostBtn);
        found=(Button) findViewById(R.id.fouBtn);
        lost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lostintent= new Intent(Lost.this, item_lost.class);
                startActivity(lostintent);
            }
        });
        found.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foundintent= new Intent(Lost.this, item_found.class);
                startActivity(foundintent);

            }
        });
    }
}
