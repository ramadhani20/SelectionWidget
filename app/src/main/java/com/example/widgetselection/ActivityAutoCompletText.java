package com.example.widgetselection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class ActivityAutoCompletText extends AppCompatActivity {
    private static final String[] KAMAR = new String[]{
            "Bantal", "Guling", "Kasur", "Meja", "Kursi", "Lemari"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complet_text);

        AutoCompleteTextView editText = findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, KAMAR);
        editText.setAdapter(adapter);
    }
}