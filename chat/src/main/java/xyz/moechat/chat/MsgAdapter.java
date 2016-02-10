package xyz.moechat.chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by timeloveboy on 16/2/10.
 */
public class MsgAdapter extends ArrayAdapter<Msg> {
    int resourceId;

    public MsgAdapter(Context context, List<Msg> objects, int textviewresourceId) {
        super(context,textviewresourceId, objects);
        this.resourceId = textviewresourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder viewholder;
        Msg msg=getItem(position);
        if(convertView==null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewholder = new ViewHolder();
            viewholder.leftLayout = (LinearLayout) view.findViewById(R.id.left_layout);
            viewholder.rightLayout = (LinearLayout) view.findViewById(R.id.right_layout);
            viewholder.leftmsg = (TextView) view.findViewById(R.id.left_msg);
            viewholder.rightmsg = (TextView) view.findViewById(R.id.right_msg);
            view.setTag(viewholder);
        }
        else{
            view=convertView;
            viewholder =(ViewHolder)view.getTag();
        }
        if(msg.receive_not_send){
            viewholder.leftLayout.setVisibility(View.VISIBLE);
            viewholder.rightLayout.setVisibility(View.GONE);
            viewholder.leftmsg.setText(msg.getContent());
        }else
        {
            viewholder.leftLayout.setVisibility(View.GONE);
            viewholder.rightLayout.setVisibility(View.VISIBLE);
            viewholder.rightmsg.setText(msg.getContent());
        }
        return view;
    }
    class ViewHolder{
        LinearLayout leftLayout;
        LinearLayout rightLayout;
        TextView leftmsg;
        TextView rightmsg;
    }
}
