package com.example.capstoneprojectterrariaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.capstoneprojectterrariaguide.Generate_Values.Generate_Axes;
import com.example.capstoneprojectterrariaguide.Generate_Values.Generate_Bosses;
import com.example.capstoneprojectterrariaguide.Generate_Values.Generate_Enemies;
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

public class MainActivity extends AppCompatActivity {

    String AppId = "capstone-szohf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    }

    public void StartOnClick(View v){
        openActivity2();
    }
    public void openActivity2(){
        Intent intent = new Intent(this, Navigation.class);
        startActivity(intent);
    }

    public void addMaterialsToDatabase() {
        //Get Materials
        final Generate_Materials gm = new Generate_Materials();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(new Realm.Transaction() {
            public void execute(Realm realm) {

                //Add Bar Materials
                realm.copyToRealmOrUpdate(gm.Adamantite_Bar);
                realm.copyToRealmOrUpdate(gm.Chlorophyte_Bar);
                realm.copyToRealmOrUpdate(gm.Cobalt_Bar);
                realm.copyToRealmOrUpdate(gm.Copper_Bar);
                realm.copyToRealmOrUpdate(gm.Crimtane_Bar);
                realm.copyToRealmOrUpdate(gm.Demonite_Bar);
                realm.copyToRealmOrUpdate(gm.Gold_Bar);
                realm.copyToRealmOrUpdate(gm.Hallowed_Bar);
                realm.copyToRealmOrUpdate(gm.Hellstone_Bar);
                realm.copyToRealmOrUpdate(gm.Iron_Bar);
                realm.copyToRealmOrUpdate(gm.Lead_Bar);
                realm.copyToRealmOrUpdate(gm.Luminite_Bar);
                realm.copyToRealmOrUpdate(gm.Meteorite_Bar);
                realm.copyToRealmOrUpdate(gm.Mythril_Bar);
                realm.copyToRealmOrUpdate(gm.Orichalcum_Bar);
                realm.copyToRealmOrUpdate(gm.Palladium_Bar);
                realm.copyToRealmOrUpdate(gm.Platinum_Bar);
                realm.copyToRealmOrUpdate(gm.Shroomite_Bar);
                realm.copyToRealmOrUpdate(gm.Silver_Bar);
                realm.copyToRealmOrUpdate(gm.Spectre_Bar);
                realm.copyToRealmOrUpdate(gm.Tin_Bar);
                realm.copyToRealmOrUpdate(gm.Titanium_Bar);
                realm.copyToRealmOrUpdate(gm.Tungsten_Bar);

                //Add Gem Materials
                realm.copyToRealmOrUpdate(gm.Amber);
                realm.copyToRealmOrUpdate(gm.Amethyst);
                realm.copyToRealmOrUpdate(gm.Diamond);
                realm.copyToRealmOrUpdate(gm.Emerald);
                realm.copyToRealmOrUpdate(gm.Ruby);
                realm.copyToRealmOrUpdate(gm.Sapphire);
                realm.copyToRealmOrUpdate(gm.Topaz);

                //Add Ore Materials
                realm.copyToRealmOrUpdate(gm.Adamantite_Ore);
                realm.copyToRealmOrUpdate(gm.Chlorophyte_Ore);
                realm.copyToRealmOrUpdate(gm.Cobalt_Ore);
                realm.copyToRealmOrUpdate(gm.Copper_Ore);
                realm.copyToRealmOrUpdate(gm.Crimtane_Ore);
                realm.copyToRealmOrUpdate(gm.Demonite_Ore);
                realm.copyToRealmOrUpdate(gm.Gold_Ore);
                realm.copyToRealmOrUpdate(gm.Hellstone);
                realm.copyToRealmOrUpdate(gm.Iron_Ore);
                realm.copyToRealmOrUpdate(gm.Lead_Ore);
                realm.copyToRealmOrUpdate(gm.Luminite);
                realm.copyToRealmOrUpdate(gm.Meteorite);
                realm.copyToRealmOrUpdate(gm.Mythril_Ore);
                realm.copyToRealmOrUpdate(gm.Obsidian);
                realm.copyToRealmOrUpdate(gm.Orichalcum_Ore);
                realm.copyToRealmOrUpdate(gm.Palladium_Ore);
                realm.copyToRealmOrUpdate(gm.Platinum_Ore);
                realm.copyToRealmOrUpdate(gm.Silver_Ore);
                realm.copyToRealmOrUpdate(gm.Tin_Ore);
                realm.copyToRealmOrUpdate(gm.Titanium_Ore);
                realm.copyToRealmOrUpdate(gm.Tungsten_Ore);

                //Add Soul Materials
                realm.copyToRealmOrUpdate(gm.Souls_of_Blight);
                realm.copyToRealmOrUpdate(gm.Souls_of_Flight);
                realm.copyToRealmOrUpdate(gm.Souls_of_Fright);
                realm.copyToRealmOrUpdate(gm.Souls_of_Light);
                realm.copyToRealmOrUpdate(gm.Souls_of_Might);
                realm.copyToRealmOrUpdate(gm.Souls_of_Night);
                realm.copyToRealmOrUpdate(gm.Souls_of_Sight);

            }
        });
    }
    public void addEnemiesToDatabase() {
        //Get Enemies
        final Generate_Enemies ge = new Generate_Enemies();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(new Realm.Transaction() {
            public void execute(Realm realm) {

                //Add Pre-Hardmode Enemies
                realm.copyToRealmOrUpdate(ge.Angry_Bones);
                realm.copyToRealmOrUpdate(ge.Anomura_Fungus);
                realm.copyToRealmOrUpdate(ge.Antlion);
                realm.copyToRealmOrUpdate(ge.Antlion_Charger);
                realm.copyToRealmOrUpdate(ge.Antlion_Larva);
                realm.copyToRealmOrUpdate(ge.Antlion_Swarmer);
                realm.copyToRealmOrUpdate(ge.Baby_Slime);
                realm.copyToRealmOrUpdate(ge.Bee);
                realm.copyToRealmOrUpdate(ge.Black_Slime);
                realm.copyToRealmOrUpdate(ge.Blazing_Wheel);
                realm.copyToRealmOrUpdate(ge.Blood_Crawler);
                realm.copyToRealmOrUpdate(ge.Blue_Jellyfish);
                realm.copyToRealmOrUpdate(ge.Blue_Slime);
                realm.copyToRealmOrUpdate(ge.Bone_Serpent);
                realm.copyToRealmOrUpdate(ge.Cave_Bat);
                realm.copyToRealmOrUpdate(ge.Cochineal_Beetle);
                realm.copyToRealmOrUpdate(ge.Crab);
                realm.copyToRealmOrUpdate(ge.Crawdad);
                realm.copyToRealmOrUpdate(ge.Crimera);
                realm.copyToRealmOrUpdate(ge.Cursed_Skull);
                realm.copyToRealmOrUpdate(ge.Cyan_Beetle);
                realm.copyToRealmOrUpdate(ge.Dark_Caster);
                realm.copyToRealmOrUpdate(ge.Demon);
                realm.copyToRealmOrUpdate(ge.Demon_Eye);
                realm.copyToRealmOrUpdate(ge.Devourer);
                realm.copyToRealmOrUpdate(ge.Doctor_Bones);
                realm.copyToRealmOrUpdate(ge.Dungeon_Guardian);
                realm.copyToRealmOrUpdate(ge.Dungeon_Slime);
                realm.copyToRealmOrUpdate(ge.Eater_of_Souls);
                realm.copyToRealmOrUpdate(ge.Face_Monster);
                realm.copyToRealmOrUpdate(ge.Fire_Imp);
                realm.copyToRealmOrUpdate(ge.Frozen_Zombie);
                realm.copyToRealmOrUpdate(ge.Fungi_Bulb);
                realm.copyToRealmOrUpdate(ge.Ghost);
                realm.copyToRealmOrUpdate(ge.Giant_Antlion_Charger);
                realm.copyToRealmOrUpdate(ge.Giant_Antlion_Swarmer);
                realm.copyToRealmOrUpdate(ge.Giant_Shelly);
                realm.copyToRealmOrUpdate(ge.Giant_Worm);
                realm.copyToRealmOrUpdate(ge.Gnome);
                realm.copyToRealmOrUpdate(ge.Goblin_Scout);
                realm.copyToRealmOrUpdate(ge.Granite_Elemental);
                realm.copyToRealmOrUpdate(ge.Granite_Golem);
                realm.copyToRealmOrUpdate(ge.Green_Slime);
                realm.copyToRealmOrUpdate(ge.Harpy);
                realm.copyToRealmOrUpdate(ge.Hell_Bat);
                realm.copyToRealmOrUpdate(ge.Hoplite);
                realm.copyToRealmOrUpdate(ge.Hornet);
                realm.copyToRealmOrUpdate(ge.Ice_Bat);
                realm.copyToRealmOrUpdate(ge.Ice_Slime);
                realm.copyToRealmOrUpdate(ge.Jungle_Bat);
                realm.copyToRealmOrUpdate(ge.Jungle_Slime);
                realm.copyToRealmOrUpdate(ge.Lac_Beetle);
                realm.copyToRealmOrUpdate(ge.Lava_Slime);
                realm.copyToRealmOrUpdate(ge.Maggot_Zombie);
                realm.copyToRealmOrUpdate(ge.Man_Eater);
                realm.copyToRealmOrUpdate(ge.Meteor_Head);
                realm.copyToRealmOrUpdate(ge.Mother_Slime);
                realm.copyToRealmOrUpdate(ge.Mushi_Ladybug);
                realm.copyToRealmOrUpdate(ge.Nymph);
                realm.copyToRealmOrUpdate(ge.Pink_Jellyfish);
                realm.copyToRealmOrUpdate(ge.Pinky);
                realm.copyToRealmOrUpdate(ge.Piranhas);
                realm.copyToRealmOrUpdate(ge.Purple_Slime);
                realm.copyToRealmOrUpdate(ge.Raven);
                realm.copyToRealmOrUpdate(ge.Red_Slime);
                realm.copyToRealmOrUpdate(ge.Salamander);
                realm.copyToRealmOrUpdate(ge.Sand_Slime);
                realm.copyToRealmOrUpdate(ge.Sea_Snail);
                realm.copyToRealmOrUpdate(ge.Shark);
                realm.copyToRealmOrUpdate(ge.Skeleton);
                realm.copyToRealmOrUpdate(ge.Snatcher);
                realm.copyToRealmOrUpdate(ge.Snow_Flinx);
                realm.copyToRealmOrUpdate(ge.Spike_Ball);
                realm.copyToRealmOrUpdate(ge.Spiked_Ice_Slime);
                realm.copyToRealmOrUpdate(ge.Spiked_Jungle_Slime);
                realm.copyToRealmOrUpdate(ge.Spore_Bat);
                realm.copyToRealmOrUpdate(ge.Spore_Skeleton);
                realm.copyToRealmOrUpdate(ge.Spore_Zombie);
                realm.copyToRealmOrUpdate(ge.Squid);
                realm.copyToRealmOrUpdate(ge.Tim);
                realm.copyToRealmOrUpdate(ge.Tomb_Crawler);
                realm.copyToRealmOrUpdate(ge.Undead_Miner);
                realm.copyToRealmOrUpdate(ge.Undead_Viking);
                realm.copyToRealmOrUpdate(ge.Voodoo_Demon);
                realm.copyToRealmOrUpdate(ge.Vulture);
                realm.copyToRealmOrUpdate(ge.Wall_Creeper);
                realm.copyToRealmOrUpdate(ge.Yellow_Slime);
                realm.copyToRealmOrUpdate(ge.Zombie);

                //Add Hardmode Enemies
                realm.copyToRealmOrUpdate(ge.Angler_Fish);
                realm.copyToRealmOrUpdate(ge.Angry_Trapper);
                realm.copyToRealmOrUpdate(ge.Arapaima);
                realm.copyToRealmOrUpdate(ge.Armored_Skeleton);
                realm.copyToRealmOrUpdate(ge.Armored_Viking);
                realm.copyToRealmOrUpdate(ge.Basilisk);
                realm.copyToRealmOrUpdate(ge.Black_Recluse);
                realm.copyToRealmOrUpdate(ge.Blood_Feeder);
                realm.copyToRealmOrUpdate(ge.Blood_Jelly);
                realm.copyToRealmOrUpdate(ge.Blood_Mummy);
                realm.copyToRealmOrUpdate(ge.Blue_Armored_Bones);
                realm.copyToRealmOrUpdate(ge.Blue_Cultist_Archer);
                realm.copyToRealmOrUpdate(ge.Bone_Lee);
                realm.copyToRealmOrUpdate(ge.Chaos_Elemental);
                realm.copyToRealmOrUpdate(ge.Clinger);
                realm.copyToRealmOrUpdate(ge.Corrupt_Mimic);
                realm.copyToRealmOrUpdate(ge.Corrupt_Slime);
                realm.copyToRealmOrUpdate(ge.Corruptor);
                realm.copyToRealmOrUpdate(ge.Crimslime);
                realm.copyToRealmOrUpdate(ge.Crimson_Axe);
                realm.copyToRealmOrUpdate(ge.Crimson_Mimic);
                realm.copyToRealmOrUpdate(ge.Cursed_Hammer);
                realm.copyToRealmOrUpdate(ge.Dark_Mummy);
                realm.copyToRealmOrUpdate(ge.Derpling);
                realm.copyToRealmOrUpdate(ge.Desert_Spirit);
                realm.copyToRealmOrUpdate(ge.Diablolist);
                realm.copyToRealmOrUpdate(ge.Digger);
                realm.copyToRealmOrUpdate(ge.Dreamer_Ghoul);
                realm.copyToRealmOrUpdate(ge.Dune_Splicer);
                realm.copyToRealmOrUpdate(ge.Dungeon_Spirit);
                realm.copyToRealmOrUpdate(ge.Enchanted_Sword);
                realm.copyToRealmOrUpdate(ge.Floaty_Gross);
                realm.copyToRealmOrUpdate(ge.Flying_Snake);
                realm.copyToRealmOrUpdate(ge.Fungo_Fish);
                realm.copyToRealmOrUpdate(ge.Gastropod);
                realm.copyToRealmOrUpdate(ge.Ghoul);
                realm.copyToRealmOrUpdate(ge.Giant_Bat);
                realm.copyToRealmOrUpdate(ge.Giant_Cursed_Skull);
                realm.copyToRealmOrUpdate(ge.Giant_Flying_Fox);
                realm.copyToRealmOrUpdate(ge.Giant_Fungi_Bulb);
                realm.copyToRealmOrUpdate(ge.Giant_Tortoise);
                realm.copyToRealmOrUpdate(ge.Green_Jellyfish);
                realm.copyToRealmOrUpdate(ge.Hallowed_Mimic);
                realm.copyToRealmOrUpdate(ge.Hell_Armored_Bones);
                realm.copyToRealmOrUpdate(ge.Herpling);
                realm.copyToRealmOrUpdate(ge.Hoppin_Jack);
                realm.copyToRealmOrUpdate(ge.Ice_Elemental);
                realm.copyToRealmOrUpdate(ge.Ice_Mimic);
                realm.copyToRealmOrUpdate(ge.Ice_Tortoise);
                realm.copyToRealmOrUpdate(ge.Ichor_Sticker);
                realm.copyToRealmOrUpdate(ge.Icy_Merman);
                realm.copyToRealmOrUpdate(ge.Illuminant_Bat);
                realm.copyToRealmOrUpdate(ge.Illuminant_Slime);
                realm.copyToRealmOrUpdate(ge.Jungle_Creeper);
                realm.copyToRealmOrUpdate(ge.Lamia);
                realm.copyToRealmOrUpdate(ge.Lava_Bat);
                realm.copyToRealmOrUpdate(ge.Light_Mummy);
                realm.copyToRealmOrUpdate(ge.Lihzahrd);
                realm.copyToRealmOrUpdate(ge.Lunatic_Devotee);
                realm.copyToRealmOrUpdate(ge.Martian_Probe);
                realm.copyToRealmOrUpdate(ge.Medusa);
                realm.copyToRealmOrUpdate(ge.Mimic);
                realm.copyToRealmOrUpdate(ge.Moss_Hornet);
                realm.copyToRealmOrUpdate(ge.Moth);
                realm.copyToRealmOrUpdate(ge.Mummy);
                realm.copyToRealmOrUpdate(ge.Necromancer);
                realm.copyToRealmOrUpdate(ge.Paladin);
                realm.copyToRealmOrUpdate(ge.Pigron);
                realm.copyToRealmOrUpdate(ge.Pixie);
                realm.copyToRealmOrUpdate(ge.Possessed_Armor);
                realm.copyToRealmOrUpdate(ge.Ragged_Caster);
                realm.copyToRealmOrUpdate(ge.Red_Devil);
                realm.copyToRealmOrUpdate(ge.Rock_Golem);
                realm.copyToRealmOrUpdate(ge.Rune_Wizard);
                realm.copyToRealmOrUpdate(ge.Rusty_Armored_Bones);
                realm.copyToRealmOrUpdate(ge.Sand_Poacher);
                realm.copyToRealmOrUpdate(ge.Skeleton_Archer);
                realm.copyToRealmOrUpdate(ge.Skeleton_Commando);
                realm.copyToRealmOrUpdate(ge.Skeleton_Sniper);
                realm.copyToRealmOrUpdate(ge.Slimeling);
                realm.copyToRealmOrUpdate(ge.Slimer);
                realm.copyToRealmOrUpdate(ge.Tactical_Skeleton);
                realm.copyToRealmOrUpdate(ge.Tainted_Ghoul);
                realm.copyToRealmOrUpdate(ge.Tortured_Soul);
                realm.copyToRealmOrUpdate(ge.Toxic_Sludge);
                realm.copyToRealmOrUpdate(ge.Unicorn);
                realm.copyToRealmOrUpdate(ge.Vile_Ghoul);
                realm.copyToRealmOrUpdate(ge.Wandering_Eye);
                realm.copyToRealmOrUpdate(ge.Werewolf);
                realm.copyToRealmOrUpdate(ge.Wolf);
                realm.copyToRealmOrUpdate(ge.World_Feeder);
                realm.copyToRealmOrUpdate(ge.Wraith);
                realm.copyToRealmOrUpdate(ge.Wyvern);
            }
        });
    }
    public void addBossesToDatabase() {
        //Get Bosses
        final Generate_Bosses gb = new Generate_Bosses();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(new Realm.Transaction() {
            public void execute(Realm realm) {

                //Add Pre-Hardmode Bosses
                realm.copyToRealmOrUpdate(gb.King_Slime);
                realm.copyToRealmOrUpdate(gb.Eye_Of_Cthulhu);
                realm.copyToRealmOrUpdate(gb.Eater_Of_Worlds);
                realm.copyToRealmOrUpdate(gb.Brain_Of_Cthulhu);
                realm.copyToRealmOrUpdate(gb.Queen_Bee);
                realm.copyToRealmOrUpdate(gb.Skeletron);
                realm.copyToRealmOrUpdate(gb.Wall_Of_Flesh);

                //Add Hardmode Bosses
                realm.copyToRealmOrUpdate(gb.Queen_Slime);
                realm.copyToRealmOrUpdate(gb.The_Twins);
                realm.copyToRealmOrUpdate(gb.The_Destroyer);
                realm.copyToRealmOrUpdate(gb.Skeletron_Prime);
                realm.copyToRealmOrUpdate(gb.Plantera);
                realm.copyToRealmOrUpdate(gb.Golem);
                realm.copyToRealmOrUpdate(gb.Empress_Of_Light);
                realm.copyToRealmOrUpdate(gb.Duke_Fishron);
                realm.copyToRealmOrUpdate(gb.Lunatic_Cultist);
                realm.copyToRealmOrUpdate(gb.Moon_Lord);
            }
        });
    }
    public void addSwordsToDatabase() {
        //Get Swords
        final Generate_Swords gs = new Generate_Swords();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(new Realm.Transaction() {
            public void execute(Realm realm) {

                //Add Pre-Hardmode Swords
                realm.copyToRealmOrUpdate(gs.Copper_Shortsword);
                realm.copyToRealmOrUpdate(gs.Tin_Shortsword);
                realm.copyToRealmOrUpdate(gs.Wooden_Sword);
                realm.copyToRealmOrUpdate(gs.Boreal_Wood_Sword);
                realm.copyToRealmOrUpdate(gs.Copper_Broadsword);
                realm.copyToRealmOrUpdate(gs.Iron_Shortsword);
                realm.copyToRealmOrUpdate(gs.Palm_Wood_Sword);
                realm.copyToRealmOrUpdate(gs.Rich_Mahogany_Sword);
                realm.copyToRealmOrUpdate(gs.Cactus_Sword);
                realm.copyToRealmOrUpdate(gs.Lead_Shortsword);
                realm.copyToRealmOrUpdate(gs.Silver_Shortsword);
                realm.copyToRealmOrUpdate(gs.Tin_Broadsword);
                realm.copyToRealmOrUpdate(gs.Ebonwood_Sword);
                realm.copyToRealmOrUpdate(gs.Iron_Broadsword);
                realm.copyToRealmOrUpdate(gs.Shadewood_Sword);
                realm.copyToRealmOrUpdate(gs.Tungsten_Shortsword);
                realm.copyToRealmOrUpdate(gs.Gold_Shortsword);
                realm.copyToRealmOrUpdate(gs.Lead_Broadsword);
                realm.copyToRealmOrUpdate(gs.Silver_Broadsword);
                realm.copyToRealmOrUpdate(gs.Bladed_Glove);
                realm.copyToRealmOrUpdate(gs.Tungsten_Broadsword);
                realm.copyToRealmOrUpdate(gs.Zombie_Arm);
                realm.copyToRealmOrUpdate(gs.Gold_Broadsword);
                realm.copyToRealmOrUpdate(gs.Platinum_Shortsword);
                realm.copyToRealmOrUpdate(gs.Mandible_Blade);
                realm.copyToRealmOrUpdate(gs.Stylish_Scissors);
                realm.copyToRealmOrUpdate(gs.Ruler);
                realm.copyToRealmOrUpdate(gs.Platinum_Broadsword);
                realm.copyToRealmOrUpdate(gs.Umbrella);
                realm.copyToRealmOrUpdate(gs.Breathing_Reed);
                realm.copyToRealmOrUpdate(gs.Gladius);
                realm.copyToRealmOrUpdate(gs.Bone_Sword);
                realm.copyToRealmOrUpdate(gs.Candy_Cane_Sword);
                realm.copyToRealmOrUpdate(gs.Katana);
                realm.copyToRealmOrUpdate(gs.Ice_Blade);
                realm.copyToRealmOrUpdate(gs.Lights_Bane);
                realm.copyToRealmOrUpdate(gs.Tragic_Umbrella);
                realm.copyToRealmOrUpdate(gs.Muramasa);
                realm.copyToRealmOrUpdate(gs.Exotic_Scimitar);
                realm.copyToRealmOrUpdate(gs.Phaseblade);
                realm.copyToRealmOrUpdate(gs.Blood_Butcherer);
                realm.copyToRealmOrUpdate(gs.Starfury);
                realm.copyToRealmOrUpdate(gs.Enchanted_Sword);
                realm.copyToRealmOrUpdate(gs.Purple_Clubberfish);
                realm.copyToRealmOrUpdate(gs.Bee_Keeper);
                realm.copyToRealmOrUpdate(gs.Falcon_Blade);
                realm.copyToRealmOrUpdate(gs.Blade_Of_Grass);
                realm.copyToRealmOrUpdate(gs.Fiery_Greatsword);
                realm.copyToRealmOrUpdate(gs.Nights_Edge);

                //Add Hardmode Swords
                realm.copyToRealmOrUpdate(gs.Pearlwood_Sword);
                realm.copyToRealmOrUpdate(gs.Classy_Cane);
                realm.copyToRealmOrUpdate(gs.Slap_Hand);
                realm.copyToRealmOrUpdate(gs.Cobalt_Sword);
                realm.copyToRealmOrUpdate(gs.Palladium_Sword);
                realm.copyToRealmOrUpdate(gs.Phasesaber);
                realm.copyToRealmOrUpdate(gs.Ice_Sickle);
                realm.copyToRealmOrUpdate(gs.Brand_Of_The_Inferno);
                realm.copyToRealmOrUpdate(gs.Mythril_Sword);
                realm.copyToRealmOrUpdate(gs.Orichalcum_Sword);
                realm.copyToRealmOrUpdate(gs.Breaker_Blade);
                realm.copyToRealmOrUpdate(gs.Cutlass);
                realm.copyToRealmOrUpdate(gs.Frostbrand);
                realm.copyToRealmOrUpdate(gs.Adamantite_Sword);
                realm.copyToRealmOrUpdate(gs.Beam_Sword);
                realm.copyToRealmOrUpdate(gs.Titanium_Sword);
                realm.copyToRealmOrUpdate(gs.Fetid_Baghnakhs);
                realm.copyToRealmOrUpdate(gs.Bladetongue);
                realm.copyToRealmOrUpdate(gs.Tizona);
                realm.copyToRealmOrUpdate(gs.Excaliber);
                realm.copyToRealmOrUpdate(gs.True_Excaliber);
                realm.copyToRealmOrUpdate(gs.Chlorophyte_Saber);
                realm.copyToRealmOrUpdate(gs.Death_Sickle);
                realm.copyToRealmOrUpdate(gs.Psycho_Knife);
                realm.copyToRealmOrUpdate(gs.Keybrand);
                realm.copyToRealmOrUpdate(gs.Chlorophyte_Claymore);
                realm.copyToRealmOrUpdate(gs.The_Horsemans_Blade);
                realm.copyToRealmOrUpdate(gs.Christmas_Tree_Sword);
                realm.copyToRealmOrUpdate(gs.True_Nights_Edge);
                realm.copyToRealmOrUpdate(gs.Seedler);
                realm.copyToRealmOrUpdate(gs.Flying_Dragon);
                realm.copyToRealmOrUpdate(gs.Starlight);
                realm.copyToRealmOrUpdate(gs.Terra_Blade);
                realm.copyToRealmOrUpdate(gs.Influx_Waver);
                realm.copyToRealmOrUpdate(gs.Star_Wrath);
                realm.copyToRealmOrUpdate(gs.Meowmere);

            }
        });
    }
    public void addPickaxesToDatabase() {
        //Get Pickaxes
        final Generate_Pickaxes gp = new Generate_Pickaxes();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(new Realm.Transaction() {
            public void execute(Realm realm) {

                //Add Pickaxes & Drills
                realm.copyToRealmOrUpdate(gp.Cactus_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Copper_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Tin_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Iron_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Lead_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Silver_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Tungsten_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Gold_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Candy_Cane_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Fossil_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Bone_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Platinum_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Reaver_Shark);
                realm.copyToRealmOrUpdate(gp.Nightmare_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Deathbringer_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Molten_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Cobalt_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Cobalt_Drill);
                realm.copyToRealmOrUpdate(gp.Palladium_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Palladium_Drill);
                realm.copyToRealmOrUpdate(gp.Mythril_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Mythril_Drill);
                realm.copyToRealmOrUpdate(gp.Orichalcum_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Orichalcum_Drill);
                realm.copyToRealmOrUpdate(gp.Adamantite_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Adamantite_Drill);
                realm.copyToRealmOrUpdate(gp.Titanium_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Titanium_Drill);
                realm.copyToRealmOrUpdate(gp.Spectre_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Chlorophyte_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Chlorophyte_Drill);
                realm.copyToRealmOrUpdate(gp.Pickaxe_Axe_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Drax_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Shroomite_Digging_Claw_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Picksaw_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Solar_Flare_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Solar_Flare_Drill);
                realm.copyToRealmOrUpdate(gp.Vortex_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Vortex_Drill);
                realm.copyToRealmOrUpdate(gp.Nebula_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Nebula_Drill);
                realm.copyToRealmOrUpdate(gp.Stardust_Pickaxe);
                realm.copyToRealmOrUpdate(gp.Stardust_Drill);
                realm.copyToRealmOrUpdate(gp.Laser_Drill);

            }
        });
    }
    public void addAxesToDatabase() {
        //Get Axes
        final Generate_Axes ga = new Generate_Axes();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(new Realm.Transaction() {
            public void execute(Realm realm) {

                //Add Axes and Chainsaws
                realm.copyToRealmOrUpdate(ga.Copper_Axe);
                realm.copyToRealmOrUpdate(ga.Tin_Axe);
                realm.copyToRealmOrUpdate(ga.Iron_Axe);
                realm.copyToRealmOrUpdate(ga.Lead_Axe);
                realm.copyToRealmOrUpdate(ga.Silver_Axe);
                realm.copyToRealmOrUpdate(ga.Tungsten_Axe);
                realm.copyToRealmOrUpdate(ga.Gold_Axe);
                realm.copyToRealmOrUpdate(ga.Platinum_Axe);
                realm.copyToRealmOrUpdate(ga.Cobalt_Waraxe);
                realm.copyToRealmOrUpdate(ga.Cobalt_Chainsaw);
                realm.copyToRealmOrUpdate(ga.Sawtooth_Shark);
                realm.copyToRealmOrUpdate(ga.War_Axe_Of_The_Night);
                realm.copyToRealmOrUpdate(ga.Blood_Lust_Cluster);
                realm.copyToRealmOrUpdate(ga.Palladium_Waraxe);
                realm.copyToRealmOrUpdate(ga.Palladium_Chainsaw);
                realm.copyToRealmOrUpdate(ga.Mythril_Waraxe);
                realm.copyToRealmOrUpdate(ga.Mythril_Chainsaw);
                realm.copyToRealmOrUpdate(ga.Orichalcum_Waraxe);
                realm.copyToRealmOrUpdate(ga.Orichalcum_Chainsaw);
                realm.copyToRealmOrUpdate(ga.Adamantite_Waraxe);
                realm.copyToRealmOrUpdate(ga.Adamantite_Chainsaw);
                realm.copyToRealmOrUpdate(ga.Meteor_Hamaxe_Axe);
                realm.copyToRealmOrUpdate(ga.Titanium_Waraxe);
                realm.copyToRealmOrUpdate(ga.Titanium_Chainsaw);
                realm.copyToRealmOrUpdate(ga.Pickaxe_Axe_Axe);
                realm.copyToRealmOrUpdate(ga.Drax_Axe);
                realm.copyToRealmOrUpdate(ga.Chlorophyte_Greataxe);
                realm.copyToRealmOrUpdate(ga.Chlorophyte_Chainsaw);
                realm.copyToRealmOrUpdate(ga.Lucy_The_Axe);
                realm.copyToRealmOrUpdate(ga.Picksaw_Axe);
                realm.copyToRealmOrUpdate(ga.Shroomite_Digging_Claw_Axe);
                realm.copyToRealmOrUpdate(ga.Butchers_Chainsaw);
                realm.copyToRealmOrUpdate(ga.Molten_Hamaxe_Axe);
                realm.copyToRealmOrUpdate(ga.Haemorrhaxe_Axe);
                realm.copyToRealmOrUpdate(ga.Spectre_Hamaxe_Axe);
                realm.copyToRealmOrUpdate(ga.Solar_Flare_Hamaxe_Axe);
                realm.copyToRealmOrUpdate(ga.Vortex_Hamaxe_Axe);
                realm.copyToRealmOrUpdate(ga.Nebula_Hamaxe_Axe);
                realm.copyToRealmOrUpdate(ga.Stardust_Hamaxe_Axe);
                realm.copyToRealmOrUpdate(ga.The_Axe_Axe);


            }
        });
    }
    public void addHammersToDatabase() {
        //Get Hammers
        final Generate_Hammers gh = new Generate_Hammers();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(new Realm.Transaction() {
            public void execute(Realm realm) {

                //Add Hammers and Jackhammers
                realm.copyToRealmOrUpdate(gh.Wooden_Hammer);
                realm.copyToRealmOrUpdate(gh.Rich_Mahogany_Hammer);
                realm.copyToRealmOrUpdate(gh.Palm_Wood_Hammer);
                realm.copyToRealmOrUpdate(gh.Boreal_Wood_Hammer);
                realm.copyToRealmOrUpdate(gh.Copper_Hammer);
                realm.copyToRealmOrUpdate(gh.Tin_Hammer);
                realm.copyToRealmOrUpdate(gh.Iron_Hammer);
                realm.copyToRealmOrUpdate(gh.Ebonwood_Hammer);
                realm.copyToRealmOrUpdate(gh.Shadewood_Hammer);
                realm.copyToRealmOrUpdate(gh.Lead_Hammer);
                realm.copyToRealmOrUpdate(gh.Pearlwood_Hammer);
                realm.copyToRealmOrUpdate(gh.Silver_Hammer);
                realm.copyToRealmOrUpdate(gh.Tungsten_Hammer);
                realm.copyToRealmOrUpdate(gh.Gold_Hammer);
                realm.copyToRealmOrUpdate(gh.The_Breaker);
                realm.copyToRealmOrUpdate(gh.Flesh_Grinder);
                realm.copyToRealmOrUpdate(gh.Platinum_Hammer);
                realm.copyToRealmOrUpdate(gh.Meteor_Hamaxe_Hammer);
                realm.copyToRealmOrUpdate(gh.Rockfish);
                realm.copyToRealmOrUpdate(gh.Molten_Hamaxe_Hammer);
                realm.copyToRealmOrUpdate(gh.Pwnhammer);
                realm.copyToRealmOrUpdate(gh.Haemorrhaxe_Hammer);
                realm.copyToRealmOrUpdate(gh.Hammush);
                realm.copyToRealmOrUpdate(gh.Chlorophyte_Warhammer);
                realm.copyToRealmOrUpdate(gh.Chlorophyte_Jackhammer);
                realm.copyToRealmOrUpdate(gh.Spectre_Hamaxe_Hammer);
                realm.copyToRealmOrUpdate(gh.Solar_Flare_Hamaxe_Hammer);
                realm.copyToRealmOrUpdate(gh.Vortex_Hamaxe_Hammer);
                realm.copyToRealmOrUpdate(gh.Nebula_Hamaxe_Hammer);
                realm.copyToRealmOrUpdate(gh.Stardust_Hamaxe_Hammer);
                realm.copyToRealmOrUpdate(gh.The_Axe_Hammer);


            }
        });
    }
    public void addSpellTomesToDatabase() {
        //Get SpellTomes
        final Generate_SpellTomes gst = new Generate_SpellTomes();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(new Realm.Transaction() {
            public void execute(Realm realm) {

                //Add Pre-Hardmode SpellTomes
                realm.copyToRealmOrUpdate(gst.Water_Bolt);
                realm.copyToRealmOrUpdate(gst.Book_Of_Skulls);
                realm.copyToRealmOrUpdate(gst.Demon_Scythe);

                //Add Hardmode SpellTomes
                realm.copyToRealmOrUpdate(gst.Cursed_Flames);
                realm.copyToRealmOrUpdate(gst.Golden_Shower);
                realm.copyToRealmOrUpdate(gst.Crystal_Storm);
                realm.copyToRealmOrUpdate(gst.Magnet_Sphere);
                realm.copyToRealmOrUpdate(gst.Razorblade_Typhoon);
                realm.copyToRealmOrUpdate(gst.Lunar_Flare);

            }
        });
    }
    public void addWandsToDatabase() {
        //Get Wands
        final Generate_Wands gw = new Generate_Wands();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(new Realm.Transaction() {
            public void execute(Realm realm) {

                //Add Pre-Hardmode Wands
                realm.copyToRealmOrUpdate(gw.Wand_Of_Sparking);
                realm.copyToRealmOrUpdate(gw.Thunder_Zapper);
                realm.copyToRealmOrUpdate(gw.Amethyst_Staff);
                realm.copyToRealmOrUpdate(gw.Topaz_Staff);
                realm.copyToRealmOrUpdate(gw.Sapphire_Staff);
                realm.copyToRealmOrUpdate(gw.Emerald_Staff);
                realm.copyToRealmOrUpdate(gw.Ruby_Staff);
                realm.copyToRealmOrUpdate(gw.Diamond_Staff);
                realm.copyToRealmOrUpdate(gw.Amber_Staff);
                realm.copyToRealmOrUpdate(gw.Vilethorn);
                realm.copyToRealmOrUpdate(gw.Weather_Pain);
                realm.copyToRealmOrUpdate(gw.Magic_Missile);
                realm.copyToRealmOrUpdate(gw.Aqua_Scepter);
                realm.copyToRealmOrUpdate(gw.Flower_Of_Fire);
                realm.copyToRealmOrUpdate(gw.Flamelash);

                //Add Hardmode Wands
                realm.copyToRealmOrUpdate(gw.Sky_Fracture);
                realm.copyToRealmOrUpdate(gw.Crystal_Serpent);
                realm.copyToRealmOrUpdate(gw.Flower_Of_Frost);
                realm.copyToRealmOrUpdate(gw.Frost_Staff);
                realm.copyToRealmOrUpdate(gw.Crystal_Vile_Shard);
                realm.copyToRealmOrUpdate(gw.Life_Drain);
                realm.copyToRealmOrUpdate(gw.Meteor_Staff);
                realm.copyToRealmOrUpdate(gw.Poison_Staff);
                realm.copyToRealmOrUpdate(gw.Rainbow_Rod);
                realm.copyToRealmOrUpdate(gw.Unholy_Trident);
                realm.copyToRealmOrUpdate(gw.Tome_Of_Infinite_Wisdom);
                realm.copyToRealmOrUpdate(gw.Venom_Staff);
                realm.copyToRealmOrUpdate(gw.Nettle_Burst);
                realm.copyToRealmOrUpdate(gw.Bat_Scepter);
                realm.copyToRealmOrUpdate(gw.Blizzard_Staff);
                realm.copyToRealmOrUpdate(gw.Inferno_Fork);
                realm.copyToRealmOrUpdate(gw.Shadowbeam_Staff);
                realm.copyToRealmOrUpdate(gw.Spectre_Staff);
                realm.copyToRealmOrUpdate(gw.Resonance_Scepter);
                realm.copyToRealmOrUpdate(gw.Razorpine);
                realm.copyToRealmOrUpdate(gw.Staff_Of_Earth);
                realm.copyToRealmOrUpdate(gw.Betsys_Wrath);


            }
        });
    }
    public void addYoYosToDatabase() {
        //Get YoYos
        final Generate_YoYos gYY = new Generate_YoYos();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(new Realm.Transaction() {
            public void execute(Realm realm) {

                //Add Pre-Hardmode YoYos
                realm.copyToRealmOrUpdate(gYY.Wooden_Yoyo);
                realm.copyToRealmOrUpdate(gYY.Rally);
                realm.copyToRealmOrUpdate(gYY.Malaise);
                realm.copyToRealmOrUpdate(gYY.Artery);
                realm.copyToRealmOrUpdate(gYY.Amazon);
                realm.copyToRealmOrUpdate(gYY.Code_1);
                realm.copyToRealmOrUpdate(gYY.Valor);
                realm.copyToRealmOrUpdate(gYY.Cascade);

                //Add Hardmode YoYos
                realm.copyToRealmOrUpdate(gYY.Format_C);
                realm.copyToRealmOrUpdate(gYY.Gradient);
                realm.copyToRealmOrUpdate(gYY.Chik);
                realm.copyToRealmOrUpdate(gYY.Hel_Fire);
                realm.copyToRealmOrUpdate(gYY.Amarok);
                realm.copyToRealmOrUpdate(gYY.Code_2);
                realm.copyToRealmOrUpdate(gYY.Yelets);
                realm.copyToRealmOrUpdate(gYY.Reds_Throw);
                realm.copyToRealmOrUpdate(gYY.Valkyrie_Yoyo);
                realm.copyToRealmOrUpdate(gYY.Kraken);
                realm.copyToRealmOrUpdate(gYY.The_Eye_Of_Cthulhu);
                realm.copyToRealmOrUpdate(gYY.Terrarian);

            }
        });
    }
    public void addSpearsToDatabase() {
        //Get Spears
        final Generate_Spears gsp = new Generate_Spears();
        // on below line we are calling a method to execute a transaction.
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransactionAsync(new Realm.Transaction() {
            public void execute(Realm realm) {

                //Add Pre-Hardmode Spears
                realm.copyToRealmOrUpdate(gsp.Spear);
                realm.copyToRealmOrUpdate(gsp.Trident);
                realm.copyToRealmOrUpdate(gsp.Storm_Spear);
                realm.copyToRealmOrUpdate(gsp.The_Rotted_Fork);
                realm.copyToRealmOrUpdate(gsp.Swordfish);
                realm.copyToRealmOrUpdate(gsp.Dark_Lance);

                //Add Hardmode Spears
                realm.copyToRealmOrUpdate(gsp.Cobalt_Naginata);
                realm.copyToRealmOrUpdate(gsp.Palladium_Pike);
                realm.copyToRealmOrUpdate(gsp.Mythril_Halberd);
                realm.copyToRealmOrUpdate(gsp.Orichalcum_Halberd);
                realm.copyToRealmOrUpdate(gsp.Adamantite_Glaive);
                realm.copyToRealmOrUpdate(gsp.Titanium_Trident);
                realm.copyToRealmOrUpdate(gsp.Gungnir);
                realm.copyToRealmOrUpdate(gsp.Ghastly_Glaive);
                realm.copyToRealmOrUpdate(gsp.Chlorophyte_Partisan);
                realm.copyToRealmOrUpdate(gsp.Tonbogiri);
                realm.copyToRealmOrUpdate(gsp.Mushroom_Spear);
                realm.copyToRealmOrUpdate(gsp.Obsidian_Swordfish);
                realm.copyToRealmOrUpdate(gsp.North_Pole);

            }
        });
    }
}
