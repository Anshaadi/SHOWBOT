package com.anshulshrivastava.showbot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void stocks(View view) {
        Log.d(LOG_TAG,"stocks");
        Intent intent =new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    public void portfolio(View view) {
        Log.d(LOG_TAG,"portfolio");
        Intent intent =new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }

    public void help(View view){
        Log.d(LOG_TAG,"help");
        Intent intent =new Intent(this,FourthActivity.class);
        startActivity(intent);
    }

    public void quotes(View view) {
        Log.d(LOG_TAG,"quotes");
        Intent intent =new Intent(this,FifthActivity.class);
        startActivity(intent);
    }
}
