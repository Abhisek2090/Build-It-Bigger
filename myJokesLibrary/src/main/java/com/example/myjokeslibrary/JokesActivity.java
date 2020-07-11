package com.example.myjokeslibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.jokes);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        TextView jokeTV = (TextView) findViewById(R.id.jokeTV);

        Intent intent = getIntent();
        if (intent.hasExtra(JOKE_EXTRA)){
            String jokeToDisplay = intent.getStringExtra(JOKE_EXTRA);
            jokeTV.setText(jokeToDisplay);
        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }

}