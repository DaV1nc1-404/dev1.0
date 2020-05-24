package com.example.cmr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.example.cmr.R.*;

public class Home extends AppCompatActivity {
   GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_home);
        mainGrid= (GridLayout)findViewById(id.mainGrid);
        setEvent(mainGrid);

    }
    public void setEvent(GridLayout mainGrid){
        for (int i =0; i< mainGrid.getChildCount(); i++){
            CardView cardview=(CardView)mainGrid.getChildAt(i);
            final int fin =i;
            cardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (fin==0){
                        Intent prof =new Intent(Home.this, profile.class);
                        startActivity(prof);
                    }
                    else if (fin==1){
                        Intent  eve =new Intent(Home.this, Events.class);
                        startActivity(eve);
                    }
                    else if (fin==2){
                        Intent lost =new Intent(Home.this, Lost.class);
                        startActivity(lost);
                    }
                   else if (fin==3){
                        Intent food =new Intent(Home.this, Food_Final.class);
                        startActivity(food);
                    }
                   else if (fin==4){
                        Intent comp =new Intent(Home.this, Complains.class);
                        startActivity(comp);
                    }
                  else if (fin==5){
                        Intent cont =new Intent(Home.this, Contact.class);
                        startActivity(cont);
                    }
                    else if (fin==6){
                        Intent cont =new Intent(Home.this, Contact.class);
                        startActivity(cont);
                    }
                    else if (fin==7){
                        Intent cont =new Intent(Home.this, Contact.class);
                        startActivity(cont);
                    }
                    else if (fin==8){
                        Intent cont =new Intent(Home.this, Contact.class);
                        startActivity(cont);
                    }
                    else if (fin==9){
                        Intent cont =new Intent(Home.this, Contact.class);
                        startActivity(cont);
                    }
                }
            });
        }
    }

}
