package io.technicalhub.mypracticeapps;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    String[] states = {"Andhra Pradesh","Tamilnadu","Kerala","Karnataka","Uttar Pradesh","Telangana"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,states);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setThreshold(1);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
