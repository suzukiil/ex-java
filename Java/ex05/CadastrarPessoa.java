package ex05;

import java.util.ArrayList;
import java.util.List;

public class CadastrarPessoa {

    List<Pessoa> cadastro=new ArrayList<>();
    //lista com arrays
    
    
    public void cadastrar(Pessoa pessoa){
        cadastro.add(pessoa);
    }
    
    public void pessoaShow(){
        for(int i=0;i<cadastro.size();i++){
            System.out.println("______________________________\n");
            System.out.println("Nome:"+cadastro.get(i).getNome());
            System.out.println("Endereço:"+cadastro.get(i).getRua());
            System.out.println("Idade:"+cadastro.get(i).getIdade());
            System.out.println("Está matriculado:"+cadastro.get(i).getMatriculado()+"\n");
        }
    }
}