package tld.tgbv.chatorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public Intent LoginActivity;
    public Intent RegisterActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // before anything we don't need the actionbar
        getSupportActionBar().hide();

        // set the intents
        LoginActivity = new Intent(this, LoginActivity.class);
        RegisterActivity = new Intent(this, RegisterActivity.class);

        // sets the default content view
        setContentView(R.layout.activity_main);

        // btn listener
        findViewById(R.id.intentLoginBtn).setOnClickListener(this);
        findViewById(R.id.intentRegisterBtn).setOnClickListener(this);
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

        }
    }
}