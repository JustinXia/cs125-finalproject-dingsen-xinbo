package com.example.apple.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class qixi_webview extends qixi {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qixifestival_webview);
        WebView myWebView = (WebView) findViewById(R.id.qixi_webview);
        myWebView.loadUrl("https://www.youtube.com/watch?v=RXi-Xd1vXBQ");
    }
}