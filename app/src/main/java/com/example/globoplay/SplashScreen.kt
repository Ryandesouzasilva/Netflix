package com.example.globoplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        /*handler().postDelayed(
            {
                val i: Intent = intent(this, MainActivity::class.java)
                startActivity(i)
                startActivityForResult(i)


                finish()
            }, 5 * 1000
        ) // espere por 5 segundos */
    }
}