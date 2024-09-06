package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class GeometryOptionActivity extends AppCompatActivity {
Button btnCircle;
Button btnTrapezoid;
Button btnParallelogram;
Button btnTriangle;
Button btnRhombus;
ImageView imgMollu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        btnCircle=findViewById(R.id.btnCircle);
        btnTrapezoid=findViewById(R.id.btnTrapezoid);
        btnParallelogram=findViewById(R.id.btnParallelogram);
        btnTriangle=findViewById(R.id.btnTriangle);
        btnRhombus=findViewById(R.id.btnRhombus);
        imgMollu=findViewById(R.id.imageView2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry_option);
    }
}