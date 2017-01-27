package com.mckee.david.gta_radio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayerScreen extends AppCompatActivity {

    private Radio radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_screen);
        buttonsConfig();
        radio = new Radio(getApplicationContext());
    }

    private void populateListView()
    {

    }

    private void buttonsConfig()
    {
        btnPlayConfig();
    }

    private void btnPlayConfig()
    {
        Button btnPlay = (Button)findViewById(R.id.btnPlay);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
