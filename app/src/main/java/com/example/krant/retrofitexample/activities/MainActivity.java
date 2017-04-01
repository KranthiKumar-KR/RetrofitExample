package com.example.krant.retrofitexample.activities;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.krant.retrofitexample.R;

public class MainActivity extends AppCompatActivity {
EditText username;
    EditText password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);

        if(!username.getText().toString().isEmpty() && !password.getText().toString().isEmpty()) {
            registerUser(new RegisterRequest(username.getText().toString(), password.getText().toString()));
        } else
            Toast.makeText(this, "cannot send the request with invalid fields", Toast.LENGTH_LONG).show();
    }

    private void registerUser(RegisterRequest registerRequest) {
        final ProgressDialog waitingDialog = new ProgressDialog(this);
        waitingDialog.setTitle(getString(R.string.progress_dialog_title));
        waitingDialog.setMessage(getString(R.string.progress_dialog_message));
        waitingDialog.show();

        final AlertDialog waitingAlert = new AlertDialog.Builder(this).create();
        waitingAlert.setTitle(getString(R.string.alert_dialog_title));
        waitingAlert.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                if (waitingDialog.isShowing()) {
                    waitingDialog.dismiss();
                }
            }
        });

    }
    public class RegisterRequest {
        private String username;
        private String password;

        public RegisterRequest(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}
