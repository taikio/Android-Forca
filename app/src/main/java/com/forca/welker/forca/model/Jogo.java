package com.forca.welker.forca.model;

import android.util.Log;

/**
 * Created by Caio Henrique on 21/01/2016.
 */
public class Jogo {
    private String bancoDeLetras = "";
    private int tentativas = 6;
    private int pos = 0;
    private int pontos = 0;


    public Jogo() {
    }

    public boolean verificaLetra(char letra,String palavra){
        if (!bancoDeLetras.contains(Character.toString(letra)) && palavra.contains(Character.toString(letra))){
            pos = palavra.indexOf(letra);
            Log.v("palavra", palavra);
            pontos += 10;
            return true;
        }
        if (!bancoDeLetras.contains(Character.toString(letra))){
            bancoDeLetras += letra;
        }
        return false;
    }

    public String substituiLetra(char letra, int pos, String campos){
        StringBuilder campoSub = new StringBuilder(campos);

        while (campos.contains(Character.toString(letra))){
                                 

        }

        Log.v("antes", campoSub.toString());
//        campoSub.setCharAt(pos, ' ');
        campoSub.setCharAt(pos + 3,letra);
        Log.v("depois",campoSub.toString());

        return campoSub.toString();
    }


    public String getBancoDeLetras() {
        return bancoDeLetras;
    }

    public void setBancoDeLetras(String bancoDeLetras) {
        this.bancoDeLetras = bancoDeLetras;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
