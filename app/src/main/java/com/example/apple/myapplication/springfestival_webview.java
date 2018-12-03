package com.example.apple.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class springfestival_webview extends springfestival {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.springfestival_webview);
        WebView myWebView = (WebView) findViewById(R.id.springfestival_webview);
        myWebView.loadUrl("https://www.youtube.com/watch?v=SWvbkcaCGi0");
    }
}