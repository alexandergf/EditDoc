package com.example.alexandergf.editdoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {

    private EditText edit_box;
    private Button btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        Intent intent = getIntent();
        String text = intent.getStringExtra("text");

        edit_box = findViewById(R.id.edit_box);
        btn_save = findViewById(R.id.btn_save);

        edit_box.setText(text);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("text",edit_box.getText().toString());
                setResult(RESULT_OK,data);
                finish();
            }
        });
    }
}
