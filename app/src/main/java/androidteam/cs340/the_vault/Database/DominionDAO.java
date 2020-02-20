package androidteam.cs340.the_vault.Database;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidteam.cs340.the_vault.Model.Card;

public class DominionDAO {
    private SQLiteDatabase db;
    public DominionDAO(Context context){
        db = new DatabaseHelper(context).getReadableDatabase();
    }

    public ArrayList<Card> getCards() {
        return getCards(null);
    }

    public ArrayList<Card> getCards(ArrayList<String> expansions){

        String query = "SELECT * FROM dominion_cards";
        if (expansions != null) {
            String values = listToSQL(expansions);
            query = query + " WHERE expansion in (" + values + ")";
        }
        ArrayList<Card> cards = new ArrayList<Card>();

        Cursor cursor = db.rawQuery(query, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            String name = cursor.getString(0);
            String cost = cursor.getString(1);
            String type = cursor.getString(2);
            String expansion = cursor.getString(3);
            Card card = new Card(name,cost,type,expansion);
            cards.add(card);
            cursor.moveToNext();
        }
        return cards;
    }

    private String listToSQL(ArrayList<String> expansions) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < expansions.size(); i++){
            sb.append('"' + expansions.get(i) + "\",");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
