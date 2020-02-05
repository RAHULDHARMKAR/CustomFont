package com.example.customfront;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView ,textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txt_font);
        textView1 = findViewById(R.id.txt_font1);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "ginga.ttf");
        textView.setTypeface(typeface);
        textView1.setTypeface(typeface);


    }
}
