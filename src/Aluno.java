public class Aluno {

    //Questão 1 - Atributos private
    private String nome;
    private int id;
    private double media;
    
    //Questão 1 - Atributos protected
    protected double nota1;
    protected double nota2;

    public Aluno(){

    }

    public Aluno(String nome, int id, double nota1, double nota2) {
        setNome(nome);
        setId(id);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    void imprimeNome(String nome){
        System.out.println(nome);
    }
    
    void imprimeId(int id){
        System.out.println(id);
    }
  
    //Calcula a média e retorna o resultado
    private double calculaMedia(){
        this.setMedia((this.nota1 + this.nota2) / 2); 
        
        return getMedia();
    }
    
    //Função que retorna a média das notas
    public double retornaMedia(){
        return calculaMedia();
    }

    //Função que retorna true, se a média for maior ou igual a 7
    //e retorna false se a média for menor que 7
    boolean passou(){
        if(getMedia() >= 7){
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public double getMedia() {
        return media;
    }
    
    public void setMedia(double media) {
        this.media = media;
    }
}