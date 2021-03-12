package com.sh1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
    }
    public void prueba(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        if(editText.getText().toString().isEmpty()){return ;}
        intent.putExtra("text",editText.getText().toString());
        startActivity(intent);
    }
}