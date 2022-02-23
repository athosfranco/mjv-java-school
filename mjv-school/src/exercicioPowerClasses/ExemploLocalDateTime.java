package exercicioPowerClasses;

import java.time.LocalDateTime;

	//fazer comparativos entre datas utilizando os métodos .isBefore(), .isAfter(), .isEqual();
	//comparar a data de hoje com a data de lançamento da linguagem Java e uma data aleatória

public class ExemploLocalDateTime {

	public static void main(String[] args) {
		//pegar a data atual através do método .now()
		LocalDateTime hoje = LocalDateTime.now();
		System.out.println(hoje);
		
		//criar os anos para comparar com o método .of()
		
		//ano de lançamento do Java = 23 de maio de 1995		
		LocalDateTime dataLancamentoJava = LocalDateTime.of(1995, 4, 23, 0, 0);
		
		//data comparativa
		LocalDateTime dataComparativa = LocalDateTime.of(2023, 8, 1, 0, 0);
		
		//comparativos		
		System.out.println("Data de hoje é posterior ao lançamento do Java? " + hoje.isAfter(dataLancamentoJava));
		System.out.println("Data de hoje é anterior ao lançamento do Java? " + hoje.isBefore(dataLancamentoJava));
		System.out.println("Data de hoje é igual ao lançamento do Java? " + hoje.isEqual(dataLancamentoJava));
		
		
		System.out.println("Data de hoje é anterior à data " + dataComparativa + "? " + hoje.isBefore(dataComparativa));
		System.out.println("Data de hoje é posterior à data " + dataComparativa + "? " + hoje.isAfter(dataComparativa));
		System.out.println("Data de hoje é igual à data " + dataComparativa + "? " + hoje.isEqual(dataComparativa));
		
		
		
		

	}

}
