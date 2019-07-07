package com.example.homework122;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
//    стек переходов:

    TextView text;
    Random rand = new Random();
    int ActivityNumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.imageName);
        Integer randNum = rand.nextInt(100);
        if (ActivityNumber == 0){
            ActivityNumber = randNum;
        }

        text.setText("image" + randNum);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle", ActivityNumber + " onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", ActivityNumber + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", ActivityNumber + "onDestriy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", ActivityNumber + "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", ActivityNumber + "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle", ActivityNumber + "onRestart");
    }

    public void nextClick(View view){

        Intent intent = new Intent(MainActivity.this, MainActivity.class);

        startActivity(intent);
    }


    public void backClick(View view){
        finish();
    }
}
