package primeiraSemana;

public class Escola {

    public static void main(String[] args) {
        //usando a fun�ao construtora para criar uma nova instancia do objeto aluno
        Aluno Athos = new Aluno("Athos", "Franco", 26, Aluno.Genero.M, "002-017284");

        //usando a fun�ao construtora padrao sem argumentos
        Aluno Marcio = new Aluno();

        //lendo os dados das instancias dos objetos com os m�todos Get
        System.out.println(Athos.getIdade());

        //usando o m�todo customizado que criei para ler o nome completo do aluno
        System.out.println(Athos.getNomeCompleto());

        //Como o objeto 'Marcio' foi criado sem definir os atibutos, utilizar os m�todos Set pra definir as informa�oes
        Marcio.setNome("M�rcio");
        Marcio.setSobrenome("Feitosa");
        Marcio.setIdade(50);
        Marcio.setGenero(Aluno.Genero.M);
        Marcio.setCodigoMatricula("003-045632");

        //Ler dados do objeto 'Marcio' atrav�s do m�todo criado para ler todos os dados no console
        Marcio.getAllDados();
    }
    
}

