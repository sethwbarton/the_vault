package androidteam.cs340.the_vault.Activities;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import androidteam.cs340.the_vault.R;

public class DiceActivity extends AppCompatActivity {
    private final static int ROLL_DURATION = 1000;
    Button btnOneDie;
    Button btnTwoDice;
    ImageView imgDie1;
    ImageView imgDie2;
    TextView prompt;
    Random gen = new Random();
    SoundPool diceSound;
    int soundID;
    Handler handler;
    Timer timer = new Timer();
    boolean isRolling = false;
    int numDice = 0;
    RotateAnimation rotate;
    int playSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);
        InitSound();
        prompt = (TextView) findViewById(R.id.dicePrompt);
        imgDie1 = (ImageView) findViewById(R.id.imageDie1);
        imgDie1.setOnClickListener(new HandleClick());
        imgDie2 = (ImageView) findViewById(R.id.imageDie2);
        imgDie2.setOnClickListener(new HandleClick());

        btnOneDie = (Button) findViewById(R.id.oneDieButton);
        btnOneDie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numDice = 1;
                switchViews();
            }
        });
        btnTwoDice = (Button) findViewById(R.id.twoDiceButton);
        btnTwoDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numDice = 2;
                switchViews();
            }
        });

        rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(ROLL_DURATION);
        rotate.setInterpolator(new LinearInterpolator());
        handler = new Handler(callback);
    }

    private void switchViews(){
        btnOneDie.setVisibility(View.GONE);
        btnTwoDice.setVisibility(View.GONE);
        prompt.setVisibility(View.GONE);

        imgDie1.setVisibility(View.VISIBLE);
        if (numDice > 1) {
            imgDie2.setVisibility(View.VISIBLE);
        }
        else {
            RelativeLayout.LayoutParams testLP = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            testLP.addRule(RelativeLayout.CENTER_IN_PARENT);
            btnOneDie.setLayoutParams(testLP);
        }
    }

    private class HandleClick implements View.OnClickListener {
        public void onClick(View arg0) {
            if (!isRolling) {
                isRolling = true;
                imgDie1.setImageResource(R.drawable.die);
                imgDie1.startAnimation(rotate);
                imgDie2.setImageResource(R.drawable.die);
                imgDie2.startAnimation(rotate);
                timer.schedule(new Roll(), ROLL_DURATION);
            }
        }
    }

    void InitSound() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes aa = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            diceSound = new SoundPool.Builder().setAudioAttributes(aa).build();
        }
        soundID = diceSound.load(this, R.raw.shake_dice,1);
    }

    class Roll extends TimerTask {
        public void run() {
            handler.sendEmptyMessage(0);
        }
    }

    private void setDie(ImageView die, int num){
        rotate.cancel();
        switch(num) {
            case 1:
                die.setImageResource(R.drawable.one);
                break;
            case 2:
                die.setImageResource(R.drawable.two);
                break;
            case 3:
                die.setImageResource(R.drawable.three);
                break;
            case 4:
                die.setImageResource(R.drawable.four);
                break;
            case 5:
                die.setImageResource(R.drawable.five);
                break;
            case 6:
                die.setImageResource(R.drawable.six);
                break;
            default:
        }
    }

    Handler.Callback callback = new Handler.Callback() {
        public boolean handleMessage(Message msg) {
            playSound = diceSound.play(soundID, 1.0f, 1.0f, 0, 0, 1.0f);
            setDie(imgDie1, gen.nextInt(6)+1);
            setDie(imgDie2, gen.nextInt(6)+1);
            isRolling=false;
            return true;
        }
    };

    protected void onPause() {
        super.onPause();
        diceSound.pause(soundID);
    }
    protected void onDestroy() {
        super.onDestroy();
        timer.cancel();
    }
}
