package sateesh.com.completeui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class DoneBar extends AppCompatActivity implements View.OnClickListener {

    LinearLayout cancel, done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done_bar);

        cancel = (LinearLayout) findViewById(R.id.action_cancel);
        cancel.setOnClickListener(this);

        done = (LinearLayout) findViewById(R.id.action_done);
        done.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.action_cancel:
                super.onBackPressed();
                Log.v("Sateesh", "Cancel Tracked");
                break;
            case R.id.action_done:
                Log.v("Sateesh", "Done Tracked");
                break;
        }

    }
}
