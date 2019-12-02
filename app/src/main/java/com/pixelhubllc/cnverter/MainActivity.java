package com.pixelhubllc.cnverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TimeConversion timeConversion = new TimeConversion();
        Log.e("Converted:", timeConversion.time("6","day","month"));

    }
}
