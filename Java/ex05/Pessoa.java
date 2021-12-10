package ex05;

public class Pessoa {
    private String nome;                 
    private String rua; 
    private int idade;
    private boolean matriculado;
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome(){
        return nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua=rua;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade=idade;
    }
    public void setMatriculado(boolean matriculado){
        this.matriculado=matriculado;
    }
    public boolean getMatriculado(){
        return matriculado;
    }
}
