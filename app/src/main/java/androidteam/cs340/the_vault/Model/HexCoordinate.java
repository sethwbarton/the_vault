package androidteam.cs340.the_vault.Model;

public class HexCoordinate {
    private int x;
    private int y;
    private int z;

    public HexCoordinate(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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


    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof HexCoordinate)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        HexCoordinate hc = (HexCoordinate) o;

        // Compare the data members and return accordingly
        return Integer.compare(x, hc.x) == 0
                && Integer.compare(y, hc.y) == 0
                && Integer.compare(z, hc.z) == 0;
    }

}
