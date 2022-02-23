package exercicioPowerClasses;

//importar localDate
import java.time.LocalDate; 

public class ExemploLocalDate {
	//USAR O LOCALDATE PARA EXIBIR A DATA DE HOJE, ONTEM E AMANH�.

	public static void main(String[] args) {
		//pegar a data de hoje utilizando o m�todo .now()
		 LocalDate dataHoje = LocalDate.now();   
		 
		 //pegar a data de ontem usando o m�todo .minusDays()
		 LocalDate dataOntem = dataHoje.minusDays(1); 
		 
		 //pegar a data de amanh� usando o m�todo .plusDays()
		 LocalDate dataAmanha = dataOntem.plusDays(2);  	 
		 
		 
		 //Imprimir
		 System.out.println("Data de hoje: "+dataHoje);    
		 System.out.println("Data de ontem: "+dataOntem);    
		 System.out.println("Data de amanh�: "+dataAmanha);   
		 
		 //Verificar se os anos 2014, 2020, 2022, 2024 s�o anos bissextos (leap year em ingl�s)
		 LocalDate ano2014 = LocalDate.of(2014, 1, 2);
		 System.out.println("2014 � bissexto? " + ano2014.isLeapYear());
		 
		 LocalDate ano2020 = LocalDate.of(2020, 1, 2);
		 System.out.println("2020 � bissexto? " + ano2020.isLeapYear());
		 
		 LocalDate ano2022 = LocalDate.of(2022, 1, 2);
		 System.out.println("2022 � bissexto? " + ano2022.isLeapYear());
		 
		 LocalDate ano2024 = LocalDate.of(2024, 1, 2);
		 System.out.println("2024 � bissexto? " + ano2024.isLeapYear());
		 
		 
		 
		 

	}

}
