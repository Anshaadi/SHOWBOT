package com.anshulshrivastava.showbot;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SecondActivity extends AppCompatActivity {

    private static final String LOG_TAG = SecondActivity.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


    }

    public void bse(View view) {
        Log.d(LOG_TAG,"bse");
        Intent intent =new Intent(this,SixthActivity.class);
        startActivity(intent);
    }

    public void nse(View view) {
        Log.d(LOG_TAG,"nse");
        Intent intent =new Intent(this,SeventhActivity.class);
        startActivity(intent);
    }





}
