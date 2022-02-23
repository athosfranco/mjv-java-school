package primeiraSemana;

public class Escola {

    public static void main(String[] args) {
        //usando a funçao construtora para criar uma nova instancia do objeto aluno
        Aluno Athos = new Aluno("Athos", "Franco", 26, Aluno.Genero.M, "002-017284");

        //usando a funçao construtora padrao sem argumentos
        Aluno Marcio = new Aluno();

        //lendo os dados das instancias dos objetos com os métodos Get
        System.out.println(Athos.getIdade());

        //usando o método customizado que criei para ler o nome completo do aluno
        System.out.println(Athos.getNomeCompleto());

        //Como o objeto 'Marcio' foi criado sem definir os atibutos, utilizar os métodos Set pra definir as informaçoes
        Marcio.setNome("Márcio");
        Marcio.setSobrenome("Feitosa");
        Marcio.setIdade(50);
        Marcio.setGenero(Aluno.Genero.M);
        Marcio.setCodigoMatricula("003-045632");

        //Ler dados do objeto 'Marcio' através do método criado para ler todos os dados no console
        Marcio.getAllDados();
    }
    
}

