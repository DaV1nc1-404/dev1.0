package com.example.cmr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class Food_Final extends AppCompatActivity {
    GridLayout mainGrid;
    String item;
    Dialog mydilog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen);
        mydilog=new Dialog(Food_Final.this);
        mainGrid= (GridLayout)findViewById(R.id.mainGrid);
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

                        int price =20;
                       


                    }
                    else if (fin==1){
                        int price =20;
                        
                    }
                    else if (fin==2){
                        int price =20;
                       


                    }
                    else if (fin==3){
                        int price =20;
                       


                    }
                    else if (fin==4){
                        int price =20;
                        


                    }

                    else if (fin==5){
                        int price =20;
                       


                    }

                    else if (fin==6) {
                        int price = 20;
                        


                    }
                    else if (fin==7){
                        int price =20;
                        


                    }

                    else if (fin==8){
                        int price =20;
                        


                    }

                    else if (fin==9){
                        int price =20;
                        


                    }


                }
            });
        }
    }

}
