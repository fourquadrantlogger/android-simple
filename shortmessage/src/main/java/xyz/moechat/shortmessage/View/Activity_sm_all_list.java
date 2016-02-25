package xyz.moechat.shortmessage.View;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import xyz.moechat.shortmessage.Common.SmsHelper;
import xyz.moechat.shortmessage.Model.Message;
import xyz.moechat.shortmessage.Presenter.Adapter_shortmessage_mini;
import xyz.moechat.shortmessage.R;

public class Activity_sm_all_list extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sm_all_list);

        initViews();
    }
    List<Message> messageList;
    private void initViews() {
        messageList= new  SmsHelper(this,SmsHelper.SMS_URI_ALL,null,null).getMessageList();

        ListView listView_sm_all=(ListView)findViewById(R.id.listView_sm_all);
        Adapter_shortmessage_mini adapter_shortmessage_mini=new Adapter_shortmessage_mini(this,R.layout.view_shortmessage_mini,messageList);
        listView_sm_all.setAdapter(adapter_shortmessage_mini);
    }

}
