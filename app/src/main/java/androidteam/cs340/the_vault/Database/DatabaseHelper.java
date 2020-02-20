package androidteam.cs340.the_vault.Database;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "dominion_cards.sqlite3";

    private Context context;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        this.context = context;
        installDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) { }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) { }

    public void installDatabase() {
        try {
            InputStream inputStream = this.context.getAssets().open("databases/" + DATABASE_NAME);
            File outputFile = new File(context.getDatabasePath(DATABASE_NAME).getPath());
            OutputStream outputStream = new FileOutputStream(outputFile);

            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);

            outputStream.write(buffer);
        }
        catch (IOException e) {
            Log.e("DEBUG", e.getMessage());
        }
    }
}