package androidteam.cs340.the_vault.Model;

import java.util.ArrayList;

import androidteam.cs340.the_vault.Presentors.TurnOrderPresenterInterface;

public class TurnOrderData implements TurnOrderPresenterInterface {
    private static TurnOrderData _instance;
    public static TurnOrderData instance() {
        if (_instance == null){
            _instance = new TurnOrderData();
        }
        return _instance;
    }

    private ArrayList<Card> cards = new ArrayList<>();

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
    public ArrayList<String> getReorderedPlayers() {
        return null;
    }

    @Override
    public void randomizePlayers() {

    }
}
