package com.example.samuel.pruebalecturapdf;

import android.graphics.pdf.PdfDocument;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("prueba1/cursoandroid.pdf")
                .enableSwipe(true)
                .enableDoubletap(true)
                .enableAntialiasing(true)
                .load();
    }
}
