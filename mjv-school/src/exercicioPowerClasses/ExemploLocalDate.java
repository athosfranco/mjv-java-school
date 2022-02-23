package exercicioPowerClasses;

//importar localDate
import java.time.LocalDate; 

public class ExemploLocalDate {
	//USAR O LOCALDATE PARA EXIBIR A DATA DE HOJE, ONTEM E AMANHÃ.

	public static void main(String[] args) {
		//pegar a data de hoje utilizando o método .now()
		 LocalDate dataHoje = LocalDate.now();   
		 
		 //pegar a data de ontem usando o método .minusDays()
		 LocalDate dataOntem = dataHoje.minusDays(1); 
		 
		 //pegar a data de amanhã usando o método .plusDays()
		 LocalDate dataAmanha = dataOntem.plusDays(2);  	 
		 
		 
		 //Imprimir
		 System.out.println("Data de hoje: "+dataHoje);    
		 System.out.println("Data de ontem: "+dataOntem);    
		 System.out.println("Data de amanhã: "+dataAmanha);   
		 
		 //Verificar se os anos 2014, 2020, 2022, 2024 são anos bissextos (leap year em inglês)
		 LocalDate ano2014 = LocalDate.of(2014, 1, 2);
		 System.out.println("2014 é bissexto? " + ano2014.isLeapYear());
		 
		 LocalDate ano2020 = LocalDate.of(2020, 1, 2);
		 System.out.println("2020 é bissexto? " + ano2020.isLeapYear());
		 
		 LocalDate ano2022 = LocalDate.of(2022, 1, 2);
		 System.out.println("2022 é bissexto? " + ano2022.isLeapYear());
		 
		 LocalDate ano2024 = LocalDate.of(2024, 1, 2);
		 System.out.println("2024 é bissexto? " + ano2024.isLeapYear());
		 
		 
		 
		 

	}

}
