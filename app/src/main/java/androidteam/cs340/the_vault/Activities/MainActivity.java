package androidteam.cs340.the_vault.Activities;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidteam.cs340.the_vault.Model.DominionData;

import androidteam.cs340.the_vault.Database.DatabaseHelper;

import androidteam.cs340.the_vault.R;

public class MainActivity extends AppCompatActivity {

    /* Buttons */
    private Button dominionButton;
    private Button turnOrderButton;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        DominionData.instance();
        super.onCreate(savedInstanceState);


        // Hides the title bar
        try {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        setContentView(R.layout.activity_main);

        db = new DatabaseHelper(this).getReadableDatabase();
        //Example Code for reading from database:
//        Cursor cursor = db.rawQuery("SELECT * FROM students", null);
//        cursor.moveToFirst();
//        while (!cursor.isAfterLast()) {
//            Log.d("SQLITE", '\n' + cursor.getString(1));
//            cursor.moveToNext();
//        }

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
    }
}
