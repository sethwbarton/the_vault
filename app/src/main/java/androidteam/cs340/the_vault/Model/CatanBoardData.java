package androidteam.cs340.the_vault.Model;

import java.util.ArrayList;
import java.util.HashMap;

public class CatanBoardData {
    private static CatanBoardData _instance;
    public static CatanBoardData instance() {
        if (_instance == null){
            _instance = new CatanBoardData();
        }
        return _instance;
    }


    private ArrayList<HexCoordinate> baseHexCoordinates = new ArrayList<>();
    private HashMap<HexCoordinate, Enum<Resources>> baseHexes = new HashMap<>();

    private ArrayList<HexCoordinate> expansionHexCoordinates = new ArrayList<>();
    private HashMap<HexCoordinate, Enum<Resources>> expansionHexes = new HashMap<>();

    private ArrayList<Enum<Resources>> baseResources= new ArrayList<>();
    private ArrayList<Enum<Resources>> expansionResources= new ArrayList<>();



    private CatanBoardData(){
        fillData();
    }


    //fill in data needed for later
    private void fillData(){
        fillHexCoordinatesLists();
        fillHexMaps();
        fillResourceLists();
    }

    private void fillHexCoordinatesLists(){
        fillBaseHexCoordinates();
        fillExpansionCoordinates();
    }

    private void fillBaseHexCoordinates(){
        baseHexCoordinates.add(new HexCoordinate(2,0,2));
        baseHexCoordinates.add(new HexCoordinate(3,1,2));
        baseHexCoordinates.add(new HexCoordinate(4,2,2));
        baseHexCoordinates.add(new HexCoordinate(1,0,1));
        baseHexCoordinates.add(new HexCoordinate(2,1,1));
        baseHexCoordinates.add(new HexCoordinate(3,2,1));
        baseHexCoordinates.add(new HexCoordinate(4,3,1));
        baseHexCoordinates.add(new HexCoordinate(0,0,0));
        baseHexCoordinates.add(new HexCoordinate(1,1,0));
        baseHexCoordinates.add(new HexCoordinate(2,2,0));
        baseHexCoordinates.add(new HexCoordinate(3,3,0));
        baseHexCoordinates.add(new HexCoordinate(4,4,0));
        baseHexCoordinates.add(new HexCoordinate(0,1,-1));
        baseHexCoordinates.add(new HexCoordinate(1,2,-1));
        baseHexCoordinates.add(new HexCoordinate(2,3,-1));
        baseHexCoordinates.add(new HexCoordinate(3,4,-1));
        baseHexCoordinates.add(new HexCoordinate(0,2,-2));
        baseHexCoordinates.add(new HexCoordinate(1,3,-2));
        baseHexCoordinates.add(new HexCoordinate(2,4,-2));
    }
    
    private void fillExpansionCoordinates(){
        expansionHexCoordinates.add(new HexCoordinate(3,0,3));
        expansionHexCoordinates.add(new HexCoordinate(4,1,3));
        expansionHexCoordinates.add(new HexCoordinate(5,2,3));
        expansionHexCoordinates.add(new HexCoordinate(2,0,2));
        expansionHexCoordinates.add(new HexCoordinate(3,1,2));
        expansionHexCoordinates.add(new HexCoordinate(4,2,2));
        expansionHexCoordinates.add(new HexCoordinate(5,3,2));
        expansionHexCoordinates.add(new HexCoordinate(1,0,1));
        expansionHexCoordinates.add(new HexCoordinate(2,1,1));
        expansionHexCoordinates.add(new HexCoordinate(3,2,1));
        expansionHexCoordinates.add(new HexCoordinate(4,3,1));
        expansionHexCoordinates.add(new HexCoordinate(5,4,1));
        expansionHexCoordinates.add(new HexCoordinate(0,0,0));
        expansionHexCoordinates.add(new HexCoordinate(1,1,0));
        expansionHexCoordinates.add(new HexCoordinate(2,2,0));
        expansionHexCoordinates.add(new HexCoordinate(3,3,0));
        expansionHexCoordinates.add(new HexCoordinate(4,4,0));
        expansionHexCoordinates.add(new HexCoordinate(5,5,0));
        expansionHexCoordinates.add(new HexCoordinate(0,1,-1));
        expansionHexCoordinates.add(new HexCoordinate(1,2,-1));
        expansionHexCoordinates.add(new HexCoordinate(2,3,-1));
        expansionHexCoordinates.add(new HexCoordinate(3,4,-1));
        expansionHexCoordinates.add(new HexCoordinate(4,5,-1));
        expansionHexCoordinates.add(new HexCoordinate(0,2,-2));
        expansionHexCoordinates.add(new HexCoordinate(1,3,-2));
        expansionHexCoordinates.add(new HexCoordinate(2,4,-2));
        expansionHexCoordinates.add(new HexCoordinate(3,5,-2));
        expansionHexCoordinates.add(new HexCoordinate(0,3,-3));
        expansionHexCoordinates.add(new HexCoordinate(1,4,-3));
        expansionHexCoordinates.add(new HexCoordinate(2,5,-3));
    }

    private void fillHexMaps(){
        fillBaseHexMap();
        fillExpansionHexMap();
    }

    private void fillBaseHexMap(){
        for (HexCoordinate x:baseHexCoordinates) {
            if(x.equals(new HexCoordinate(0, 0,0))){
                baseHexes.put(x, Resources.BRICK);
            }
            else
                baseHexes.put(x, Resources.SHEEP);
        }
    }

    private void fillExpansionHexMap(){
        for (HexCoordinate x:expansionHexCoordinates) {
            if(x.equals(new HexCoordinate(0, 0,0))){
                expansionHexes.put(x, Resources.WOOD);
            }
            else
                expansionHexes.put(x, Resources.WHEAT);
        }
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

    public HashMap<HexCoordinate, Enum<Resources>> getBaseHexes() {
        return baseHexes;
    }

    public void setBaseHexes(HashMap<HexCoordinate, Enum<Resources>> baseHexes) {
        this.baseHexes = baseHexes;
    }

    public HashMap<HexCoordinate, Enum<Resources>> getExpansionHexes() {
        return expansionHexes;
    }

    public void setExpansionHexes(HashMap<HexCoordinate, Enum<Resources>> expansionHexes) {
        this.expansionHexes = expansionHexes;
    }

    public ArrayList<Enum<Resources>> getBaseResources() {
        if(baseResources.size() == 0){
            fillBaseResources();
        }
        return baseResources;
    }

    public ArrayList<Enum<Resources>> getExpansionResources() {
        if(expansionResources.size() == 0){
            fillExpansionResources();
        }
        return expansionResources;
    }
}
