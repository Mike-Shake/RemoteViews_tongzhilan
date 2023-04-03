package com.example.remoteviews_tongzhilan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class DemoActivity_2 extends AppCompatActivity {
    private static final String TAG = "DemoActivity_2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);

        Log.d(TAG, "onCreate: ");
        Toast.makeText(this, getIntent().getStringExtra("sid"), Toast.LENGTH_SHORT).show();
        initView();
    }

    private void initView() {

    }
}