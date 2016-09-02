package com.tutor93.geekfarm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by indra on 02/09/2016.
 */
public class ImageActivity extends AppCompatActivity {

    int currentImage = 0;
    int[] images = {R.drawable.images, R.drawable.images2, R.drawable.images3};
    ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        Button btnBack = (Button) findViewById(R.id.btnBack);
        Button btnNext = (Button) findViewById(R.id.btnNext);
        imageView = (ImageView) findViewById(R.id.imageView);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentImage == 0 ){
                    currentImage = images.length;
                }else{
                    currentImage--;
                }
                currentImage = currentImage % images.length;
                imageView.setImageResource(images[currentImage]);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentImage++;
                currentImage = currentImage % images.length;
                imageView.setImageResource(images[currentImage]);
            }
        });



    }
}
