package com.forca.welker.forca.model;

import android.util.Log;

/**
 * Created by Caio Henrique on 21/01/2016.
 */
public class Jogo {
    private String bancoDeLetras = "";
    private int erros;
    private int jogadas;
    private int pontos = 0;


    public Jogo() {
    }

    public boolean verificaLetra(char letra,String palavra){
        if (!bancoDeLetras.contains(Character.toString(letra)) && palavra.contains(Character.toString(letra))){
            Log.v("palavra", palavra);
            pontos += 10;
            bancoDeLetras += letra;
            return true;
        }
        if (!bancoDeLetras.contains(Character.toString(letra))){
            bancoDeLetras += letra;
        }
        return false;
    }

    public String substituiLetra(char letra,String palavra, String campos){
        StringBuilder campoSub = new StringBuilder(campos);
        char[] charPalavra;
        charPalavra = palavra.toCharArray();

            for (int i = 0; i < palavra.length(); i++){
                if (charPalavra[i] == letra){
                    campoSub.setCharAt(i ,letra);
                }
            }



        Log.v("antes", campoSub.toString());
        Log.v("depois",campoSub.toString());

        return campoSub.toString();
    }

    public boolean verificaFimJogo(String espacos){
        if (!espacos.contains(Character.toString('@')) || erros == 5){
            return true;
        }
        return false;

// if (jogadas == (palavra.length() - 1)){
//            return true;
//        }
//        jogadas ++;
//        return false;
    }


    public String getBancoDeLetras() {
        return bancoDeLetras;
    }

    public void setBancoDeLetras(String bancoDeLetras) {
        this.bancoDeLetras = bancoDeLetras;
    }

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros += erros;
    }

    public int getJogadas() {
        return jogadas;
    }

    public void setJogadas(int jogadas) {
        this.jogadas = jogadas;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
