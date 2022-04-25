package com.company;

public class Guerreiro extends Personagem{
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setMana(int mana) {
        this.mana = mana;

        if (this.mana <= 100){
            super.setMana(this.mana);
        }else {
            this.mana = 200;
            super.setMana(this.mana);
        }
    }

    @Override
    public int getMana() {
        return super.getMana();
    }

    @Override
    public void setVida(int vida){
        this.vida = vida;
    }

    @Override
    public int getVida() {
        return super.getVida();
    }

    @Override
    public int getAtaque(){
        return super.getAtaque();
    }
}
