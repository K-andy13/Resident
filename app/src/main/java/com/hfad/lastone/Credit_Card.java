package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Credit_Card extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card);
    }

    public void ccBack(View view) {
        Intent intent=new Intent(this,MainPayment.class);
        startActivity(intent);

    }

    public void onClickProceed(View view) {
Intent intent=new Intent(this, bookingSummPro.class);
intent.putExtra("key","cc");
    startActivity(intent);}
}