package androidteam.cs340.the_vault.Model;

import java.util.ArrayList;

public interface DominionDataInterface {
    //used to indicate which expansions have been selected
    public abstract void setUsingBase(boolean bool);
    public abstract void setUsingIntrigue(boolean bool);
    public abstract void setUsingSeaside(boolean bool);
    public abstract void setUsingProsperity(boolean bool);
    public abstract void setUsingHinterlands(boolean bool);
    public abstract void setUsingDarkages(boolean bool);
    public abstract void setUsingAdventures(boolean bool);
    public abstract void setUsingEmpires(boolean bool);
    public abstract void setUsingNocturne(boolean bool);
    public abstract void setUsingRenaissance(boolean bool);
    public abstract void setUsingAlchemy(boolean bool);
    public abstract void setUsingCornucopia(boolean bool);
    public abstract void setUsingGuilds(boolean bool);

    //gets the list of all possible Cards from the database and selects 10, storing those 10 in the Dominion data
    public abstract void selectCards();

    //returns the ten Cards to the presenter that will be played with
    public abstract ArrayList<Card> getCardSet();
}
