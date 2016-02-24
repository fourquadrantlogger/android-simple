package xyz.moechat.notification.view;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;

import xyz.moechat.notification.R;
/**
 * Created by timeloveboy on 16/2/24.
 */
public class Mynotification  {
    NotificationManager notificationManager;
    Notification notification;
    public Mynotification(Context context,String title,String content,PendingIntent pendingIntent) {
        notificationManager=(NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        notification = new Notification.Builder(context)
                .setContentTitle(title)
                .setContentText(content)
                .setSmallIcon(R.drawable.moechat)
                .setLargeIcon(BitmapFactory.decodeResource(context.getResources(),R.drawable.moechat))
                //设置跳转Intent
                .setContentIntent(pendingIntent)
                //设置震动
                .setVibrate(new long[]{0,1000,1000,1000})
                .build();

    }
    public void show(){
        notificationManager.notify(1,notification);
    }
}
