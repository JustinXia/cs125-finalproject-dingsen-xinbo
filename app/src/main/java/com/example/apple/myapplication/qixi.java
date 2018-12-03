package com.example.apple.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class qixi extends fina {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qixifestival);
        Button button = (Button)findViewById(R.id.button11);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), qixi_webview.class);
                startActivity(i);
            }
        });
    }
}