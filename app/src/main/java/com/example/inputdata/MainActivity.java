package com.example.inputdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editTextMssv;
    EditText editTextName;
    EditText editTextCCCD;
    EditText editTextSdt;
    EditText editTextEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button_ok);
        editTextMssv = findViewById(R.id.edit_text_mssv);
        editTextName = findViewById(R.id.edit_text_name);
        editTextCCCD = findViewById(R.id.edit_text_cccd);
        editTextSdt = findViewById(R.id.edit_text_sdt);
        editTextEmail = findViewById(R.id.edit_text_email);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextCCCD.getText().toString().equals("") ||
                    editTextMssv.getText().toString().equals("") ||
                    editTextSdt.getText().toString().equals("") ||
                    editTextEmail.getText().toString().equals("")
                )   {
                    Toast.makeText(MainActivity.this, "Missing information", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Successfully submited data!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void onRadioButtonClick(View view) {

    }
}