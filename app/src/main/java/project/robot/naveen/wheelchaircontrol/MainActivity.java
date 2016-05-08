package project.robot.naveen.wheelchaircontrol;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsible_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Wheelchair control");
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
        collapsingToolbarLayout.setTitle("");
    }
}
