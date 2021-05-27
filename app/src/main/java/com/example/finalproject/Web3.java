package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Web3 extends AppCompatActivity {

    WebView webView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web3);

        webView3=findViewById(R.id.webview3);
        webView3.getSettings().setDomStorageEnabled(true);
        webView3.getSettings().setAppCacheEnabled(true);
        webView3.getSettings().setLoadsImagesAutomatically(true);
        webView3.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        webView3.getSettings().setJavaScriptEnabled(true);


        int position=getIntent().getIntExtra("ic_key",0);

        if(position==0){
            webView3.loadUrl("file:///android_asset/IC.html");
        }
        else if(position==1){
            webView3.loadUrl("file:///android_asset/thick_thinIC.html");
        }
        else if(position==2){
            webView3.loadUrl("file:///android_asset/mono_ic.html");
        }
        else if(position==3){
            webView3.loadUrl("file:///android_asset/hybridic.html");
        }


    }
}