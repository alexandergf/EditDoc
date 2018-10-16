package com.example.alexandergf.editdoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditTextActivity extends AppCompatActivity {

    private EditText edit_box2;
    private Button btn_save2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);


        Intent intent = getIntent();
        String text = intent.getStringExtra("text");

        edit_box2 = findViewById(R.id.edit_box2);
        btn_save2 = findViewById(R.id.btn_save2);

        edit_box2.setText(text);

        btn_save2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("text2",edit_box2.getText().toString());
                setResult(RESULT_OK,data);
                finish();
            }
        });

    }
}
