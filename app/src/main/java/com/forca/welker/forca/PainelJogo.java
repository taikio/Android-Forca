package com.forca.welker.forca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.forca.welker.forca.model.Jogo;

public class PainelJogo extends AppCompatActivity {

    TextView txtPontos;
    ImageView imgForca;
    TextView txtDica;
    TextView txtPalavra;
    String palavra;
    String espacos = "";
    String espacosAux = "";
    char espaco = '@';
    Button btnA; Button btnB; Button btnC; Button btnD; Button btnE; Button btnF; Button btnG; Button btnH;
    Button btnI; Button btnJ; Button btnK; Button btnL; Button btnM; Button btnN; Button btnO; Button btnP;
    Button btnQ; Button btnR; Button btnS; Button btnT; Button btnU; Button btnV; Button btnW; Button btnX;
    Button btnY; Button btnZ;

    Jogo jogo = new Jogo();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painel_jogo);

        palavra = "manga";

        // Calcula quantidade de espaços
        for (int i = 0;i < palavra.length(); i++){
            espacos += espaco;
        }

        iniciaComponentes();

        // Atribui os espaços da palavra
        txtPalavra.setText(espacos);
        // Atribui os pontos iniciais
        txtPontos.setText(String.valueOf(jogo.getPontos()));

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'a';
                if (jogo.verificaLetra(letra, palavra)) {
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra, palavra, espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                } else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5) {
                        Toast.makeText(PainelJogo.this, "Você Perdeu!", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(PainelJogo.this, "Parabéns, você Ganhou!!!", Toast.LENGTH_LONG).show();

                    }

                }

                btnA.setVisibility(View.INVISIBLE);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'b';
                if (jogo.verificaLetra(letra, palavra)) {
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra, palavra, espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                } else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5) {
                        Toast.makeText(PainelJogo.this, "Você Perdeu!", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(PainelJogo.this, "Parabéns, você Ganhou!!!", Toast.LENGTH_LONG).show();

                    }

                }

                btnB.setVisibility(View.INVISIBLE);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'c';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnC.setVisibility(View.INVISIBLE);
            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'd';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnD.setVisibility(View.INVISIBLE);
            }
        });

        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'e';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnE.setVisibility(View.INVISIBLE);
            }
        });

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'f';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnF.setVisibility(View.INVISIBLE);
            }
        });

        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'g';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnG.setVisibility(View.INVISIBLE);
            }
        });

        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'h';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnH.setVisibility(View.INVISIBLE);
            }
        });

        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'i';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnI.setVisibility(View.INVISIBLE);
            }
        });

        btnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'j';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnJ.setVisibility(View.INVISIBLE);
            }
        });

        btnK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'k';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnK.setVisibility(View.INVISIBLE);
            }
        });

        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'l';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnL.setVisibility(View.INVISIBLE);
            }
        });

        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'm';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnM.setVisibility(View.INVISIBLE);
            }
        });

        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'n';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnN.setVisibility(View.INVISIBLE);
            }
        });

        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'o';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnO.setVisibility(View.INVISIBLE);
            }
        });

        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'p';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnP.setVisibility(View.INVISIBLE);
            }
        });

        btnQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'q';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnQ.setVisibility(View.INVISIBLE);
            }
        });

        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'r';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnR.setVisibility(View.INVISIBLE);
            }
        });

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 's';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnS.setVisibility(View.INVISIBLE);
            }
        });

        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 't';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnT.setVisibility(View.INVISIBLE);
            }
        });

        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'u';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnU.setVisibility(View.INVISIBLE);
            }
        });

        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'v';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnV.setVisibility(View.INVISIBLE);
            }
        });

        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'w';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnW.setVisibility(View.INVISIBLE);
            }
        });

        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'x';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnX.setVisibility(View.INVISIBLE);
            }
        });

        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'y';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnY.setVisibility(View.INVISIBLE);
            }
        });

        btnZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char letra = 'z';
                if (jogo.verificaLetra(letra, palavra)){
                    espacosAux = espacos;
                    espacos = null;
                    espacos = jogo.substituiLetra(letra,palavra,espacosAux);
                    txtPalavra.setText(null);
                    txtPalavra.setText(espacos);
                    txtPontos.setText(null);
                    txtPontos.setText(String.valueOf(jogo.getPontos()));
                }

                else if (!jogo.verificaLetra(letra, palavra)) {
                    Toast.makeText(PainelJogo.this, "Letra incorreta", Toast.LENGTH_LONG).show();

                    jogo.setErros(1);
                    trocaImg();
                }
                if (jogo.verificaFimJogo(espacos)) {

                    if (jogo.getErros() == 5){
                        Toast.makeText(PainelJogo.this,"Você Perdeu!",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(PainelJogo.this,"Parabéns, você Ganhou!!!",Toast.LENGTH_LONG).show();

                    }

                }

                btnZ.setVisibility(View.INVISIBLE);
            }
        });

    }

    public void iniciaComponentes(){

        txtDica = (TextView) findViewById(R.id.txtDica);
        txtPalavra = (TextView) findViewById(R.id.txtPalava);
        txtPontos = (TextView) findViewById(R.id.txtPontos);
        imgForca = (ImageView) findViewById(R.id.imgForca);
        btnA = (Button) findViewById(R.id.btnA);
        btnB = (Button) findViewById(R.id.btnB);
        btnC = (Button) findViewById(R.id.btnC);
        btnD = (Button) findViewById(R.id.btnD);
        btnE = (Button) findViewById(R.id.btnE);
        btnF = (Button) findViewById(R.id.btnF);
        btnG = (Button) findViewById(R.id.btnG);
        btnH = (Button) findViewById(R.id.btnH);
        btnI = (Button) findViewById(R.id.btnI);
        btnJ = (Button) findViewById(R.id.btnJ);
        btnK = (Button) findViewById(R.id.btnK);
        btnL = (Button) findViewById(R.id.btnL);
        btnM = (Button) findViewById(R.id.btnM);
        btnN = (Button) findViewById(R.id.btnN);
        btnO = (Button) findViewById(R.id.btnO);
        btnP = (Button) findViewById(R.id.btnP);
        btnQ = (Button) findViewById(R.id.btnQ);
        btnR = (Button) findViewById(R.id.btnR);
        btnS = (Button) findViewById(R.id.btnS);
        btnT = (Button) findViewById(R.id.btnT);
        btnU = (Button) findViewById(R.id.btnU);
        btnV = (Button) findViewById(R.id.btnV);
        btnW = (Button) findViewById(R.id.btnW);
        btnX = (Button) findViewById(R.id.btnX);
        btnY = (Button) findViewById(R.id.btnY);
        btnZ = (Button) findViewById(R.id.btnZ);
    }

    public void trocaImg(){
        switch (jogo.getErros()){
            case 1:
                imgForca.setImageResource(R.drawable.um);
                break;
            case 2:
                imgForca.setImageResource(R.drawable.dois);
                break;
            case 3:
                imgForca.setImageResource(R.drawable.tres);
                break;
            case 4:
                imgForca.setImageResource(R.drawable.quatro);
                break;
            case 5:
                imgForca.setImageResource(R.drawable.cinco);
                break;
            default:
                Log.v("hehe","Acertô miseravi");
        }
    }
}
