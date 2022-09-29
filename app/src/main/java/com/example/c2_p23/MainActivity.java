package com.example.c2_p23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button B;
    private TextView L;
    private final int red = 0xFF0000;
    private final int yellow = 0xFFFF00;
    private final int green = 0x00FF00;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B = findViewById(R.id.button);
        L = findViewById(R.id.light);

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hex = 0xFFFFFF & L.getCurrentTextColor();

                switch (hex){
                    case (red):
                        L.setTextColor(green);
                        break;
                    case (green):
                        L.setTextColor(yellow);
                        break;
                    case (yellow):
                        L.setTextColor(red);
                        break;
                }

            }
        });
    }
}
