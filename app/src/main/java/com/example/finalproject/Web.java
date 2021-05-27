package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Web extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView=findViewById(R.id.webview);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        webView.getSettings().setJavaScriptEnabled(true);

        int position=getIntent().getIntExtra("capacitor_key",0);

        if(position==0){
            webView.loadUrl("file:///android_asset/Electrolyte_Capacitor.html");
        }
        else if(position==1){
            webView.loadUrl("file:///android_asset/Mica_Capacitor.html");
        }
        else if(position==2){
            webView.loadUrl("file:///android_asset/Ceramic_Capacitor.html");
        }
        else if(position==3){
            webView.loadUrl("file:///android_asset/Film_Capacitor.html");
        }


    }
}