package project.robot.naveen.wheelchaircontrol;

import android.content.Intent;
import android.graphics.Color;
import android.speech.RecognizerIntent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private FloatingActionButton mButton, mAccelero, mVoice;
    private ViewFlipper viewFlipper;
    private static final int RECOGNIZER_REQ_CODE = 1234;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initializing variables
        init();

        //On Clicking mButton
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Setting fragment button
                viewFlipper.setDisplayedChild(0);
            }
        });

        //On Clicking mAccelero button
        mAccelero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Setting fragment Accelerometer
                viewFlipper.setDisplayedChild(1);
            }
        });

        //On Clicking mVoice button
        mVoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                startActivityForResult(intent, RECOGNIZER_REQ_CODE);
            }
        });

    }

    private void init() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsible_toolbar);
        viewFlipper = (ViewFlipper) findViewById(R.id.vf);
        mButton = (FloatingActionButton) findViewById(R.id.fab_buttons);
        mAccelero = (FloatingActionButton) findViewById(R.id.fab_acm);
        mVoice = (FloatingActionButton) findViewById(R.id.fab_voice);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Wheelchair control");
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
        collapsingToolbarLayout.setTitle("");
    }
}
