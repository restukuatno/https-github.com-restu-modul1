package com.example.android.restukuatno_1202150015_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_Restoran =
            "com.example.android.studycase.extra.Restoran";
    public static final String EXTRA_Menu =
            "com.example.android.studycase.extra.Menu";
    public static final String EXTRA_Porsi =
            "com.example.android.studycase.extra.Porsi";
    public static final String EXTRA_Harga =
            "com.example.android.studycase.extra.Harga";

    EditText inputNamaMenu, inputPorsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNamaMenu = (EditText) findViewById(R.id.inputMenu);
        inputPorsi = (EditText) findViewById(R.id.daftarPorsi);

        Button eatbus = (Button)findViewById(R.id.Eatbus);
        Button abnormal = (Button)findViewById(R.id.Abnormal);

        eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenuEatbus();
            }
        });

        abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenuAbnormal();
            }
        });
    }
    public void MenuEatbus() {

        String nama = inputNamaMenu.getText().toString();
        String porsi = inputPorsi.getText().toString();
        Intent SeconActivity = new Intent(this, Main2Activity.class);
        SeconActivity.putExtra(EXTRA_Restoran, "Eatbus");
        SeconActivity.putExtra(EXTRA_Menu, nama);
        SeconActivity.putExtra(EXTRA_Porsi, porsi);

        startActivity(SeconActivity);
    }

    public void MenuAbnormal() {

        String nama = inputNamaMenu.getText().toString();
        String porsi = inputPorsi.getText().toString();
        Intent SeconActivity = new Intent(this, Main2Activity.class);
        SeconActivity.putExtra(EXTRA_Restoran, "Abnormal");
        SeconActivity.putExtra(EXTRA_Menu, nama);
        SeconActivity.putExtra(EXTRA_Porsi, porsi);

        startActivity(SeconActivity);
    }
}

