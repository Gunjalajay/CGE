package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Web2 extends AppCompatActivity {
    WebView webView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web2);

        webView2=findViewById(R.id.webview2);
        webView2.getSettings().setDomStorageEnabled(true);
        webView2.getSettings().setAppCacheEnabled(true);
        webView2.getSettings().setLoadsImagesAutomatically(true);
        webView2.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        webView2.getSettings().setJavaScriptEnabled(true);


        int position=getIntent().getIntExtra("resistor_key",0);

        if(position==0){
            webView2.loadUrl("file:///android_asset/fixed_resistor.html");
        }
        else if(position==1){
            webView2.loadUrl("file:///android_asset/variable_resistor.html");
        }
        else if(position==2){
            webView2.loadUrl("file:///android_asset/photoresistor.html");
        }
        else if(position==3){
            webView2.loadUrl("file:///android_asset/thermistor.html");
        }


    }
}