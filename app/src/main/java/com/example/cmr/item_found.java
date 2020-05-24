package com.example.cmr;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class item_found extends AppCompatActivity {
    private static final int PERMISSION_CODE = 1000;
     Button found;
     Button pick;
     ImageView image;
     Uri image_uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_found);
        found=(Button)findViewById(R.id.lostReportbtn);
        pick=(Button)findViewById(R.id.imgBtn);
        image=(ImageView)findViewById(R.id.imgFou);
        found.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(item_found.this, "Report has been submitted!", Toast.LENGTH_SHORT).show();
            }
        });
        pick.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED || checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {

                        String[] permission = {Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE};
                        requestPermissions(permission, PERMISSION_CODE);
                    }
                    else{

                        ContentValues values=new ContentValues();
                        values.put(MediaStore.Images.Media.TITLE,"New Image");
                        values.put(MediaStore.Images.Media.DESCRIPTION,"Freom the camera");
                        image_uri=getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,values);
                        Intent cameraopen =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                        cameraopen.putExtra(MediaStore.EXTRA_OUTPUT, image_uri);
                    }
                }
                else{

                }

                image.setImageURI(image_uri);

            }


            }
        });

    }
    private openCamera(){

    }


}
