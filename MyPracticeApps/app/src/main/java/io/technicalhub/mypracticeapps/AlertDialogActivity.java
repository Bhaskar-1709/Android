package io.technicalhub.mypracticeapps;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogActivity extends AppCompatActivity {

    Button alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        alertDialog = findViewById(R.id.btnAlertDialog);
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialogBuilder.setTitle("Alert");
                alertDialogBuilder.setIcon(R.mipmap.ic_launcher);
                alertDialogBuilder.setCancelable(false);
                alertDialogBuilder.setMessage("Do you want to close this Dialog").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(),String.valueOf(which),Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
    }
}
