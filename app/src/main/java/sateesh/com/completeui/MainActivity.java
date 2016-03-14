package sateesh.com.completeui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button tab, done, tab_float;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab = (Button) findViewById(R.id.tabbed_view);
        tab.setOnClickListener(this);

        done = (Button) findViewById(R.id.done_bar);
        done.setOnClickListener(this);
        
        tab_float = (Button) findViewById(R.id.Tab_with_float);
        tab_float.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.tabbed_view:
                Intent tab_open = new Intent(MainActivity.this, TabbedView.class);
                startActivity(tab_open);
                Log.v("Sateesh", "tabbed_view click");
                break;
            case R.id.done_bar:
                Intent done_open = new Intent(MainActivity.this, DoneBar.class);
                startActivity(done_open);
                Log.v("Sateesh", "done bar click");
                break;
            case R.id.Tab_with_float:
                Intent tab_with_float_open = new Intent(MainActivity.this, TabbedWithFloating.class);
                startActivity(tab_with_float_open);
                Log.v("Sateesh", "done bar click");
                break;

        }
    }
}
