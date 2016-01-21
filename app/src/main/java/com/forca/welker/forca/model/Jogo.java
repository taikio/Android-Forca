package com.forca.welker.forca.model;

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
            return true;
        }
        if (!bancoDeLetras.contains(Character.toString(letra))){
            bancoDeLetras += letra;
        }
        return false;
    }

    public void substituiLetra(char letra, int pos, String palavra){
        

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
