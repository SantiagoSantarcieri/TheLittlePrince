package com.ejemplo.thelittleprince

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.thelittleprince.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(2000)
        setTheme(R.style.Theme_TheLittlePrince)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonLecture = findViewById<Button>(R.id.btnOpenActivityLecture)
        buttonLecture.setOnClickListener {
            val intent = Intent(this, LectureActivity::class.java)
            startActivity(intent)
        }

        val buttonAuthor = findViewById<Button>(R.id.btnOpenActivityAuthor)
        buttonAuthor.setOnClickListener {
            val intent = Intent(this, AuthorActivity::class.java)
            startActivity(intent)
        }

        val buttonDedication = findViewById<Button>(R.id.btnOpenActivityDedication)
        buttonDedication.setOnClickListener {
            val intent = Intent(this, DedicationActivity::class.java)
            startActivity(intent)
        }


    }

}


