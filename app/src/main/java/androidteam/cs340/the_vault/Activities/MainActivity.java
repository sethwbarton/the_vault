package androidteam.cs340.the_vault.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidteam.cs340.the_vault.Model.DominionData;
import androidteam.cs340.the_vault.R;

public class MainActivity extends AppCompatActivity {

    /* Buttons */
    private Button dominionButton;
    private Button turnOrderButton;
    private Button diceButton;
    private Button catanBoardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        DominionData.instance(this);
        super.onCreate(savedInstanceState);


        // Hides the title bar
        try {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }

        setContentView(R.layout.activity_main);

        /* Dominion Button */
        dominionButton = findViewById(R.id.dominionActivityButton);
        dominionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dominionIntent = new Intent(getBaseContext(), ExpansionsActivity.class);
                startActivity(dominionIntent);
            }
        });

        /* Turn Order Button */
        turnOrderButton = findViewById(R.id.turnOrderActivityButton);
        turnOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent turnOrderIntent = new Intent(getBaseContext(), TurnOrderActivity.class);
                startActivity(turnOrderIntent);
            }
        });

        diceButton = findViewById(R.id.diceActivityButton);
        diceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent diceIntent = new Intent(getBaseContext(), DiceActivity.class);
                startActivity(diceIntent);
            }
        });

        catanBoardButton = findViewById(R.id.catanBoardActivityButton);
        catanBoardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent catanBoardIntent = new Intent(getBaseContext(), CatanBoardActivity.class);
                startActivity(catanBoardIntent);
            }
        });
    }
}
