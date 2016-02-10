package xyz.moechat.chat;

/**
 * Created by timeloveboy on 16/2/8.
 */
public class Msg {
    public  boolean receive_not_send=true;
    String content;

    public Msg(String content,boolean receive_not_send) {
        this.content = content;
        this.receive_not_send=receive_not_send;
    }
    public String getContent(){
        return content;
    }
}
