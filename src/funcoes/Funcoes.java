package funcoes;

import java.util.Stack;

public  class Funcoes {
    //Funcao para verificar se os parenteses estao balanceados
    public int verificarBalanceamentoParenteses(String str) {
        Stack<Character> pilha = new Stack<>(); // Declara uma nova pilha de caracteres
        boolean possuiParantese = false; // Declara um booleano para verificar se possui parenteses na string, iniciando como false

        for (char caractere : str.toCharArray()) { //percorre cada caractere da string
            if (caractere == '(') { // condicao que verifica se o caractere atual é a abertura de parentese "("
                pilha.push(caractere); // se a condicao for verdade, vai empilhar esse caracatere na pilha
                possuiParantese = true; // passa true para a variavel, indicando que possui "(" na string
            }
            else if (caractere == ')') { // condicao que verifica se o caractere atual é o fechamento de parentese ")"
                if (pilha.isEmpty()) { // Verifica se a pilha esta vazia, caso verdade, retorna 0, pois nao tem parentese de abertura
                    return 0;
                }
                pilha.pop(); // Remove o parentese de abertura e continua verificando
            }
        }
        // Verifica se a pilha esta vazia ou nao possui parenteses na string, caso for verdade retorna 1, caso contrario 0
        return pilha.isEmpty() || !possuiParantese ? 1 : 0;
    }

}
