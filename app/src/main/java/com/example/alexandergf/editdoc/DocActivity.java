package com.example.alexandergf.editdoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DocActivity extends AppCompatActivity {

    public static final int EDIT_TITLE=1;

    //model
    private String title="Lorem Ipsum", text="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed eleifend id odio vitae iaculis. Pellentesque interdum quis risus ac bibendum. In ut dignissim nisi. Suspendisse euismod elit enim, at eleifend nisi dictum ut. Sed eu vestibulum diam, et venenatis velit. Curabitur rutrum ut nisi sed commodo. Curabitur condimentum blandit ligula, a ultrices felis feugiat ut. ";
    private TextView docview;
    private TextView titleview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc);

        titleview = findViewById(R.id.titleview);
        docview = findViewById(R.id.docview);

        titleview.setText(title);
        docview.setText(text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_doc,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option_edit_title:
                Intent intent = new Intent(this,EditActivity.class);
                intent.putExtra("text",title);
                //intent.putExtra("",);
                startActivityForResult(intent,EDIT_TITLE);
                break;
        }
        return true;
    }
}
