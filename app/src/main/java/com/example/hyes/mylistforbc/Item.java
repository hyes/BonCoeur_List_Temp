package com.example.hyes.mylistforbc;

/**
 * Created by hyes on 2015. 2. 17..
 */
public class Item {
    String count;
    String title;
    String content;


    public Item() {
    }

    public Item(String count, String title, String content) {
        this.count = count;
        this.title = title;
        this.content = content;
    }


    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
