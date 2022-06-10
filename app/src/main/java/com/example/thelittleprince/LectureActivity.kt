package com.example.thelittleprince

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class LectureActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture)

        var pdfView = this.findViewById(R.id.pdfView) as PDFView
        pdfView.fromAsset("TheLittlePrince.pdf").load()

    }
}