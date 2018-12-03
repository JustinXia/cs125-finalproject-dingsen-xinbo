package com.example.apple.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class midautumn extends fina {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.midautumnfestival);
        Button button = (Button)findViewById(R.id.button10);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), midautumn_webview.class);
                startActivity(i);
            }
        });
    }
}