package com.itshareplus.googlemapdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class Welcome extends AppCompatActivity {

    //deklarowanie zmiennych
    private long ms = 0;
    private long czasPowitania = 2500;
    private boolean aktywowac = true;
    private boolean pauza = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //utworzenie wyjątku
        Thread mojwatek = new Thread(){
            public void run(){
                try {
                    while (aktywowac && ms < czasPowitania){
                        if(!pauza)
                            ms = ms + 100;
                        sleep(100);
                    }
                }catch (Exception e){
                }finally {
                    Intent intent = new Intent(Welcome.this,MainActivity.class);
                    startActivity(intent);
                }
            }

        };
        mojwatek.start();
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ekran_startowy_aplikacji, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
}