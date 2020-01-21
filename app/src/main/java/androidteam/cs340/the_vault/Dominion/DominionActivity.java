package androidteam.cs340.the_vault.Dominion;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class DominionActivity extends AppCompatActivity {

    public static Intent newIntent (Context packageContext) {
        return(new Intent(packageContext, DominionActivity.class));
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    /* TODO: Implement on Resume */
}
