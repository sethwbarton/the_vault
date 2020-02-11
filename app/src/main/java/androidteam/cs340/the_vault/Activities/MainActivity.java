package androidteam.cs340.the_vault.Activities;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidteam.cs340.the_vault.Model.Data;

import androidteam.cs340.the_vault.Database.DatabaseHelper;

import androidteam.cs340.the_vault.R;

public class MainActivity extends AppCompatActivity {

    /* Buttons */
    private Button dominionButton;
    private Button turnOrderButton;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Data.instance();
        super.onCreate(savedInstanceState);
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
