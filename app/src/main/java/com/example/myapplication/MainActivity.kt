package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.webkit.WebView
import android.webkit.WebSettings
import android.content.Intent
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            navigateToGetStart()
        }, 2000)

    }


    @SuppressLint("MissingInflatedId")
    private fun navigateToGetStart() {
        setContentView(R.layout.getstart)

        val slideInAnimation = AnimationUtils.loadAnimation(this,R.anim.slide_out_left)
        findViewById<ConstraintLayout>(R.id.getstartlay).startAnimation(slideInAnimation)
        val getStart: Button = findViewById(R.id.getstart)
        getStart.setOnClickListener {
            navigateToLogin()
        }
    }
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.hometab -> {
                navigateToHome()
                return@OnNavigationItemSelectedListener true
            }
            R.id.newstab -> {
                navigateToNews()
                return@OnNavigationItemSelectedListener true
            }
            R.id.profiletab -> {
                navigateToProfile()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun navigateToLogin() {
        setContentView(R.layout.login_acc)
        val signUpButton: TextView = findViewById(R.id.signuplogin)
        val loginButton: Button = findViewById(R.id.loginbutton)

        signUpButton.setOnClickListener {
            navigateToSignUp()
        }

        loginButton.setOnClickListener {
            navigateToNews()
        }
    }

    private fun navigateToSignUp() {
        setContentView(R.layout.signup_acc)
        val loginSignUpButton: TextView = findViewById(R.id.loginsignup)
        val SignUpButton: TextView = findViewById(R.id.loginbutton)

        loginSignUpButton.setOnClickListener {
            navigateToLogin()
        }
        SignUpButton.setOnClickListener {
            navigateToLogin()
        }
    }

    private fun navigateToHome() {
        setContentView(R.layout.home)
        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)


        val webView: WebView = findViewById(R.id.webview)
        val webSettings: WebSettings = webView.settings

        // Enable JavaScript
        webSettings.javaScriptEnabled = true

        val widgetHtml = """
            <div class="tradingview-widget-container">
                <div class="tradingview-widget-container__widget"></div>
                <script type="text/javascript" src="https://s3.tradingview.com/external-embedding/embed-widget-screener.js" async>
                {
                    "width": "100%",
                    "height": "100%",
                    "defaultColumn": "overview",
                    "screener_type": "crypto_mkt",
                    "displayCurrency": "USD",
                    "colorTheme": "light",
                    "locale": "en"
                }
                </script>
            </div>
        """.trimIndent()

        webView.loadDataWithBaseURL(null, widgetHtml, "text/html", "utf-8", null)


    }

    private fun navigateToNews() {
        setContentView(R.layout.news)
        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }

    private fun navigateToProfile() {
        setContentView(R.layout.myprofile)
        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        val DeleteButton: TextView = findViewById(R.id.delete_account_button)
        val UpdateButton: TextView = findViewById(R.id.edit_account_button)
        val LogoutButton: TextView = findViewById(R.id.logout_button)

        DeleteButton.setOnClickListener {
            navigateToLogin()
        }

        UpdateButton.setOnClickListener {
            navigateToSignUp()
        }

        LogoutButton.setOnClickListener {
            navigateToLogin()
        }
    }
}
