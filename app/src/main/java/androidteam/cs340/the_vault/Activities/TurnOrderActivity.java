package androidteam.cs340.the_vault.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import androidteam.cs340.the_vault.R;

public class TurnOrderActivity extends AppCompatActivity {

    private TextView titleText;
    private TextView subTitleText;
    private TextInputEditText playerNumberText;
    private TextView turnOrderText;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turn_order);

        titleText =  findViewById(R.id.turnOrderTitle);
        subTitleText = findViewById(R.id.turnOrderSubTitle);
        playerNumberText =  findViewById(R.id.playerNumberPrompt);
        turnOrderText = findViewById(R.id.turnOrder);

    }
}
