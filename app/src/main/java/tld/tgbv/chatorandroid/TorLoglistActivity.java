package tld.tgbv.chatorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TorLoglistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // before anything we don't need the actionbar
        getSupportActionBar().setTitle("TOR loglist");

        setContentView(R.layout.activity_tor_loglist);
    }
}