public class Aluno {

    private String Nome;

    private Double P1,P2,Media;

    public Aluno(){

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public Double getP1() {
        return P1;
    }

    public void setP1(Double p1) {
        this.P1 = p1;
    }

    public Double getP2() {
        return P2;
    }

    public void setP2(Double p2) {
        this.P2 = p2;
    }

    public Double getMedia() {
        this.Media = (this.P1 + this.P2)/2;
        return Media;
    }

    
}
