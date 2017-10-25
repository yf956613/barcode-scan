package com.cocodin.barcodescan.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;

/**
 * Created by alberto.doval on 21/10/17.
 */

public abstract class BaseScan {

    public BaseScan(CordovaInterface cordova, CordovaWebView webView) {

    };

    public abstract void initialize(CordovaInterface cordova, CordovaWebView webView);

    public abstract String getDeviceName();

    public abstract void scan(final CordovaInterface cordova, CordovaWebView webView, JSONArray args, final CallbackContext callbackContext);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onDestroy();

    public abstract void onResume(boolean multitasking);

    public abstract void onPause(boolean multitasking);

}