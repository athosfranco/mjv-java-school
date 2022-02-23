package primeiraSemana;

/*
As classes de programação podem ser entendidas como “moldes” de suas instâncias. Elas são compostas de IDENTIFICADORES, CARACTERÍSTICAS e COMPORTAMENTOS, permitindo assim armazenar propriedades e métodos dentro dela. Para construir uma classe é preciso utilizar o pilar da abstração. Uma classe geralmente representa um substantivo, por exemplo: uma pessoa, um lugar, algo que seja “abstrato”.
*/
public class Aluno {
   //enum de genero
   public enum Genero {  M, F }

    //atributos da classe
    private String nome;
    private String sobrenome;
    private int idade;
    private Genero genero;
    private String codigoMatricula;

    //métodos GETTER e SETTER da classe 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public String getCodigoMatricula() {
        return codigoMatricula;
    }
    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    //Método criado para retornar o nome completo do aluno
    public String getNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    //Método criado para retornar todas as informaçoes do aluno no console
    public void getAllDados() {
        System.out.println("------------[DADOS DO ALUNO]----------");
        System.out.println("NOME: " + this.getNomeCompleto());
        System.out.println("IDADE: " + this.idade + " Anos");
        System.out.println("GÊNERO: " + (this.genero == Genero.M ? "Masculino" : "Feminino"));
        System.out.println("CÓDIGO DE MATRÍCULA: " + this.codigoMatricula);
        System.out.println("------------------------------------");
    }

    //função construtora que cria uma instância completa da classe ALUNO:
    public Aluno(String nome, String sobrenome, int idade, Genero genero, String codigoMatricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.genero = genero;
        this.codigoMatricula = codigoMatricula;
    }

    //funçao construtora padrão (ESSA APENAS CRIA A NOVA INSTANCIA, SEM DEFINIR SUAS CARACTERÍSTICAS)
    public Aluno() {

    };

    /* 
    OBSERVAÇÕES: 
    --> Os atributos são definidos como "private" para garantir o encapsulamento. Os métodos GETTER e SETTER são a forma correta de LER e ATRIBUIR os valores para as instâncias das classes, portanto são definidos como "public".
    */

    
}

