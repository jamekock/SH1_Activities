package com.sh1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity2 extends AppCompatActivity {
    String text;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        webView = findViewById(R.id.webView);
        text = intent.getExtras().getString("text");
        webView.loadUrl("https://"+ text);
    }

    public void prueba(View v) {
        finish();
    }
}