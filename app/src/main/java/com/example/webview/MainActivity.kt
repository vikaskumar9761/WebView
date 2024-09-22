package com.example.webview

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.webkit.JavascriptInterface
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.webview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.WebView.loadUrl("https://letesthtml99.blogspot.com/#home")
        @SuppressLint("setJavaScriptEnabled")
        binding.WebView.settings.javaScriptEnabled=true
        binding.WebView.webViewClient= WebViewClient()


    }
}