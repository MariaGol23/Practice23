package com.example.practice23;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView FirstText = (TextView) findViewById(R.id.textView1);
        final TextView SecondText = (TextView) findViewById(R.id.textView2);
        Button Btn1 = findViewById(R.id.button);
        Button Btn2 = findViewById(R.id.button2);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstText.setTextColor(Color.GREEN);
                SecondText.setTextColor(Color.GREEN);
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstText.setTextColor(Color.RED);
                SecondText.setTextColor(Color.RED);
            }
        });
    }
}

