package com.example.capstoneprojectterrariaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.capstoneprojectterrariaguide.Models.Axes;
import com.example.capstoneprojectterrariaguide.Models.Bosses;
import com.example.capstoneprojectterrariaguide.Models.Enemies;
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

public class Info_Viewer extends AppCompatActivity {

    String AppId = "capstone-szohf";
    public String maybe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_viewer);

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
                        // at last we are calling a method to build.
                        .build();
        // on below line we are setting
        // configuration to our realm database.
        TextView tv = findViewById(R.id.Name_View);
        Realm.setDefaultConfiguration(config);
        Intent intent = getIntent();
        maybe = intent.getStringExtra(Navigation.Choice);
        tv.setText(maybe);
        SetContent();
    }

    public void BackOnClick(View v){
        openActivity2();
    }
    public void openActivity2(){
        Intent intent = new Intent(this, Navigation.class);
        startActivity(intent);
    }

    public void SetContent() {
        Realm realm = Realm.getDefaultInstance();
        TextView tv2 = findViewById(R.id.Info_View);
        ImageView iv = findViewById(R.id.Material_Image);
        String newString;

        RealmQuery<Materials> materialsQuery = realm.where(Materials.class);
        List<Materials> materialsList = (materialsQuery.findAll());
        for(Materials m : materialsList) {
            if (m.getName().contains(maybe)) {
                tv2.setText(m.toString());
                newString = m.getName().replace(" ", "_").toLowerCase();
                int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                iv.setImageResource(resId);
            }
        }
        RealmQuery<Enemies> enemiesQuery = realm.where(Enemies.class);
        List<Enemies> enemiesList = (enemiesQuery.findAll());
        for(Enemies e : enemiesList) {
            if (e.getName().contains(maybe)) {
                tv2.setText(e.toString());
                newString = e.getName().replace(" ", "_").toLowerCase();
                int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                iv.setImageResource(resId);
            }
        }
        RealmQuery<Bosses> bossesQuery = realm.where(Bosses.class);
        List<Bosses> bossesList = (bossesQuery.findAll());
        for(Bosses b : bossesList) {
            if (b.getName().contains(maybe)) {
                tv2.setText(b.toString());
                newString = b.getName().replace(" ", "_").toLowerCase();
                int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                iv.setImageResource(resId);
            }
        }
        RealmQuery<Swords> swordsQuery = realm.where(Swords.class);
        List<Swords> swordsList = (swordsQuery.findAll());
        for(Swords s : swordsList) {
            if (s.getName().contains(maybe)) {
                tv2.setText(s.toString());
                newString = s.getName().replace(" ", "_").toLowerCase();
                int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                iv.setImageResource(resId);
            }
        }
        RealmQuery<Pickaxes> pickaxesQuery = realm.where(Pickaxes.class);
        List<Pickaxes> pickaxesList = (pickaxesQuery.findAll());
        for(Pickaxes p : pickaxesList) {
            if (p.getName().contains(maybe)) {
                tv2.setText(p.toString());
                newString = p.getName().replace(" ", "_").toLowerCase();
                int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                iv.setImageResource(resId);
            }
        }
        RealmQuery<Axes> axesQuery = realm.where(Axes.class);
        List<Axes> axesList = (axesQuery.findAll());
        for(Axes a : axesList) {
            if (a.getName().contains(maybe)) {
                tv2.setText(a.toString());
                newString = a.getName().replace(" ", "_").toLowerCase();
                int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                iv.setImageResource(resId);
            }
        }
        RealmQuery<Hammers> hammersQuery = realm.where(Hammers.class);
        List<Hammers> hammersList = (hammersQuery.findAll());
        for(Hammers h : hammersList) {
            if (h.getName().contains(maybe)) {
                tv2.setText(h.toString());
                newString = h.getName().replace(" ", "_").toLowerCase();
                int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                iv.setImageResource(resId);
            }
        }
        RealmQuery<SpellTomes> spellTomesQuery = realm.where(SpellTomes.class);
        List<SpellTomes> spellTomesList = (spellTomesQuery.findAll());
        for(SpellTomes st : spellTomesList) {
            if (st.getName().contains(maybe)) {
                tv2.setText(st.toString());
                newString = st.getName().replace(" ", "_").toLowerCase();
                int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                iv.setImageResource(resId);
            }
        }
        RealmQuery<Wands> wandsQuery = realm.where(Wands.class);
        List<Wands> wandsList = (wandsQuery.findAll());
        for(Wands w : wandsList) {
            if (w.getName().contains(maybe)) {
                tv2.setText(w.toString());
                newString = w.getName().replace(" ", "_").toLowerCase();
                int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                iv.setImageResource(resId);
            }
        }
        RealmQuery<YoYos> yoyosQuery = realm.where(YoYos.class);
        List<YoYos> yoyosList = (yoyosQuery.findAll());
        for(YoYos yy : yoyosList) {
            if (yy.getName().contains(maybe)) {
                tv2.setText(yy.toString());
                newString = yy.getName().replace(" ", "_").toLowerCase();
                int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                iv.setImageResource(resId);
            }
        }
        RealmQuery<Spears> spearsQuery = realm.where(Spears.class);
        List<Spears> spearsList = (spearsQuery.findAll());
        for(Spears sp : spearsList) {
            if (sp.getName().contains(maybe)) {
                tv2.setText(sp.toString());
                newString = sp.getName().replace(" ", "_").toLowerCase();
                int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                iv.setImageResource(resId);
            }
        }
    }
}
