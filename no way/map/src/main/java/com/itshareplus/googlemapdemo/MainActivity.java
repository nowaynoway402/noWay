package com.itshareplus.googlemapdemo;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setupMapButton(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        this.startActivity(intent);
    }

    public void setupSearchButton(View view) {
        Toast msg = Toast.makeText(MainActivity.this, "Search Button", Toast.LENGTH_LONG);
        msg.show();
    }

    public void setupAboutButton(View view) {
        Intent intent = new Intent(this, AboutActivity.class);
        this.startActivity(intent);
    }

    public void setupHelpButton(View view) {
        Intent intent = new Intent(this, HelpActivity.class);
        this.startActivity(intent);
    }
}
