package com.example.tubes_cekpotensirisikojantung.ui.formCekRisiko;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.tubes_cekpotensirisikojantung.R;

import org.w3c.dom.Text;

public class FormJantungActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_jantung);

        Intent intent = new Intent();
        //String message = intent.getStringExtra(/*Di ambil dari data Register Jenis Kelamin*/);
        TextView
                textView = findViewById(R.id.form_kelaminTextview);
                textView = findViewById(R.id.form_usiaTextview);
        //textView.setText(message);

        Spinner
                spinner = findViewById(R.id.form_kolesterolSpinner);
        if (spinner != null){
            spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_kolesterol, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if (spinner != null){
            spinner.setAdapter(adapter);
        }
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.diabetesYes:
                break;
            case R.id.DiabetesNo:
                break;
            default:
                break;
        }

        switch (view.getId()){
            case R.id.perokokYes:
                break;
            case R.id.perokokNo:
                break;
            default:
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void showAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(FormJantungActivity.this);

        myAlertBuilder.setTitle("PESAN");
        myAlertBuilder.setMessage("Apakah anda yakin data yang anda isikan sudah benar?");
        myAlertBuilder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        myAlertBuilder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
    }
}
