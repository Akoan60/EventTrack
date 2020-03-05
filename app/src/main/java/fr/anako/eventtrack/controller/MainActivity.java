package fr.anako.eventtrack.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import fr.epsi.eventtrack.R;

/**
 * Activité de la page d'accueil ou est récupérer la liste des évènements
 * @author Anako
 */

public class MainActivity extends AppCompatActivity {
    private TextView mRightNow;
    private Button mEvent1;
    private Button mEvent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRightNow = (TextView) findViewById(R.id.activity_main_rightnow_txt);
        mEvent1 = (Button) findViewById(R.id.activity_main_event1_btn);
        mEvent2 = (Button) findViewById(R.id.activity_main_event2_btn);

    }
}
