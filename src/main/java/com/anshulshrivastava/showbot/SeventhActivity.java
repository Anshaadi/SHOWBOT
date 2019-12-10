package com.anshulshrivastava.showbot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SeventhActivity extends AppCompatActivity {

    private WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        myWebView = (WebView)findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://www.nseindia.com/live_market/dynaContent/live_watch/equities_stock_watch.htm");
        myWebView.setWebViewClient(new WebViewClient());

    }

    public void onBackPressed(){

        if(myWebView.canGoBack()){
            myWebView.goBack();
        }else
            super.onBackPressed();
    }
}
