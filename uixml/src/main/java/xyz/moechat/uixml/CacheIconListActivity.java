package xyz.moechat.uixml;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timeloveboy on 16/2/7.
 */
public class CacheIconListActivity extends Activity {
    List<IconText> IconList=new ArrayList<IconText>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iconlist);

        initIcon();
        CacheIconTextAdapter adapter=new CacheIconTextAdapter(CacheIconListActivity.this,R.layout.icontext,IconList);
        ListView listview=(ListView)findViewById(R.id.listview);
        listview.setAdapter(adapter);
    }
    void initIcon(){
        IconText i1=new IconText("李",R.drawable.s1);
        for(int i=0;i<10;i++) {
            IconList.add(i1);
        }
        IconText i2 = new IconText("鹏", R.drawable.s2);
        for(int i=0;i<10;i++) {

            IconList.add(i2);
        }
        IconText i3=new IconText("李鹏",R.drawable.s3);
        for(int i=0;i<10;i++) {
            IconList.add(i3);
        }
    }
}

