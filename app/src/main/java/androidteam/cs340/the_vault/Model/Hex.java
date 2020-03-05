package androidteam.cs340.the_vault.Model;

public class Hex {
    private int x;
    private int y;
    private int z;
    private Enum<Resources> resource;

    public Hex(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        resource = Resources.NONE;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Enum<Resources> getResource() {
        return resource;
    }

    public void setResource(Enum<Resources> resource) {
        this.resource = resource;
    }
}
