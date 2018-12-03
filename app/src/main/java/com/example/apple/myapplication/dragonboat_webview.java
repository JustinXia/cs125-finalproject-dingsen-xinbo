package com.example.apple.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class dragonboat_webview extends dragonboat {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dragonboat_webview);
        WebView myWebView = (WebView) findViewById(R.id.dragonboat_webview);
        myWebView.loadUrl("https://www.youtube.com/watch?v=BN1tS7mQ_Uw");
    }
}