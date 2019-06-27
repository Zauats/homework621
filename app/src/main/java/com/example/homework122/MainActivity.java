package com.example.homework122;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.imageName);
    }

    public void nextClick(View view){
        Integer randNum = rand.nextInt(100);
        text.setText("image" + randNum);
        Intent intent = new Intent(MainActivity.this, MainActivity.class);

        startActivity(intent);


    }

    public void backClick(View view){
        finish();
    }
}
