package com.example.javafxdemo;
import java.security.SecureRandom;
import java.util.Scanner;

public class GeradorSenhaSegura {

    private static final String caractere = "ABCDEFGHIJQLMNOPQRSTUVXWYZabcdefghijklmnopqrstuvxwyz1234567890,.[]~´~;?-=@#$*&";
    public static String gerarSenha(int comprimento){
            SecureRandom geradorDenumeroAleatorio = new SecureRandom();
            StringBuffer senha = new StringBuffer(comprimento);
        for (int i = 0; i <comprimento ; i++) {
                int indice = geradorDenumeroAleatorio.nextInt(caractere.length());
                senha.append(caractere.charAt(indice));

        }
        return senha.toString();
    }

    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in); // aqui cria um leitor de tela do terminal
     System.out.println("Qual o tamanho da senha que você quer ? ");
     int comprimentoDaSenha = scanner.nextInt();//aqui eu vou pegar o que ele digitou e jogar ai o next
      String senha = gerarSenha(comprimentoDaSenha);
      System.out.println("senha gerada foi: " + senha);
    }
}
