package aplicacao;

import funcoes.Funcoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declara o scanner para digitação no console
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String str = sc.nextLine(); // Obtem a string digitada
        Funcoes funcoes = new Funcoes(); // Instacia a classe Funcoes para poder chamar os metodos que ela contem
        //Chama a funcao para verificar o balanceamento dos parenteses, passando a string digitada como parametro e ja mostrar o resultado
        System.out.println("Resultado = " + funcoes.verificarBalanceamentoParenteses(str));

        sc.close();
    }
}