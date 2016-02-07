package xyz.moechat.uixml;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by timeloveboy on 16/2/7.
 */
public class ListActivity extends Activity {
    private String[] data={
            "李鹏",
            "张玥"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ListActivity.this,android.R.layout.simple_list_item_1,data);

        ListView listview=(ListView)findViewById(R.id.list_view);
        listview.setAdapter(adapter);
    }
}
