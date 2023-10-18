package com.inspirationhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PeopleTypeEng extends AppCompatActivity implements View.OnClickListener {
       CardView card_sportsEn ,card_politicianEn,card_scientisEn,card_mathematicianEn, crad_FfightersEn,card_BusinessmanEn,
         card_EntrepEn , card_AuthorEn,card_soldiersEn,card_motivatorEn , card_ArtistEn ,card_MusicianEn,card_ActorEn,card_SingerEn,card_DancerEn,card_PoetsEn,card_Comedians,card_OtherFamousEn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_type_eng);
        card_sportsEn = findViewById(R.id.card_Sports2);
        card_politicianEn= findViewById(R.id.card_leaders2);
        card_scientisEn=findViewById(R.id.card_scientis2);
        card_mathematicianEn= findViewById(R.id.card_mathematicians2);
        crad_FfightersEn=findViewById(R.id.card_F_fighters2);
        card_BusinessmanEn=findViewById(R.id.card_Businessman2);
        card_EntrepEn=findViewById(R.id.card_enterp2);
        card_AuthorEn=findViewById(R.id.card_Author2);
        card_soldiersEn=findViewById(R.id.card_soldiers2);
        card_motivatorEn = findViewById(R.id.card_motivator2);
        card_ArtistEn = findViewById(R.id.card_artists2);
        card_MusicianEn = findViewById(R.id.card_musicians2);
        card_ActorEn = findViewById(R.id.card_actor2);
        card_SingerEn = findViewById(R.id.card_singers2);
        card_DancerEn = findViewById(R.id.card_dancers2);
        card_PoetsEn = findViewById(R.id.card_poets2);
        card_Comedians = findViewById(R.id.card_comedians2);
        card_OtherFamousEn = findViewById(R.id.card_others2);


        card_sportsEn.setOnClickListener(this);
        card_politicianEn .setOnClickListener(this);
        card_scientisEn.setOnClickListener(this);
        card_mathematicianEn.setOnClickListener(this);
        crad_FfightersEn.setOnClickListener(this);
        card_BusinessmanEn.setOnClickListener(this);
        card_EntrepEn.setOnClickListener(this);
        card_AuthorEn.setOnClickListener(this);
        card_soldiersEn.setOnClickListener(this);
        card_motivatorEn.setOnClickListener(this);
        card_ArtistEn.setOnClickListener(this);
        card_MusicianEn.setOnClickListener(this);
        card_ActorEn.setOnClickListener(this);
        card_SingerEn.setOnClickListener(this);
        card_DancerEn.setOnClickListener(this);
        card_PoetsEn.setOnClickListener(this);
        card_Comedians.setOnClickListener(this);
        card_OtherFamousEn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.card_Sports2:
                Intent intentsports = new Intent(PeopleTypeEng.this,sports.class);
                startActivity(intentsports);
                break;
                case R.id.card_leaders2:
                Intent intentleaders = new Intent(PeopleTypeEng.this,politician.class);
                startActivity(intentleaders);
                break;
            case R.id.card_scientis2:
                Intent intentscientist = new Intent(PeopleTypeEng.this,ScientistEn.class);
                startActivity(intentscientist);
                break;
            case R.id.card_mathematicians2:
                Intent intentsmathematician2 = new Intent(PeopleTypeEng.this,MathematiciansEn.class);
                startActivity(intentsmathematician2);
                break;
            case R.id.card_F_fighters2:
                Intent intentFfighterEn = new Intent(PeopleTypeEng.this,FreedomFighterEng.class);
                startActivity(intentFfighterEn);
                break;
            case R.id.card_Businessman2:
                Intent intentBusinessMenEn = new Intent(PeopleTypeEng.this,BusinessMenEng.class);
                startActivity(intentBusinessMenEn);
                break;
            case R.id.card_Author2:
                Intent intentAuthor2En = new Intent(PeopleTypeEng.this,Author2En.class);
                startActivity(intentAuthor2En);
                break;
            case R.id.card_enterp2:
                Intent intentEntreEn = new Intent(PeopleTypeEng.this,EntrepreneurEn.class);
                startActivity(intentEntreEn);
                break;
            case R.id.card_soldiers2:
                Intent intentsoldierEn = new Intent(PeopleTypeEng.this,soldierEn.class);
                startActivity(intentsoldierEn);
                break;

            case R.id.card_motivator2:
                Intent intentMotivatorEn = new Intent(PeopleTypeEng.this,MotivatorEn.class);
                startActivity(intentMotivatorEn);
                break;
            case R.id.card_actor2:
                Intent intentActorEn = new Intent(PeopleTypeEng.this,ActorsEn.class);
                startActivity(intentActorEn);
                break;

            case R.id.card_musicians2:
                Intent intentMusicianEn = new Intent(PeopleTypeEng.this,MusicianEn.class);
                startActivity(intentMusicianEn);
                break;

            case R.id.card_artists2:
                Intent intentArtistEn = new Intent(PeopleTypeEng.this,ArtistEn.class);
                startActivity(intentArtistEn);
                break;

            case R.id.card_singers2:
                Intent intentSingerEn = new Intent(PeopleTypeEng.this,SingerEn.class);
                startActivity(intentSingerEn);
                break;

            case R.id.card_dancers2:
                Intent intentDancerEn = new Intent(PeopleTypeEng.this,DancerEn.class);
                startActivity(intentDancerEn);
                break;
            case R.id.card_poets2:
                Intent intentPetsEn = new Intent(PeopleTypeEng.this,PoetsEn.class);
                startActivity(intentPetsEn);
                break;

            case R.id.card_comedians2:
                Intent intentComediansEn = new Intent(PeopleTypeEng.this,ComedianEn.class);
                startActivity(intentComediansEn);
                break;
            case R.id.card_others2:
                Intent intentOtherFamusEn = new Intent(PeopleTypeEng.this,OtherFamous.class);
                startActivity(intentOtherFamusEn);
                break;
        }
    }
}