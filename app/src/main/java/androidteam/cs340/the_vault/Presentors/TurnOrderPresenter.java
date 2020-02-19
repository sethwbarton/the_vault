package androidteam.cs340.the_vault.Presentors;

import java.util.ArrayList;

import androidteam.cs340.the_vault.Model.TurnOrderData;

public class TurnOrderPresenter implements TurnOrderPresenterInterface {

    TurnOrderData data = TurnOrderData.instance();

    @Override
    public int getPlayerCount() {
        return 0;
    }

    @Override
    public void setPlayerCount(int count) {

    }

    @Override
    public void setPlayers(ArrayList<String> players) {

    }

    @Override
    public void randomizePlayers() {

    }

    @Override
    public ArrayList<String> getReorderedPlayers() {
        return null;
    }
}
