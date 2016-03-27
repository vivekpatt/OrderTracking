package com.example.vivek.ordertracking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost th = (TabHost) findViewById(R.id.tabHost);
        th.setup();
        TabHost.TabSpec ts = th.newTabSpec("tab1");
        ts.setContent(R.id.linearLayout);
        ts.setIndicator("SHOP");
        th.addTab(ts);
        ts = th.newTabSpec("tab2");
        ts.setContent(R.id.linearLayout2);
        ts.setIndicator("TRACK");
        th.addTab(ts);
        ts = th.newTabSpec("tab3");
        ts.setContent(R.id.linearLayout3);
        ts.setIndicator("SETTING");
        th.addTab(ts);


        WebView WV1 = (WebView) findViewById(R.id.wv_shop);
        WV1.setWebViewClient(new WebViewClient());
        WV1.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        WV1.loadUrl("http://10.0.2.2/OrderTracking");

        WebView WV2 = (WebView) findViewById(R.id.wv_track);
        WV2.setWebViewClient(new WebViewClient());
        WV1.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        WV2.loadUrl("http://10.0.2.2/OrderTracking/ordertracking.html");

        WebView WV3 = (WebView) findViewById(R.id.wv_setting);
        WV3.setWebViewClient(new WebViewClient());
        WV1.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        WV3.loadUrl("http://10.0.2.2/OrderTracking/settings.html");
    }
}
