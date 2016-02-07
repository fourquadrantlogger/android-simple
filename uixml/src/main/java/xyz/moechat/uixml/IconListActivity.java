package xyz.moechat.uixml;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timeloveboy on 16/2/7.
 */
public class IconListActivity extends Activity {
    List<IconText> IconList=new ArrayList<IconText>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iconlist);

        initIcon();
        IconTextAdapter adapter=new IconTextAdapter(IconListActivity.this,R.layout.icontext,IconList);
        ListView listview=(ListView)findViewById(R.id.listview);
        listview.setAdapter(adapter);
    }
    void initIcon(){
        IconText i1=new IconText("李",R.drawable.s1);
        IconList.add(i1);
        IconText i2=new IconText("鹏",R.drawable.s2);
        IconList.add(i2);
        IconText i3=new IconText("李鹏",R.drawable.s3);
        IconList.add(i3);

    }
}

