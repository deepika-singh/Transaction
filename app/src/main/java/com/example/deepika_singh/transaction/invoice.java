package com.example.deepika_singh.transaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class invoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);}

    public void singlepay(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);}

    public void splitpay(View view) {
        Intent i = new Intent(this, splitscreen.class);
        startActivity(i);

    }
}
