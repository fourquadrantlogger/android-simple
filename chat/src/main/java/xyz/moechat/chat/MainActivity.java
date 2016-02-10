package xyz.moechat.chat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends  Activity {

    ListView msglistview;
    EditText inputtext;
    Button send;
    MsgAdapter adapter;
    List<Msg> msgList=new ArrayList<Msg>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initMsgList();
        adapter=new MsgAdapter(MainActivity.this,msgList,R.layout.msg_item);
        inputtext=(EditText)findViewById(R.id.input);
        send=(Button)findViewById(R.id.send);
        msglistview=(ListView)findViewById(R.id.msglist);

        msglistview.setAdapter(adapter);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content=inputtext.getText().toString();
                if(content!="")
                {
                    Msg msg=new Msg(content,false);
                    msgList.add(msg);
                    adapter.notifyDataSetChanged();//当有新数据时，刷新ListView
                    msglistview.setSelection(msgList.size());//定位到最后一条
                    inputtext.setText("");
                }

            }
        });
    }
    void initMsgList(){
        Msg m1=new Msg("你瞅啥",true);
        msgList.add(m1);
        Msg m2=new Msg("我是李鹏，瞅你咋滴？",false);
        msgList.add(m2);
        Msg m3=new Msg("突突突。。。",true);
        msgList.add(m3);
        Msg m4=new Msg("biu biu biu",false);
        msgList.add(m4);
    }
}
