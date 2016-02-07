package xyz.moechat.uixml;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by timeloveboy on 16/2/7.
 */
public class IconTextAdapter extends ArrayAdapter<IconText> {
    int resourceId;
    public IconTextAdapter(Context context, int resourceId, List<IconText> objects) {
        super(context, resourceId, objects);
        this.resourceId = resourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        IconText icontext=getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);

        ImageView Iconimg=(ImageView)view.findViewById(R.id.Iconimg);
        TextView Iconcontent=(TextView)view.findViewById(R.id.Iconcontent);

        Iconimg.setImageResource(icontext.getImageId());
        Iconimg.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Iconcontent.setText(icontext.getName());
        return view;
    }
}
