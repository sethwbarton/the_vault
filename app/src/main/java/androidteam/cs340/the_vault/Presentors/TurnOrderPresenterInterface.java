package androidteam.cs340.the_vault.Presentors;

import java.util.ArrayList;

public interface TurnOrderPresenterInterface {

    //these should just call the same function on the singleton
    public abstract int getPlayerCount();
    public abstract void setPlayerCount(int count);
    public abstract void setPlayers(ArrayList<String> players);
    public abstract ArrayList<String> getReorderedPlayers();

    //randomizes the order of the players to be passed to the activity latter
    public abstract void randomizePlayers();


}
