package com.sl2.lifecycleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"Estoy en el On Create",Toast.LENGTH_LONG).show();
        Log.i("info","Estoy en el On Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Estoy en el On Start",Toast.LENGTH_LONG).show();
        Log.i("info","Estoy en el On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Estoy en el On Resume",Toast.LENGTH_LONG).show();
        Log.i("info","Estoy en el On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"Estoy en el On Pause",Toast.LENGTH_LONG).show();
        Log.i("info","Estoy en el On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Estoy en el On Stop",Toast.LENGTH_LONG).show();
        Log.i("info","Estoy en el On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Estoy en el On Destroy",Toast.LENGTH_LONG).show();
        Log.i("info","Estoy en el On Destroy");
    }
}
