package tld.tgbv.chatorandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import tld.tgbv.chatorandroid.adapters.FriendlistViewAdapter;

public class FriendlistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_friendlist);


        // holds the users
        // still in prototype
        ArrayList<String> users = new ArrayList();

        for(short i=0; i<100; i++) {
            users.add("John");
            users.add("Doe");
        }


        // get the recycle view
        RecyclerView v = findViewById( R.id.friendlistRecycleView );

        // set the layout manager
        //v.setHasFixedSize(true);
        v.setLayoutManager( new LinearLayoutManager(this));

        // assign to the recycled view
        v.setAdapter( new FriendlistViewAdapter(this, users)  );

    }
}