package com.example.trungnguyen.androidstreaming

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.webkit.WebView
import android.widget.Button

@SuppressLint("SetJavaScriptEnabled")
class MainActivity : AppCompatActivity() {

    private var mWebView1: WebView? = null
    private var mWebView2: WebView? = null
    private var mWebView3: WebView? = null
    private var mWebView4: WebView? = null
    private var mButton1: Button? = null
    private var mButton2: Button? = null
    private var mButton3: Button? = null
    private var mButton4: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        showFullScreen()
        run()
    }

    private fun init() {
        mWebView1 = findViewById(R.id.webView1)
        mWebView2 = findViewById(R.id.webView2)
        mWebView3 = findViewById(R.id.webView3)
        mWebView4 = findViewById(R.id.webView4)

        mButton1 = findViewById(R.id.button1)
        mButton2 = findViewById(R.id.button2)
        mButton3 = findViewById(R.id.button3)
        mButton4 = findViewById(R.id.button4)
    }

    private fun run() {
        //cam 1
        mWebView1!!.webViewClient = MyWebViewClient(IP1)
        mWebView1!!.settings.loadsImagesAutomatically = true
        mWebView1!!.settings.javaScriptEnabled = true
        mWebView1!!.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        mWebView1!!.loadUrl(IP1)
        //cam 2
        mWebView2!!.webViewClient = MyWebViewClient(IP2)
        mWebView2!!.settings.loadsImagesAutomatically = true
        mWebView2!!.settings.javaScriptEnabled = true
        mWebView2!!.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        mWebView2!!.loadUrl(IP2)
        //cam 3
        mWebView3!!.webViewClient = MyWebViewClient(IP3)
        mWebView3!!.settings.loadsImagesAutomatically = true
        mWebView3!!.settings.javaScriptEnabled = true
        mWebView3!!.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        mWebView3!!.loadUrl(IP3)
        //cam 4
        mWebView4!!.webViewClient = MyWebViewClient(IP4)
        mWebView4!!.settings.loadsImagesAutomatically = true
        mWebView4!!.settings.javaScriptEnabled = true
        mWebView4!!.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        mWebView4!!.loadUrl(IP4)
    }

    private fun showFullScreen() {
        mButton1!!.setOnClickListener {
            val intent = Intent(this@MainActivity, FullscreenActivity::class.java)
            intent.putExtra("ip", IP1)
            startActivity(intent)
        }
        mWebView2!!.loadUrl(IP2)
        mButton2!!.setOnClickListener {
            val intent = Intent(this@MainActivity, FullscreenActivity::class.java)
            intent.putExtra("ip", IP2)
            startActivity(intent)
        }
        mWebView3!!.loadUrl(IP3)
        mButton3!!.setOnClickListener {
            val intent = Intent(this@MainActivity, FullscreenActivity::class.java)
            intent.putExtra("ip", IP3)
            startActivity(intent)
        }
        mWebView4!!.loadUrl(IP4)
        mButton4!!.setOnClickListener {
            val intent = Intent(this@MainActivity, FullscreenActivity::class.java)
            intent.putExtra("ip", IP4)
            startActivity(intent)
        }

    }

    companion object {

        private const val IP1 = "http://169.254.201.103:9000/javascript_simple.html"
        private const val IP2 = "http://169.254.201.103:9000/javascript_simple.html"
        private const val IP3 = "http://169.254.201.103:9000/javascript_simple.html"
        private const val IP4 = "http://169.254.201.103:9000/javascript_simple.html"
    }
}
