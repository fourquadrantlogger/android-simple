package xyz.moechat.moephone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import xyz.moechat.moephone.model.Contact;

/**
 * Created by timeloveboy on 16/2/24.
 */
public class Adapter_contacts extends ArrayAdapter<Contact> {
    int resource;
    public Adapter_contacts(Context context, int resource, List<Contact> objects) {
        super(context, resource, objects);
        this.resource=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Contact contact=getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resource, null);
        TextView textView_contactname=(TextView)view.findViewById(R.id.textView_contactname);
        textView_contactname.setText(contact.getContactname());
        return view;
    }
}
