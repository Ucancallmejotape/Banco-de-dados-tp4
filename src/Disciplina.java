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
                break;
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
        if (posicao >= 0 && posicao <= 9) {
            if((posicao-1) >= 0 && alunos[posicao - 1] != null){
                System.out.print("Nome do aluno na posição " + (posicao - 1) + ", anterior ao aluno "
                + alunos[posicao].getNome() + ": " + alunos[posicao - 1].getNome() + "\n");
            } else {
                System.out.println("A posição do antecessor não está no limite do array!");
            }
            
            if(alunos[posicao + 1] != null){
                System.out.print("Nome do aluno na posição " + (posicao + 1) + ", seguinte ao aluno "
                + alunos[posicao].getNome() + ": " + alunos[posicao + 1].getNome() + "\n");
            } else {
                System.out.println("A posição do sucessor, não está no limite do array!");
            }
        }
    }
}