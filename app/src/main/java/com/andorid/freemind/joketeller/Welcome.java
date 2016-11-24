package com.andorid.freemind.joketeller;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.andorid.freemind.jokes.JokeSmith;


public class Welcome extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView txtView = (TextView) (findViewById(R.id.manualjoke));
        JokeSmith jS = new JokeSmith();
        txtView.setText(jS.getJoke());


    }

}
