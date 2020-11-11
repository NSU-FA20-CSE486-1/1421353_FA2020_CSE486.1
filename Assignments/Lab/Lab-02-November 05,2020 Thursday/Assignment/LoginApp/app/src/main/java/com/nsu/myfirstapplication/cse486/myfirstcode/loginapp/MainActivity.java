package com.nsu.myfirstapplication.cse486.myfirstcode.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText in1= (EditText) findViewById(R.id.edit_email);
    EditText in2= (EditText) findViewById(R.id.edit_password);
    String username ="Admin";
    private int password= 12345;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show1(View view){
        Toast toast= Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT);
        toast.show();

    }

    public void Login(View view) {
       if (in1.getText().equals("username"))
           Log.e("r","Success");

        if (in2.getText().equals("password"))
         Log.e("e","Success");

    }

}