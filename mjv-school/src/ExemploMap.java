//importar a interface e a classe
import java.util.HashMap;
import java.util.Map;


public class ExemploMap {
	
	 public static void main(String[] args) {
		 //criar uma instancia da classe HashMap
		 Map<String, Integer> alunos = new HashMap<>();
	
	 
	     //adicionar entradas na HashMap
		 alunos.put("Athos", 123);
		 alunos.put("Viviane", 456);
		 alunos.put("Alexa", 789);
		 alunos.put("Guilherme", 012);
	       
	 
	     //Imprimir total utilizando método .size()
		 System.out.println(alunos.size());
		 
		 
	  
	     // Fazer uma iteraçao em todos os alunos, usando metodo .keySet().
		 for (String key : alunos.keySet()) {
			 System.out.println("NOME: " + key + " / ID: " + alunos.get(key));
		 }
		 
		 
	
	    
	 
	     //procurar por uma cchave especifica usando o método .containsKey().   
		 System.out.println( alunos.containsKey("Athos"));
	
	        
	    
	 
	     //Limpar todas as entradas com .clear();
		 alunos.clear();
	   
	 
	     // verificar o tamanho do map novamente
		 System.out.println(alunos.size());
	        
	    }

}
