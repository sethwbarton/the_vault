package androidteam.cs340.the_vault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidteam.cs340.the_vault.Dominion.DominionActivity;
import androidteam.cs340.the_vault.TurnOrder.TurnOrderActivity;

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
                Intent dominionIntent = DominionActivity.newIntent(MainActivity.this);
                startActivity(dominionIntent);
            }
        });

        /* Turn Order Button */
        turnOrderButton = findViewById(R.id.turnOrderMainButton);
        turnOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent turnOrderIntent = TurnOrderActivity.newIntent(MainActivity.this);
                startActivity(turnOrderIntent);
            }
        });
    }
}
