package androidteam.cs340.the_vault.Activities;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidteam.cs340.the_vault.Presentors.DominionPresentor;
import androidteam.cs340.the_vault.R;

public class DominionActivity extends AppCompatActivity {

//    Resources res = getResources();

    private DominionPresentor presentor = new DominionPresentor();
    /* Buttons */
    private Button nextButton;
    private RadioGroup dominionExpansionRadioGroup;
    private RadioButton domBaseSetRadioButton;
    private RadioButton domIntrigueRadioButton;
    private RadioButton domSeasideRadioButton;
    private RadioButton domCornucopiaRadioButton;
    private RadioButton domAdventuresRadioButton;
    private RadioButton domAlchemyRadioButton;
    private RadioButton domDarkAgesRadioButton;
    private RadioButton domGuildsRadioButton;
    private RadioButton domHinterlandsRadioButton;
    private RadioButton domProsperityRadioButton;
    private RadioButton domRenaissanceRadioButton;
    private RadioButton domNocturneRadioButton;
    private RadioButton domEmpiresRadioButton;

    private TextView domBaseSetTextView;
    private TextView domIntrigueTextView;
    /* TODO: Add the other expansions' TextViews */

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_dominion);

        /* Set the texts of the expansions */
        domBaseSetTextView = findViewById(R.id.domBaseSetTextView);
        domIntrigueTextView = findViewById(R.id.domIntrigueTextView);
        String[] domExpansionTextArray = getResources().getStringArray(R.array.dominionExpansionsStringArray);
        domBaseSetTextView.setText(domExpansionTextArray[0]);
        domIntrigueTextView.setText(domExpansionTextArray[1]);

        /* Set up the RadioGroup */
        dominionExpansionRadioGroup = findViewById(R.id.dominionExpansionRadioGroup);

        /* Set up the RadioButtons */
        domBaseSetRadioButton = findViewById(R.id.domBaseSetRadioButton);
        domIntrigueRadioButton = findViewById(R.id.domIntrigueRadioButton);


        /* Set up checkChangeListener */
        dominionExpansionRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checkedExpansionRadioButton = group.findViewById(checkedId);

                boolean isChecked = checkedExpansionRadioButton.isChecked();
            }
        });
    }



    /* TODO: Implement on Resume */


}
