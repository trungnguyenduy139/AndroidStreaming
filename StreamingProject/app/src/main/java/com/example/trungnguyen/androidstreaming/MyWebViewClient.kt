package com.example.trungnguyen.androidstreaming

import android.graphics.Bitmap
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient

/**
 * Created by legen on 1/19/2018.
 */

class MyWebViewClient(private val addressBar: String?) : WebViewClient() {

    override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
        Log.i("showMyLog", "Click on any interlink on webview that time you got url :-" + url)
        return super.shouldOverrideUrlLoading(view, url)
    }

    override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
        super.onPageStarted(view, url, favicon)
        Log.i("showMyLog", "Your current url when webpage loading.." + url)
    }

    override fun onPageFinished(view: WebView?, url: String?) {
        super.onPageFinished(view, url)
        Log.i("showMyLog", "Your current url when webpage loading.. finish" + url)
    }
}
