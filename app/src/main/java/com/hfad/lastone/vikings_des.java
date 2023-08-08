package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class vikings_des extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vikings_des);
    }

    public void onClickProceed(View view) {
        bookingSummPro object =new bookingSummPro();
        bookingSummPro.hallS="Vikings Hall";
        RadioGroup buttonGroup =findViewById(R.id.radioGroupV);
        RadioButton selected=findViewById(buttonGroup.getCheckedRadioButtonId());
        bookingSummPro.roomS= String.valueOf(selected.getText());
        Intent intent=new Intent(this, MainPayment.class);
        intent.putExtra("c",2);


        startActivity(intent);

    }

    public void vikBack(View view) {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }


}