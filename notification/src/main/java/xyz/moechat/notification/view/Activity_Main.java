package xyz.moechat.notification.view;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import xyz.moechat.notification.R;

public class Activity_Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    void initViews(){
        Button button_nofify=(Button)findViewById(R.id.button_nofify);
        button_nofify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(Activity_Main.this,Activity_receivenotify.class);
                PendingIntent pendingIntent=PendingIntent.getActivity(Activity_Main.this,0,intent,PendingIntent.FLAG_CANCEL_CURRENT);

                Mynotification mynotification=new Mynotification(Activity_Main.this,"moechat","霜枫醉月 请求添加好友",pendingIntent);
                mynotification.show();
            }
        });
    }

}
