package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import java.util.logging.Logger;


public class MainActivity extends AppCompatActivity {
    private static  final String TAG = MainActivity.class.getSimpleName();
    private EditText edHeight;
    private EditText edWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);
        findView();

    }

    private void findView() {
        edHeight = findViewById(R.id.ed_height);
        edWeight = findViewById(R.id.ed_weight);
    }

    public void bmi (View view){
        float weight = Float.parseFloat(edWeight.getText().toString()) ;
        float height = Float.parseFloat(edHeight.getText().toString()) ;
        float bmi = weight/(height*height);
        Log.d(TAG,"BMI:"+ bmi);


    }
}
