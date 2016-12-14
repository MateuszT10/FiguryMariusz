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
        setContentView(R.layout.activity_lista);
        Main program = new Main(); //obiekt klasy program


        String[] stringi= new String[45]; // lista wszystkich figur wraz z cechami i polami
        // zaadaptowana do wyswietlania w grid

//        for(int i = 0; i< 45; i++ ){
//            int nWiersz = i % 3;
//            int nKolumna = i / 3;
//            switch(nWiersz) {
//                case 0:
//                    stringi[i] = program.jakaFigura[nKolumna];
//                    break;
//                case 1:
//                    stringi[i] = program.polaFigur[nKolumna];
//                    break;
//                case 2:
//                    stringi[i] = program.cechaFigur[nKolumna];
//                    break;
//                default:
//                    break;
//            }
//        }
        List<String> values=new ArrayList<String>(Arrays.asList(stringi));


        GridView myGrid=(GridView)findViewById(R.id.grid);

        myGrid.setAdapter(new ArrayAdapter<String>(this,R.layout.cell,values));
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
