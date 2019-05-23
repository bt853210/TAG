package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");
        Toast.makeText(this,"Create",Toast.LENGTH_LONG).show();
    }
    protected void onStart(){
        super.onStart();
        Log.d(TAG,"onStart");
        Toast.makeText(this,"Start",Toast.LENGTH_LONG).show();
    }
    protected void onResume(){
        super.onResume();
        Log.d(TAG,"onResume");
        Toast.makeText(this,"Resume",Toast.LENGTH_LONG).show();
    }
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"onPause");
        Toast.makeText(this,"Pasuse",Toast.LENGTH_LONG).show();
    }
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"onStop");
        Toast.makeText(this,"Stop",Toast.LENGTH_LONG).show();
    }
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,"onRestart");
        Toast.makeText(this,"Restart",Toast.LENGTH_LONG).show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy");
        Toast.makeText(this,"Destort",Toast.LENGTH_LONG).show();
    }
    public void onFinishClick(View view){finish();}
}
