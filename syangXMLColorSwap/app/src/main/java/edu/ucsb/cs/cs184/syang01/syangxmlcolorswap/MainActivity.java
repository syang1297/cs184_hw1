package edu.ucsb.cs.cs184.syang01.syangxmlcolorswap;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void colorChange(View view){
        Random rand = new Random();
        int r, g, b;
        r = rand.nextInt(255);
        g = rand.nextInt(255);
        b = rand.nextInt(255);

        TextView textview = findViewById(R.id.textView);
        textview.setText("COLOR: " + r +"r, " + g + "g, " + b + "b ");
        int color = Color.rgb(r, g, b);
        textview.setTextColor(color);
    }
}
