package com.example.megaproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //val btnIndent = findViewById<Button>(R.id.button)
        //        btnIndent.setOnClickListener {
        //            val intent = Intent(this, MainActivity2::class.java)
        //            startActivity(intent)

        val momProfile = findViewById<ImageView>(R.id.mom)
        momProfile.setOnClickListener {
            val intent = Intent(this, MomProfileActivity::class.java)
            startActivity(intent)
        }

        val bishalProfile = findViewById<ImageView>(R.id.bishal)
        bishalProfile.setOnClickListener {
            val intent = Intent(this, BishalProfileActivity::class.java)
            startActivity(intent)
        }

        val dadProfile = findViewById<ImageView>(R.id.dad)
        dadProfile.setOnClickListener {
            val intent = Intent(this, DadProfileActivity::class.java)
            startActivity(intent)
        }

        val bibekProfile = findViewById<ImageView>(R.id.bibek)
        bibekProfile.setOnClickListener {
            val intent = Intent(this, BibekProfileActivity::class.java)
            startActivity(intent)
        }

        val bikashProfile = findViewById<ImageView>(R.id.bikash)
        bikashProfile.setOnClickListener {
            val intent = Intent(this, BikashProfileActivity::class.java)
            startActivity(intent)
        }

        val website = findViewById<Button>(R.id.button)

        website.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://bishalstha.netlify.app/"))
            startActivity(intent)
        }
    }
}
