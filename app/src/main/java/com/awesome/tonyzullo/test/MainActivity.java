package com.awesome.tonyzullo.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate called");
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    public void onRestart() {
        super.onRestart();  // Always call the superclass method first
        Log.v(TAG, "onRestart called");
    }

    @Override
    public void onPause() {
        super.onPause();  // Always call the superclass method first
        Log.d(TAG, "onPause called");
    }

    @Override
    public void onStart() {
        super.onStart();  // Always call the superclass method first
        Log.v(TAG, "onStart called");
    }

    @Override
    public void onResume() {
        super.onResume();  // Always call the superclass method first
        Log.i(TAG, "onResume called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();  // Always call the superclass
        Log.e(TAG, "onDestroy called");
    }

    @Override
    protected void onStop() {
        super.onStop();  // Always call the superclass method first
        Log.w(TAG, "onStop called");
    }
}
