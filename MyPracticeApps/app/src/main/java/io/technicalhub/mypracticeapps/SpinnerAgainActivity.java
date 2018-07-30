package io.technicalhub.mypracticeapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerAgainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner, spinner1;
    String[] progLangs = {"C","C++","C#","Java","Python","Kotlin","Swift"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_again);
        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(this,R.array.planets,android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner = findViewById(R.id.spinnerAgain);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(this);
        spinner1 = findViewById(R.id.spinnerAgain2);
        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,progLangs);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner1.setAdapter(arrayAdapter1);
        spinner1.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, ""+parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
        Toast.makeText(this,progLangs[position],Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(this,"Please select item from the list",Toast.LENGTH_LONG).show();
    }
}
