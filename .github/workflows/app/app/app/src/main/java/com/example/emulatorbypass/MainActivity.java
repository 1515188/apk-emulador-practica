package com.example.emulatorbypass;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variable simulada para detección de emulador
    // 1 = Emulador, 0 = Móvil
    public static int isEmulator = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logo = findViewById(R.id.logoImage);
        TextView status = findViewById(R.id.statusText);

        if (isEmulator == 1) {
            logo.setImageResource(R.drawable.emulator_logo);
            status.setText("Modo emulador detectado");
        } else {
            logo.setImageResource(R.drawable.mobile_logo);
            status.setText("Modo móvil detectado");
        }
    }
}
