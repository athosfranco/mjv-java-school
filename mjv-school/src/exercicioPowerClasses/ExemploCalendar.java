package exercicioPowerClasses;

//importar a classe Calendar
import java.util.Calendar;

public class ExemploCalendar {
	
//OBJETIVO: PEGAR A DATA DE HOJE E IMPRIMIR A MENSAGEM "BOA TARDE! HOJE É TERÇA, 22/2/2022. SÃO 15:23 HORAS"
	
	public static void main(String[] args) {
		
		//Criar uma instancia do Calendar chamada "hoje"
		Calendar hoje;
		
		//instanciar a classe Calendar através do método getInstance()
		hoje = Calendar.getInstance();		
		
		//testar com um print
		System.out.println(hoje);
		
		//usar o método .get pra pegar as informações da data de hoje
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hr = hoje.get(Calendar.HOUR_OF_DAY);
		int diaSemana = hoje.get(Calendar.DAY_OF_WEEK);
		int mins = hoje.get(Calendar.MINUTE);
		int segs = hoje.get(Calendar.SECOND);
		
		System.out.println(hoje.getTime());
		
		//String turno
		String turno = null;
		
		if(hr >= 6 && hr <= 12) {
			turno = "manhã";
		} else if(hr > 12 && hr <= 18) {
			turno = "tarde";
		} else if (hr > 18 || hr < 6) {
			turno = "noite";
		}
		
		//Gerar String do dia da semana
		String diaDaSemana = null;
		
		if(diaSemana == 1) {
			diaDaSemana = "DOMINGO";			
		} else if(diaSemana == 2) {
			diaDaSemana = "SEGUNDA";
		} else if(diaSemana == 3) {
			diaDaSemana = "TERÇA";
		} else if(diaSemana == 4) {
			diaDaSemana = "QUARTA";
		} else if(diaSemana == 5) {
			diaDaSemana = "QUINTA";
		} else if(diaSemana == 6) {
			diaDaSemana = "SEXTA";
		} else if(diaSemana == 7) {
			diaDaSemana = "SÁBADO";
		}
		
		
		//gerar string da mensagem
		String mensagem = 
		"Boa " + turno + "! Hoje é " + diaDaSemana + ", " + dia + "/" + (mes + 1) + "/" + ano + ". São " + hr + ":" + mins + "h.";
			
		//imprimir mensagem
		System.out.println(mensagem);
	}

}
