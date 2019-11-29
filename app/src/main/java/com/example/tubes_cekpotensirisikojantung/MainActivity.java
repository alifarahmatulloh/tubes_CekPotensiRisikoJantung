package com.example.tubes_cekpotensirisikojantung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.tubes_cekpotensirisikojantung.ui.history.histori;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.example_item);
        Intent i = new Intent(MainActivity.this , histori.class);
        startActivity(i);
    }

}
