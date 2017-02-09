package com.kyostudios.a5echaractersheet;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class Character_List_Activity_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character__list___main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appBarLayout);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Character Name");

        BottomNavigationView bnv = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    default:
                        break;
                    case R.id.action_status:
                        Snackbar.make(findViewById(R.id.place_snackbar), "Switched to Status", Snackbar.LENGTH_SHORT)
                                .show();
                        break;
                    case R.id.action_bio:
                        Snackbar.make(findViewById(R.id.place_snackbar), "Switched to Bio", Snackbar.LENGTH_SHORT)
                                .show();
                        break;
                    case R.id.action_feats:
                        Snackbar.make(findViewById(R.id.place_snackbar), "Switched to Feats", Snackbar.LENGTH_SHORT)
                                .show();
                        break;
                    case R.id.action_inventory:
                        Snackbar.make(findViewById(R.id.place_snackbar), "Switched to Inventory", Snackbar.LENGTH_SHORT)
                                .show();
                        break;
                    case R.id.action_spells:
                        Snackbar.make(findViewById(R.id.place_snackbar), "Switched to Spells", Snackbar.LENGTH_SHORT)
                                .show();
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_character__list__activity__main, menu);
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
