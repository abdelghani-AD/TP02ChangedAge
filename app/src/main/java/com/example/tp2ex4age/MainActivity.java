package com.example.tp2ex4age;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Hashtable;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Hashtable<String,String>> persons;
    Hashtable<String,String> ht;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.list);
        persons = new ArrayList<>();
        ht = new Hashtable<>();
        ht.put("name","Nouri");
        ht.put("prenom","Mohammed");
        ht.put("age","15");
        persons.add(ht);
        ht = new Hashtable<>();
        ht.put("name","Douirek");
        ht.put("prenom","Abdlghani");
        ht.put("age","66");
        persons.add(ht);
        ht = new Hashtable<>();
        ht.put("name","Fath_allah");
        ht.put("prenom","Tarik");
        ht.put("age","34");
        persons.add(ht);
        ht = new Hashtable<>();
        ht.put("name","Mohtafide");
        ht.put("prenom","Ayoub");
        ht.put("age","71");
        persons.add(ht);
        ClasseAdapter ageAdaptar = new ClasseAdapter(persons,this);
        lv.setAdapter(ageAdaptar);

    }
}