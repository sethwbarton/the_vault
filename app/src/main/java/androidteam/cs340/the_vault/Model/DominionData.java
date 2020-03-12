package androidteam.cs340.the_vault.Model;

import android.content.Context;

import java.util.ArrayList;
import java.util.Random;

import androidteam.cs340.the_vault.Database.DominionDAO;
import androidteam.cs340.the_vault.Presentors.DominionPresenterInterface;

public class DominionData implements DominionPresenterInterface {
    private static DominionData _instance;
    private static DominionDAO _dao;

    public static DominionData instance(Context context) {
        _dao = new DominionDAO(context);
        return instance();
    }

    public static DominionData instance() {
        if (_instance == null){
            _instance = new DominionData();
        }
        return _instance;
    }

    private ArrayList<Card> allCards = new ArrayList<>(); //for the complete set of possible Cards

    public ArrayList<Card> getPickedCardSet() {
        return pickedCardSet;
    }

    private ArrayList<Card> pickedCardSet = new ArrayList<>();
    private ArrayList<Card> specialPickedCardSet = new ArrayList<>();

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

    public ArrayList<Card> getSpecialPickedCardSet() {
        return specialPickedCardSet;
    }

    public void setSpecialPickedCardSet(ArrayList<Card> specialPickedCardSet) {
        this.specialPickedCardSet = specialPickedCardSet;
    }

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
        Random rand = new Random();
        this.allCards = this.getCardSet();
        ArrayList<Integer> picked = new ArrayList<>();
        ArrayList<Integer> specialPicked = new ArrayList<>();
        int kingdomCardsPicked =0;
        int specialCardsPicked =0;
        //make sure we are getting 10 actual kingdom cards, will require a bit of database editing as well
        while (kingdomCardsPicked != 10) {
            //get the next random index for the next card
            int num = rand.nextInt(this.allCards.size());
            //check if its one of the special cards
            if(this.allCards.get(num).getType() == "EVENT" || this.allCards.get(num).getType() == "PROJECT"
                    || this.allCards.get(num).getType() == "LANDMARK" ){
                //if we have already grabbed 2 special cards pick a new card that is not special
                if(specialCardsPicked >= 2){
                    while(this.allCards.get(num).getType() == "EVENT" || this.allCards.get(num).getType() == "PROJECT"
                            || this.allCards.get(num).getType() == "LANDMARK") {
                        num = rand.nextInt(this.allCards.size());
                    }
                }
            }
            //make sure we dont pick the same card twice
            while (picked.contains(num) || specialPicked.contains(num)) {
                num = rand.nextInt(this.allCards.size());
            }
            //add the card we picked to the set of picked cards as well as its index

            //we don't increment the kingdom cards picked if it was a special card picked
            if(this.allCards.get(num).getType() == "EVENT" || this.allCards.get(num).getType() == "PROJECT" || this.allCards.get(num).getType() == "LANDMARK"){
                this.specialPickedCardSet.add(this.allCards.get(num));
                specialPicked.add(num);
                specialCardsPicked++;
            }
            else{
                this.pickedCardSet.add(this.allCards.get(num));
                picked.add(num);
                kingdomCardsPicked++;
            }
        }
    }

    @Override
    public ArrayList<Card> getCardSet() {
        ArrayList<String> expansions = new ArrayList<String>();
        if (usingBase) expansions.add("BASE");
        if (usingIntrigue) expansions.add("INTRIGUE");
        if (usingSeaside) expansions.add("SEASIDE");
        if (usingGuilds) expansions.add("GUILDS");
        if (usingRenaissance) expansions.add("RENAISSANCE");
        if (usingEmpires) expansions.add("EMPIRES");
        if (usingAdventures) expansions.add("ADVENTURES");
        if (usingAlchemy) expansions.add("ALCHEMY");
        if (usingCornucopia) expansions.add("CORNUCOPIA");
        if (usingDarkages) expansions.add("DARKAGES");
        if (usingHinterlands) expansions.add("HINTERLANDS");
        if (usingProsperity) expansions.add("PROSPERITY");
        if (usingNocturne) expansions.add("NOCTURNE");

        return expansions.size() > 0 ? _dao.getCards(expansions) : _dao.getCards();
    }

    @Override
    public ArrayList<Card> getSpecialCardSet() {
        return getSpecialPickedCardSet();
    }
}
