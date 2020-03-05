package androidteam.cs340.the_vault.Model;

import java.util.ArrayList;

public class CatanBoardData {
    private static CatanBoardData _instance;
    public static CatanBoardData instance() {
        if (_instance == null){
            _instance = new CatanBoardData();
        }
        return _instance;
    }

    private ArrayList<Hex> expansionHexes = new ArrayList<>();
    private ArrayList<Hex> baseHexes = new ArrayList<>();
    private ArrayList<Resources> baseResources= new ArrayList<>();
    private ArrayList<Resources> expansionResources= new ArrayList<>();
    private boolean expansion = false;

    private CatanBoardData(){
        fillData();
    }


    public boolean isExpansion() {
        return expansion;
    }

    public void setExpansion(boolean expansion) {
        this.expansion = expansion;
    }

    //fill in data needed for later
    private void fillData(){
        fillHexLists();
        fillResourceLists();
    }

    private void fillHexLists(){
        fillBaseHexes();
        fillExpansionHexes();
    }

    private void fillBaseHexes(){
        baseHexes.add(new Hex(2,0,2));
        baseHexes.add(new Hex(3,1,2));
        baseHexes.add(new Hex(4,2,2));
        baseHexes.add(new Hex(1,0,1));
        baseHexes.add(new Hex(2,1,1));
        baseHexes.add(new Hex(3,2,1));
        baseHexes.add(new Hex(4,3,1));
        baseHexes.add(new Hex(0,0,0));
        baseHexes.add(new Hex(1,1,0));
        baseHexes.add(new Hex(2,2,0));
        baseHexes.add(new Hex(3,3,0));
        baseHexes.add(new Hex(4,4,0));
        baseHexes.add(new Hex(0,1,-1));
        baseHexes.add(new Hex(1,2,-1));
        baseHexes.add(new Hex(2,3,-1));
        baseHexes.add(new Hex(3,4,-1));
        baseHexes.add(new Hex(0,2,-2));
        baseHexes.add(new Hex(1,3,-2));
        baseHexes.add(new Hex(2,4,-2));
    }
    
    private void fillExpansionHexes(){
        expansionHexes.add(new Hex(3,0,3));
        expansionHexes.add(new Hex(4,1,3));
        expansionHexes.add(new Hex(5,2,3));
        expansionHexes.add(new Hex(2,0,2));
        expansionHexes.add(new Hex(3,1,2));
        expansionHexes.add(new Hex(4,2,2));
        expansionHexes.add(new Hex(5,3,2));
        expansionHexes.add(new Hex(1,0,1));
        expansionHexes.add(new Hex(2,1,1));
        expansionHexes.add(new Hex(3,2,1));
        expansionHexes.add(new Hex(4,3,1));
        expansionHexes.add(new Hex(5,4,1));
        expansionHexes.add(new Hex(0,0,0));
        expansionHexes.add(new Hex(1,1,0));
        expansionHexes.add(new Hex(2,2,0));
        expansionHexes.add(new Hex(3,3,0));
        expansionHexes.add(new Hex(4,4,0));
        expansionHexes.add(new Hex(5,5,0));
        expansionHexes.add(new Hex(0,1,-1));
        expansionHexes.add(new Hex(1,2,-1));
        expansionHexes.add(new Hex(2,3,-1));
        expansionHexes.add(new Hex(3,4,-1));
        expansionHexes.add(new Hex(4,5,-1));
        expansionHexes.add(new Hex(0,2,-2));
        expansionHexes.add(new Hex(1,3,-2));
        expansionHexes.add(new Hex(2,4,-2));
        expansionHexes.add(new Hex(3,5,-2));
        expansionHexes.add(new Hex(0,3,-3));
        expansionHexes.add(new Hex(1,4,-3));
        expansionHexes.add(new Hex(2,5,-3));
    }

    private void fillResourceLists(){
        fillBaseResources();
        fillExpansionResources();
    }

    private void fillBaseResources(){
        baseResources.add(Resources.DESERT);
        for(int i = 1; i <= 4; i++){
            baseResources.add(Resources.WHEAT);
            baseResources.add(Resources.WOOD);
            baseResources.add(Resources.SHEEP);
            if(i != 4){
                baseResources.add(Resources.ORE);
                baseResources.add(Resources.BRICK);
            }
        }
    }

    private void fillExpansionResources(){
        expansionResources.add(Resources.DESERT);
        expansionResources.add(Resources.DESERT);
        for(int i = 1; i <= 6; i++){
            expansionResources.add(Resources.WHEAT);
            expansionResources.add(Resources.WOOD);
            expansionResources.add(Resources.SHEEP);
            if(i != 6){
                expansionResources.add(Resources.ORE);
                expansionResources.add(Resources.BRICK);
            }
        }
    }
}
