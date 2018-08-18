package com.theninequeens.feedr.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"On start method called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"On stop method called");
    }


    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG,"On pause method called");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"On restart method called");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG,"On destroy method called");
    }
}
