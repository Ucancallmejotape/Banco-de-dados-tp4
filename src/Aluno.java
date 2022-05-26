public class Aluno {
    private String nome;
    private int id;
    private double media;
    
    protected double nota1;
    protected double nota2;
    
    void imprimeNome(String nome){
        System.out.println(nome);
    }
    
    void imprimeId(int id){
        System.out.println(id);
    }
    
    void alteraNome(String nome){
        setNome(nome);
    }
    
    void alteraId(int id){
        setId(id);
    }
    
    //Calcula a média e retorna o resultado
    private double calculaMedia(){
        this.setMedia((this.nota1 + this.nota2) / 2); 
        
        return getMedia();
    }
    
    //Retorna a média das notas
    double retornaMedia(){
        return calculaMedia();
    }

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