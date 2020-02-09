package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction1(View view){
        String str = ((EditText) findViewById(R.id.editText)).getText().toString();
        int result = Integer.parseInt(str);
        result = result * (77/100);
        str = Integer.toString(result);
        goToActivity2(str + " pounds");
    }

    public void clickFunction2(View view){
        String str = ((EditText) findViewById(R.id.editText)).getText().toString();
        int result = Integer.parseInt(str);
        result = result * (100/77);
        str = Integer.toString(result);
        goToActivity2(str + " dollars");
    }
    public void goToActivity2(String s){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
