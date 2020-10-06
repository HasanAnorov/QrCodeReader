package com.example.qrcodegenerator

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main2.*

class WebView : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        webViewSetup()

    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup(){
        val manzil=intent.getStringExtra("HHHH")
        wb_webView.webViewClient = WebViewClient()
        wb_webView.apply {
            if (manzil != null) {
                loadUrl(manzil)
            }
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }
}