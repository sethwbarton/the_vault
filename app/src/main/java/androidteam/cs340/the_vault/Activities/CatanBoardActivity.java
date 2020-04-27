package androidteam.cs340.the_vault.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.HashMap;

import androidteam.cs340.the_vault.Model.HexCoordinate;
import androidteam.cs340.the_vault.Model.Resources;
import androidteam.cs340.the_vault.Presentors.CatanBoardPresentor;
import androidteam.cs340.the_vault.R;

public class CatanBoardActivity extends AppCompatActivity {

    private int unselectedColor = -855310;
    private int selectedColor = -14130376;

    private Button expansionButton;
    private Button reshuffleButton;
    private LinearLayout baseBoardLayout;
    private LinearLayout expansionBoardLayout;


    private CatanBoardPresentor presentor = new CatanBoardPresentor(this);

    private ImageView bHex1;
    private ImageView bHex2;
    private ImageView bHex3;
    private ImageView bHex4;
    private ImageView bHex5;
    private ImageView bHex6;
    private ImageView bHex7;
    private ImageView bHex8;
    private ImageView bHex9;
    private ImageView bHex10;
    private ImageView bHex11;
    private ImageView bHex12;
    private ImageView bHex13;
    private ImageView bHex14;
    private ImageView bHex15;
    private ImageView bHex16;
    private ImageView bHex17;
    private ImageView bHex18;
    private ImageView bHex19;
    private ImageView eHex1;
    private ImageView eHex2;
    private ImageView eHex3;
    private ImageView eHex4;
    private ImageView eHex5;
    private ImageView eHex6;
    private ImageView eHex7;
    private ImageView eHex8;
    private ImageView eHex9;
    private ImageView eHex10;
    private ImageView eHex11;
    private ImageView eHex12;
    private ImageView eHex13;
    private ImageView eHex14;
    private ImageView eHex15;
    private ImageView eHex16;
    private ImageView eHex17;
    private ImageView eHex18;
    private ImageView eHex19;
    private ImageView eHex20;
    private ImageView eHex21;
    private ImageView eHex22;
    private ImageView eHex23;
    private ImageView eHex24;
    private ImageView eHex25;
    private ImageView eHex26;
    private ImageView eHex27;
    private ImageView eHex28;
    private ImageView eHex29;
    private ImageView eHex30;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catan_board);

        baseBoardLayout = findViewById(R.id.baseBoard);
        expansionBoardLayout = findViewById(R.id.expansionBoard);

        expansionButton = findViewById(R.id.expansionButton);
        expansionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (expansionButton.getCurrentTextColor() == unselectedColor) {
                    expansionButton.setTextColor(getResources().getColor(R.color.expansionButtonSelectedColor));
                    baseBoardLayout.setVisibility(View.GONE);
                    expansionBoardLayout.setVisibility(View.VISIBLE);
                }
                else {
                    expansionBoardLayout.setVisibility(View.GONE);
                    baseBoardLayout.setVisibility(View.VISIBLE);
                    expansionButton.setTextColor(getResources().getColor(R.color.expansionButtonTextColor));
                }
            }
        });

        reshuffleButton = findViewById(R.id.reshuffleButton);
        reshuffleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presentor.createBoards();
            }
        });

        bHex1 = findViewById(R.id.bhexagon1);
        bHex2 = findViewById(R.id.bhexagon2);
        bHex3 = findViewById(R.id.bhexagon3);
        bHex4 = findViewById(R.id.bhexagon4);
        bHex5 = findViewById(R.id.bhexagon5);
        bHex6 = findViewById(R.id.bhexagon6);
        bHex7 = findViewById(R.id.bhexagon7);
        bHex8 = findViewById(R.id.bhexagon8);
        bHex9 = findViewById(R.id.bhexagon9);
        bHex10 = findViewById(R.id.bhexagon10);
        bHex11 = findViewById(R.id.bhexagon11);
        bHex12 = findViewById(R.id.bhexagon12);
        bHex13 = findViewById(R.id.bhexagon13);
        bHex14 = findViewById(R.id.bhexagon14);
        bHex15 = findViewById(R.id.bhexagon15);
        bHex16 = findViewById(R.id.bhexagon16);
        bHex17 = findViewById(R.id.bhexagon17);
        bHex18 = findViewById(R.id.bhexagon18);
        bHex19 = findViewById(R.id.bhexagon19);

        eHex1 = findViewById(R.id.ehexagon1);
        eHex2 = findViewById(R.id.ehexagon2);
        eHex3 = findViewById(R.id.ehexagon3);
        eHex4 = findViewById(R.id.ehexagon4);
        eHex5 = findViewById(R.id.ehexagon5);
        eHex6 = findViewById(R.id.ehexagon6);
        eHex7 = findViewById(R.id.ehexagon7);
        eHex8 = findViewById(R.id.ehexagon8);
        eHex9 = findViewById(R.id.ehexagon9);
        eHex10 = findViewById(R.id.ehexagon10);
        eHex11 = findViewById(R.id.ehexagon11);
        eHex12 = findViewById(R.id.ehexagon12);
        eHex13 = findViewById(R.id.ehexagon13);
        eHex14 = findViewById(R.id.ehexagon14);
        eHex15 = findViewById(R.id.ehexagon15);
        eHex16 = findViewById(R.id.ehexagon16);
        eHex17 = findViewById(R.id.ehexagon17);
        eHex18 = findViewById(R.id.ehexagon18);
        eHex19 = findViewById(R.id.ehexagon19);
        eHex20 = findViewById(R.id.ehexagon20);
        eHex21 = findViewById(R.id.ehexagon21);
        eHex22 = findViewById(R.id.ehexagon22);
        eHex23 = findViewById(R.id.ehexagon23);
        eHex24 = findViewById(R.id.ehexagon24);
        eHex25 = findViewById(R.id.ehexagon25);
        eHex26 = findViewById(R.id.ehexagon26);
        eHex27 = findViewById(R.id.ehexagon27);
        eHex28 = findViewById(R.id.ehexagon28);
        eHex29 = findViewById(R.id.ehexagon29);
        eHex30 = findViewById(R.id.ehexagon30);


        presentor.createBoards();

    }

    public void loadBoards(){
        loadBaseBoard();
        loadExpansionBoard();
    }

    private void loadBaseBoard(){
        HashMap<HexCoordinate, Enum<Resources>> baseHexes = presentor.getBaseHexes();
        Enum<Resources> resource;

        resource = findResource(new HexCoordinate(2,0,2), baseHexes);
        drawHex(bHex1, resource);
        resource = findResource(new HexCoordinate(3,1,2), baseHexes);
        drawHex(bHex2, resource);
        resource = findResource(new HexCoordinate(4,2,2), baseHexes);
        drawHex(bHex3, resource);
        resource = findResource(new HexCoordinate(1,0,1), baseHexes);
        drawHex(bHex4, resource);
        resource = findResource(new HexCoordinate(2,1,1), baseHexes);
        drawHex(bHex5, resource);
        resource = findResource(new HexCoordinate(3,2,1), baseHexes);
        drawHex(bHex6, resource);
        resource = findResource(new HexCoordinate(4,3,1), baseHexes);
        drawHex(bHex7, resource);
        resource = findResource(new HexCoordinate(0,0,0), baseHexes);
        drawHex(bHex8, resource);
        resource = findResource(new HexCoordinate(1,1,0), baseHexes);
        drawHex(bHex9, resource);
        resource = findResource(new HexCoordinate(2,2,0), baseHexes);
        drawHex(bHex10, resource);
        resource = findResource(new HexCoordinate(3,3,0), baseHexes);
        drawHex(bHex11, resource);
        resource = findResource(new HexCoordinate(4,4,0), baseHexes);
        drawHex(bHex12, resource);
        resource = findResource(new HexCoordinate(0,1,-1), baseHexes);
        drawHex(bHex13, resource);
        resource = findResource(new HexCoordinate(1,2,-1), baseHexes);
        drawHex(bHex14, resource);
        resource = findResource(new HexCoordinate(2,3,-1), baseHexes);
        drawHex(bHex15, resource);
        resource = findResource(new HexCoordinate(3,4,-1), baseHexes);
        drawHex(bHex16, resource);
        resource = findResource(new HexCoordinate(0,2,-2), baseHexes);
        drawHex(bHex17, resource);
        resource = findResource(new HexCoordinate(1,3,-2), baseHexes);
        drawHex(bHex18, resource);
        resource = findResource(new HexCoordinate(2,4,-2), baseHexes);
        drawHex(bHex19, resource);

    }

    private void loadExpansionBoard(){
        HashMap<HexCoordinate, Enum<Resources>> expansionHexes = presentor.getExpansionHexes();
        Enum<Resources> resource;

        resource = findResource(new HexCoordinate(3,0,3), expansionHexes);
        drawHex(eHex1, resource);
        resource = findResource(new HexCoordinate(4,1,3), expansionHexes);
        drawHex(eHex2, resource);
        resource = findResource(new HexCoordinate(5,2,3), expansionHexes);
        drawHex(eHex3, resource);
        resource = findResource(new HexCoordinate(2,0,2), expansionHexes);
        drawHex(eHex4, resource);
        resource = findResource(new HexCoordinate(3,1,2), expansionHexes);
        drawHex(eHex5, resource);
        resource = findResource(new HexCoordinate(4,2,2), expansionHexes);
        drawHex(eHex6, resource);
        resource = findResource(new HexCoordinate(5,3,2), expansionHexes);
        drawHex(eHex7, resource);
        resource = findResource(new HexCoordinate(1,0,1), expansionHexes);
        drawHex(eHex8, resource);
        resource = findResource(new HexCoordinate(2,1,1), expansionHexes);
        drawHex(eHex9, resource);
        resource = findResource(new HexCoordinate(3,2,1), expansionHexes);
        drawHex(eHex10, resource);
        resource = findResource(new HexCoordinate(4,3,1), expansionHexes);
        drawHex(eHex11, resource);
        resource = findResource(new HexCoordinate(5,4,1), expansionHexes);
        drawHex(eHex12, resource);
        resource = findResource(new HexCoordinate(0,0,0), expansionHexes);
        drawHex(eHex13, resource);
        resource = findResource(new HexCoordinate(1,1,0), expansionHexes);
        drawHex(eHex14, resource);
        resource = findResource(new HexCoordinate(2,2,0), expansionHexes);
        drawHex(eHex15, resource);
        resource = findResource(new HexCoordinate(3,3,0), expansionHexes);
        drawHex(eHex16, resource);
        resource = findResource(new HexCoordinate(4,4,0), expansionHexes);
        drawHex(eHex17, resource);
        resource = findResource(new HexCoordinate(5,5,0), expansionHexes);
        drawHex(eHex18, resource);
        resource = findResource(new HexCoordinate(0,1,-1), expansionHexes);
        drawHex(eHex19, resource);
        resource = findResource(new HexCoordinate(1,2,-1), expansionHexes);
        drawHex(eHex20, resource);
        resource = findResource(new HexCoordinate(2,3,-1), expansionHexes);
        drawHex(eHex21, resource);
        resource = findResource(new HexCoordinate(3,4,-1), expansionHexes);
        drawHex(eHex22, resource);
        resource = findResource(new HexCoordinate(4,5,-1), expansionHexes);
        drawHex(eHex23, resource);
        resource = findResource(new HexCoordinate(0,2,-2), expansionHexes);
        drawHex(eHex24, resource);
        resource = findResource(new HexCoordinate(1,3,-2), expansionHexes);
        drawHex(eHex25, resource);
        resource = findResource(new HexCoordinate(2,4,-2), expansionHexes);
        drawHex(eHex26, resource);
        resource = findResource(new HexCoordinate(3,5,-2), expansionHexes);
        drawHex(eHex27, resource);
        resource = findResource(new HexCoordinate(0,3,-3), expansionHexes);
        drawHex(eHex28, resource);
        resource = findResource(new HexCoordinate(1,4,-3), expansionHexes);
        drawHex(eHex29, resource);
        resource = findResource(new HexCoordinate(2,5,-3), expansionHexes);
        drawHex(eHex30, resource);
    }

    private Enum<Resources> findResource(HexCoordinate hex, HashMap<HexCoordinate, Enum<Resources>> hexes){
        for(HexCoordinate x : hexes.keySet()){
            if(x.equals(hex)){
                return hexes.get(x);
            }
        }
        return null;
    }

    private void drawHex(ImageView hex, Enum<Resources> resource){
        if (resource == Resources.DESERT)
            hex.setImageResource(R.drawable.desert_hexagon);
        else if (resource == Resources.BRICK)
            hex.setImageResource(R.drawable.brick_hexagon);
        else if (resource == Resources.WOOD)
            hex.setImageResource(R.drawable.wood_hexagon);
        else if (resource == Resources.SHEEP)
            hex.setImageResource(R.drawable.sheep_hexagon);
        else if (resource == Resources.WHEAT)
            hex.setImageResource(R.drawable.wheat_hexagon);
        else if (resource == Resources.ORE)
            hex.setImageResource(R.drawable.ore_hexagon);
        else
            hex.setImageResource(R.drawable.desert_hexagon);
    }


}
