package io.technicalhub.mypracticeapps;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CustomAlertDialogActivity extends AppCompatActivity {

    Button customAlertDlgBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_alert_dialog);
        customAlertDlgBtn = findViewById(R.id.customAlertDlgBtn);
        customAlertDlgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDlgBuilder = new AlertDialog.Builder(CustomAlertDialogActivity.this);
                View view = getLayoutInflater().inflate(R.layout.custom_alert_dialog,null);
                TextView msg = view.findViewById(R.id.alertDlgTxtView);
                Button btn = view.findViewById(R.id.customAlertDlgBtn2);
                alertDlgBuilder.setView(view);
                alertDlgBuilder.setCancelable(false);
                final AlertDialog alertDialog = alertDlgBuilder.create();
                alertDialog.setIcon(R.mipmap.ic_launcher);
                alertDialog.setTitle("Alert");
                alertDialog.setMessage("This is Custom Alert Dialog");
                alertDialog.show();
                msg.setText("This is Custom Alert Dialog");
                btn.setText("Ok");
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
            }
        });
    }
}
