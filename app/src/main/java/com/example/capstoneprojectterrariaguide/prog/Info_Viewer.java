package com.example.capstoneprojectterrariaguide.prog;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import com.example.capstoneprojectterrariaguide.Models.Axe;
import com.example.capstoneprojectterrariaguide.Models.Boomerang;
import com.example.capstoneprojectterrariaguide.Models.Boss;
import com.example.capstoneprojectterrariaguide.Models.Bow;
import com.example.capstoneprojectterrariaguide.Models.Enemy;
import com.example.capstoneprojectterrariaguide.Models.Flail;
import com.example.capstoneprojectterrariaguide.Models.Hammer;
import com.example.capstoneprojectterrariaguide.Models.Material;
import com.example.capstoneprojectterrariaguide.Models.Pickaxe;
import com.example.capstoneprojectterrariaguide.Models.Repeater;
import com.example.capstoneprojectterrariaguide.Models.Spear;
import com.example.capstoneprojectterrariaguide.Models.SpellTome;
import com.example.capstoneprojectterrariaguide.Models.Sword;
import com.example.capstoneprojectterrariaguide.Models.Wand;
import com.example.capstoneprojectterrariaguide.Models.YoYo;
import com.example.capstoneprojectterrariaguide.R;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmQuery;
import io.realm.mongodb.App;
import io.realm.mongodb.AppConfiguration;
import io.realm.mongodb.Credentials;
import io.realm.mongodb.User;

public class Info_Viewer extends AppCompatActivity {

    //Intent Values
    public String objectName;
    public String objectType;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_viewer);

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

        TextView tv = findViewById(R.id.Name_View);
        TextView tvT = findViewById(R.id.Info_Type);
        Realm.setDefaultConfiguration(config);
        Intent intent = getIntent();
        objectName = intent.getStringExtra(Object_List.Choice);
        objectType = intent.getStringExtra(Object_List.Type);
        tv.setText(objectName);
        tvT.setText("Type: " + objectType);
        SetContent();
    }

    //Button OnClick
    public void BackOnClick(View v) {
        openActivity2();
    }

    //Intent Opening
    public void openActivity2() {
        Intent intent = new Intent(this, Object_List.class);
        startActivity(intent);
    }

    //Grab data from Database and print it on the screen
    public void SetContent() {
        Realm realm = Realm.getDefaultInstance();
        TextView tv2 = findViewById(R.id.Info_View);
        ImageView iv = findViewById(R.id.Material_Image);
        String newString;

        if (objectType.equals("Material")) {
            RealmQuery<Material> materialsQuery = realm.where(Material.class);
            List<Material> materialList = (materialsQuery.findAll());
            for (Material m : materialList) {
                if (m.getName().equalsIgnoreCase(objectName)) {
                    Spanned test = HtmlCompat.fromHtml(m.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
                    tv2.setText(test);
                    newString = m.getName().replace(" ", "_").toLowerCase();
                    int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                    iv.setImageResource(resId);
                }
            }
        }
        if (objectType.equals("Enemy")) {
            RealmQuery<Enemy> enemiesQuery = realm.where(Enemy.class);
            List<Enemy> enemyList = (enemiesQuery.findAll());
            for (Enemy e : enemyList) {
                if (e.getName().equalsIgnoreCase(objectName)) {
                    Spanned test = HtmlCompat.fromHtml(e.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
                    tv2.setText(test);
                    newString = e.getName().replace(" ", "_").toLowerCase();
                    int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                    iv.setImageResource(resId);
                }
            }
        } if (objectType.equals("Boss")) {
            RealmQuery<Boss> bossesQuery = realm.where(Boss.class);
            List<Boss> bossList = (bossesQuery.findAll());
            for (Boss b : bossList) {
                if (b.getName().equalsIgnoreCase(objectName)) {
                    Spanned test = HtmlCompat.fromHtml(b.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
                    tv2.setText(test);
                    newString = b.getName().replace(" ", "_").toLowerCase();
                    int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                    iv.setImageResource(resId);
                }
            }
        } if (objectType.equals("Sword")) {
            RealmQuery<Sword> swordsQuery = realm.where(Sword.class);
            List<Sword> swordList = (swordsQuery.findAll());
            for (Sword s : swordList) {
                if (s.getName().equalsIgnoreCase(objectName)) {
                    Spanned test = HtmlCompat.fromHtml(s.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
                    tv2.setText(test);
                    newString = s.getName().replace(" ", "_").toLowerCase();
                    int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                    iv.setImageResource(resId);
                }
            }
        } if (objectType.equals("Pickaxe")) {
            RealmQuery<Pickaxe> pickaxesQuery = realm.where(Pickaxe.class);
            List<Pickaxe> pickaxeList = (pickaxesQuery.findAll());
            for (Pickaxe p : pickaxeList) {
                if (p.getName().equalsIgnoreCase(objectName)) {
                    Spanned test = HtmlCompat.fromHtml(p.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
                    tv2.setText(test);
                    newString = p.getName().replace(" ", "_").toLowerCase();
                    int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                    iv.setImageResource(resId);
                }
            }
        } if (objectType.equals("Axe")) {
            RealmQuery<Axe> axesQuery = realm.where(Axe.class);
            List<Axe> axeList = (axesQuery.findAll());
            for (Axe a : axeList) {
                if (a.getName().equalsIgnoreCase(objectName)) {
                    Spanned test = HtmlCompat.fromHtml(a.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
                    tv2.setText(test);
                    newString = a.getName().replace(" ", "_").toLowerCase();
                    int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                    iv.setImageResource(resId);
                }
            }
        } if (objectType.equals("Hammer")) {
            RealmQuery<Hammer> hammersQuery = realm.where(Hammer.class);
            List<Hammer> hammerList = (hammersQuery.findAll());
            for (Hammer h : hammerList) {
                if (h.getName().equalsIgnoreCase(objectName)) {
                    Spanned test = HtmlCompat.fromHtml(h.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
                    tv2.setText(test);
                    newString = h.getName().replace(" ", "_").toLowerCase();
                    int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                    iv.setImageResource(resId);
                }
            }
        } if (objectType.equals("SpellTome")) {
            RealmQuery<SpellTome> spellTomesQuery = realm.where(SpellTome.class);
            List<SpellTome> spellTomeList = (spellTomesQuery.findAll());
            for (SpellTome st : spellTomeList) {
                if (st.getName().equalsIgnoreCase(objectName)) {
                    Spanned test = HtmlCompat.fromHtml(st.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
                    tv2.setText(test);
                    newString = st.getName().replace(" ", "_").toLowerCase();
                    int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                    iv.setImageResource(resId);
                }
            }
        } if (objectType.equals("Wand")) {
            RealmQuery<Wand> wandsQuery = realm.where(Wand.class);
            List<Wand> wandList = (wandsQuery.findAll());
            for (Wand w : wandList) {
                if (w.getName().equalsIgnoreCase(objectName)) {
                    Spanned test = HtmlCompat.fromHtml(w.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
                    tv2.setText(test);
                    newString = w.getName().replace(" ", "_").toLowerCase();
                    int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                    iv.setImageResource(resId);
                }
            }
        } if (objectType.equals("YoYo")) {
            RealmQuery<YoYo> yoyosQuery = realm.where(YoYo.class);
            List<YoYo> yoyosList = (yoyosQuery.findAll());
            for (YoYo yy : yoyosList) {
                if (yy.getName().equalsIgnoreCase(objectName)) {
                    Spanned test = HtmlCompat.fromHtml(yy.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
                    tv2.setText(test);
                    newString = yy.getName().replace(" ", "_").toLowerCase();
                    int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                    iv.setImageResource(resId);
                }
            }
        } if (objectType.equals("Spear")) {
            RealmQuery<Spear> spearsQuery = realm.where(Spear.class);
            List<Spear> spearList = (spearsQuery.findAll());
            for (Spear sp : spearList) {
                if (sp.getName().equalsIgnoreCase(objectName)) {
                    Spanned test = HtmlCompat.fromHtml(sp.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
                    tv2.setText(test);
                    newString = sp.getName().replace(" ", "_").toLowerCase();
                    int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                    iv.setImageResource(resId);
                }
            }
        } if (objectType.equals("Boomerang")) {
            RealmQuery<Boomerang> boomerangsQuery = realm.where(Boomerang.class);
            List<Boomerang> boomerangList = (boomerangsQuery.findAll());
            for (Boomerang b : boomerangList) {
                if (b.getName().equalsIgnoreCase(objectName)) {
                    Spanned test = HtmlCompat.fromHtml(b.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
                    tv2.setText(test);
                    newString = b.getName().replace(" ", "_").toLowerCase();
                    int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                    iv.setImageResource(resId);
                }
            }
        } if (objectType.equals("Flail")) {
            RealmQuery<Flail> flailsQuery = realm.where(Flail.class);
            List<Flail> flailList = (flailsQuery.findAll());
            for (Flail f : flailList) {
                if (f.getName().equalsIgnoreCase(objectName)) {
                    Spanned test = HtmlCompat.fromHtml(f.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
                    tv2.setText(test);
                    newString = f.getName().replace(" ", "_").toLowerCase();
                    int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                    iv.setImageResource(resId);
                }
            }
        } if (objectType.equals("Bow")) {
            RealmQuery<Bow> bowsQuery = realm.where(Bow.class);
            List<Bow> bowList = (bowsQuery.findAll());
            for (Bow b : bowList) {
                if (b.getName().equalsIgnoreCase(objectName)) {
                    Spanned test = HtmlCompat.fromHtml(b.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
                    tv2.setText(test);
                    newString = b.getName().replace(" ", "_").toLowerCase();
                    int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                    iv.setImageResource(resId);
                }
            }
        } if (objectType.equals("Repeater")) {
            RealmQuery<Repeater> repeatersQuery = realm.where(Repeater.class);
            List<Repeater> repeaterList = (repeatersQuery.findAll());
            for (Repeater r : repeaterList) {
                if (r.getName().equalsIgnoreCase(objectName)) {
                    Spanned test = HtmlCompat.fromHtml(r.toString(), HtmlCompat.FROM_HTML_MODE_LEGACY);
                    tv2.setText(test);
                    newString = r.getName().replace(" ", "_").toLowerCase();
                    int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                    iv.setImageResource(resId);
                }
            }
        }
    }
}

