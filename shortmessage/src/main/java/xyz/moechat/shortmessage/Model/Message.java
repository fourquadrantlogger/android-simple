package xyz.moechat.shortmessage.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by timeloveboy on 16/2/25.
 */
public class Message {
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        java.util.Date dt = new Date(this.date);
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        return sdf.format(dt);
    }

    public void setDate(long date) {
        this.date = date;
    }
    public final static int TYPE_RECEIVE=1,TYPE_SEND=2;
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    String address;
    int person;
    String body;
    long date;
    int type;
}
