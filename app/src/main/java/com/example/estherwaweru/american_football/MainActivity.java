package com.example.estherwaweru.american_football;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private int scoreOakland=0;
     private int scoreBlueVale=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button safetyBlueVale=(Button) findViewById(R.id.safety_blueVale);
        safetyBlueVale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreBlueVale+=2;
                displayForBlueVale(scoreBlueVale);
            }
        });

        Button safetyBtn=(Button) findViewById(R.id.safety_oakland);
        safetyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreOakland+=2;
                displayForOakland(scoreOakland);
            }
        });
        Button conversionBlueVale=(Button) findViewById(R.id.conversion_blueVale);
        conversionBlueVale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreBlueVale+=1;
                displayForBlueVale(scoreBlueVale);
            }
        });
        Button conversionBtn=(Button) findViewById(R.id.conversion_oakland);
        conversionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreOakland+=1;
                displayForOakland(scoreOakland);
            }
        });
        Button fieldBlueVale=(Button) findViewById(R.id.field_goal_blueVale);
        fieldBlueVale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreBlueVale+=3;
                displayForBlueVale(scoreBlueVale);
            }
        });

        Button fieldBtn=(Button)findViewById(R.id.field_goal_oakland);
        fieldBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreOakland+=3;
                displayForOakland(scoreOakland);
            }
        });
        Button touchdownBlueVale=(Button) findViewById(R.id.touchdown_blueVale);
        touchdownBlueVale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreBlueVale+=6;
                displayForBlueVale(scoreBlueVale);
            }
        });

        Button touchdownBtn=(Button) findViewById(R.id.touchdown_oakland);
                touchdownBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        scoreOakland+=6;
                        displayForOakland(scoreOakland);
                    }
                });

                Button resetBtn=(Button)findViewById(R.id.reset_btn);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreOakland=0;
                scoreBlueVale=0;
                displayForBlueVale(scoreBlueVale);
                displayForOakland(scoreOakland);
            }
        });

        }
    public void displayForOakland(int score){
        TextView textView=(TextView) findViewById(R.id.scores_oakland);
        textView.setText(""+score);
    }
    public void displayForBlueVale(int score){
        TextView textView=(TextView) findViewById(R.id.scores_blueVale);
        textView.setText(""+score);
    }
}
