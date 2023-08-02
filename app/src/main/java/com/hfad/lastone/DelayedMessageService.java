package com.hfad.lastone;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;


public class DelayedMessageService extends IntentService {

    public static final String message= "you're doing great man";
 public void showText(String text){
     Log.v("DelayedMessageService","THe message is: "+text);
 }

    public DelayedMessageService() {
        super("DelayedMessageService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
synchronized (this){try{wait(10000);}
catch (InterruptedException e){e.printStackTrace();}

            }
String text=intent.getStringExtra(message);
 showText(text);}
}