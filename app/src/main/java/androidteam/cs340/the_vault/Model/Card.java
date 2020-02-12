package androidteam.cs340.the_vault.Model;

public class Card {
    private String name;
    private String cost;
    private String type;
    private Enum<Expansion> expansion;

    public Card(String name, String cost, String type, Enum<Expansion> expansion) {
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.expansion = expansion;
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

    public Enum<Expansion> getExpansion() {
        return expansion;
    }
}
