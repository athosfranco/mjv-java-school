package primeiraSemana;

/*
As classes de programa��o podem ser entendidas como �moldes� de suas inst�ncias. Elas s�o compostas de IDENTIFICADORES, CARACTER�STICAS e COMPORTAMENTOS, permitindo assim armazenar propriedades e m�todos dentro dela. Para construir uma classe � preciso utilizar o pilar da abstra��o. Uma classe geralmente representa um substantivo, por exemplo: uma pessoa, um lugar, algo que seja �abstrato�.
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

    //m�todos GETTER e SETTER da classe 
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

    //M�todo criado para retornar o nome completo do aluno
    public String getNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    //M�todo criado para retornar todas as informa�oes do aluno no console
    public void getAllDados() {
        System.out.println("------------[DADOS DO ALUNO]----------");
        System.out.println("NOME: " + this.getNomeCompleto());
        System.out.println("IDADE: " + this.idade + " Anos");
        System.out.println("G�NERO: " + (this.genero == Genero.M ? "Masculino" : "Feminino"));
        System.out.println("C�DIGO DE MATR�CULA: " + this.codigoMatricula);
        System.out.println("------------------------------------");
    }

    //fun��o construtora que cria uma inst�ncia completa da classe ALUNO:
    public Aluno(String nome, String sobrenome, int idade, Genero genero, String codigoMatricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.genero = genero;
        this.codigoMatricula = codigoMatricula;
    }

    //fun�ao construtora padr�o (ESSA APENAS CRIA A NOVA INSTANCIA, SEM DEFINIR SUAS CARACTER�STICAS)
    public Aluno() {

    };

    /* 
    OBSERVA��ES: 
    --> Os atributos s�o definidos como "private" para garantir o encapsulamento. Os m�todos GETTER e SETTER s�o a forma correta de LER e ATRIBUIR os valores para as inst�ncias das classes, portanto s�o definidos como "public".
    */

    
}

