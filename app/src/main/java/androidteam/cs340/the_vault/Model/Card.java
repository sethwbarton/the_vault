package androidteam.cs340.the_vault.Model;

public class Card {
    private String name;
    private String cost;
    private String type;
    private String expansion;
//    private Enum<Expansion> expansion;


    public Card(String name, String cost, String type, String expansion) {
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.expansion = expansion;
//        this.expansion = expansion;
    }

    public String getName() {
        return name;
    }

    public String getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }

    public String getExpansion() { return expansion; }

//    public Enum<Expansion> getExpansion() {
//        return expansion;
//    }
}
