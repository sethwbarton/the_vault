package androidteam.cs340.the_vault.Activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import androidteam.cs340.the_vault.Presentors.DominionPresenter;
import androidteam.cs340.the_vault.R;

public class DominionActivity extends AppCompatActivity {

//    Resources res = getResources();

    private DominionPresenter presentor = new DominionPresenter();
    /* Buttons */
    private Button nextButton;
    private Switch domBaseSetSwitch;
    private Switch domIntrigueSwitch;
    private Switch domSeasideSwitch;
    private Switch domCornucopiaSwitch;
    private Switch domAdventuresSwitch;
    private Switch domAlchemySwitch;
    private Switch domDarkAgesSwitch;
    private Switch domGuildsSwitch;
    private Switch domHinterlandsSwitch;
    private Switch domProsperitySwitch;
    private Switch domRenaissanceSwitch;
    private Switch domNocturneSwitch;
    private Switch domEmpiresSwitch;

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
    }



    /* TODO: Implement on Resume */


}
