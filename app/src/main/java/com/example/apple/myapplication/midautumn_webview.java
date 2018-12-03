package com.example.apple.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class midautumn_webview extends midautumn {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.midautumnfestival_webview);
        WebView myWebView = (WebView) findViewById(R.id.midautumn_webview);
        myWebView.loadUrl("https://www.youtube.com/watch?v=r9hJnRYUoy4");
    }
}
