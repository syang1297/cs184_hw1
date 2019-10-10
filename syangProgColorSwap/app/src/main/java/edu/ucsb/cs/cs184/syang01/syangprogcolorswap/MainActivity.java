package edu.ucsb.cs.cs184.syang01.syangprogcolorswap;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RelativeLayout.LayoutParams parameters = new RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
    );

    RelativeLayout.LayoutParams btnparameters = new RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT
    );

    RelativeLayout.LayoutParams layout_parameters = new RelativeLayout.LayoutParams(
            RelativeLayout.LayoutParams.MATCH_PARENT,
            RelativeLayout.LayoutParams.MATCH_PARENT
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parameters.addRule(RelativeLayout.CENTER_HORIZONTAL);
        layout_parameters.addRule(RelativeLayout.CENTER_VERTICAL);
        btnparameters.addRule(RelativeLayout.CENTER_HORIZONTAL);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        Button button = new Button(this);
        final TextView textView = new TextView(this);

        relativeLayout.setLayoutParams(layout_parameters);
        relativeLayout.setLayoutParams(btnparameters);
        relativeLayout.setLayoutParams(parameters);

        String init = "Tap to Change Color";
        String btnText = "TAP ME";
        textView.setText(init);
        textView.setLayoutParams(parameters);
        textView.setTextSize(36);
        button.setText(btnText);
        button.setLayoutParams(btnparameters);
        button.setTextSize(22);
        btnparameters.setMargins(0,200,0,0);


        relativeLayout.addView(textView);
        relativeLayout.addView(button);

        this.addContentView(relativeLayout, layout_parameters);

        int initID = 123;
        textView.setId(initID);
        final int id = textView.getId();

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Random rand = new Random();
                int r, g, b;
                r = rand.nextInt(255);
                g = rand.nextInt(255);
                b = rand.nextInt(255);

                TextView textview = findViewById(id);
                String color = "COLOR: ";
                textview.setText(color);
                textview.append(r +"r, " + g + "g, " + b + "b ");
                int newColor = Color.rgb(r, g, b);
                textview.setTextColor(newColor);
            }

        });

    }

}
