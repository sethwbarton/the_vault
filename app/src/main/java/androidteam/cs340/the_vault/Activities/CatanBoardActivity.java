package androidteam.cs340.the_vault.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidteam.cs340.the_vault.R;

public class CatanBoardActivity extends AppCompatActivity {

    private int unselectedColor = -855310;
    private int selectedColor = -14130376;

    Button expansionButton;
    LinearLayout baseBoardLayout;
    LinearLayout expansionBoardLayout;

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
    }
}
