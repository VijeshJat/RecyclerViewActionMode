package jat.vijesh.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import jat.vijesh.R;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.btnGmailList).setOnClickListener(this);
        findViewById(R.id.btnSwipeLeftList).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnGmailList:

                startActivity(new Intent(this, MainActivity.class));
                break;

            case R.id.btnSwipeLeftList:
                startActivity(new Intent(this, LeftSwipeListActivity.class));
                break;

        }
    }
}
