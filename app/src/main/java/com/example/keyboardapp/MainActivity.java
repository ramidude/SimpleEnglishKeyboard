package com.example.keyboardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public TextView textViewDisplayBar;
    public Button buttonClear;
//    public String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewDisplayBar = findViewById(R.id.textViewDisplayBar);
        buttonClear = findViewById(R.id.buttonClear);
    }

    public void addChar(View view) {
        textViewDisplayBar.setText(textViewDisplayBar.getText().toString() + view.getTag().toString());
//        str += view.getTag().toString();
//        textViewDisplayBar.setText(str);
    }

    public void clearButton(View view) {
        textViewDisplayBar.setText("");
//        str = "";
//        textViewDisplayBar.setText(str);
    }

    public void closeMe(View view) {
        Toast.makeText(this, "Have a nice one :)", Toast.LENGTH_SHORT).show();
        finish();
    }
}