package xyz.moechat.uixml;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timeloveboy on 16/2/7.
 */
public class ViewHolderIconListActivity extends Activity {
    List<IconText> IconList=new ArrayList<IconText>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iconlist);

        initIcon();
        ViewHolderIconTextAdapter adapter=new ViewHolderIconTextAdapter(ViewHolderIconListActivity.this,R.layout.icontext,IconList);
        final ListView listview=(ListView)findViewById(R.id.listview);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                IconText icontext=IconList.get(position);
                Toast.makeText(ViewHolderIconListActivity.this,icontext.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    void initIcon(){
        IconText i1=new IconText("张萌萌",R.drawable.s1);
        for(int i=0;i<10;i++) {
            IconList.add(i1);
        }
        IconText i2 = new IconText("大鹏", R.drawable.s2);
        for(int i=0;i<10;i++) {
            IconList.add(i2);
        }
        IconText i3=new IconText("who",R.drawable.s3);
        for(int i=0;i<10;i++) {
            IconList.add(i3);
        }
    }
}

