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
public class ViewHolderIconTextAdapter extends ArrayAdapter<IconText> {

    int resourceId;
    public ViewHolderIconTextAdapter(Context context, int resourceId, List<IconText> objects) {
        super(context, resourceId, objects);
        this.resourceId = resourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        IconText icontext=getItem(position);
        //快速滚动ListView提高效率
        View view;
        ViewHolder viewholder;
        if(convertView==null){
            view=LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewholder=new ViewHolder();
            viewholder.img =(ImageView)view.findViewById(R.id.Iconimg);
            viewholder.name=(TextView)view.findViewById(R.id.Iconcontent);

            view.setTag(viewholder);
        } else
        {
            view=convertView;
            viewholder=(ViewHolder)view.getTag();
        }


        viewholder.img.setImageResource(icontext.getImageId());
        viewholder.img.setScaleType(ImageView.ScaleType.CENTER_CROP);
        viewholder.name.setText(icontext.getName());
        return view;
    }
    class ViewHolder{
        ImageView img;
        TextView name;
    }

}
