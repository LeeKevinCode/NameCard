package krlighting.com.namecard;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    TextView createNew;
    TextView ListAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        createNew = (TextView)findViewById(R.id.main_create_new);
        ListAll = (TextView)findViewById(R.id.main_list_all);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/GreatVibes-Regular.otf");

        createNew.setTypeface(typeface);
        ListAll.setTypeface(typeface);
    }

    public void listTemplate(View v) {
        Intent ListInent = new Intent(this, Template.class);
        startActivity(ListInent);
    }
}
