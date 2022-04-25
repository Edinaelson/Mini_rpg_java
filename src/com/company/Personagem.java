package com.company;

import java.util.Scanner;

public abstract class Personagem {

    private String nome;
    protected int mana;
    protected int vida;
    private int ataque;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana; //poder do personagem.
    }

    public int getVida() {
        return vida;
    }

    public String getNome() {
        return nome;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

}
