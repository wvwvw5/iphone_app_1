package com.example.customuiapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    private Switch notificationsSwitch;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        notificationsSwitch = findViewById(R.id.notifications_switch);
        logoutButton = findViewById(R.id.logout_button);

        notificationsSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            // Показываем сообщение "хера ты жмешь сюда?" при нажатии на переключатель
            Toast.makeText(SettingsActivity.this, "хера ты жмешь сюда?", Toast.LENGTH_SHORT).show();
        });

        logoutButton.setOnClickListener(v -> {
            // Переход на главное окно (MainActivity) при выходе
            Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
            // Удаление всех предыдущих активностей из стека, чтобы предотвратить возврат назад
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish(); // Завершение текущей активности
        });
    }
}
