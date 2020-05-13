package ru.geekbrains.materialdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class ToolbarActivity extends AppCompatActivity {

    private ProgressBar progressBarRound;
    private ProgressBar progressBarLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);

        progressBarRound = findViewById(R.id.progress_round_activity_progress);
        progressBarLine = findViewById(R.id.progress_line_activity_progress);
    }

    public void show(View view) {
        progressBarLine.setVisibility(View.VISIBLE);
        progressBarRound.setVisibility(View.VISIBLE);
    }

    public void hide(View view) {
        progressBarLine.setVisibility(View.INVISIBLE);
        progressBarRound.setVisibility(View.INVISIBLE);
    }
}
