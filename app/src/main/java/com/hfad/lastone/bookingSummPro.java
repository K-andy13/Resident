package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bookingSummPro extends AppCompatActivity {
    private String x="1000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_summ);
        Intent rec =getIntent();
       x=rec.getStringExtra("key");
    }

    public void bSumConfirm(View view) {
        Intent intent=new Intent(this, bookingconf.class);
        startActivity(intent);
    }

    public void onBookSummBack(View view) {
        switch (x){
            case "cc":
                Intent intent=new Intent(this, Credit_Card.class);
                startActivity(intent);
                break;
            case "mm":
                Intent intent2=new Intent(this, m_money.class);
                startActivity(intent2);
                break;
        }

    }
}