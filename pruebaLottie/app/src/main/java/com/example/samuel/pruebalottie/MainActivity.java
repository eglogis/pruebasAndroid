package com.example.samuel.pruebalottie;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //PONE TRANSPARENTE LA STATUS BAR
        //getWindow().setStatusBarColor(Color.BLACK);

        //QUITA LA BARRA DE ESTADO CON LOS ICONOS
        /*View decoreView = getWindow().getDecorView();
        int uiOption = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decoreView.setSystemUiVisibility(uiOption);*/

        //QUITA LA BARRA DE ESTADO DEJANDO LOS ICONOS (ESTA ES LA QUE UTILIZARE)
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
    }
}
