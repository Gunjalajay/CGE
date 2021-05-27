package com.example.finalproject;


import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Web1 extends AppCompatActivity {
    WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web1);

        webView1=findViewById(R.id.web_view);
        webView1.getSettings().setDomStorageEnabled(true);
        webView1.getSettings().setAppCacheEnabled(true);
        webView1.getSettings().setLoadsImagesAutomatically(true);
        webView1.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        webView1.getSettings().setJavaScriptEnabled(true);


        int position=getIntent().getIntExtra("diode_key",0);

        if(position==0){
            webView1.loadUrl("file:///android_asset/PN_junction.html");
        }
        else if(position==1){
            webView1.loadUrl("file:///android_asset/LED_Diode.html");
        }
        else if(position==2){
            webView1.loadUrl("file:///android_asset/Laser_Diode.html");
        }
        else if(position==3){
            webView1.loadUrl("file:///android_asset/Zener_Diode.html");
        }


    }
}