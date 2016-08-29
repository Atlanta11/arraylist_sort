package com.example.enterprise.arraylist_sort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList arrayList = new ArrayList();
        arrayList.add("element_1");
        arrayList.add("element_3");
        arrayList.add("element_5");
        arrayList.add("element_2");
        arrayList.add("element_4");

        for(int i=0; i < arrayList.size(); i++)
            Toast.makeText(getApplicationContext(), arrayList.toString(), Toast.LENGTH_SHORT).show();

    }
}
