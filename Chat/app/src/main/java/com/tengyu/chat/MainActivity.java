package com.tengyu.chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tx1 = (TextView)findViewById(R.id.TextView1);
        TextView tx2 = (TextView)findViewById(R.id.TextView2);

        // set textview
        tx1.setText("This is test");
        // set url link text
        tx2.setText("https://www.google.com.tw/");
        tx2.setAutoLinkMask(Linkify.WEB_URLS);
        tx2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
