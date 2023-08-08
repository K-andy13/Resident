package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pentagon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pentagon);
    }

    public void pBack(View view) {
        Intent intent=new Intent(this, Homepage.class);
        startActivity(intent);
    }

    public void onClickProceed(View view) {
        Intent intent=new Intent(this, MainPayment.class);
        intent.putExtra("c",3);

        startActivity(intent);


    }
}