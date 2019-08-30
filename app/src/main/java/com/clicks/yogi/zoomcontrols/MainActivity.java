package com.clicks.yogi.zoomcontrols;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    ZoomControls zoomControls;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zoomControls = findViewById(R.id.zoom);
        img = findViewById(R.id.img);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                // calculate scale x and y value of ImageView...
                float x = img.getScaleX();
                float y = img.getScaleY();

                // set scale x and y...
                img.setScaleX((x + 1));
                img.setScaleY((y + 1));

                Toast toast = Toast.makeText(getApplicationContext(),
                        "Zoom in...",Toast.LENGTH_SHORT);

                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();

            }
        });


        zoomControls.setOnZoomOutClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                // calculate scale x and y value of ImageView
                float x = img.getScaleX();
                float y = img.getScaleY();

                // set scale x and y...
                img.setScaleX((x - 1));
                img.setScaleY((y - 1));

                Toast toast =Toast.makeText(getApplicationContext(),
                        "Zoom out...",Toast.LENGTH_SHORT);

                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();

            }
        });

    }
}