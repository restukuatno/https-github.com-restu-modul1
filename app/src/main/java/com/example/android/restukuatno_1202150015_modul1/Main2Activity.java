package com.example.android.restukuatno_1202150015_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    public TextView Restoran;
    public TextView NamaMenu;
    public TextView PorsiMenu;
    public TextView HargaMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Restoran = (TextView)findViewById(R.id.namaRestoran);
        NamaMenu = (TextView)findViewById(R.id.daftarMenu);
        PorsiMenu = (TextView)findViewById(R.id.jumlahPorsi);
        HargaMenu = (TextView)findViewById(R.id.daftarHarga);
        Intent Inten = getIntent();
        String ExtraNamaRestoran = Inten.getStringExtra(MainActivity.EXTRA_Restoran);
        String ExtraNamaMenu = Inten.getStringExtra(MainActivity.EXTRA_Menu);
        String ExtraNamaPorsi = Inten.getStringExtra(MainActivity.EXTRA_Porsi);

        int uang = 65500;
        int harga=0;
        int porsi = Integer.parseInt(ExtraNamaPorsi);
        if("Abnormal".equals(ExtraNamaRestoran)){harga=50000*porsi;}
        else if("Eatbus".equals(ExtraNamaRestoran)){harga=30000*porsi;}
        if(harga>uang){
            Toast.makeText(this, "Tidak Cukup",Toast.LENGTH_SHORT).show();}
        else{Toast.makeText(this, "Makan disini",Toast.LENGTH_SHORT).show();}

        Restoran.setText(ExtraNamaRestoran);
        NamaMenu.setText(ExtraNamaMenu);
        PorsiMenu.setText(ExtraNamaPorsi);
        HargaMenu.setText(""+harga);
    }
}


