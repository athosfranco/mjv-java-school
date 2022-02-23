package primeiraSemana;

public class Operadores {

    //Operador de atribuição (=)
    static int idade = 26; //O operador atribui o valor numérico de 26 para a variável do tipo int.

    public static void main(String[] args) {
        //OPERADORES DE INCREMENTAÇÃO E DECREMENTAÇÃO        

        idade++; //incrementação

        //OPERADORES UNÁRIOS (++ e -- e !)
        System.out.println(idade); //vai retornar 27 devido a incrementação da linha anterior

        System.out.println(idade--); //aqui ainda vai retornar 27, pois a precedência possui importancia: a decrementaçao é feita DEPOIS da impressão.

        System.out.println(--idade); //aqui vai retornar 25. Isso porque vai contar a decerementaçao da linha 13, e depois a decrementaçao da linha 15, pois agora o operador está precedendo. 

        String concatenacao = "1"+(1+1+1); //retornará 13, pois o que está entre parêntese terá precedência. 

        System.out.println(concatenacao);

        //OPERADORES TERNÁRIOS
        double salarioDevJava = 10.500;
        String analise = salarioDevJava > 10.000 ? "Salário tá bom!" : "Salário tá mais ou menos";

        System.out.println(analise);

        //OPERADORES RELACIONAIS
        //resultados de operadores relacionais sempre serão retornados como valores booleanos (true ou false).
        boolean resultado = 6 != 7; //retornará TRUE
        boolean resultado2 = 5 > 8; //retornará FALSE

        System.out.println(resultado);
        System.out.println(resultado2);

        //OPERADORES LÓGICOS (E, OU)
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 || condicao2) {
            System.out.println("Um dos dois é TRUE");
        };

        if(condicao1 && condicao2) {
            System.out.println("As duas condições precisam ser TRUE para isso aparecer no console!");
        };


        
    }
}