package androidteam.cs340.the_vault.Model;

import java.util.ArrayList;

public interface TurnOrderDataInterface {

    public abstract int getPlayerCount();
    public abstract void setPlayerCount(int count);
    public abstract void setPlayers(ArrayList<String> players);
    public abstract ArrayList<String> getReorderedPlayers();
}
