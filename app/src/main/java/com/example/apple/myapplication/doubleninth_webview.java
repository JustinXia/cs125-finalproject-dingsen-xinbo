package com.example.apple.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class doubleninth_webview extends doubleninth {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doubleninth_webview);
        WebView myWebView = (WebView) findViewById(R.id.doubleninth_webview);
        myWebView.loadUrl("https://www.youtube.com/watch?v=Q5iFA9WPJHY");
    }
}
