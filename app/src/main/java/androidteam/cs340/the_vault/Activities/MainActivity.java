package androidteam.cs340.the_vault.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidteam.cs340.the_vault.R;

public class MainActivity extends AppCompatActivity {

    /* Buttons */
    private Button dominionButton;
    private Button turnOrderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Dominion Button */
        dominionButton = findViewById(R.id.dominionMainButton);
        dominionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dominionIntent = new Intent(getBaseContext(), DominionActivity.class);
                startActivity(dominionIntent);
            }
        });

        /* Turn Order Button */
        turnOrderButton = findViewById(R.id.turnOrderMainButton);
        turnOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent turnOrderIntent = new Intent(getBaseContext(), TurnOrderActivity.class);
                startActivity(turnOrderIntent);
            }
        });
    }
}
