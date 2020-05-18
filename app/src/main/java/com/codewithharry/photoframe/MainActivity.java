package com.codewithharry.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
//    char i='a';
int tap = 4;
    public void nextImage(View view){
        tap++;
        ImageView img = findViewById(R.id.imageView);
        // int tap = Integer.parseInt(img.getTag().toString());
        if(tap == 1){
            img.setImageResource(R.drawable.a);
        }else if(tap == 2){
            img.setImageResource(R.drawable.b);
        }else if(tap == 3){
            img.setImageResource(R.drawable.c);
        }else if(tap == 4){
            img.setImageResource(R.drawable.d);
        }else if(tap == 5){
            img.setImageResource(R.drawable.e);
        }
        else{
            img.setImageResource(R.drawable.a);
            tap=1;
        }
    }
    public void previousImage(View view){
        tap--;
        ImageView img = findViewById(R.id.imageView);
        // int tap = Integer.parseInt(img.getTag().toString());
        if(tap == 5){
            img.setImageResource(R.drawable.e);
        }else if(tap == 4){
            img.setImageResource(R.drawable.d);
        }else if(tap == 3){
            img.setImageResource(R.drawable.c);
        }else if(tap == 2){
            img.setImageResource(R.drawable.b);
        }else if(tap == 1){
            img.setImageResource(R.drawable.a);
        }
        else{
            img.setImageResource(R.drawable.e);
            tap=5;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

