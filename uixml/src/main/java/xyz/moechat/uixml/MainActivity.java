package xyz.moechat.uixml;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_titlelayout);

        Button btn_List=(Button)findViewById(R.id.btnlist);
        btn_List.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        Button btn_IconList=(Button)findViewById(R.id.btniconlist);
        btn_IconList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,IconListActivity.class);
                startActivity(intent);
            }
        });

        Button btn_cacheiconlist=(Button)findViewById(R.id.btncacheiconlist);
        btn_cacheiconlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CacheIconListActivity.class);
                startActivity(intent);
            }
        });

        Button btn_viewholdericonlist=(Button)findViewById(R.id.btnviewholdericonlist);
        btn_viewholdericonlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ViewHolderIconListActivity.class);
                startActivity(intent);
            }
        });
    }
}
