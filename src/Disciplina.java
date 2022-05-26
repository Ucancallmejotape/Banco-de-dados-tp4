public class Disciplina {
    Aluno alunos[] = new Aluno[10];

    // Adiciona aluno no array alunos
    void adicionaAluno(Aluno aluno, int pos) {
        if (pos >= 0 && pos <= 10) {
            alunos[pos] = aluno;
        } else {
            System.out.print("Adicione o aluno em uma posição válida do array");
        }
    }

    void removeAluno(int idAluno) {
        for (int i = 0; i < 10; i++) {
            if(alunos[i].getId() == idAluno){
                alunos[i] = null;
            }
        }
    }

    double mediaNota1() {
        double somaDasNotas = 0;
        double media;
        for (int i = 0; i < 10; i++) {
            if(alunos[i] != null){
                somaDasNotas += alunos[i].nota1;
            }
        }

        media = somaDasNotas / 10;
        return media;
    }

    double mediaNota2() {
        double somaDasNotas = 0;
        double media;
        for (int i = 0; i < 10; i++) {
            if(alunos[i] != null){
                somaDasNotas += alunos[i].nota2;
            }
        }

        media = somaDasNotas / 10;
        return media;
    }

    public void imprimeAlunosPróximos(int posicao) {
        if (posicao >= 1 && posicao <= 8) {
            System.out.print("Nome do aluno na posição " + (posicao - 1) + ", anterior ao aluno "
                    + alunos[posicao].getNome() + ": " + alunos[posicao - 1].getNome() + "\n");
            System.out.print("Nome do aluno na posição " + (posicao + 1) + ", seguinte ao aluno "
                    + alunos[posicao].getNome() + ": " + alunos[posicao + 1].getNome() + "\n");
        } else {
            System.out.println("A posição do antecessor, ou do sucessor, não estão no limite do array!");
        }
    }

    public static void main(String[] args) {
        // Instanciando um objeto Disciplina
        Disciplina d1 = new Disciplina();

        // Instanciando os alunos
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

        // Adicionando os alunos no array alunos
        // de Disciplina
        d1.adicionaAluno(a0, 0);
        d1.adicionaAluno(a1, 1);
        d1.adicionaAluno(a2, 2);
        d1.adicionaAluno(a3, 3);
        d1.adicionaAluno(a4, 4);
        d1.adicionaAluno(a5, 5);
        d1.adicionaAluno(a6, 6);
        d1.adicionaAluno(a7, 7);
        d1.adicionaAluno(a8, 8);
        d1.adicionaAluno(a9, 9);

        // Povoando as notas
        a0.nota1 = 1;
        a1.nota1 = 5;
        a2.nota1 = 4;
        a3.nota1 = 6;
        a4.nota1 = 10;
        a5.nota1 = 2;
        a6.nota1 = 4;
        a7.nota1 = 7;
        a8.nota1 = 3;
        a9.nota1 = 8;

        a0.nota2 = 7;
        a1.nota2 = 7;
        a2.nota2 = 7;
        a3.nota2 = 7;
        a4.nota2 = 10;
        a5.nota2 = 7;
        a6.nota2 = 7;
        a7.nota2 = 7;
        a8.nota2 = 7;
        a9.nota2 = 7;

        // For que percorre e imprime as nota1 dos alunos do array alunos
        // da Disciplina d1
        for (int i = 0; i < 10; i++) {
            System.out.println("Nota 1 do aluno " + i + ": " + d1.alunos[i].nota1);
        }

        System.out.print("\n");

        // For que percorre e imprime as nota2 dos alunos do array alunos
        // da Disciplina d1
        for (int i = 0; i < 10; i++) {
            System.out.println("Nota 2 do aluno " + i + ": " + d1.alunos[i].nota2);
        }

        System.out.print("\n");

        // Imprime a média da nota1 e da nota2
        System.out.println("Média da nota 1 da turma: " + d1.mediaNota1());
        System.out.println("Média da nota 2 da turma: " + d1.mediaNota2());
    }
}
