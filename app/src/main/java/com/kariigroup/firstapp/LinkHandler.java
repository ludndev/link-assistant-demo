package com.kariigroup.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class LinkHandler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_handle);

        Uri uri = getIntent().getData();
        if (uri != null) {
            String userName = uri.getQueryParameter("UserName");
            String sessionId = uri.getQueryParameter("SessionId");

            TextView infoView = (TextView) findViewById(R.id.info_textview);
            infoView.setText(String.format("%s%s%s%s%s%s%s",
                    infoView.getText(), "\n\n",
                    "UserName = ", userName, "\n",
                    "Session ID = ", sessionId));
        }
    }
}