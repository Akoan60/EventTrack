package fr.anako.eventtrack.controller;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import fr.anako.eventtrack.model.User;
import fr.epsi.eventtrack.R;

/**
 * Activité de la page d'identification de l'utilisateur dans l'application
 * @author Anako
 */

public class IdentificationActivity extends AppCompatActivity {

    private TextView mWelcomeText;
    private EditText mNameInput;
    private Button mExploreButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification);

        mWelcomeText = (TextView) findViewById(R.id.activity_main_welcome_txt);
        mNameInput = (EditText) findViewById(R.id.activity_main_name_input);
        mExploreButton = (Button) findViewById(R.id.activity_main_explore_btn);
        User mUser = new User();
        mUser.setFirstName(mNameInput.getText().toString());

        mExploreButton.setEnabled(false);

        mNameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mExploreButton.setEnabled(s.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mExploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivityIntent = new Intent(IdentificationActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });
    }
}
