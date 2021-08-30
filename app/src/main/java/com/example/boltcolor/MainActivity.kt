package com.example.boltcolor

import android.media.session.PlaybackState
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.color.CustomColor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val id=findViewById<TextView>(R.id.text_view)

        CustomColor.Red("HELLO EVERYONE",1,4,id)
    }
}