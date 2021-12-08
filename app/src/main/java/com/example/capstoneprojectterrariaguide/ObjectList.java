package com.example.capstoneprojectterrariaguide;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.capstoneprojectterrariaguide.Models.Axes;
import com.example.capstoneprojectterrariaguide.Models.Boomerangs;
import com.example.capstoneprojectterrariaguide.Models.Bosses;
import com.example.capstoneprojectterrariaguide.Models.Enemies;
import com.example.capstoneprojectterrariaguide.Models.Flails;
import com.example.capstoneprojectterrariaguide.Models.Hammers;
import com.example.capstoneprojectterrariaguide.Models.Materials;
import com.example.capstoneprojectterrariaguide.Models.Pickaxes;
import com.example.capstoneprojectterrariaguide.Models.Spears;
import com.example.capstoneprojectterrariaguide.Models.SpellTomes;
import com.example.capstoneprojectterrariaguide.Models.Swords;
import com.example.capstoneprojectterrariaguide.Models.Wands;
import com.example.capstoneprojectterrariaguide.Models.YoYos;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmQuery;
import io.realm.mongodb.App;
import io.realm.mongodb.AppConfiguration;
import io.realm.mongodb.Credentials;
import io.realm.mongodb.User;

public class ObjectList extends AppCompatActivity {

    public static final String Choice = "com.example.capstoneprojectterrariaguide.Choice";
    public EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.objectlist_page);

        Realm.init(this);

        String AppId = "capstone-szohf";
        App app = new App(new AppConfiguration.Builder(AppId).build());

        Credentials credentials = Credentials.anonymous();

        app.loginAsync(credentials, result -> {
            if (result.isSuccess()) {
                Log.v("QUICKSTART", "Successfully authenticated anonymously.");
                User user = app.currentUser();
            } else {
                Log.e("QUICKSTART", "Failed to log in. Error: " + result.getError());
            }
        });


        // configuration to the realm database.
        RealmConfiguration config =
                new RealmConfiguration.Builder()
                        .allowWritesOnUiThread(true)
                        .deleteRealmIfMigrationNeeded()
                        .build();

        Realm.setDefaultConfiguration(config);

        search = findViewById(R.id.Search_Bar);

        GetMaterials();
        GetEnemies();
        GetBosses();
        GetSwords();
        GetPickaxes();
        GetAxes();
        GetHammers();
        GetSpellTomes();
        GetWands();
        GetYoYos();
        GetSpears();
        GetBoomerangs();
        GetFlails();
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

        //Swords
        RealmQuery<Swords> swordQuery = realm.where(Swords.class);
        List<Swords> swordsList = (swordQuery.findAll());

        //Pickaxes
        RealmQuery<Pickaxes> pickaxeQuery = realm.where(Pickaxes.class);
        List<Pickaxes> pickaxesList = (pickaxeQuery.findAll());

        //Axes
        RealmQuery<Axes> axeQuery = realm.where(Axes.class);
        List<Axes> axesList = (axeQuery.findAll());

        //Hammers
        RealmQuery<Hammers> hammerQuery = realm.where(Hammers.class);
        List<Hammers> hammersList = (hammerQuery.findAll());

        //SpellTomes
        RealmQuery<SpellTomes> spellTomesQuery = realm.where(SpellTomes.class);
        List<SpellTomes> spellTomesList = (spellTomesQuery.findAll());

        //Wands
        RealmQuery<Wands> wandsQuery = realm.where(Wands.class);
        List<Wands> wandsList = (wandsQuery.findAll());

        //YoYos
        RealmQuery<YoYos> yoyosQuery = realm.where(YoYos.class);
        List<YoYos> yoyosList = (yoyosQuery.findAll());

        //Spears
        RealmQuery<Spears> spearsQuery = realm.where(Spears.class);
        List<Spears> spearsList = (spearsQuery.findAll());

        //Boomerangs
        RealmQuery<Boomerangs> boomerangsQuery = realm.where(Boomerangs.class);
        List<Boomerangs> boomerangsList = (boomerangsQuery.findAll());

        //Flails
        RealmQuery<Flails> flailsQuery = realm.where(Flails.class);
        List<Flails> flailsList = (flailsQuery.findAll());

        for(Materials m : materialsList) {
            if (m.getName().toLowerCase().contains(object.toLowerCase())) {
                openActivity3(m.getName());
            }
        }
        for(Enemies e : enemiesList) {
            if (e.getName().toLowerCase().contains(object.toLowerCase())) {
                openActivity3(e.getName());
            }
        }
        for(Bosses b : bossesList) {
            if (b.getName().toLowerCase().contains(object.toLowerCase())) {
                openActivity3(b.getName());
            }
        }
        for(Swords s : swordsList) {
            if (s.getName().toLowerCase().contains(object.toLowerCase())) {
                openActivity3(s.getName());
            }
        }
        for(Pickaxes p : pickaxesList) {
            if (p.getName().toLowerCase().contains(object.toLowerCase())) {
                openActivity3(p.getName());
            }
        }
        for(Axes a : axesList) {
            if (a.getName().toLowerCase().contains(object.toLowerCase())) {
                openActivity3(a.getName());
            }
        }
        for(Hammers h : hammersList) {
            if (h.getName().toLowerCase().contains(object.toLowerCase())) {
                openActivity3(h.getName());
            }
        }
        for(SpellTomes st : spellTomesList) {
            if (st.getName().toLowerCase().contains(object.toLowerCase())) {
                openActivity3(st.getName());
            }
        }
        for(Wands w : wandsList) {
            if (w.getName().toLowerCase().contains(object.toLowerCase())) {
                openActivity3(w.getName());
            }
        }
        for(YoYos yy : yoyosList) {
            if (yy.getName().toLowerCase().contains(object.toLowerCase())) {
                openActivity3(yy.getName());
            }
        }
        for(Spears sp : spearsList) {
            if (sp.getName().toLowerCase().contains(object.toLowerCase())) {
                openActivity3(sp.getName());
            }
        }
        for(Boomerangs b : boomerangsList) {
            if (b.getName().toLowerCase().contains(object.toLowerCase())) {
                openActivity3(b.getName());
            }
        }
        for(Flails f : flailsList) {
            if (f.getName().toLowerCase().contains(object.toLowerCase())) {
                openActivity3(f.getName());
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

        ArrayAdapter<String> MaterialAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1 ,MaterialList);
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

        ArrayAdapter<String> EnemyAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1 ,EnemiesList);
        EnemyAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        EnemySpinner.setAdapter(EnemyAdapter);

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

        ArrayAdapter<String> BossAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1 ,BossesList);
        BossAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        BossSpinner.setAdapter(BossAdapter);

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
    public void GetSwords() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Swords> tasksQuery = realm.where(Swords.class);
        Spinner SwordSpinner = (Spinner) findViewById(R.id.Sword_Spinner);
        List<Swords> swordsList = (tasksQuery.findAll());
        final String[] SwordsList = new String[swordsList.size() + 1];

        int i = 1;
        SwordsList[0] = "(Swords)";

        for(Swords s: swordsList) {
            SwordsList[i] = s.getName();
            i++;
        }

        ArrayAdapter<String> SwordAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1 ,SwordsList);
        SwordAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        SwordSpinner.setAdapter(SwordAdapter);

        SwordSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(SwordsList[a]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void GetPickaxes() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Pickaxes> tasksQuery = realm.where(Pickaxes.class);
        Spinner PickaxeSpinner = (Spinner) findViewById(R.id.Pickaxe_Spinner);
        List<Pickaxes> pickaxesList = (tasksQuery.findAll());
        final String[] PickaxesList = new String[pickaxesList.size() + 1];

        int i = 1;
        PickaxesList[0] = "(Pickaxes)";

        for(Pickaxes p: pickaxesList) {
            PickaxesList[i] = p.getName();
            i++;
        }

        ArrayAdapter<String> PickaxeAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1 ,PickaxesList);
        PickaxeAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        PickaxeSpinner.setAdapter(PickaxeAdapter);

        PickaxeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(PickaxesList[a]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void GetAxes() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Axes> tasksQuery = realm.where(Axes.class);
        Spinner AxeSpinner = (Spinner) findViewById(R.id.Axe_Spinner);
        List<Axes> axesList = (tasksQuery.findAll());
        final String[] AxesList = new String[axesList.size() + 1];

        int i = 1;
        AxesList[0] = "(Axes)";

        for(Axes a: axesList) {
            AxesList[i] = a.getName();
            i++;
        }

        ArrayAdapter<String> AxeAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1 ,AxesList);
        AxeAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        AxeSpinner.setAdapter(AxeAdapter);

        AxeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(AxesList[a]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void GetHammers() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Hammers> tasksQuery = realm.where(Hammers.class);
        Spinner HammerSpinner = (Spinner) findViewById(R.id.Hammer_Spinner);
        List<Hammers> hammersList = (tasksQuery.findAll());
        final String[] HammersList = new String[hammersList.size() + 1];

        int i = 1;
        HammersList[0] = "(Hammers)";

        for(Hammers h: hammersList) {
            HammersList[i] = h.getName();
            i++;
        }

        ArrayAdapter<String> HammerAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1 ,HammersList);
        HammerAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        HammerSpinner.setAdapter(HammerAdapter);

        HammerSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(HammersList[a]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void GetSpellTomes() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<SpellTomes> tasksQuery = realm.where(SpellTomes.class);
        Spinner SpellTomeSpinner = (Spinner) findViewById(R.id.SpellTome_Spinner);
        List<SpellTomes> spellTomesList = (tasksQuery.findAll());
        final String[] SpellTomesList = new String[spellTomesList.size() + 1];

        int i = 1;
        SpellTomesList[0] = "(Spell Tomes)";

        for(SpellTomes st: spellTomesList) {
            SpellTomesList[i] = st.getName();
            i++;
        }

        ArrayAdapter<String> SpellTomeAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1 ,SpellTomesList);
        SpellTomeAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        SpellTomeSpinner.setAdapter(SpellTomeAdapter);

        SpellTomeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(SpellTomesList[a]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void GetWands() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Wands> tasksQuery = realm.where(Wands.class);
        Spinner WandSpinner = (Spinner) findViewById(R.id.Wand_Spinner);
        List<Wands> wandsList = (tasksQuery.findAll());
        final String[] WandsList = new String[wandsList.size() + 1];

        int i = 1;
        WandsList[0] = "(Wands)";

        for(Wands w: wandsList) {
            WandsList[i] = w.getName();
            i++;
        }

        final ArrayAdapter<String> WandAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1 ,WandsList);
        WandAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        WandSpinner.setAdapter(WandAdapter);

        WandSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(WandsList[a]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void GetYoYos() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<YoYos> tasksQuery = realm.where(YoYos.class);
        Spinner YoYoSpinner = (Spinner) findViewById(R.id.YoYo_Spinner);
        List<YoYos> yoyosList = (tasksQuery.findAll());
        final String[] YoYosList = new String[yoyosList.size() + 1];

        int i = 1;
        YoYosList[0] = "(YoYos)";

        for(YoYos yy: yoyosList) {
            YoYosList[i] = yy.getName();
            i++;
        }

        final ArrayAdapter<String> YoYoAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1 ,YoYosList);
        YoYoAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        YoYoSpinner.setAdapter(YoYoAdapter);

        YoYoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(YoYosList[a]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void GetSpears() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Spears> tasksQuery = realm.where(Spears.class);
        Spinner SpearSpinner = (Spinner) findViewById(R.id.Spear_Spinner);
        List<Spears> spearsList = (tasksQuery.findAll());
        final String[] SpearsList = new String[spearsList.size() + 1];

        int i = 1;
        SpearsList[0] = "(Spears)";

        for(Spears sp: spearsList) {
            SpearsList[i] = sp.getName();
            i++;
        }

        final ArrayAdapter<String> SpearAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1 ,SpearsList);
        SpearAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        SpearSpinner.setAdapter(SpearAdapter);

        SpearSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(SpearsList[a]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void GetBoomerangs() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Boomerangs> tasksQuery = realm.where(Boomerangs.class);
        Spinner BoomerangSpinner = (Spinner) findViewById(R.id.Boomerang_Spinner);
        List<Boomerangs> boomerangsList = (tasksQuery.findAll());
        final String[] BoomerangsList = new String[boomerangsList.size() + 1];

        int i = 1;
        BoomerangsList[0] = "(Boomerangs)";

        for(Boomerangs b: boomerangsList) {
            BoomerangsList[i] = b.getName();
            i++;
        }

        final ArrayAdapter<String> BoomerangsAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1 ,BoomerangsList);
        BoomerangsAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        BoomerangSpinner.setAdapter(BoomerangsAdapter);

        BoomerangSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(BoomerangsList[a]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void GetFlails() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Flails> tasksQuery = realm.where(Flails.class);
        Spinner FlailSpinner = (Spinner) findViewById(R.id.Flail_Spinner);
        List<Flails> flailsList = (tasksQuery.findAll());
        final String[] FlailsList = new String[flailsList.size() + 1];

        int i = 1;
        FlailsList[0] = "(Flails)";

        for(Flails f: flailsList) {
            FlailsList[i] = f.getName();
            i++;
        }

        final ArrayAdapter<String> FlailAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1 ,FlailsList);
        FlailAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        FlailSpinner.setAdapter(FlailAdapter);

        FlailSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(FlailsList[a]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
