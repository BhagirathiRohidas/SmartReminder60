package com.bhagi.smartreminder;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class RemindMeActivity extends AppCompatActivity {
    private ActionBar toolbar4;
    private EditText dateTextRemind;
    private EditText timeTextRemind;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remind_me);
        toolbar4 = getSupportActionBar();

        dateTextRemind = findViewById(R.id.date_picker_remind);
        timeTextRemind = findViewById(R.id.time_set_remind);

        dateTextRemind.setEnabled(false);
        timeTextRemind.setEnabled(false);

        Toolbar toolbar = findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_editor.xml file.
        getMenuInflater().inflate(R.menu.menu_editor, menu);
        return true;
    }

}