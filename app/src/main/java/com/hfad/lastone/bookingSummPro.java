package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class bookingSummPro extends AppCompatActivity {
    private String x="1000";
    public static String hallS="yo";





    public static String roomS="Field of Dandelions";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_summ);
        Intent rec =getIntent();
       x=rec.getStringExtra("key");
       TextView hall =findViewById(R.id.book_summ_ho_res);
       TextView room=findViewById(R.id.roomSelec);
        TextView date=findViewById(R.id.admiss_date);

        Calendar currentDate = Datenow.getCurrentDate();
        int year = currentDate.get(Calendar.YEAR);
        int month = currentDate.get(Calendar.MONTH) + 1; // Month starts from 0
        int day = currentDate.get(Calendar.DAY_OF_MONTH);
String finalDate=year + "-" + month + "-" + day;
        date.setText(finalDate);


        hall.setText(hallS);
room.setText(roomS);

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