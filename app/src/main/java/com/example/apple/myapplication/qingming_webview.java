package com.example.apple.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class qingming_webview extends qingming {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qingmingfeistival_webview);
        WebView myWebView = (WebView) findViewById(R.id.qingming_webview);
        myWebView.loadUrl("https://www.youtube.com/watch?v=c0twuz58bD0");
    }
}