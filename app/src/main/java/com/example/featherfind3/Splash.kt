package com.example.featherfind3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.droidsonroids.gif.GifImageView

class Splash : AppCompatActivity() {
    private lateinit var image : GifImageView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        image = findViewById(R.id.gifImageView)
        image.alpha = 0f
        image.animate().setDuration(2300).alpha(1f).withEndAction{
            val intent = Intent(this, Login::class.java)

            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }

    }
}