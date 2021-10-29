package com.example.capstoneprojectterrariaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.capstoneprojectterrariaguide.Models.Bosses;
import com.example.capstoneprojectterrariaguide.Models.Enemies;
import com.example.capstoneprojectterrariaguide.Models.Materials;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmQuery;
import io.realm.mongodb.App;
import io.realm.mongodb.AppConfiguration;

public class Navigation extends AppCompatActivity {

    String AppId = "capstone-szohf";
    public static final String Choice = "com.example.capstoneprojectterrariaguide.Choice";
    public EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_page);

        Realm.init(this);
        App app = new App(new AppConfiguration.Builder(AppId).build());
        RealmConfiguration config =
                new RealmConfiguration.Builder()
                        // below line is to allow write
                        // data to database on ui thread.
                        .allowWritesOnUiThread(true)
                        // below line is to delete realm
                        // if migration is needed.
                        .deleteRealmIfMigrationNeeded()
                        //allow reading the database
                        .allowQueriesOnUiThread(true)
                        // at last we are calling a method to build.
                        .build();
        // on below line we are setting
        // configuration to our realm database.
        Realm.setDefaultConfiguration(config);

        search = findViewById(R.id.Search_Bar);

        GetMaterials();
        GetEnemies();
        GetBosses();
    }

    public void BackOnClick(View v){
        openActivity1();
    }
    public void SearchOnClick(View v) {
        String object = search.getText().toString();
        Realm realm = Realm.getDefaultInstance();
        //Materials

        RealmQuery<Materials> materialQuery = realm.where(Materials.class);
        List<Materials> materialsList = (materialQuery.findAll());
        //Enemies

        RealmQuery<Enemies> enemyQuery = realm.where(Enemies.class);
        List<Enemies> enemiesList = (enemyQuery.findAll());
        //Bosses
        RealmQuery<Bosses> bossQuery = realm.where(Bosses.class);
        List<Bosses> bossesList = (bossQuery.findAll());

        for(Materials m : materialsList) {
            if (m.getName().toLowerCase().contains(object.toLowerCase())) {
                openActivity3(m.getName());
            } else {
                for(Enemies e : enemiesList) {
                    if(e.getName().toLowerCase().contains(object.toLowerCase())) {
                        openActivity3(e.getName());
                    } else {
                        for(Bosses b : bossesList) {
                            if (b.getName().toLowerCase().contains(object.toLowerCase())) {
                                openActivity3(b.getName());
                            }
                        }
                    }
                }
            }
        }
    }

    public void openActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openActivity3(String MChoice){
        Intent intent = new Intent(this, Info_Viewer.class);
        intent.putExtra(Choice, MChoice);
        startActivity(intent);
    }

    public void GetMaterials() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Materials> tasksQuery = realm.where(Materials.class);
        Spinner MaterialSpinner = (Spinner) findViewById(R.id.Material_Spinner);
        List<Materials> materialsList = (tasksQuery.findAll());
        final String[] MaterialList = new String[materialsList.size() + 1];

        int i = 1;
        MaterialList[0] = "(Materials)";

        for(Materials m: materialsList) {
            MaterialList[i] = m.getName();
            i++;
        }

        ArrayAdapter<String> MaterialAdapter = new ArrayAdapter<>(Navigation.this, android.R.layout.simple_list_item_1 ,MaterialList);
        MaterialAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        MaterialSpinner.setAdapter(MaterialAdapter);

        MaterialSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(MaterialList[a]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void GetEnemies() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Enemies> tasksQuery = realm.where(Enemies.class);
        Spinner EnemySpinner = (Spinner) findViewById(R.id.Enemy_Spinner);
        List<Enemies> enemiesList = (tasksQuery.findAll());
        final String[] EnemiesList = new String[enemiesList.size() + 1];

        int i = 1;
        EnemiesList[0] = "(Enemies)";

        for(Enemies e: enemiesList) {
            EnemiesList[i] = e.getName();
            i++;
        }

        ArrayAdapter<String> MaterialAdapter = new ArrayAdapter<>(Navigation.this, android.R.layout.simple_list_item_1 ,EnemiesList);
        MaterialAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        EnemySpinner.setAdapter(MaterialAdapter);

        EnemySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(EnemiesList[a]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void GetBosses() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Bosses> tasksQuery = realm.where(Bosses.class);
        Spinner BossSpinner = (Spinner) findViewById(R.id.Boss_Spinner);
        List<Bosses> bossesList = (tasksQuery.findAll());
        final String[] BossesList = new String[bossesList.size() + 1];

        int i = 1;
        BossesList[0] = "(Bosses)";

        for(Bosses b: bossesList) {
            BossesList[i] = b.getName();
            i++;
        }

        ArrayAdapter<String> MaterialAdapter = new ArrayAdapter<>(Navigation.this, android.R.layout.simple_list_item_1 ,BossesList);
        MaterialAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        BossSpinner.setAdapter(MaterialAdapter);

        BossSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(BossesList[a]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
