package com.example.animate2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textHelloWorld;
    private boolean istrue=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textHelloWorld=findViewById(R.id.textHello);
        textHelloWorld.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
              //  textHelloWorld.animate().rotation(40f).setDuration(3000);
                //textHelloWorld.animate().alpha(0).setDuration(3000);
             //   textHelloWorld.animate().scaleY(10f).setDuration(3000);
               // textHelloWorld.animate().alpha(0).setDuration(0);
              //  textHelloWorld.animate().translationX(500).setDuration(1000);
                if(istrue)
                {
                   // textHelloWorld.animate().translationY(-200f).setDuration(2000);
                    textHelloWorld.animate().rotation(60f).translationXBy(200f).setDuration(2000);
                    istrue=false;

                }
                else
                {
                   // textHelloWorld.animate().translationY(5000).setDuration(5000);
                   // textHelloWorld.animate().translationYBy(300f).setDuration(5000);

                    //textHelloWorld.animate().translationZ(-300f).setDuration(3000);
                    istrue=true;
                }

            }
        });
    }
}