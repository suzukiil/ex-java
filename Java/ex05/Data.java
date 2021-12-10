package ex05;

public class Data {
   
    public class DataDrivenPessoa {

        public static void main(String[] args) {
           Pessoa pessoa1=new Pessoa();
           pessoa1.setNome("Thyago");
           pessoa1.setRua("Rua das Margaridas");
           pessoa1.setIdade(21);
           pessoa1.setMatriculado(false);
           
           Pessoa pessoa2=new Pessoa();
           pessoa2.setNome("Gabriel");
           pessoa2.setRua("Rua dos Manguezais");
           pessoa2.setIdade(123);
           pessoa2.setMatriculado(true);
           
           Pessoa pessoa3=new Pessoa();
           pessoa3.setNome("Pedro");
           pessoa3.setRua("Rua dos Pedreiros");
           pessoa3.setIdade(8);
           pessoa3.setMatriculado(true);
           
           CadastrarPessoa cadastrar=new CadastrarPessoa();
           cadastrar.cadastrar(pessoa1);
           cadastrar.cadastrar(pessoa2);
           cadastrar.cadastrar(pessoa3);
           cadastrar.pessoaShow();
        }
    }
}
    