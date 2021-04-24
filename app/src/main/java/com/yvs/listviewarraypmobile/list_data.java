package com.yvs.listviewarraypmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class list_data extends AppCompatActivity {

    //deklarasi variable
    //penamaan listview dibawah hanya untuk membedakan id di listview di xml saja, boleh menggunakan nama variable lain atau sama dengan id listview di xml
    ListView lv_hari;

    //array 1 dimensi digunakan untuk menampun data hari
    String [] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

    //ArrayAdapter digunakan untuk mengampun data dalam array
    ArrayAdapter adapter_hari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);

        //konfigurrasi dari FrontEnd (xml) ke BackEnd (java)
        lv_hari = (ListView)findViewById(R.id.lv_item);

        //membuat constructor ArrayAdapter (dengan 2 parameter)
        //android.R.layout.simple_list_item_1 adalah layout bawaan dari Androi sendiri
        adapter_hari = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, hari);

        //mengirim data adapter untuk di tempatkan ke daam list view menggunakan method setAdapter()
        lv_hari.setAdapter(adapter_hari);
    }
}