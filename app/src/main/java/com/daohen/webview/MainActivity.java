package com.daohen.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.daohen.webview.library.WebSettingsWrap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.webView);

        WebSettings settings = new WebSettingsWrap.Builder(webView.getSettings())
                .defaultWrap()
                .build();

        webView.loadUrl("https://www.baidu.com/");

    }
}
