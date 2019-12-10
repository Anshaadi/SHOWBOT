package com.anshulshrivastava.showbot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class ThirdActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        myWebView = (WebView)findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://m.economictimes.com/pf_portfoliohome.cms");
        myWebView.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){

        if(myWebView.canGoBack()){
            myWebView.goBack();
        }else
            super.onBackPressed();
    }
}
