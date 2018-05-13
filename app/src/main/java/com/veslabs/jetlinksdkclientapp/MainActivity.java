package com.veslabs.jetlinksdkclientapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.veslabs.jetlinklibrary.JetlinkApp;
import com.veslabs.jetlinklibrary.config.JetlinkUIProperties;
import com.veslabs.jetlinklibrary.config.JetlinkUser;
import com.veslabs.jetlinklibrary.config.JetlinkConfig;
import com.veslabs.jetlinklibrary.faq.FaqActivity;
import com.veslabs.jetlinklibrary.messaging.JetlinkChatActivity;


public class MainActivity extends AppCompatActivity {

    private Button btnMessaging;
    private Button btnFaq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JetlinkConfig jetlinkConfig = new JetlinkConfig("<YOUR-APP-ID>", "<YOUR-APP-KEY>");
        JetlinkUIProperties uiProperties = new JetlinkUIProperties();
        jetlinkConfig.setJetLinkUIProperties(uiProperties);


        JetlinkUser user = new JetlinkUser();
        user.setEmail("salman.khan@jetlink.com");
        user.setName("Salman");
        user.setSurname("Khan");
        JetlinkApp.getInstance(getApplicationContext()).setUser(user);
        JetlinkApp.getInstance(getApplicationContext()).init(jetlinkConfig);


        btnMessaging= (Button) findViewById(R.id.btnJetLink);
        btnMessaging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, JetLinkChatActivity.class);
                startActivity(intent);

            }
        });

        btnFaq= (Button) findViewById(R.id.btnFaq);
        btnFaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FaqActivity.class);
                startActivity(intent);

            }
        });

    }
}
