package com.example.biswe.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText entry;
    private TextView viewPassed;
    private String strEntry;
    static Validator validator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        validator = new Validator();
        entry = findViewById(R.id.editPass);
        viewPassed = findViewById(R.id.viewPassed);
        strEntry = entry.toString();

        Button checkBt = findViewById(R.id.checkPassbt);
        //checks if string on textview is valid or not
        checkBt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(validator.validate(strEntry)){
                    viewPassed.setText("Strong!");
                } else {
                    viewPassed.setText("Not Strong!");
                }
            }
        });

    }
}
