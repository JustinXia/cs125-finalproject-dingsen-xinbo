package com.example.apple.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class fina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fina);

        Button button = (Button)findViewById(R.id.Double_Ninth_Festival);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), doubleninth.class);
                startActivity(i);
            }
        });
        Button button1 = (Button)findViewById(R.id.Winter_Solstice_Festival);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), wintersolsticefestival.class);
                startActivity(i);
            }
        });
        Button button2 = (Button)findViewById(R.id.Spring_Festival);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), springfestival.class);
                startActivity(i);
            }
        });
        Button button3 = (Button)findViewById(R.id.Qixi_Festival);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), qixi.class);
                startActivity(i);
            }
        });
        Button button4 = (Button)findViewById(R.id.Qingming_Festival);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), qingming.class);
                startActivity(i);
            }
        });
        Button button5 = (Button)findViewById(R.id.Mid_Autumn_Festival);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), midautumn.class);
                startActivity(i);
            }
        });
        Button button6 = (Button)findViewById(R.id.Lantern_Festival);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), lantern.class);
                startActivity(i);
            }
        });
        Button button7 = (Button)findViewById(R.id.Dragon_Boat_Festival);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), dragonboat.class);
                startActivity(i);
            }
        });
    }
}
