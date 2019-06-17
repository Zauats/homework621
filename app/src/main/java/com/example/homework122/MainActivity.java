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
    LinkedList<Integer> nums = new LinkedList<>();
    int nowPosition = 0;
    public void nextClick(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
        if (nowPosition == nums.size()){
            Integer randNum = rand.nextInt(100);
            nums.add(randNum);
        }
        else {
            text.setText("image" + nums.get(nowPosition));
        }
        nowPosition += 1;

    }

    public void backClick(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
        if (nowPosition == 0){
            finish();
        }else {
            text.setText("image" + nums.get(nowPosition));
        }
        nowPosition -= 1;
    }
}
