//Dev: João Pedro Pereira Lima 
//Matrícula: 508153

public class Main {
    public static void main(String[] args) throws Exception {

        /////////////////////////////////////////////////////// -----QUESTÃO 2----- /////////////////////////////////////////////////////// 
        //Questão 2 - Item A
        Aluno aluno1 = new Aluno();

        //Questão 2 - Item D
        aluno1.nota1 = 3.5;
        aluno1.nota2 = 6.5;

        //Questão 2 - Item B
        aluno1.alteraNome("Antonio");
        //Questão 2 - Item C
        aluno1.alteraId(4202469);

        //Questão 2 - Item E
        System.out.println("Resposta da questão 2 - item E:");
        System.out.println(aluno1.retornaMedia());

        //Questão 2 - Item F
        System.out.println("Resposta da questão 2 - item F:");
        System.out.println(aluno1.passou());

/////////////////////////////////////////////////////// -----QUESTÃO 4----- /////////////////////////////////////////////////////// 
        
        //Questão 4 - Instanciando um objeto Disciplina
        Disciplina d1 = new Disciplina();

        //Questão 4 - Instanciando os alunos
        Aluno a0 = new Aluno();
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        Aluno a8 = new Aluno();
        Aluno a9 = new Aluno();

        //Questão 4 - Adicionando os alunos no array alunos
        //de Disciplina
        d1.addAlunos(a0);
        d1.addAlunos(a1);
        d1.addAlunos(a2);
        d1.addAlunos(a3);
        d1.addAlunos(a4);
        d1.addAlunos(a5);
        d1.addAlunos(a6);
        d1.addAlunos(a7);
        d1.addAlunos(a8);
        d1.addAlunos(a9);
        
        //Questão 4 - Povoando os nomes
        a0.setNome("Hanna");
        a1.setNome("Marcos");
        a2.setNome("Antonio");
        a3.setNome("Gabriela");
        a4.setNome("Kaio");
        a5.setNome("Eduarda");
        a6.setNome("Felipe");
        a7.setNome("Thiago");
        a8.setNome("Julia");
        a9.setNome("Davi");

        System.out.println("\n");
        System.out.println("Resposta da questão 4:");
        //Questão 4 - Invocando a função que imprime
        //os nomes dos alunos da posição anterior e
        //da posição seguinte
        d1.imprimeSucEAnt(4);
    }
}
