package com.hridoy.user.ieee_aust;

/**
 * Created by User on 21-Apr-17.
 */

public class MyList {

    private String head;
    private String desc;

    //constructor initializing values
    public MyList(String head, String desc) {
        this.head = head;
        this.desc = desc;
    }

    //getters
    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }

}
