package xyz.moechat.shortmessage.Common;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import xyz.moechat.shortmessage.Model.Message;

/**
 * Created by timeloveboy on 16/2/25.
 */
public class SmsHelper {
    public final static String SMS_URI_ALL = "content://sms/";
    public final static  String SMS_URI_INBOX = "content://sms/inbox";
    public final static  String SMS_URI_SEND = "content://sms/sent";
    public final static  String SMS_URI_DRAFT = "content://sms/draft";
    public final static  String SMS_URI_OUTBOX = "content://sms/outbox";
    public final static  String SMS_URI_FAILED = "content://sms/failed";
    public final static  String SMS_URI_QUEUED = "content://sms/queued";



    public List<Message> getMessageList() {
        return messageList;
    }

    List<Message> messageList;
    public SmsHelper(Context context,String SMS_URI,String selection,String[] selectionArgs) {
        messageList=new ArrayList<Message>();
        try {
            Uri uri = Uri.parse(SMS_URI);
            String[] projection = new String[] { "_id", "address", "person", "body", "date", "type" };
            Cursor cur =context.getContentResolver().query(uri, projection,selection, selectionArgs, "date desc");      // 获取手机内部短信

            if (cur.moveToFirst()) {
                int index_Address = cur.getColumnIndex("address");
                int index_Person = cur.getColumnIndex("person");
                int index_Body = cur.getColumnIndex("body");
                int index_Date = cur.getColumnIndex("date");
                int index_Type = cur.getColumnIndex("type");

                do {
                    String strAddress = cur.getString(index_Address);
                    int intPerson = cur.getInt(index_Person);
                    String strbody = cur.getString(index_Body);
                    long longDate = cur.getLong(index_Date);
                    int intType = cur.getInt(index_Type);

                    Message message=new Message();
                    message.setAddress(strAddress);
                    message.setBody(strbody);
                    message.setType(intType);
                    message.setDate(longDate);
                    message.setPerson(intPerson);
                    messageList.add(message);
                } while (cur.moveToNext());

                if (!cur.isClosed()) {
                    cur.close();
                    cur = null;
                }
            } else {

            }
        } catch (SQLiteException ex) {
            Log.e("moe","Sms:"+ ex.getMessage());
        }

    }
}

