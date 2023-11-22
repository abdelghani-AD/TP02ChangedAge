package com.example.tp2ex4age;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Hashtable;

public class ClasseAdapter extends BaseAdapter {
    ArrayList<Hashtable<String,String>> persons;
    Context context;
    public ClasseAdapter(ArrayList<Hashtable<String,String>> l , Context c){
        persons = l;
        context=c;
    }

    @Override
    public int getCount() {
        return persons.size();
    }

    @Override
    public Object getItem(int position) {
        return persons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.myressource,null);
            TextView namePer = convertView.findViewById(R.id.nom_prs);
            TextView prePer = convertView.findViewById(R.id.pre_prs);
            TextView agePer = convertView.findViewById(R.id.age_prs);

            namePer.setText(persons.get(position).get("name"));
            prePer.setText(persons.get(position).get("prenom"));
            agePer.setText(persons.get(position).get("age"));
            namePer.setTextColor(Color.BLUE);
            prePer.setTextColor(Color.CYAN);
            int age = Integer.parseInt(persons.get(position).get("age"));
            if (age<18) agePer.setTextColor(Color.GREEN);
            if (age>60) agePer.setTextColor(Color.RED);
        }
        return convertView;
    }
}