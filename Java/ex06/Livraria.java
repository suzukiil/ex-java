package ex06;

import java.util.Scanner;

public class Livraria {
    public static void main(String[] args) throws Exception {

        Book Livro = new Book();
        
        Author SthepanKing = new Author();
        Livro.setAuthor(SthepanKing);
        
        Publisher Panini = new Publisher();
        Livro.setPublisher(Panini);
        
        User Usuario = new User();

        Shipper Leitura = new Shipper();
        ShippingInfo infoLeitura = new ShippingInfo();
        infoLeitura.setShipper(Leitura);
        
        Account ContaUsuario = new Account();
        Usuario.setAccount(ContaUsuario);
        ContaUsuario.setId(123);
        ContaUsuario.setPassword("123");
        ContaUsuario.setEmailAddress("Usuario@yahoo.com.br");

        BillingInfo infoCompra = new BillingInfo();
        infoCompra.setAccount(ContaUsuario);

        Order PedidoUsuario = new Order();
        PedidoUsuario.setUser(Usuario);
        PedidoUsuario.setBook(Livro);
        PedidoUsuario.setShippingInfo(infoLeitura);
        PedidoUsuario.setBillingInfo(infoCompra);
        if(PedidoUsuario.isFullfilled())
        {
            Scanner scannerId;
            int id = 0;
            String psw = "";
            try {
                scannerId = new Scanner(System.in);
                System.out.println("Informa o seu id: ");
                id = scannerId.nextInt();
                System.out.println("informe a sua senha: ");
                psw = scannerId.next();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(PedidoUsuario.getBillingInfo().getAccount().validateLogin(id, psw))
            {
                System.out.println("Compra realizada com sucesso");
            }
        }
    }
}
