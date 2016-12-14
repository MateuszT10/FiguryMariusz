package com.example.mateusz.figurymariusz;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.example.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        Main obiekt = new Main(); //obiekt klasy program
        int N = 15;

        obiekt.losowanie(N); // losujemy N figur
        ArrayList<String> stringi = new ArrayList<String>();
        for(int i=0; i< N;i++){
            stringi.add(obiekt.nazwafigury.get(i));
            stringi.add(obiekt.cechafigury.get(i));
            stringi.add(obiekt.polefigury.get(i));
        }
        GridView myGrid=(GridView)findViewById(R.id.grid);

        myGrid.setAdapter(new ArrayAdapter<String>(this,R.layout.cell,stringi));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
