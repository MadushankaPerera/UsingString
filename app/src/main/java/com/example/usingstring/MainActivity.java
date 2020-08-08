package com.example.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = findViewById(R.id.tVmsg2);
        textView2.setText(R.string.msg2);

        Log.i("lifecycle", "onCreate() invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lifecycle", "onStop() invoked");
    }


    public void onStart(){

        super.onStart();
        Log.i("lifecycle", "onStart() invoked");
    }


    public void onRestart(){

        super.onRestart();
        Log.i("lifecycle", "onRestart() invoked");
    }

    public void onResume(){

        super.onResume();
        Log.i("lifecycle", "onResume() invoked");
    }


    public void onPause(){

        super.onPause();
        Log.i("lifecycle", "onPause() invoked");
    }


    public void onDestroy(){

        super.onDestroy();
        Log.i("lifecycle", "onDestroy() invoked");
    }
}
