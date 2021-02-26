package tld.tgbv.chatorandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public Intent LoginActivity;
    public Intent RegisterActivity;
    private Intent FriendlistActivity;
    private Intent TorLoglistActivity;
    private Intent ChatlistActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // no night mode plz
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        // before anything we don't need the actionbar
        getSupportActionBar().hide();

        // set the intents
        LoginActivity = new Intent(this, LoginActivity.class);
        RegisterActivity = new Intent(this, RegisterActivity.class);
        FriendlistActivity = new Intent(this, FriendlistActivity.class);
        TorLoglistActivity = new Intent(this, TorLoglistActivity.class);
        ChatlistActivity = new Intent(this, ChatlistActivity.class);

        // sets the default content view
        setContentView(R.layout.activity_main);

        // btn listener
        findViewById(R.id.intentLoginBtn).setOnClickListener(this);
        findViewById(R.id.intentRegisterBtn).setOnClickListener(this);
        findViewById(R.id.tmpBtnFriendlist).setOnClickListener(this);
        findViewById(R.id.btnTorLoglist).setOnClickListener(this);
        findViewById(R.id.btnChatlist).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.intentLoginBtn:{
                startActivity(LoginActivity);
                break;
            }

            case R.id.intentRegisterBtn:{
                startActivity(RegisterActivity);
                break;
            }
            
            case R.id.tmpBtnFriendlist:{
                startActivity(FriendlistActivity);
                break;
            }

            case R.id.btnTorLoglist:{
                startActivity(TorLoglistActivity);
                break;
            }

            case R.id.btnChatlist:{
                startActivity(ChatlistActivity);
                break;
            }

        }
    }
}