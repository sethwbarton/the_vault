package androidteam.cs340.the_vault.Activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.widget.TextView;

import androidteam.cs340.the_vault.Presentors.DominionPresenter;
import androidteam.cs340.the_vault.R;

public class ExpansionsActivity extends AppCompatActivity {

//    Resources res = getResources();

    private int unselectedColor = -855310;
    private int selectedColor = -14130376;

    private DominionPresenter presenter = new DominionPresenter();
    /* Buttons */
    private TextView nextButton;
    private Button domBaseSetButton;
    private Button domIntrigueButton;
    private Button domSeasideButton;
    private Button domCornucopiaButton;
    private Button domAdventuresButton;
    private Button domAlchemyButton;
    private Button domDarkAgesButton;
    private Button domGuildsButton;
    private Button domHinterlandsButton;
    private Button domProsperityButton;
    private Button domRenaissanceButton;
    private Button domNocturneButton;
    private Button domEmpiresButton;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expansions);

        domIntrigueButton = (Button) findViewById(R.id.intrigueButton);
        domIntrigueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (domIntrigueButton.getCurrentTextColor() == unselectedColor) {
                    domIntrigueButton.setTextColor(getResources().getColor(R.color.expansionButtonSelectedColor));
                    presenter.setUsingIntrigue(true);
                }
                else {
                    presenter.setUsingIntrigue(false);
                    domIntrigueButton.setTextColor(getResources().getColor(R.color.expansionButtonTextColor));
                }
            }
        });

        domSeasideButton = (Button) findViewById(R.id.seasideButton);
        domSeasideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (domSeasideButton.getCurrentTextColor() == unselectedColor) {
                    domSeasideButton.setTextColor(getResources().getColor(R.color.expansionButtonSelectedColor));
                    presenter.setUsingSeaside(true);
                }
                else {
                    presenter.setUsingSeaside(false);
                    domSeasideButton.setTextColor(getResources().getColor(R.color.expansionButtonTextColor));
                }
            }
        });

        domHinterlandsButton = (Button) findViewById(R.id.hinterlandsButton);
        domHinterlandsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (domHinterlandsButton.getCurrentTextColor() == unselectedColor) {
                    domHinterlandsButton.setTextColor(getResources().getColor(R.color.expansionButtonSelectedColor));
                    presenter.setUsingHinterlands(true);
                }
                else {
                    presenter.setUsingHinterlands(false);
                    domHinterlandsButton.setTextColor(getResources().getColor(R.color.expansionButtonTextColor));
                }
            }
        });

        domDarkAgesButton = (Button) findViewById(R.id.darkAgesButton);
        domDarkAgesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (domDarkAgesButton.getCurrentTextColor() == unselectedColor) {
                    domDarkAgesButton.setTextColor(getResources().getColor(R.color.expansionButtonSelectedColor));
                    presenter.setUsingDarkages(true);
                }
                else {
                    presenter.setUsingDarkages(false);
                    domDarkAgesButton.setTextColor(getResources().getColor(R.color.expansionButtonTextColor));
                }
            }
        });

        domProsperityButton = (Button) findViewById(R.id.prosperityButton);
        domProsperityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (domProsperityButton.getCurrentTextColor() == unselectedColor) {
                    domProsperityButton.setTextColor(getResources().getColor(R.color.expansionButtonSelectedColor));
                    presenter.setUsingProsperity(true);
                }
                else {
                    presenter.setUsingProsperity(false);
                    domProsperityButton.setTextColor(getResources().getColor(R.color.expansionButtonTextColor));
                }
            }
        });

        domAlchemyButton = (Button) findViewById(R.id.alchemyButton);
        domAlchemyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (domAlchemyButton.getCurrentTextColor() == unselectedColor) {
                    domAlchemyButton.setTextColor(getResources().getColor(R.color.expansionButtonSelectedColor));
                    presenter.setUsingAlchemy(true);
                }
                else {
                    presenter.setUsingAlchemy(false);
                    domAlchemyButton.setTextColor(getResources().getColor(R.color.expansionButtonTextColor));
                }
            }
        });

        domGuildsButton = (Button) findViewById(R.id.guildsButton);
        domGuildsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (domGuildsButton.getCurrentTextColor() == unselectedColor) {
                    domGuildsButton.setTextColor(getResources().getColor(R.color.expansionButtonSelectedColor));
                    presenter.setUsingGuilds(true);
                }
                else {
                    presenter.setUsingGuilds(false);
                    domGuildsButton.setTextColor(getResources().getColor(R.color.expansionButtonTextColor));
                }
            }
        });

        domCornucopiaButton = (Button) findViewById(R.id.cornucopiaButton);
        domCornucopiaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (domCornucopiaButton.getCurrentTextColor() == unselectedColor) {
                    domCornucopiaButton.setTextColor(getResources().getColor(R.color.expansionButtonSelectedColor));
                    presenter.setUsingCornucopia(true);
                }
                else {
                    presenter.setUsingCornucopia(false);
                    domCornucopiaButton.setTextColor(getResources().getColor(R.color.expansionButtonTextColor));
                }
            }
        });

        nextButton = (TextView) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.selectCards();
                Intent cardIntent = new Intent(ExpansionsActivity.this, Cards.class);
                startActivity(cardIntent);
            }
        });


    }



    /* TODO: Implement on Resume */


}
