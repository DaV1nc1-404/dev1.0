package com.example.cmr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class item_lost extends AppCompatActivity {
  Button lost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_lost);
        lost=(Button)findViewById(R.id.lostReportbtn);
        lost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(item_lost.this, "your Report has been submitted!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
