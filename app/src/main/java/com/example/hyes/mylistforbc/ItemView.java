package com.example.hyes.mylistforbc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by hyes on 2015. 2. 17..
 */
public class ItemView extends LinearLayout {

    TextView numTextView;
    TextView titleTextView;
    TextView contentsTextView;

    public ItemView(Context context) {
        super(context);

        init(context);
    }

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public void init(Context c){
      LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      inflater.inflate(R.layout.custom_view, this, true);
        numTextView = (TextView) findViewById(R.id.numTextView);
        titleTextView = (TextView)findViewById(R.id.titleTextView);
        contentsTextView = (TextView)findViewById(R.id.contentsTextView);
    }


    public void setCount(String count) {
        numTextView.setText(count);
    }

    public void setTitle(String title) {
        titleTextView.setText(title);
    }

    public void setContent(String content) {
        contentsTextView.setText(content);
    }


}
