package com.example.capstoneprojectterrariaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.capstoneprojectterrariaguide.Generate_Values.Generate_Axes;
import com.example.capstoneprojectterrariaguide.Generate_Values.Generate_Boomerangs;
import com.example.capstoneprojectterrariaguide.Generate_Values.Generate_Bosses;
import com.example.capstoneprojectterrariaguide.Generate_Values.Generate_Enemies;
import com.example.capstoneprojectterrariaguide.Generate_Values.Generate_Flails;
import com.example.capstoneprojectterrariaguide.Generate_Values.Generate_Hammers;
import com.example.capstoneprojectterrariaguide.Generate_Values.Generate_Materials;
import com.example.capstoneprojectterrariaguide.Generate_Values.Generate_Pickaxes;
import com.example.capstoneprojectterrariaguide.Generate_Values.Generate_Spears;
import com.example.capstoneprojectterrariaguide.Generate_Values.Generate_SpellTomes;
import com.example.capstoneprojectterrariaguide.Generate_Values.Generate_Swords;
import com.example.capstoneprojectterrariaguide.Generate_Values.Generate_Wands;
import com.example.capstoneprojectterrariaguide.Generate_Values.Generate_YoYos;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.mongodb.App;
import io.realm.mongodb.AppConfiguration;
import io.realm.mongodb.Credentials;
import io.realm.mongodb.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        addMaterialsToDatabase();
        addEnemiesToDatabase();
        addBossesToDatabase();
        addSwordsToDatabase();
        addPickaxesToDatabase();
        addAxesToDatabase();
        addHammersToDatabase();
        addSpellTomesToDatabase();
        addWandsToDatabase();
        addYoYosToDatabase();
        addSpearsToDatabase();
        addBoomerangsToDatabase();
        addFlailsToDatabase();

    }

    public void StartOnClick(View v){
        openActivity2();
    }
    public void openActivity2(){
        Intent intent = new Intent(this, ObjectList.class);
        startActivity(intent);
    }

    public void addMaterialsToDatabase() {
        //Get Materials
        final Generate_Materials gm = new Generate_Materials();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransaction(realm1 -> {

            //Add Bar Materials
            realm1.copyToRealmOrUpdate(gm.Adamantite_Bar);
            realm1.copyToRealmOrUpdate(gm.Chlorophyte_Bar);
            realm1.copyToRealmOrUpdate(gm.Cobalt_Bar);
            realm1.copyToRealmOrUpdate(gm.Copper_Bar);
            realm1.copyToRealmOrUpdate(gm.Crimtane_Bar);
            realm1.copyToRealmOrUpdate(gm.Demonite_Bar);
            realm1.copyToRealmOrUpdate(gm.Gold_Bar);
            realm1.copyToRealmOrUpdate(gm.Hallowed_Bar);
            realm1.copyToRealmOrUpdate(gm.Hellstone_Bar);
            realm1.copyToRealmOrUpdate(gm.Iron_Bar);
            realm1.copyToRealmOrUpdate(gm.Lead_Bar);
            realm1.copyToRealmOrUpdate(gm.Luminite_Bar);
            realm1.copyToRealmOrUpdate(gm.Meteorite_Bar);
            realm1.copyToRealmOrUpdate(gm.Mythril_Bar);
            realm1.copyToRealmOrUpdate(gm.Orichalcum_Bar);
            realm1.copyToRealmOrUpdate(gm.Palladium_Bar);
            realm1.copyToRealmOrUpdate(gm.Platinum_Bar);
            realm1.copyToRealmOrUpdate(gm.Shroomite_Bar);
            realm1.copyToRealmOrUpdate(gm.Silver_Bar);
            realm1.copyToRealmOrUpdate(gm.Spectre_Bar);
            realm1.copyToRealmOrUpdate(gm.Tin_Bar);
            realm1.copyToRealmOrUpdate(gm.Titanium_Bar);
            realm1.copyToRealmOrUpdate(gm.Tungsten_Bar);

            //Add Gem Materials
            realm1.copyToRealmOrUpdate(gm.Amber);
            realm1.copyToRealmOrUpdate(gm.Amethyst);
            realm1.copyToRealmOrUpdate(gm.Diamond);
            realm1.copyToRealmOrUpdate(gm.Emerald);
            realm1.copyToRealmOrUpdate(gm.Ruby);
            realm1.copyToRealmOrUpdate(gm.Sapphire);
            realm1.copyToRealmOrUpdate(gm.Topaz);

            //Add Ore Materials
            realm1.copyToRealmOrUpdate(gm.Adamantite_Ore);
            realm1.copyToRealmOrUpdate(gm.Chlorophyte_Ore);
            realm1.copyToRealmOrUpdate(gm.Cobalt_Ore);
            realm1.copyToRealmOrUpdate(gm.Copper_Ore);
            realm1.copyToRealmOrUpdate(gm.Crimtane_Ore);
            realm1.copyToRealmOrUpdate(gm.Demonite_Ore);
            realm1.copyToRealmOrUpdate(gm.Gold_Ore);
            realm1.copyToRealmOrUpdate(gm.Hellstone);
            realm1.copyToRealmOrUpdate(gm.Iron_Ore);
            realm1.copyToRealmOrUpdate(gm.Lead_Ore);
            realm1.copyToRealmOrUpdate(gm.Luminite);
            realm1.copyToRealmOrUpdate(gm.Meteorite);
            realm1.copyToRealmOrUpdate(gm.Mythril_Ore);
            realm1.copyToRealmOrUpdate(gm.Obsidian);
            realm1.copyToRealmOrUpdate(gm.Orichalcum_Ore);
            realm1.copyToRealmOrUpdate(gm.Palladium_Ore);
            realm1.copyToRealmOrUpdate(gm.Platinum_Ore);
            realm1.copyToRealmOrUpdate(gm.Silver_Ore);
            realm1.copyToRealmOrUpdate(gm.Tin_Ore);
            realm1.copyToRealmOrUpdate(gm.Titanium_Ore);
            realm1.copyToRealmOrUpdate(gm.Tungsten_Ore);

            //Add Soul Materials
            realm1.copyToRealmOrUpdate(gm.Souls_of_Blight);
            realm1.copyToRealmOrUpdate(gm.Souls_of_Flight);
            realm1.copyToRealmOrUpdate(gm.Souls_of_Fright);
            realm1.copyToRealmOrUpdate(gm.Souls_of_Light);
            realm1.copyToRealmOrUpdate(gm.Souls_of_Might);
            realm1.copyToRealmOrUpdate(gm.Souls_of_Night);
            realm1.copyToRealmOrUpdate(gm.Souls_of_Sight);

        });
    }
    public void addEnemiesToDatabase() {
        //Get Enemies
        final Generate_Enemies ge = new Generate_Enemies();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(realm1 -> {

            //Add Pre-Hardmode Enemies
            realm1.copyToRealmOrUpdate(ge.Angry_Bones);
            realm1.copyToRealmOrUpdate(ge.Anomura_Fungus);
            realm1.copyToRealmOrUpdate(ge.Antlion);
            realm1.copyToRealmOrUpdate(ge.Antlion_Charger);
            realm1.copyToRealmOrUpdate(ge.Antlion_Larva);
            realm1.copyToRealmOrUpdate(ge.Antlion_Swarmer);
            realm1.copyToRealmOrUpdate(ge.Baby_Slime);
            realm1.copyToRealmOrUpdate(ge.Bee);
            realm1.copyToRealmOrUpdate(ge.Black_Slime);
            realm1.copyToRealmOrUpdate(ge.Blazing_Wheel);
            realm1.copyToRealmOrUpdate(ge.Blood_Crawler);
            realm1.copyToRealmOrUpdate(ge.Blue_Jellyfish);
            realm1.copyToRealmOrUpdate(ge.Blue_Slime);
            realm1.copyToRealmOrUpdate(ge.Bone_Serpent);
            realm1.copyToRealmOrUpdate(ge.Cave_Bat);
            realm1.copyToRealmOrUpdate(ge.Cochineal_Beetle);
            realm1.copyToRealmOrUpdate(ge.Crab);
            realm1.copyToRealmOrUpdate(ge.Crawdad);
            realm1.copyToRealmOrUpdate(ge.Crimera);
            realm1.copyToRealmOrUpdate(ge.Cursed_Skull);
            realm1.copyToRealmOrUpdate(ge.Cyan_Beetle);
            realm1.copyToRealmOrUpdate(ge.Dark_Caster);
            realm1.copyToRealmOrUpdate(ge.Demon);
            realm1.copyToRealmOrUpdate(ge.Demon_Eye);
            realm1.copyToRealmOrUpdate(ge.Devourer);
            realm1.copyToRealmOrUpdate(ge.Doctor_Bones);
            realm1.copyToRealmOrUpdate(ge.Dungeon_Guardian);
            realm1.copyToRealmOrUpdate(ge.Dungeon_Slime);
            realm1.copyToRealmOrUpdate(ge.Eater_of_Souls);
            realm1.copyToRealmOrUpdate(ge.Face_Monster);
            realm1.copyToRealmOrUpdate(ge.Fire_Imp);
            realm1.copyToRealmOrUpdate(ge.Frozen_Zombie);
            realm1.copyToRealmOrUpdate(ge.Fungi_Bulb);
            realm1.copyToRealmOrUpdate(ge.Ghost);
            realm1.copyToRealmOrUpdate(ge.Giant_Antlion_Charger);
            realm1.copyToRealmOrUpdate(ge.Giant_Antlion_Swarmer);
            realm1.copyToRealmOrUpdate(ge.Giant_Shelly);
            realm1.copyToRealmOrUpdate(ge.Giant_Worm);
            realm1.copyToRealmOrUpdate(ge.Gnome);
            realm1.copyToRealmOrUpdate(ge.Goblin_Scout);
            realm1.copyToRealmOrUpdate(ge.Granite_Elemental);
            realm1.copyToRealmOrUpdate(ge.Granite_Golem);
            realm1.copyToRealmOrUpdate(ge.Green_Slime);
            realm1.copyToRealmOrUpdate(ge.Harpy);
            realm1.copyToRealmOrUpdate(ge.Hell_Bat);
            realm1.copyToRealmOrUpdate(ge.Hoplite);
            realm1.copyToRealmOrUpdate(ge.Hornet);
            realm1.copyToRealmOrUpdate(ge.Ice_Bat);
            realm1.copyToRealmOrUpdate(ge.Ice_Slime);
            realm1.copyToRealmOrUpdate(ge.Jungle_Bat);
            realm1.copyToRealmOrUpdate(ge.Jungle_Slime);
            realm1.copyToRealmOrUpdate(ge.Lac_Beetle);
            realm1.copyToRealmOrUpdate(ge.Lava_Slime);
            realm1.copyToRealmOrUpdate(ge.Maggot_Zombie);
            realm1.copyToRealmOrUpdate(ge.Man_Eater);
            realm1.copyToRealmOrUpdate(ge.Meteor_Head);
            realm1.copyToRealmOrUpdate(ge.Mother_Slime);
            realm1.copyToRealmOrUpdate(ge.Mushi_Ladybug);
            realm1.copyToRealmOrUpdate(ge.Nymph);
            realm1.copyToRealmOrUpdate(ge.Pink_Jellyfish);
            realm1.copyToRealmOrUpdate(ge.Pinky);
            realm1.copyToRealmOrUpdate(ge.Piranhas);
            realm1.copyToRealmOrUpdate(ge.Purple_Slime);
            realm1.copyToRealmOrUpdate(ge.Raven);
            realm1.copyToRealmOrUpdate(ge.Red_Slime);
            realm1.copyToRealmOrUpdate(ge.Salamander);
            realm1.copyToRealmOrUpdate(ge.Sand_Slime);
            realm1.copyToRealmOrUpdate(ge.Sea_Snail);
            realm1.copyToRealmOrUpdate(ge.Shark);
            realm1.copyToRealmOrUpdate(ge.Skeleton);
            realm1.copyToRealmOrUpdate(ge.Snatcher);
            realm1.copyToRealmOrUpdate(ge.Snow_Flinx);
            realm1.copyToRealmOrUpdate(ge.Spike_Ball);
            realm1.copyToRealmOrUpdate(ge.Spiked_Ice_Slime);
            realm1.copyToRealmOrUpdate(ge.Spiked_Jungle_Slime);
            realm1.copyToRealmOrUpdate(ge.Spore_Bat);
            realm1.copyToRealmOrUpdate(ge.Spore_Skeleton);
            realm1.copyToRealmOrUpdate(ge.Spore_Zombie);
            realm1.copyToRealmOrUpdate(ge.Squid);
            realm1.copyToRealmOrUpdate(ge.Tim);
            realm1.copyToRealmOrUpdate(ge.Tomb_Crawler);
            realm1.copyToRealmOrUpdate(ge.Undead_Miner);
            realm1.copyToRealmOrUpdate(ge.Undead_Viking);
            realm1.copyToRealmOrUpdate(ge.Voodoo_Demon);
            realm1.copyToRealmOrUpdate(ge.Vulture);
            realm1.copyToRealmOrUpdate(ge.Wall_Creeper);
            realm1.copyToRealmOrUpdate(ge.Yellow_Slime);
            realm1.copyToRealmOrUpdate(ge.Zombie);

            //Add Hardmode Enemies
            realm1.copyToRealmOrUpdate(ge.Angler_Fish);
            realm1.copyToRealmOrUpdate(ge.Angry_Trapper);
            realm1.copyToRealmOrUpdate(ge.Arapaima);
            realm1.copyToRealmOrUpdate(ge.Armored_Skeleton);
            realm1.copyToRealmOrUpdate(ge.Armored_Viking);
            realm1.copyToRealmOrUpdate(ge.Basilisk);
            realm1.copyToRealmOrUpdate(ge.Black_Recluse);
            realm1.copyToRealmOrUpdate(ge.Blood_Feeder);
            realm1.copyToRealmOrUpdate(ge.Blood_Jelly);
            realm1.copyToRealmOrUpdate(ge.Blood_Mummy);
            realm1.copyToRealmOrUpdate(ge.Blue_Armored_Bones);
            realm1.copyToRealmOrUpdate(ge.Blue_Cultist_Archer);
            realm1.copyToRealmOrUpdate(ge.Bone_Lee);
            realm1.copyToRealmOrUpdate(ge.Chaos_Elemental);
            realm1.copyToRealmOrUpdate(ge.Clinger);
            realm1.copyToRealmOrUpdate(ge.Corrupt_Mimic);
            realm1.copyToRealmOrUpdate(ge.Corrupt_Slime);
            realm1.copyToRealmOrUpdate(ge.Corruptor);
            realm1.copyToRealmOrUpdate(ge.Crimslime);
            realm1.copyToRealmOrUpdate(ge.Crimson_Axe);
            realm1.copyToRealmOrUpdate(ge.Crimson_Mimic);
            realm1.copyToRealmOrUpdate(ge.Cursed_Hammer);
            realm1.copyToRealmOrUpdate(ge.Dark_Mummy);
            realm1.copyToRealmOrUpdate(ge.Derpling);
            realm1.copyToRealmOrUpdate(ge.Desert_Spirit);
            realm1.copyToRealmOrUpdate(ge.Diablolist);
            realm1.copyToRealmOrUpdate(ge.Digger);
            realm1.copyToRealmOrUpdate(ge.Dreamer_Ghoul);
            realm1.copyToRealmOrUpdate(ge.Dune_Splicer);
            realm1.copyToRealmOrUpdate(ge.Dungeon_Spirit);
            realm1.copyToRealmOrUpdate(ge.Enchanted_Sword);
            realm1.copyToRealmOrUpdate(ge.Floaty_Gross);
            realm1.copyToRealmOrUpdate(ge.Flying_Snake);
            realm1.copyToRealmOrUpdate(ge.Fungo_Fish);
            realm1.copyToRealmOrUpdate(ge.Gastropod);
            realm1.copyToRealmOrUpdate(ge.Ghoul);
            realm1.copyToRealmOrUpdate(ge.Giant_Bat);
            realm1.copyToRealmOrUpdate(ge.Giant_Cursed_Skull);
            realm1.copyToRealmOrUpdate(ge.Giant_Flying_Fox);
            realm1.copyToRealmOrUpdate(ge.Giant_Fungi_Bulb);
            realm1.copyToRealmOrUpdate(ge.Giant_Tortoise);
            realm1.copyToRealmOrUpdate(ge.Green_Jellyfish);
            realm1.copyToRealmOrUpdate(ge.Hallowed_Mimic);
            realm1.copyToRealmOrUpdate(ge.Hell_Armored_Bones);
            realm1.copyToRealmOrUpdate(ge.Herpling);
            realm1.copyToRealmOrUpdate(ge.Hoppin_Jack);
            realm1.copyToRealmOrUpdate(ge.Ice_Elemental);
            realm1.copyToRealmOrUpdate(ge.Ice_Mimic);
            realm1.copyToRealmOrUpdate(ge.Ice_Tortoise);
            realm1.copyToRealmOrUpdate(ge.Ichor_Sticker);
            realm1.copyToRealmOrUpdate(ge.Icy_Merman);
            realm1.copyToRealmOrUpdate(ge.Illuminant_Bat);
            realm1.copyToRealmOrUpdate(ge.Illuminant_Slime);
            realm1.copyToRealmOrUpdate(ge.Jungle_Creeper);
            realm1.copyToRealmOrUpdate(ge.Lamia);
            realm1.copyToRealmOrUpdate(ge.Lava_Bat);
            realm1.copyToRealmOrUpdate(ge.Light_Mummy);
            realm1.copyToRealmOrUpdate(ge.Lihzahrd);
            realm1.copyToRealmOrUpdate(ge.Lunatic_Devotee);
            realm1.copyToRealmOrUpdate(ge.Martian_Probe);
            realm1.copyToRealmOrUpdate(ge.Medusa);
            realm1.copyToRealmOrUpdate(ge.Mimic);
            realm1.copyToRealmOrUpdate(ge.Moss_Hornet);
            realm1.copyToRealmOrUpdate(ge.Moth);
            realm1.copyToRealmOrUpdate(ge.Mummy);
            realm1.copyToRealmOrUpdate(ge.Necromancer);
            realm1.copyToRealmOrUpdate(ge.Paladin);
            realm1.copyToRealmOrUpdate(ge.Pigron);
            realm1.copyToRealmOrUpdate(ge.Pixie);
            realm1.copyToRealmOrUpdate(ge.Possessed_Armor);
            realm1.copyToRealmOrUpdate(ge.Ragged_Caster);
            realm1.copyToRealmOrUpdate(ge.Red_Devil);
            realm1.copyToRealmOrUpdate(ge.Rock_Golem);
            realm1.copyToRealmOrUpdate(ge.Rune_Wizard);
            realm1.copyToRealmOrUpdate(ge.Rusty_Armored_Bones);
            realm1.copyToRealmOrUpdate(ge.Sand_Poacher);
            realm1.copyToRealmOrUpdate(ge.Skeleton_Archer);
            realm1.copyToRealmOrUpdate(ge.Skeleton_Commando);
            realm1.copyToRealmOrUpdate(ge.Skeleton_Sniper);
            realm1.copyToRealmOrUpdate(ge.Slimeling);
            realm1.copyToRealmOrUpdate(ge.Slimer);
            realm1.copyToRealmOrUpdate(ge.Tactical_Skeleton);
            realm1.copyToRealmOrUpdate(ge.Tainted_Ghoul);
            realm1.copyToRealmOrUpdate(ge.Tortured_Soul);
            realm1.copyToRealmOrUpdate(ge.Toxic_Sludge);
            realm1.copyToRealmOrUpdate(ge.Unicorn);
            realm1.copyToRealmOrUpdate(ge.Vile_Ghoul);
            realm1.copyToRealmOrUpdate(ge.Wandering_Eye);
            realm1.copyToRealmOrUpdate(ge.Werewolf);
            realm1.copyToRealmOrUpdate(ge.Wolf);
            realm1.copyToRealmOrUpdate(ge.World_Feeder);
            realm1.copyToRealmOrUpdate(ge.Wraith);
            realm1.copyToRealmOrUpdate(ge.Wyvern);
        });
    }
    public void addBossesToDatabase() {
        //Get Bosses
        final Generate_Bosses gb = new Generate_Bosses();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(realm1 -> {

            //Add Pre-Hardmode Bosses
            realm1.copyToRealmOrUpdate(gb.King_Slime);
            realm1.copyToRealmOrUpdate(gb.Eye_Of_Cthulhu);
            realm1.copyToRealmOrUpdate(gb.Eater_Of_Worlds);
            realm1.copyToRealmOrUpdate(gb.Brain_Of_Cthulhu);
            realm1.copyToRealmOrUpdate(gb.Queen_Bee);
            realm1.copyToRealmOrUpdate(gb.Skeletron);
            realm1.copyToRealmOrUpdate(gb.Wall_Of_Flesh);

            //Add Hardmode Bosses
            realm1.copyToRealmOrUpdate(gb.Queen_Slime);
            realm1.copyToRealmOrUpdate(gb.The_Twins);
            realm1.copyToRealmOrUpdate(gb.The_Destroyer);
            realm1.copyToRealmOrUpdate(gb.Skeletron_Prime);
            realm1.copyToRealmOrUpdate(gb.Plantera);
            realm1.copyToRealmOrUpdate(gb.Golem);
            realm1.copyToRealmOrUpdate(gb.Empress_Of_Light);
            realm1.copyToRealmOrUpdate(gb.Duke_Fishron);
            realm1.copyToRealmOrUpdate(gb.Lunatic_Cultist);
            realm1.copyToRealmOrUpdate(gb.Moon_Lord);
        });
    }
    public void addSwordsToDatabase() {
        //Get Swords
        final Generate_Swords gs = new Generate_Swords();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(realm1 -> {

            //Add Pre-Hardmode Swords
            realm1.copyToRealmOrUpdate(gs.Copper_Shortsword);
            realm1.copyToRealmOrUpdate(gs.Tin_Shortsword);
            realm1.copyToRealmOrUpdate(gs.Wooden_Sword);
            realm1.copyToRealmOrUpdate(gs.Boreal_Wood_Sword);
            realm1.copyToRealmOrUpdate(gs.Copper_Broadsword);
            realm1.copyToRealmOrUpdate(gs.Iron_Shortsword);
            realm1.copyToRealmOrUpdate(gs.Palm_Wood_Sword);
            realm1.copyToRealmOrUpdate(gs.Rich_Mahogany_Sword);
            realm1.copyToRealmOrUpdate(gs.Cactus_Sword);
            realm1.copyToRealmOrUpdate(gs.Lead_Shortsword);
            realm1.copyToRealmOrUpdate(gs.Silver_Shortsword);
            realm1.copyToRealmOrUpdate(gs.Tin_Broadsword);
            realm1.copyToRealmOrUpdate(gs.Ebonwood_Sword);
            realm1.copyToRealmOrUpdate(gs.Iron_Broadsword);
            realm1.copyToRealmOrUpdate(gs.Shadewood_Sword);
            realm1.copyToRealmOrUpdate(gs.Tungsten_Shortsword);
            realm1.copyToRealmOrUpdate(gs.Gold_Shortsword);
            realm1.copyToRealmOrUpdate(gs.Lead_Broadsword);
            realm1.copyToRealmOrUpdate(gs.Silver_Broadsword);
            realm1.copyToRealmOrUpdate(gs.Bladed_Glove);
            realm1.copyToRealmOrUpdate(gs.Tungsten_Broadsword);
            realm1.copyToRealmOrUpdate(gs.Zombie_Arm);
            realm1.copyToRealmOrUpdate(gs.Gold_Broadsword);
            realm1.copyToRealmOrUpdate(gs.Platinum_Shortsword);
            realm1.copyToRealmOrUpdate(gs.Mandible_Blade);
            realm1.copyToRealmOrUpdate(gs.Stylish_Scissors);
            realm1.copyToRealmOrUpdate(gs.Ruler);
            realm1.copyToRealmOrUpdate(gs.Platinum_Broadsword);
            realm1.copyToRealmOrUpdate(gs.Umbrella);
            realm1.copyToRealmOrUpdate(gs.Breathing_Reed);
            realm1.copyToRealmOrUpdate(gs.Gladius);
            realm1.copyToRealmOrUpdate(gs.Bone_Sword);
            realm1.copyToRealmOrUpdate(gs.Candy_Cane_Sword);
            realm1.copyToRealmOrUpdate(gs.Katana);
            realm1.copyToRealmOrUpdate(gs.Ice_Blade);
            realm1.copyToRealmOrUpdate(gs.Lights_Bane);
            realm1.copyToRealmOrUpdate(gs.Tragic_Umbrella);
            realm1.copyToRealmOrUpdate(gs.Muramasa);
            realm1.copyToRealmOrUpdate(gs.Exotic_Scimitar);
            realm1.copyToRealmOrUpdate(gs.Phaseblade);
            realm1.copyToRealmOrUpdate(gs.Blood_Butcherer);
            realm1.copyToRealmOrUpdate(gs.Starfury);
            realm1.copyToRealmOrUpdate(gs.Enchanted_Sword);
            realm1.copyToRealmOrUpdate(gs.Purple_Clubberfish);
            realm1.copyToRealmOrUpdate(gs.Bee_Keeper);
            realm1.copyToRealmOrUpdate(gs.Falcon_Blade);
            realm1.copyToRealmOrUpdate(gs.Blade_Of_Grass);
            realm1.copyToRealmOrUpdate(gs.Fiery_Greatsword);
            realm1.copyToRealmOrUpdate(gs.Nights_Edge);

            //Add Hardmode Swords
            realm1.copyToRealmOrUpdate(gs.Pearlwood_Sword);
            realm1.copyToRealmOrUpdate(gs.Classy_Cane);
            realm1.copyToRealmOrUpdate(gs.Slap_Hand);
            realm1.copyToRealmOrUpdate(gs.Cobalt_Sword);
            realm1.copyToRealmOrUpdate(gs.Palladium_Sword);
            realm1.copyToRealmOrUpdate(gs.Phasesaber);
            realm1.copyToRealmOrUpdate(gs.Ice_Sickle);
            realm1.copyToRealmOrUpdate(gs.Brand_Of_The_Inferno);
            realm1.copyToRealmOrUpdate(gs.Mythril_Sword);
            realm1.copyToRealmOrUpdate(gs.Orichalcum_Sword);
            realm1.copyToRealmOrUpdate(gs.Breaker_Blade);
            realm1.copyToRealmOrUpdate(gs.Cutlass);
            realm1.copyToRealmOrUpdate(gs.Frostbrand);
            realm1.copyToRealmOrUpdate(gs.Adamantite_Sword);
            realm1.copyToRealmOrUpdate(gs.Beam_Sword);
            realm1.copyToRealmOrUpdate(gs.Titanium_Sword);
            realm1.copyToRealmOrUpdate(gs.Fetid_Baghnakhs);
            realm1.copyToRealmOrUpdate(gs.Bladetongue);
            realm1.copyToRealmOrUpdate(gs.Tizona);
            realm1.copyToRealmOrUpdate(gs.Excaliber);
            realm1.copyToRealmOrUpdate(gs.True_Excaliber);
            realm1.copyToRealmOrUpdate(gs.Chlorophyte_Saber);
            realm1.copyToRealmOrUpdate(gs.Death_Sickle);
            realm1.copyToRealmOrUpdate(gs.Psycho_Knife);
            realm1.copyToRealmOrUpdate(gs.Keybrand);
            realm1.copyToRealmOrUpdate(gs.Chlorophyte_Claymore);
            realm1.copyToRealmOrUpdate(gs.The_Horsemans_Blade);
            realm1.copyToRealmOrUpdate(gs.Christmas_Tree_Sword);
            realm1.copyToRealmOrUpdate(gs.True_Nights_Edge);
            realm1.copyToRealmOrUpdate(gs.Seedler);
            realm1.copyToRealmOrUpdate(gs.Flying_Dragon);
            realm1.copyToRealmOrUpdate(gs.Starlight);
            realm1.copyToRealmOrUpdate(gs.Terra_Blade);
            realm1.copyToRealmOrUpdate(gs.Influx_Waver);
            realm1.copyToRealmOrUpdate(gs.Star_Wrath);
            realm1.copyToRealmOrUpdate(gs.Meowmere);

        });
    }
    public void addPickaxesToDatabase() {
        //Get Pickaxes
        final Generate_Pickaxes gp = new Generate_Pickaxes();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(realm1 -> {

            //Add Pickaxes & Drills
            realm1.copyToRealmOrUpdate(gp.Cactus_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Copper_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Tin_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Iron_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Lead_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Silver_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Tungsten_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Gold_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Candy_Cane_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Fossil_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Bone_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Platinum_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Reaver_Shark);
            realm1.copyToRealmOrUpdate(gp.Nightmare_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Deathbringer_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Molten_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Cobalt_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Cobalt_Drill);
            realm1.copyToRealmOrUpdate(gp.Palladium_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Palladium_Drill);
            realm1.copyToRealmOrUpdate(gp.Mythril_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Mythril_Drill);
            realm1.copyToRealmOrUpdate(gp.Orichalcum_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Orichalcum_Drill);
            realm1.copyToRealmOrUpdate(gp.Adamantite_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Adamantite_Drill);
            realm1.copyToRealmOrUpdate(gp.Titanium_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Titanium_Drill);
            realm1.copyToRealmOrUpdate(gp.Spectre_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Chlorophyte_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Chlorophyte_Drill);
            realm1.copyToRealmOrUpdate(gp.Pickaxe_Axe_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Drax_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Shroomite_Digging_Claw_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Picksaw_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Solar_Flare_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Solar_Flare_Drill);
            realm1.copyToRealmOrUpdate(gp.Vortex_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Vortex_Drill);
            realm1.copyToRealmOrUpdate(gp.Nebula_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Nebula_Drill);
            realm1.copyToRealmOrUpdate(gp.Stardust_Pickaxe);
            realm1.copyToRealmOrUpdate(gp.Stardust_Drill);
            realm1.copyToRealmOrUpdate(gp.Laser_Drill);

        });
    }
    public void addAxesToDatabase() {
        //Get Axes
        final Generate_Axes ga = new Generate_Axes();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(realm1 -> {

            //Add Axes and Chainsaws
            realm1.copyToRealmOrUpdate(ga.Copper_Axe);
            realm1.copyToRealmOrUpdate(ga.Tin_Axe);
            realm1.copyToRealmOrUpdate(ga.Iron_Axe);
            realm1.copyToRealmOrUpdate(ga.Lead_Axe);
            realm1.copyToRealmOrUpdate(ga.Silver_Axe);
            realm1.copyToRealmOrUpdate(ga.Tungsten_Axe);
            realm1.copyToRealmOrUpdate(ga.Gold_Axe);
            realm1.copyToRealmOrUpdate(ga.Platinum_Axe);
            realm1.copyToRealmOrUpdate(ga.Cobalt_Waraxe);
            realm1.copyToRealmOrUpdate(ga.Cobalt_Chainsaw);
            realm1.copyToRealmOrUpdate(ga.Sawtooth_Shark);
            realm1.copyToRealmOrUpdate(ga.War_Axe_Of_The_Night);
            realm1.copyToRealmOrUpdate(ga.Blood_Lust_Cluster);
            realm1.copyToRealmOrUpdate(ga.Palladium_Waraxe);
            realm1.copyToRealmOrUpdate(ga.Palladium_Chainsaw);
            realm1.copyToRealmOrUpdate(ga.Mythril_Waraxe);
            realm1.copyToRealmOrUpdate(ga.Mythril_Chainsaw);
            realm1.copyToRealmOrUpdate(ga.Orichalcum_Waraxe);
            realm1.copyToRealmOrUpdate(ga.Orichalcum_Chainsaw);
            realm1.copyToRealmOrUpdate(ga.Adamantite_Waraxe);
            realm1.copyToRealmOrUpdate(ga.Adamantite_Chainsaw);
            realm1.copyToRealmOrUpdate(ga.Meteor_Hamaxe_Axe);
            realm1.copyToRealmOrUpdate(ga.Titanium_Waraxe);
            realm1.copyToRealmOrUpdate(ga.Titanium_Chainsaw);
            realm1.copyToRealmOrUpdate(ga.Pickaxe_Axe_Axe);
            realm1.copyToRealmOrUpdate(ga.Drax_Axe);
            realm1.copyToRealmOrUpdate(ga.Chlorophyte_Greataxe);
            realm1.copyToRealmOrUpdate(ga.Chlorophyte_Chainsaw);
            realm1.copyToRealmOrUpdate(ga.Lucy_The_Axe);
            realm1.copyToRealmOrUpdate(ga.Picksaw_Axe);
            realm1.copyToRealmOrUpdate(ga.Shroomite_Digging_Claw_Axe);
            realm1.copyToRealmOrUpdate(ga.Butchers_Chainsaw);
            realm1.copyToRealmOrUpdate(ga.Molten_Hamaxe_Axe);
            realm1.copyToRealmOrUpdate(ga.Haemorrhaxe_Axe);
            realm1.copyToRealmOrUpdate(ga.Spectre_Hamaxe_Axe);
            realm1.copyToRealmOrUpdate(ga.Solar_Flare_Hamaxe_Axe);
            realm1.copyToRealmOrUpdate(ga.Vortex_Hamaxe_Axe);
            realm1.copyToRealmOrUpdate(ga.Nebula_Hamaxe_Axe);
            realm1.copyToRealmOrUpdate(ga.Stardust_Hamaxe_Axe);
            realm1.copyToRealmOrUpdate(ga.The_Axe_Axe);


        });
    }
    public void addHammersToDatabase() {
        //Get Hammers
        final Generate_Hammers gh = new Generate_Hammers();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(realm1 -> {

            //Add Hammers and Jackhammers
            realm1.copyToRealmOrUpdate(gh.Wooden_Hammer);
            realm1.copyToRealmOrUpdate(gh.Rich_Mahogany_Hammer);
            realm1.copyToRealmOrUpdate(gh.Palm_Wood_Hammer);
            realm1.copyToRealmOrUpdate(gh.Boreal_Wood_Hammer);
            realm1.copyToRealmOrUpdate(gh.Copper_Hammer);
            realm1.copyToRealmOrUpdate(gh.Tin_Hammer);
            realm1.copyToRealmOrUpdate(gh.Iron_Hammer);
            realm1.copyToRealmOrUpdate(gh.Ebonwood_Hammer);
            realm1.copyToRealmOrUpdate(gh.Shadewood_Hammer);
            realm1.copyToRealmOrUpdate(gh.Lead_Hammer);
            realm1.copyToRealmOrUpdate(gh.Pearlwood_Hammer);
            realm1.copyToRealmOrUpdate(gh.Silver_Hammer);
            realm1.copyToRealmOrUpdate(gh.Tungsten_Hammer);
            realm1.copyToRealmOrUpdate(gh.Gold_Hammer);
            realm1.copyToRealmOrUpdate(gh.The_Breaker);
            realm1.copyToRealmOrUpdate(gh.Flesh_Grinder);
            realm1.copyToRealmOrUpdate(gh.Platinum_Hammer);
            realm1.copyToRealmOrUpdate(gh.Meteor_Hamaxe_Hammer);
            realm1.copyToRealmOrUpdate(gh.Rockfish);
            realm1.copyToRealmOrUpdate(gh.Molten_Hamaxe_Hammer);
            realm1.copyToRealmOrUpdate(gh.Pwnhammer);
            realm1.copyToRealmOrUpdate(gh.Haemorrhaxe_Hammer);
            realm1.copyToRealmOrUpdate(gh.Hammush);
            realm1.copyToRealmOrUpdate(gh.Chlorophyte_Warhammer);
            realm1.copyToRealmOrUpdate(gh.Chlorophyte_Jackhammer);
            realm1.copyToRealmOrUpdate(gh.Spectre_Hamaxe_Hammer);
            realm1.copyToRealmOrUpdate(gh.Solar_Flare_Hamaxe_Hammer);
            realm1.copyToRealmOrUpdate(gh.Vortex_Hamaxe_Hammer);
            realm1.copyToRealmOrUpdate(gh.Nebula_Hamaxe_Hammer);
            realm1.copyToRealmOrUpdate(gh.Stardust_Hamaxe_Hammer);
            realm1.copyToRealmOrUpdate(gh.The_Axe_Hammer);


        });
    }
    public void addSpellTomesToDatabase() {
        //Get SpellTomes
        final Generate_SpellTomes gst = new Generate_SpellTomes();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(realm1 -> {

            //Add Pre-Hardmode SpellTomes
            realm1.copyToRealmOrUpdate(gst.Water_Bolt);
            realm1.copyToRealmOrUpdate(gst.Book_Of_Skulls);
            realm1.copyToRealmOrUpdate(gst.Demon_Scythe);

            //Add Hardmode SpellTomes
            realm1.copyToRealmOrUpdate(gst.Cursed_Flames);
            realm1.copyToRealmOrUpdate(gst.Golden_Shower);
            realm1.copyToRealmOrUpdate(gst.Crystal_Storm);
            realm1.copyToRealmOrUpdate(gst.Magnet_Sphere);
            realm1.copyToRealmOrUpdate(gst.Razorblade_Typhoon);
            realm1.copyToRealmOrUpdate(gst.Lunar_Flare);

        });
    }
    public void addWandsToDatabase() {
        //Get Wands
        final Generate_Wands gw = new Generate_Wands();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(realm1 -> {

            //Add Pre-Hardmode Wands
            realm1.copyToRealmOrUpdate(gw.Wand_Of_Sparking);
            realm1.copyToRealmOrUpdate(gw.Thunder_Zapper);
            realm1.copyToRealmOrUpdate(gw.Amethyst_Staff);
            realm1.copyToRealmOrUpdate(gw.Topaz_Staff);
            realm1.copyToRealmOrUpdate(gw.Sapphire_Staff);
            realm1.copyToRealmOrUpdate(gw.Emerald_Staff);
            realm1.copyToRealmOrUpdate(gw.Ruby_Staff);
            realm1.copyToRealmOrUpdate(gw.Diamond_Staff);
            realm1.copyToRealmOrUpdate(gw.Amber_Staff);
            realm1.copyToRealmOrUpdate(gw.Vilethorn);
            realm1.copyToRealmOrUpdate(gw.Weather_Pain);
            realm1.copyToRealmOrUpdate(gw.Magic_Missile);
            realm1.copyToRealmOrUpdate(gw.Aqua_Scepter);
            realm1.copyToRealmOrUpdate(gw.Flower_Of_Fire);
            realm1.copyToRealmOrUpdate(gw.Flamelash);

            //Add Hardmode Wands
            realm1.copyToRealmOrUpdate(gw.Sky_Fracture);
            realm1.copyToRealmOrUpdate(gw.Crystal_Serpent);
            realm1.copyToRealmOrUpdate(gw.Flower_Of_Frost);
            realm1.copyToRealmOrUpdate(gw.Frost_Staff);
            realm1.copyToRealmOrUpdate(gw.Crystal_Vile_Shard);
            realm1.copyToRealmOrUpdate(gw.Life_Drain);
            realm1.copyToRealmOrUpdate(gw.Meteor_Staff);
            realm1.copyToRealmOrUpdate(gw.Poison_Staff);
            realm1.copyToRealmOrUpdate(gw.Rainbow_Rod);
            realm1.copyToRealmOrUpdate(gw.Unholy_Trident);
            realm1.copyToRealmOrUpdate(gw.Tome_Of_Infinite_Wisdom);
            realm1.copyToRealmOrUpdate(gw.Venom_Staff);
            realm1.copyToRealmOrUpdate(gw.Nettle_Burst);
            realm1.copyToRealmOrUpdate(gw.Bat_Scepter);
            realm1.copyToRealmOrUpdate(gw.Blizzard_Staff);
            realm1.copyToRealmOrUpdate(gw.Inferno_Fork);
            realm1.copyToRealmOrUpdate(gw.Shadowbeam_Staff);
            realm1.copyToRealmOrUpdate(gw.Spectre_Staff);
            realm1.copyToRealmOrUpdate(gw.Resonance_Scepter);
            realm1.copyToRealmOrUpdate(gw.Razorpine);
            realm1.copyToRealmOrUpdate(gw.Staff_Of_Earth);
            realm1.copyToRealmOrUpdate(gw.Betsys_Wrath);


        });
    }
    public void addYoYosToDatabase() {
        //Get YoYos
        final Generate_YoYos gYY = new Generate_YoYos();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(realm1 -> {

            //Add Pre-Hardmode YoYos
            realm1.copyToRealmOrUpdate(gYY.Wooden_Yoyo);
            realm1.copyToRealmOrUpdate(gYY.Rally);
            realm1.copyToRealmOrUpdate(gYY.Malaise);
            realm1.copyToRealmOrUpdate(gYY.Artery);
            realm1.copyToRealmOrUpdate(gYY.Amazon);
            realm1.copyToRealmOrUpdate(gYY.Code_1);
            realm1.copyToRealmOrUpdate(gYY.Valor);
            realm1.copyToRealmOrUpdate(gYY.Cascade);

            //Add Hardmode YoYos
            realm1.copyToRealmOrUpdate(gYY.Format_C);
            realm1.copyToRealmOrUpdate(gYY.Gradient);
            realm1.copyToRealmOrUpdate(gYY.Chik);
            realm1.copyToRealmOrUpdate(gYY.Hel_Fire);
            realm1.copyToRealmOrUpdate(gYY.Amarok);
            realm1.copyToRealmOrUpdate(gYY.Code_2);
            realm1.copyToRealmOrUpdate(gYY.Yelets);
            realm1.copyToRealmOrUpdate(gYY.Reds_Throw);
            realm1.copyToRealmOrUpdate(gYY.Valkyrie_Yoyo);
            realm1.copyToRealmOrUpdate(gYY.Kraken);
            realm1.copyToRealmOrUpdate(gYY.The_Eye_Of_Cthulhu);
            realm1.copyToRealmOrUpdate(gYY.Terrarian);

        });
    }
    public void addSpearsToDatabase() {
        //Get Spears
        final Generate_Spears gsp = new Generate_Spears();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(realm1 -> {

            //Add Pre-Hardmode Spears
            realm1.copyToRealmOrUpdate(gsp.Spear);
            realm1.copyToRealmOrUpdate(gsp.Trident);
            realm1.copyToRealmOrUpdate(gsp.Storm_Spear);
            realm1.copyToRealmOrUpdate(gsp.The_Rotted_Fork);
            realm1.copyToRealmOrUpdate(gsp.Swordfish);
            realm1.copyToRealmOrUpdate(gsp.Dark_Lance);

            //Add Hardmode Spears
            realm1.copyToRealmOrUpdate(gsp.Cobalt_Naginata);
            realm1.copyToRealmOrUpdate(gsp.Palladium_Pike);
            realm1.copyToRealmOrUpdate(gsp.Mythril_Halberd);
            realm1.copyToRealmOrUpdate(gsp.Orichalcum_Halberd);
            realm1.copyToRealmOrUpdate(gsp.Adamantite_Glaive);
            realm1.copyToRealmOrUpdate(gsp.Titanium_Trident);
            realm1.copyToRealmOrUpdate(gsp.Gungnir);
            realm1.copyToRealmOrUpdate(gsp.Ghastly_Glaive);
            realm1.copyToRealmOrUpdate(gsp.Chlorophyte_Partisan);
            realm1.copyToRealmOrUpdate(gsp.Tonbogiri);
            realm1.copyToRealmOrUpdate(gsp.Mushroom_Spear);
            realm1.copyToRealmOrUpdate(gsp.Obsidian_Swordfish);
            realm1.copyToRealmOrUpdate(gsp.North_Pole);

        });
    }
    public void addBoomerangsToDatabase() {
        //Get Boomerangs
        final Generate_Boomerangs gb = new Generate_Boomerangs();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(realm1 -> {

            //Add Pre-Hardmode Boomerangs
            realm1.copyToRealmOrUpdate(gb.Wooden_Boomerang);
            realm1.copyToRealmOrUpdate(gb.Enchanted_Boomerang);
            realm1.copyToRealmOrUpdate(gb.Fruitcake_Chakram);
            realm1.copyToRealmOrUpdate(gb.Bloody_Machete);
            realm1.copyToRealmOrUpdate(gb.Shroomerang);
            realm1.copyToRealmOrUpdate(gb.Ice_Boomerang);
            realm1.copyToRealmOrUpdate(gb.Thorn_Chakram);
            realm1.copyToRealmOrUpdate(gb.Combat_Wrench);
            realm1.copyToRealmOrUpdate(gb.Flamarang);

            //Add Hardmode Boomerangs
            realm1.copyToRealmOrUpdate(gb.Flying_Knife);
            realm1.copyToRealmOrUpdate(gb.Sergeant_United_Shield);
            realm1.copyToRealmOrUpdate(gb.Light_Disc);
            realm1.copyToRealmOrUpdate(gb.Bananarang);
            realm1.copyToRealmOrUpdate(gb.Possessed_Hatchet);
            realm1.copyToRealmOrUpdate(gb.Paladins_Hammer);

        });
    }
    public void addFlailsToDatabase() {
        //Get Flails
        final Generate_Flails gf = new Generate_Flails();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(realm1 -> {

            //Add Pre-Hardmode Flails
            realm1.copyToRealmOrUpdate(gf.Chain_Knife);
            realm1.copyToRealmOrUpdate(gf.Mace);
            realm1.copyToRealmOrUpdate(gf.Flaming_Mace);
            realm1.copyToRealmOrUpdate(gf.Ball_O_Hurt);
            realm1.copyToRealmOrUpdate(gf.The_Meatball);
            realm1.copyToRealmOrUpdate(gf.Blue_Moon);
            realm1.copyToRealmOrUpdate(gf.Sunfury);

            //Add Hardmode Flails
            realm1.copyToRealmOrUpdate(gf.Anchor);
            realm1.copyToRealmOrUpdate(gf.KO_Cannon);
            realm1.copyToRealmOrUpdate(gf.Drippler_Crippler);
            realm1.copyToRealmOrUpdate(gf.Chain_Guillotines);
            realm1.copyToRealmOrUpdate(gf.Dao_Of_Pow);
            realm1.copyToRealmOrUpdate(gf.Flower_Pow);
            realm1.copyToRealmOrUpdate(gf.Golem_Fist);
            realm1.copyToRealmOrUpdate(gf.Flairon);

        });
    }
}
