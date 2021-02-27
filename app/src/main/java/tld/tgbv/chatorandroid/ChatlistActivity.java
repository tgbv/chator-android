package tld.tgbv.chatorandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

import tld.tgbv.chatorandroid.adapters.ChatlistViewAdapter;
import tld.tgbv.chatorandroid.adapters.FriendlistViewAdapter;
import tld.tgbv.chatorandroid.models.Lobbies;
import tld.tgbv.chatorandroid.models.Lobby;

public class ChatlistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // before anything we don't need the actionbar
        getSupportActionBar().hide();

        //
        setContentView(R.layout.activity_chatlist);


        // create new lobby and populate it with garbage data
        Lobbies test = new Lobbies( );

        for(short i=0; i<50; i++){
            HashMap<String, Object> lobby = new HashMap();
            lobby.put("nick", "meme "+i);
            test.push(lobby);
        }

        // get the recycle view
        RecyclerView v = findViewById( R.id.chatlistRecyclerView );

        // set the layout manager
        //v.setHasFixedSize(true);
        v.setLayoutManager( new LinearLayoutManager(this));

        // assign to the recycled view
        v.setAdapter( new ChatlistViewAdapter(this, test)  );

    }
}