package com.example.capstoneprojectterrariaguide;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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

public class Info_Viewer extends AppCompatActivity {

    public String maybe;

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
        Realm.setDefaultConfiguration(config);
        Intent intent = getIntent();
        maybe = intent.getStringExtra(ObjectList.Choice);
        tv.setText(maybe);
        SetContent();
    }

    public void BackOnClick(View v){
        openActivity2();
    }
    public void openActivity2(){
        Intent intent = new Intent(this, ObjectList.class);
        startActivity(intent);
    }

    public void SetContent() {
        Realm realm = Realm.getDefaultInstance();
        TextView tvT = findViewById(R.id.Info_Type);
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
                tvT.setText("Material");
                break;
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
                tvT.setText("Enemy");
                break;
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
                tvT.setText("Boss");
                break;
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
                tvT.setText("Sword");
                break;
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
                tvT.setText("Pickaxe");
                break;
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
                tvT.setText("Axe");
                break;
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
                tvT.setText("Hammer");
                break;
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
                tvT.setText("Spell Tome");
                break;
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
                tvT.setText("Wand");
                break;
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
                tvT.setText("Yo-Yo");
                break;
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
                tvT.setText("Spear");
                break;
            }
        }
        RealmQuery<Boomerangs> boomerangsQuery = realm.where(Boomerangs.class);
        List<Boomerangs> boomerangsList = (boomerangsQuery.findAll());
        for(Boomerangs b : boomerangsList) {
            if (b.getName().contains(maybe)) {
                tv2.setText(b.toString());
                newString = b.getName().replace(" ", "_").toLowerCase();
                int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                iv.setImageResource(resId);
                tvT.setText("Boomerang");
                break;
            }
        }
        RealmQuery<Flails> flailsQuery = realm.where(Flails.class);
        List<Flails> flailsList = (flailsQuery.findAll());
        for(Flails f : flailsList) {
            if (f.getName().contains(maybe)) {
                tv2.setText(f.toString());
                newString = f.getName().replace(" ", "_").toLowerCase();
                int resId = getResources().getIdentifier(newString, "drawable", getPackageName());
                iv.setImageResource(resId);
                tvT.setText("Flail");
                break;
            }
        }
    }
}
