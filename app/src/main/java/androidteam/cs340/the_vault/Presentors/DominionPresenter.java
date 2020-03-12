package androidteam.cs340.the_vault.Presentors;

import android.widget.Button;

import java.util.ArrayList;

import androidteam.cs340.the_vault.Model.Card;
import androidteam.cs340.the_vault.Model.DominionData;

public class DominionPresenter implements DominionPresenterInterface{

    DominionData data = DominionData.instance();

    public DominionPresenter() {}


    @Override
    public void setUsingBase(boolean bool) {
        data.setUsingBase(bool);
    }

    @Override
    public void setUsingIntrigue(boolean bool) {
        data.setUsingIntrigue(bool);
    }

    @Override
    public void setUsingSeaside(boolean bool) {
        data.setUsingSeaside(bool);
    }

    @Override
    public void setUsingProsperity(boolean bool) {
        data.setUsingProsperity(bool);
    }

    @Override
    public void setUsingHinterlands(boolean bool) {
        data.setUsingHinterlands(bool);
    }

    @Override
    public void setUsingDarkages(boolean bool) {
        data.setUsingDarkages(bool);
    }

    @Override
    public void setUsingAdventures(boolean bool) {
        data.setUsingAdventures(bool);
    }

    @Override
    public void setUsingEmpires(boolean bool) {
        data.setUsingEmpires(bool);
    }

    @Override
    public void setUsingNocturne(boolean bool) {
        data.setUsingNocturne(bool);
    }

    @Override
    public void setUsingRenaissance(boolean bool) {
        data.setUsingRenaissance(bool);
    }

    @Override
    public void setUsingAlchemy(boolean bool) {
        data.setUsingAlchemy(bool);
    }

    @Override
    public void setUsingCornucopia(boolean bool) {
        data.setUsingCornucopia(bool);
    }

    @Override
    public void setUsingGuilds(boolean bool) {
        data.setUsingGuilds(bool);
    }

    @Override
    public void selectCards() {
        data.selectCards();
    }

    @Override
    public ArrayList<Card> getCardSet() {
        return data.getPickedCardSet();
    }

    @Override
    public ArrayList<Card> getSpecialCardSet() {
        return data.getSpecialPickedCardSet();
    }
}
