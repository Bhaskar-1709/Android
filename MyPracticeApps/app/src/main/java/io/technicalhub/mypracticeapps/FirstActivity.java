package io.technicalhub.mypracticeapps;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void alertDialog(View view) {
        AlertDialog.Builder alertDlgBuilder = new AlertDialog.Builder(this);
        alertDlgBuilder.setCancelable(false);
        alertDlgBuilder.setTitle("Alert");
        alertDlgBuilder.setMessage("Are you sure, you want to make decision");
        alertDlgBuilder.setIcon(R.drawable.ic_launcher_background);
        alertDlgBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(FirstActivity.this,"You clicked Yes button",Toast.LENGTH_LONG).show();
            }
        });
        alertDlgBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = alertDlgBuilder.create();
        alertDialog.show();
    }
}
