package primeiraSemana;

public class Operadores {

    //Operador de atribui��o (=)
    static int idade = 26; //O operador atribui o valor num�rico de 26 para a vari�vel do tipo int.

    public static void main(String[] args) {
        //OPERADORES DE INCREMENTA��O E DECREMENTA��O        

        idade++; //incrementa��o

        //OPERADORES UN�RIOS (++ e -- e !)
        System.out.println(idade); //vai retornar 27 devido a incrementa��o da linha anterior

        System.out.println(idade--); //aqui ainda vai retornar 27, pois a preced�ncia possui importancia: a decrementa�ao � feita DEPOIS da impress�o.

        System.out.println(--idade); //aqui vai retornar 25. Isso porque vai contar a decerementa�ao da linha 13, e depois a decrementa�ao da linha 15, pois agora o operador est� precedendo. 

        String concatenacao = "1"+(1+1+1); //retornar� 13, pois o que est� entre par�ntese ter� preced�ncia. 

        System.out.println(concatenacao);

        //OPERADORES TERN�RIOS
        double salarioDevJava = 10.500;
        String analise = salarioDevJava > 10.000 ? "Sal�rio t� bom!" : "Sal�rio t� mais ou menos";

        System.out.println(analise);

        //OPERADORES RELACIONAIS
        //resultados de operadores relacionais sempre ser�o retornados como valores booleanos (true ou false).
        boolean resultado = 6 != 7; //retornar� TRUE
        boolean resultado2 = 5 > 8; //retornar� FALSE

        System.out.println(resultado);
        System.out.println(resultado2);

        //OPERADORES L�GICOS (E, OU)
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 || condicao2) {
            System.out.println("Um dos dois � TRUE");
        };

        if(condicao1 && condicao2) {
            System.out.println("As duas condi��es precisam ser TRUE para isso aparecer no console!");
        };


        
    }
}