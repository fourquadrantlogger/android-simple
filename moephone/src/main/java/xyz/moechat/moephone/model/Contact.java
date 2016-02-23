package xyz.moechat.moephone.model;

/**
 * Created by timeloveboy on 16/2/24.
 */
public class Contact {
    public Contact(String contactname, String contacttel) {
        this.contactname = contactname;
        this.contacttel = contacttel;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getContacttel() {
        return contacttel;
    }

    public void setContacttel(String contacttel) {
        this.contacttel = contacttel;
    }

    String contactname;
    String contacttel;
}
