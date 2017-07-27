package com.daohen.webview.library;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;

/**
 * CREATE BY ALUN
 * EMAIL: alunfeixue2011@gmail.com
 * DATE : 2017/07/27 16:03
 */

public class WebSettingsWrap {

    @SuppressLint("SetJavaScriptEnabled")
    public static WebSettings defaultWrap(WebSettings settings){
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(false);
        settings.setDisplayZoomControls(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        return settings;
    }

    public static class Builder{

        private WebSettings settings;

        public Builder(WebSettings settings){
            this.settings = settings;
        }

        public Builder defaultWrap(){
            WebSettingsWrap.defaultWrap(settings);
            return this;
        }

        public Builder userAgentString(String userAgent){
            settings.setUserAgentString(settings.getUserAgentString() + " " + userAgent);
            return this;
        }

        public WebSettings build(){
            return settings;
        }
    }

}
