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

import com.example.capstoneprojectterrariaguide.Models.Axe;
import com.example.capstoneprojectterrariaguide.Models.Boomerang;
import com.example.capstoneprojectterrariaguide.Models.Boss;
import com.example.capstoneprojectterrariaguide.Models.Enemy;
import com.example.capstoneprojectterrariaguide.Models.Flail;
import com.example.capstoneprojectterrariaguide.Models.Hammer;
import com.example.capstoneprojectterrariaguide.Models.Material;
import com.example.capstoneprojectterrariaguide.Models.Pickaxe;
import com.example.capstoneprojectterrariaguide.Models.Spear;
import com.example.capstoneprojectterrariaguide.Models.SpellTome;
import com.example.capstoneprojectterrariaguide.Models.Sword;
import com.example.capstoneprojectterrariaguide.Models.Wand;
import com.example.capstoneprojectterrariaguide.Models.YoYo;

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
    public static final String Type = "com.example.capstoneprojectterrariaguide.Type";
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
                System.out.println(user);
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

    public void BackOnClick(View v) {
        openActivity1();
    }

    public void SearchOnClick(View v) {
        String object = search.getText().toString();
        Realm realm = Realm.getDefaultInstance();

        //Materials
        RealmQuery<Material> materialQuery = realm.where(Material.class);
        List<Material> materialList = (materialQuery.findAll());

        //Enemies
        RealmQuery<Enemy> enemyQuery = realm.where(Enemy.class);
        List<Enemy> enemyList = (enemyQuery.findAll());

        //Bosses
        RealmQuery<Boss> bossQuery = realm.where(Boss.class);
        List<Boss> bossList = (bossQuery.findAll());

        //Swords
        RealmQuery<Sword> swordQuery = realm.where(Sword.class);
        List<Sword> swordList = (swordQuery.findAll());

        //Pickaxes
        RealmQuery<Pickaxe> pickaxeQuery = realm.where(Pickaxe.class);
        List<Pickaxe> pickaxeList = (pickaxeQuery.findAll());

        //Axes
        RealmQuery<Axe> axeQuery = realm.where(Axe.class);
        List<Axe> axeList = (axeQuery.findAll());

        //Hammers
        RealmQuery<Hammer> hammerQuery = realm.where(Hammer.class);
        List<Hammer> hammerList = (hammerQuery.findAll());

        //SpellTomes
        RealmQuery<SpellTome> spellTomesQuery = realm.where(SpellTome.class);
        List<SpellTome> spellTomeList = (spellTomesQuery.findAll());

        //Wands
        RealmQuery<Wand> wandsQuery = realm.where(Wand.class);
        List<Wand> wandList = (wandsQuery.findAll());

        //YoYos
        RealmQuery<YoYo> yoyosQuery = realm.where(YoYo.class);
        List<YoYo> yoyosList = (yoyosQuery.findAll());

        //Spears
        RealmQuery<Spear> spearsQuery = realm.where(Spear.class);
        List<Spear> spearList = (spearsQuery.findAll());

        //Boomerangs
        RealmQuery<Boomerang> boomerangsQuery = realm.where(Boomerang.class);
        List<Boomerang> boomerangList = (boomerangsQuery.findAll());

        //Flails
        RealmQuery<Flail> flailsQuery = realm.where(Flail.class);
        List<Flail> flailList = (flailsQuery.findAll());

        for (Material m : materialList) {
            if (m.getName().equalsIgnoreCase(object)) {
                openActivity3(m.getName(), "Material");
            }
        }

        for (Enemy e : enemyList) {
            if (e.getName().equalsIgnoreCase(object)) {
                openActivity3(e.getName(), "Enemy");
            }
        }

        for (Boss b : bossList) {
            if (b.getName().equalsIgnoreCase(object)) {
                openActivity3(b.getName(), "Boss");
            }
        }

        for (Sword s : swordList) {
            if (s.getName().equalsIgnoreCase(object)) {
                openActivity3(s.getName(), "Sword");
            }
        }

        for (Pickaxe p : pickaxeList) {
            if (p.getName().equalsIgnoreCase(object)) {
                openActivity3(p.getName(), "Pickaxe");
            }
        }

        for (Axe a : axeList) {
            if (a.getName().equalsIgnoreCase(object)) {
                openActivity3(a.getName(), "Axe");
            }
        }

        for (Hammer h : hammerList) {
            if (h.getName().equalsIgnoreCase(object)) {
                openActivity3(h.getName(), "Hammer");
            }
        }

        for (SpellTome st : spellTomeList) {
            if (st.getName().equalsIgnoreCase(object)) {
                openActivity3(st.getName(), "SpellTome");
            }
        }
        for (Wand w : wandList) {
            if (w.getName().equalsIgnoreCase(object)) {
                openActivity3(w.getName(), "Wand");
            }
        }
        for (YoYo yy : yoyosList) {
            if (yy.getName().equalsIgnoreCase(object)) {
                openActivity3(yy.getName(), "YoYo");
            }
        }
        for (Spear sp : spearList) {
            if (sp.getName().equalsIgnoreCase(object)) {
                openActivity3(sp.getName(), "Spear");
            }
        }
        for (Boomerang b : boomerangList) {
            if (b.getName().equalsIgnoreCase(object)) {
                openActivity3(b.getName(), "Boomerang");
            }
        }
        for (Flail f : flailList) {
            if (f.getName().equalsIgnoreCase(object)) {
                openActivity3(f.getName(), "Flail");
            }
        }
    }

    public void openActivity1() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openActivity3(String MChoice, String MType) {
        Intent intent = new Intent(this, Info_Viewer.class);
        intent.putExtra(Choice, MChoice);
        intent.putExtra(Type, MType);
        startActivity(intent);
    }

    public void GetMaterials() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Material> tasksQuery = realm.where(Material.class);
        Spinner MaterialSpinner = (Spinner) findViewById(R.id.Material_Spinner);
        List<Material> materialList = (tasksQuery.findAll());
        final String[] MaterialList = new String[materialList.size() + 1];

        int i = 1;
        MaterialList[0] = "(Materials)";

        for (Material m : materialList) {
            MaterialList[i] = m.getName();
            i++;
        }

        ArrayAdapter<String> MaterialAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1, MaterialList);
        MaterialAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        MaterialSpinner.setAdapter(MaterialAdapter);

        MaterialSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(MaterialList[a], "Material");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void GetEnemies() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Enemy> tasksQuery = realm.where(Enemy.class);
        Spinner EnemySpinner = (Spinner) findViewById(R.id.Enemy_Spinner);
        List<Enemy> enemyList = (tasksQuery.findAll());
        final String[] EnemiesList = new String[enemyList.size() + 1];

        int i = 1;
        EnemiesList[0] = "(Enemies)";

        for (Enemy e : enemyList) {
            EnemiesList[i] = e.getName();
            i++;
        }

        ArrayAdapter<String> EnemyAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1, EnemiesList);
        EnemyAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        EnemySpinner.setAdapter(EnemyAdapter);

        EnemySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(EnemiesList[a], "Enemy");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void GetBosses() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Boss> tasksQuery = realm.where(Boss.class);
        Spinner BossSpinner = (Spinner) findViewById(R.id.Boss_Spinner);
        List<Boss> bossList = (tasksQuery.findAll());
        final String[] BossesList = new String[bossList.size() + 1];

        int i = 1;
        BossesList[0] = "(Bosses)";

        for (Boss b : bossList) {
            BossesList[i] = b.getName();
            i++;
        }

        ArrayAdapter<String> BossAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1, BossesList);
        BossAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        BossSpinner.setAdapter(BossAdapter);

        BossSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(BossesList[a], "Boss");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void GetSwords() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Sword> tasksQuery = realm.where(Sword.class);
        Spinner SwordSpinner = (Spinner) findViewById(R.id.Sword_Spinner);
        List<Sword> swordList = (tasksQuery.findAll());
        final String[] SwordsList = new String[swordList.size() + 1];

        int i = 1;
        SwordsList[0] = "(Swords)";

        for (Sword s : swordList) {
            SwordsList[i] = s.getName();
            i++;
        }

        ArrayAdapter<String> SwordAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1, SwordsList);
        SwordAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        SwordSpinner.setAdapter(SwordAdapter);

        SwordSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(SwordsList[a], "Sword");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void GetPickaxes() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Pickaxe> tasksQuery = realm.where(Pickaxe.class);
        Spinner PickaxeSpinner = (Spinner) findViewById(R.id.Pickaxe_Spinner);
        List<Pickaxe> pickaxeList = (tasksQuery.findAll());
        final String[] PickaxesList = new String[pickaxeList.size() + 1];

        int i = 1;
        PickaxesList[0] = "(Pickaxes)";

        for (Pickaxe p : pickaxeList) {
            PickaxesList[i] = p.getName();
            i++;
        }

        ArrayAdapter<String> PickaxeAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1, PickaxesList);
        PickaxeAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        PickaxeSpinner.setAdapter(PickaxeAdapter);

        PickaxeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(PickaxesList[a], "Pickaxe");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void GetAxes() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Axe> tasksQuery = realm.where(Axe.class);
        Spinner AxeSpinner = (Spinner) findViewById(R.id.Axe_Spinner);
        List<Axe> axeList = (tasksQuery.findAll());
        final String[] AxesList = new String[axeList.size() + 1];

        int i = 1;
        AxesList[0] = "(Axes)";

        for (Axe a : axeList) {
            AxesList[i] = a.getName();
            i++;
        }

        ArrayAdapter<String> AxeAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1, AxesList);
        AxeAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        AxeSpinner.setAdapter(AxeAdapter);

        AxeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(AxesList[a], "Axe");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void GetHammers() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Hammer> tasksQuery = realm.where(Hammer.class);
        Spinner HammerSpinner = (Spinner) findViewById(R.id.Hammer_Spinner);
        List<Hammer> hammerList = (tasksQuery.findAll());
        final String[] HammersList = new String[hammerList.size() + 1];

        int i = 1;
        HammersList[0] = "(Hammers)";

        for (Hammer h : hammerList) {
            HammersList[i] = h.getName();
            i++;
        }

        ArrayAdapter<String> HammerAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1, HammersList);
        HammerAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        HammerSpinner.setAdapter(HammerAdapter);

        HammerSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(HammersList[a], "Hammer");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void GetSpellTomes() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<SpellTome> tasksQuery = realm.where(SpellTome.class);
        Spinner SpellTomeSpinner = (Spinner) findViewById(R.id.SpellTome_Spinner);
        List<SpellTome> spellTomeList = (tasksQuery.findAll());
        final String[] SpellTomesList = new String[spellTomeList.size() + 1];

        int i = 1;
        SpellTomesList[0] = "(Spell Tomes)";

        for (SpellTome st : spellTomeList) {
            SpellTomesList[i] = st.getName();
            i++;
        }

        ArrayAdapter<String> SpellTomeAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1, SpellTomesList);
        SpellTomeAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        SpellTomeSpinner.setAdapter(SpellTomeAdapter);

        SpellTomeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(SpellTomesList[a], "SpellTome");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void GetWands() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Wand> tasksQuery = realm.where(Wand.class);
        Spinner WandSpinner = (Spinner) findViewById(R.id.Wand_Spinner);
        List<Wand> wandList = (tasksQuery.findAll());
        final String[] WandsList = new String[wandList.size() + 1];

        int i = 1;
        WandsList[0] = "(Wands)";

        for (Wand w : wandList) {
            WandsList[i] = w.getName();
            i++;
        }

        final ArrayAdapter<String> WandAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1, WandsList);
        WandAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        WandSpinner.setAdapter(WandAdapter);

        WandSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(WandsList[a], "Wand");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void GetYoYos() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<YoYo> tasksQuery = realm.where(YoYo.class);
        Spinner YoYoSpinner = (Spinner) findViewById(R.id.YoYo_Spinner);
        List<YoYo> yoyosList = (tasksQuery.findAll());
        final String[] YoYosList = new String[yoyosList.size() + 1];

        int i = 1;
        YoYosList[0] = "(YoYos)";

        for (YoYo yy : yoyosList) {
            YoYosList[i] = yy.getName();
            i++;
        }

        final ArrayAdapter<String> YoYoAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1, YoYosList);
        YoYoAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        YoYoSpinner.setAdapter(YoYoAdapter);

        YoYoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(YoYosList[a], "YoYo");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void GetSpears() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Spear> tasksQuery = realm.where(Spear.class);
        Spinner SpearSpinner = (Spinner) findViewById(R.id.Spear_Spinner);
        List<Spear> spearList = (tasksQuery.findAll());
        final String[] SpearsList = new String[spearList.size() + 1];

        int i = 1;
        SpearsList[0] = "(Spears)";

        for (Spear sp : spearList) {
            SpearsList[i] = sp.getName();
            i++;
        }

        final ArrayAdapter<String> SpearAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1, SpearsList);
        SpearAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        SpearSpinner.setAdapter(SpearAdapter);

        SpearSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(SpearsList[a], "Spear");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void GetBoomerangs() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Boomerang> tasksQuery = realm.where(Boomerang.class);
        Spinner BoomerangSpinner = (Spinner) findViewById(R.id.Boomerang_Spinner);
        List<Boomerang> boomerangList = (tasksQuery.findAll());
        final String[] BoomerangsList = new String[boomerangList.size() + 1];

        int i = 1;
        BoomerangsList[0] = "(Boomerangs)";

        for (Boomerang b : boomerangList) {
            BoomerangsList[i] = b.getName();
            i++;
        }

        final ArrayAdapter<String> BoomerangsAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1, BoomerangsList);
        BoomerangsAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        BoomerangSpinner.setAdapter(BoomerangsAdapter);

        BoomerangSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(BoomerangsList[a], "Boomerang");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void GetFlails() {
        Realm realm = Realm.getDefaultInstance();
        RealmQuery<Flail> tasksQuery = realm.where(Flail.class);
        Spinner FlailSpinner = (Spinner) findViewById(R.id.Flail_Spinner);
        List<Flail> flailList = (tasksQuery.findAll());
        final String[] FlailsList = new String[flailList.size() + 1];

        int i = 1;
        FlailsList[0] = "(Flails)";

        for (Flail f : flailList) {
            FlailsList[i] = f.getName();
            i++;
        }

        final ArrayAdapter<String> FlailAdapter = new ArrayAdapter<>(ObjectList.this, android.R.layout.simple_list_item_1, FlailsList);
        FlailAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        FlailSpinner.setAdapter(FlailAdapter);

        FlailSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int a, long id) {

                if (a != 0) {
                    openActivity3(FlailsList[a], "Flail");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
