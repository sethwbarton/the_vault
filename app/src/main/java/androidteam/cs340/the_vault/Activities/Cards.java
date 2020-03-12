package androidteam.cs340.the_vault.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import androidteam.cs340.the_vault.Presentors.DominionPresenter;
import androidteam.cs340.the_vault.Presentors.DominionPresenterInterface;
import androidteam.cs340.the_vault.R;

public class Cards extends AppCompatActivity {

    private DominionPresenterInterface presenter = new DominionPresenter();

    private Button card1Button;
    private Button card2Button;
    private Button card3Button;
    private Button card4Button;
    private Button card5Button;
    private Button card6Button;
    private Button card7Button;
    private Button card8Button;
    private Button card9Button;
    private Button card10Button;
    private Button cardS1Button;
    private Button cardS2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);
        // Hides the title bar
        try {
            this.getSupportActionBar().show();
            this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        card1Button = (Button) findViewById(R.id.card1);
        card1Button.setText(presenter.getCardSet().get(0).getName());
        card2Button = (Button) findViewById(R.id.card2);
        card2Button.setText(presenter.getCardSet().get(1).getName());
        card3Button = (Button) findViewById(R.id.card3);
        card3Button.setText(presenter.getCardSet().get(2).getName());
        card4Button = (Button) findViewById(R.id.card4);
        card4Button.setText(presenter.getCardSet().get(3).getName());
        card5Button = (Button) findViewById(R.id.card5);
        card5Button.setText(presenter.getCardSet().get(4).getName());
        card6Button = (Button) findViewById(R.id.card6);
        card6Button.setText(presenter.getCardSet().get(5).getName());
        card7Button = (Button) findViewById(R.id.card7);
        card7Button.setText(presenter.getCardSet().get(6).getName());
        card8Button = (Button) findViewById(R.id.card8);
        card8Button.setText(presenter.getCardSet().get(7).getName());
        card9Button = (Button) findViewById(R.id.card9);
        card9Button.setText(presenter.getCardSet().get(8).getName());
        card10Button = (Button) findViewById(R.id.card10);
        card10Button.setText(presenter.getCardSet().get(9).getName());
        if(presenter.getSpecialCardSet().size() >= 1) {
            cardS1Button = (Button) findViewById(R.id.cardS1);
            cardS1Button.setText(presenter.getSpecialCardSet().get(0).getName());
        }
        if(presenter.getSpecialCardSet().size() >= 2) {
            cardS2Button = (Button) findViewById(R.id.cardS2);
            cardS2Button.setText(presenter.getSpecialCardSet().get(1).getName());
        }


    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_cards);

        card1Button = (Button) findViewById(R.id.card1);
        card1Button.setText(presenter.getCardSet().get(0).getName());
        card2Button = (Button) findViewById(R.id.card2);
        card2Button.setText(presenter.getCardSet().get(1).getName());
        card3Button = (Button) findViewById(R.id.card3);
        card3Button.setText(presenter.getCardSet().get(2).getName());
        card4Button = (Button) findViewById(R.id.card4);
        card4Button.setText(presenter.getCardSet().get(3).getName());
        card5Button = (Button) findViewById(R.id.card5);
        card5Button.setText(presenter.getCardSet().get(4).getName());
        card6Button = (Button) findViewById(R.id.card6);
        card6Button.setText(presenter.getCardSet().get(5).getName());
        card7Button = (Button) findViewById(R.id.card7);
        card7Button.setText(presenter.getCardSet().get(6).getName());
        card8Button = (Button) findViewById(R.id.card8);
        card8Button.setText(presenter.getCardSet().get(7).getName());
        card9Button = (Button) findViewById(R.id.card9);
        card9Button.setText(presenter.getCardSet().get(8).getName());
        card10Button = (Button) findViewById(R.id.card10);
        card10Button.setText(presenter.getCardSet().get(9).getName());
        if(presenter.getSpecialCardSet().size() >= 1) {
            cardS1Button = (Button) findViewById(R.id.cardS1);
            cardS1Button.setText(presenter.getSpecialCardSet().get(0).getName());
        }
        if(presenter.getSpecialCardSet().size() >= 2) {
            cardS2Button = (Button) findViewById(R.id.cardS2);
            cardS2Button.setText(presenter.getSpecialCardSet().get(1).getName());
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        setContentView(R.layout.activity_cards);

        card1Button = (Button) findViewById(R.id.card1);
        card1Button.setText(presenter.getCardSet().get(0).getName());
        card2Button = (Button) findViewById(R.id.card2);
        card2Button.setText(presenter.getCardSet().get(1).getName());
        card3Button = (Button) findViewById(R.id.card3);
        card3Button.setText(presenter.getCardSet().get(2).getName());
        card4Button = (Button) findViewById(R.id.card4);
        card4Button.setText(presenter.getCardSet().get(3).getName());
        card5Button = (Button) findViewById(R.id.card5);
        card5Button.setText(presenter.getCardSet().get(4).getName());
        card6Button = (Button) findViewById(R.id.card6);
        card6Button.setText(presenter.getCardSet().get(5).getName());
        card7Button = (Button) findViewById(R.id.card7);
        card7Button.setText(presenter.getCardSet().get(6).getName());
        card8Button = (Button) findViewById(R.id.card8);
        card8Button.setText(presenter.getCardSet().get(7).getName());
        card9Button = (Button) findViewById(R.id.card9);
        card9Button.setText(presenter.getCardSet().get(8).getName());
        card10Button = (Button) findViewById(R.id.card10);
        card10Button.setText(presenter.getCardSet().get(9).getName());
        if(presenter.getSpecialCardSet().size() >= 1) {
            cardS1Button = (Button) findViewById(R.id.cardS1);
            cardS1Button.setText(presenter.getSpecialCardSet().get(0).getName());
        }
        if(presenter.getSpecialCardSet().size() >= 2) {
            cardS2Button = (Button) findViewById(R.id.cardS2);
            cardS2Button.setText(presenter.getSpecialCardSet().get(1).getName());
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        this.finish();
        return true;
    }
}
