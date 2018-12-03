package com.example.apple.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class lantern_webview extends lantern {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lanternfestival_webview);
        WebView myWebView = (WebView) findViewById(R.id.lantern_webview);
        myWebView.loadUrl("https://www.youtube.com/watch?v=1aI9A_ClgBU");
    }
}