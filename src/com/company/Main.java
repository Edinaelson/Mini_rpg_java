package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //criacao personagem 01
        Mago m1 = new Mago();
        Scanner inputInt = new Scanner(System.in);

        System.out.println("Informe nome: ");
        String nome1 = inputInt.nextLine();
        m1.setNome(nome1);

        System.out.print("informe mana: ");
        int mana1 = Integer.parseInt(inputInt.nextLine());
        m1.setMana(mana1);

        System.out.println("Informe vida: ");
        int vida1 = Integer.parseInt(inputInt.nextLine());
        m1.setVida(vida1);

        System.out.println("informe ataque: ");
        int ataque1 = Integer.parseInt(inputInt.nextLine());
        m1.setAtaque(ataque1);

        //----------------------------------------------------//
        //criacao personagem 02
        Guerreiro m2 = new Guerreiro();
        System.out.println("Informações de Guerreiro");
        Scanner inputInt2 = new Scanner(System.in);
        System.out.println("Informe nome: ");
        String nome2 = inputInt2.nextLine();
        m2.setNome(nome2);

        System.out.print("informe mana: ");
        int mana2 = Integer.parseInt(inputInt2.nextLine());
        m2.setMana(mana2);

        System.out.println("Informe vida: ");
        int vida2 = Integer.parseInt(inputInt2.nextLine());
        m1.setVida(vida2);

        System.out.println("informe ataque: ");
        int ataque2 = Integer.parseInt(inputInt2.nextLine());
        m2.setAtaque(ataque2);

        Scanner escolha = new Scanner(System.in);

        System.out.println("-------------Menu------------------");
        System.out.println("1-Imprimir informacoes de guerreiro");
        System.out.println("2-Imprimir informacoes de mago");


        int escolha1 = Integer.parseInt(escolha.nextLine());
        if (escolha1 == 1){
            imprimirInformacoes(m1);
        }else if (escolha1 == 2){
            imprimirInformacoes(m2);
        }else {
            System.out.println("Escolha indefinida");
        }

    }

    public static void imprimirInformacoes(Personagem mago){
        System.out.println("------------------------------------");
        System.out.println("Nome: \n" +   mago.getNome());
        System.out.print("Mana: \n" +     mago.getMana());
        System.out.println("vida: \n" +   mago.getVida());
        System.out.println("ataque: \n" + mago.getAtaque());
        System.out.println("------------------------------------");
    }

}
