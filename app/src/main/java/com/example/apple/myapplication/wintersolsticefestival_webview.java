package com.example.apple.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class wintersolsticefestival_webview extends wintersolsticefestival {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wintersolsticefestival_webview);
        WebView myWebView = (WebView) findViewById(R.id.wintersolstice_webview);
        myWebView.loadUrl("https://www.youtube.com/watch?v=aOaSGgYsuTk");
    }
}