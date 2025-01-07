package com.example.javafxdemo;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class JogoDaForca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();// é a variavel que vai sortear um id
        int tentativa = 6;
        ArrayList<String> palavrasChaves = new ArrayList<>();// Array com as palavras
        palavrasChaves.add("Cobra");
        palavrasChaves.add("elefante");
        palavrasChaves.add("cachorro");
        palavrasChaves.add("barata");
        int tamanhoArrray = palavrasChaves.size();
        int indiceDaPalavraGerada = random.nextInt(tamanhoArrray);
        String palavraSecreta = palavrasChaves.get(indiceDaPalavraGerada);

        ArrayList<Character> letrasDescoberta = new ArrayList<>(); // array que armazena a lista das letras descoberta
        for (int i = 0; i < palavraSecreta.length() ; i++) {
            letrasDescoberta.add('_');
        }
        boolean palavraFoiDescoberta = false;

        while (!palavraFoiDescoberta && tentativa>0){
            System.out.println("Palavra: " + letrasDescoberta);
            System.out.print("Chute uma Letra: ");
            char chute = leitor.next().charAt(0);

            boolean acertou = false;
            for (int p = 0; p < palavraSecreta.length(); p++) {

                if (palavraSecreta.charAt(p)== chute ){
                    letrasDescoberta.set(p,chute);
                    acertou = true;
                }
            }
            if (!acertou){
                tentativa--;
                System.out.println("você tem mais "+ tentativa + " tentativas");
            }

            palavraFoiDescoberta = !letrasDescoberta.contains('_');

        }
        if(palavraFoiDescoberta){
            System.out.println("parabens você acertou a palavra era :  "+ palavraSecreta);
        } else {System.out.println("Você perdeu a palavra Secreta era: "+ palavraSecreta);}

    }
}
