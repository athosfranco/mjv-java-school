package exercicioPowerClasses;

import java.time.LocalDateTime;

	//fazer comparativos entre datas utilizando os m�todos .isBefore(), .isAfter(), .isEqual();
	//comparar a data de hoje com a data de lan�amento da linguagem Java e uma data aleat�ria

public class ExemploLocalDateTime {

	public static void main(String[] args) {
		//pegar a data atual atrav�s do m�todo .now()
		LocalDateTime hoje = LocalDateTime.now();
		System.out.println(hoje);
		
		//criar os anos para comparar com o m�todo .of()
		
		//ano de lan�amento do Java = 23 de maio de 1995		
		LocalDateTime dataLancamentoJava = LocalDateTime.of(1995, 4, 23, 0, 0);
		
		//data comparativa
		LocalDateTime dataComparativa = LocalDateTime.of(2023, 8, 1, 0, 0);
		
		//comparativos		
		System.out.println("Data de hoje � posterior ao lan�amento do Java? " + hoje.isAfter(dataLancamentoJava));
		System.out.println("Data de hoje � anterior ao lan�amento do Java? " + hoje.isBefore(dataLancamentoJava));
		System.out.println("Data de hoje � igual ao lan�amento do Java? " + hoje.isEqual(dataLancamentoJava));
		
		
		System.out.println("Data de hoje � anterior � data " + dataComparativa + "? " + hoje.isBefore(dataComparativa));
		System.out.println("Data de hoje � posterior � data " + dataComparativa + "? " + hoje.isAfter(dataComparativa));
		System.out.println("Data de hoje � igual � data " + dataComparativa + "? " + hoje.isEqual(dataComparativa));
		
		
		
		

	}

}
