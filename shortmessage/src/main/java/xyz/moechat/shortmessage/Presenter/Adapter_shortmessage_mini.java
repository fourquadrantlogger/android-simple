package xyz.moechat.shortmessage.Presenter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import xyz.moechat.shortmessage.Model.Message;
import xyz.moechat.shortmessage.R;

/**
 * Created by timeloveboy on 16/2/25.
 */
public class Adapter_shortmessage_mini extends ArrayAdapter<Message> {
    int resource;
    public Adapter_shortmessage_mini(Context context, int resource, List<Message> objects) {
        super(context, resource, objects);
        this.resource=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Message message=getItem(position);
        View view=LayoutInflater.from(getContext()).inflate(resource,null);

        TextView textView_contacter=(TextView)view.findViewById(R.id.textView_contacter);
        textView_contacter.setText(message.getAddress());
        TextView textView_shortmessage_mini=(TextView)view.findViewById(R.id.textView_shortmessage_mini);
        textView_shortmessage_mini.setText(message.getBody());
        TextView textView_time=(TextView)view.findViewById(R.id.textView_time);
        textView_time.setText(message.getDate().toString());

        return view;
    }
}
