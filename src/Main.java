//Dev: João Pedro Pereira Lima 
//Matrícula: 508153

public class Main {
    public static void main(String[] args) throws Exception {

/////////////////////////////////////////////////////// -----QUESTÃO 2----- /////////////////////////////////////////////////////// 

        //Questão 2 - Item A
        Aluno aluno1 = new Aluno();
        
        //Questão 2 - Item B
        aluno1.setNome("João");
        
        //Questão 2 - Item C
        aluno1.setId(1);

        //Questão 2 - Item D
        aluno1.nota1 = 3.5;
        aluno1.nota2 = 6.5;

        //Questão 2 - Item E
        System.out.println("Resposta da questão 2 - item E:");
        System.out.println(aluno1.retornaMedia());

        //Questão 2 - Item F
        System.out.println("Resposta da questão 2 - item F:");
        if(aluno1.passou() == true){
            System.out.println("Passou");
        } else {
            System.out.println("Não passou");
        }

/////////////////////////////////////////////////////// -----QUESTÃO 3----- /////////////////////////////////////////////////////// 
        
        //Questão 3 - Instanciando um objeto Disciplina
        Disciplina turmaCK0084 = new Disciplina();

        //Questão 3 - Instanciando os alunos
        Aluno aluno2 = new Aluno("João", 2, 5.0, 10.0);
        Aluno aluno3 = new Aluno("Ana", 3, 6.0, 8.5);

        //Questão 3 - Adicionando os alunos no array alunos
        //de Disciplina
        turmaCK0084.adicionaAluno(aluno1, 0);
        turmaCK0084.adicionaAluno(aluno2, 1);
        turmaCK0084.adicionaAluno(aluno3, 2);

        //Questão 3 - Imprimindo a média das notas 1
        System.out.println("Média da nota 1 da turma: " + turmaCK0084.mediaNota1());

        //Questão 3 - Removendo o aluno1
        turmaCK0084.removeAluno(1);

        //Questão 3 - Imprimindo a média das nota 2
        System.out.println("Média da nota 2 da turma: " + turmaCK0084.mediaNota2());

        turmaCK0084.adicionaAluno(aluno1, 0);

/////////////////////////////////////////////////////// -----QUESTÃO 4----- /////////////////////////////////////////////////////// 

        System.out.println("\n");
        System.out.println("Resposta da questão 4:");
        //Questão 4 - Invocando a função que imprime os nomes dos 
        //alunos da posição anterior e da posição seguinte
        turmaCK0084.imprimeAlunosPróximos(0);
        turmaCK0084.imprimeAlunosPróximos(1);
        turmaCK0084.imprimeAlunosPróximos(2);     
    }
}