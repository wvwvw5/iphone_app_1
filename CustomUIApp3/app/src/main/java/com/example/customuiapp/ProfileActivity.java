package com.example.customuiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private EditText profileName;
    private EditText profileEmail;
    private Button saveProfileButton;
    private Button settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profileName = findViewById(R.id.profile_name);
        profileEmail = findViewById(R.id.profile_email);
        saveProfileButton = findViewById(R.id.save_profile_button);
        settingsButton = findViewById(R.id.settings_button);

        saveProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = profileName.getText().toString();
                String email = profileEmail.getText().toString();
                // Здесь можно сохранить данные профиля
                Toast.makeText(ProfileActivity.this, "Profile saved!", Toast.LENGTH_SHORT).show();
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}
