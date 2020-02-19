package androidteam.cs340.the_vault.Model;

import java.util.ArrayList;

import androidteam.cs340.the_vault.Presentors.DominionPresenterInterface;

public class DominionData implements DominionPresenterInterface {
    private static DominionData _instance;
    public static DominionData instance() {
        if (_instance == null){
            _instance = new DominionData();
        }
        return _instance;
    }

    private ArrayList<Card> allCards = new ArrayList<>(); //for the complete set of possible cards
    private ArrayList<Card> cardSeet = new ArrayList<>();
    private boolean usingBase;
    private boolean usingIntrigue;
    private boolean usingSeaside;
    private boolean usingGuilds;
    private boolean usingRenaissance;
    private boolean usingEmpires;
    private boolean usingAdventures;
    private boolean usingAlchemy;
    private boolean usingCornucopia;
    private boolean usingDarkages;
    private boolean usingHinterlands;
    private boolean usingProsperity;
    private boolean usingNocturne;

    public boolean isUsingBase() {
        return usingBase;
    }

    public void setUsingBase(boolean usingBase) {
        this.usingBase = usingBase;
    }

    public boolean isUsingIntrigue() {
        return usingIntrigue;
    }

    public void setUsingIntrigue(boolean usingIntrigue) {
        this.usingIntrigue = usingIntrigue;
    }

    public boolean isUsingSeaside() {
        return usingSeaside;
    }

    public void setUsingSeaside(boolean usingSeaside) {
        this.usingSeaside = usingSeaside;
    }

    public boolean isUsingGuilds() {
        return usingGuilds;
    }

    public void setUsingGuilds(boolean usingGuilds) {
        this.usingGuilds = usingGuilds;
    }

    public boolean isUsingRenaissance() {
        return usingRenaissance;
    }

    public void setUsingRenaissance(boolean usingRenaissance) {
        this.usingRenaissance = usingRenaissance;
    }

    public boolean isUsingEmpires() {
        return usingEmpires;
    }

    public void setUsingEmpires(boolean usingEmpires) {
        this.usingEmpires = usingEmpires;
    }

    public boolean isUsingAdventures() {
        return usingAdventures;
    }

    public void setUsingAdventures(boolean usingAdventures) {
        this.usingAdventures = usingAdventures;
    }

    public boolean isUsingAlchemy() {
        return usingAlchemy;
    }

    public void setUsingAlchemy(boolean usingAlchemy) {
        this.usingAlchemy = usingAlchemy;
    }

    public boolean isUsingCornucopia() {
        return usingCornucopia;
    }

    public void setUsingCornucopia(boolean usingCornucopia) {
        this.usingCornucopia = usingCornucopia;
    }

    public boolean isUsingDarkages() {
        return usingDarkages;
    }

    public void setUsingDarkages(boolean usingDarkages) {
        this.usingDarkages = usingDarkages;
    }

    public boolean isUsingHinterlands() {
        return usingHinterlands;
    }

    public void setUsingHinterlands(boolean usingHinterlands) {
        this.usingHinterlands = usingHinterlands;
    }

    public boolean isUsingProsperity() {
        return usingProsperity;
    }

    public void setUsingProsperity(boolean usingProsperity) {
        this.usingProsperity = usingProsperity;
    }

    public boolean isUsingNocturne() {
        return usingNocturne;
    }

    public void setUsingNocturne(boolean usingNocturne) {
        this.usingNocturne = usingNocturne;
    }

    @Override
    public void selectCards() {

    }

    @Override
    public ArrayList<Card> getCardSet() {
        return null;
    }

}
