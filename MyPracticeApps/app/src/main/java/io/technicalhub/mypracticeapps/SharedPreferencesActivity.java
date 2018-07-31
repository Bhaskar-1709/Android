package io.technicalhub.mypracticeapps;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SharedPreferencesActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    Button sharedPreferencesBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);
        sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("EmailIdKey","bhaskarkumar1709@gmail.com");
        editor.putString("NameKey","Bhaskar Kumar");
        editor.putString("PhoneKey","8985672328");
        editor.apply();
        sharedPreferencesBtn = findViewById(R.id.sharedPreferencesBtn);
        sharedPreferencesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferences = getSharedPreferences("MyData",Context.MODE_PRIVATE);
                if(sharedPreferences.getString("EmailIdKey","default").equals("bhaskarkumar1709@gmail.com"))
                {
                    if(sharedPreferences.getString("NameKey","default").equals("Bhaskar Kumar"))
                    {
                        if(sharedPreferences.getString("PhoneKey","default").equals("8985672328"))
                        {
                            Toast.makeText(SharedPreferencesActivity.this, "Successfully Logged In", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(SharedPreferencesActivity.this, "Wrong Mobile Number", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(SharedPreferencesActivity.this, "Wrong User", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(SharedPreferencesActivity.this, "Wrong Email Id", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
