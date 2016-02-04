package xyz.moechat.activitylifecircle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AActivity extends  Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("moe", "AActivity.onCreate");
        setContentView(R.layout.activity_main);

        Button b=(Button)findViewById(R.id.launchdialog);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AActivity.this,dialog.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.v("moe","AActivity.onSaveInstanceState");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("moe", "AActivity.onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("moe", "AActivity.onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("moe", "AActivity.onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v("moe","AActivity.onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("moe","AActivity.onStop");
    }

    @Override
    protected void onDestroy() {
        Log.v("moe","AActivity.onDestroy");
        super.onDestroy();
    }
}
