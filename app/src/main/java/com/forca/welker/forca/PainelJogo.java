package com.forca.welker.forca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.forca.welker.forca.model.Jogo;

import java.util.ArrayList;
import java.util.List;

public class PainelJogo extends AppCompatActivity {

    TextView txtPontos;
    ImageView imgForca;
    TextView txtDica;
    TextView txtPalavra;
    String palavra;
    String espacos = "";
    char espaco = '_';
    Button btnA;
    Jogo jogo = new Jogo();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painel_jogo);

        palavra = "limao";

        // Calcula quantidade de espaços
        for (int i = 0;i < palavra.length(); i++){
            espacos += espaco + " ";
        }

        txtDica = (TextView) findViewById(R.id.txtDica);
        txtPalavra = (TextView) findViewById(R.id.txtPalavra);
        txtPontos = (TextView) findViewById(R.id.txtPontos);
        imgForca = (ImageView) findViewById(R.id.imgForca);
        btnA = (Button) findViewById(R.id.btnA);
        // Atribui os espaços da palavra
        txtPalavra.setText(espacos);
        // Atribui os pontos iniciais
        txtPontos.setText(String.valueOf(jogo.getPontos()));

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jogo.verificaLetra('a',palavra)){
                    Log.v("pos",String.valueOf(jogo.getPos()));
                }
            }
        });


    }
}
