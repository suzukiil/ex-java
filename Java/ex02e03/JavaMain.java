package ex02e03;

public class JavaMain {

    public static void main(String[] args) {
        Quadrado quadrado=new Quadrado();
        quadrado.setA(5);
        quadrado.setB(8);

        System.out.println("_______________________________________________");
        System.out.println("Área do primerio quadrado = "+quadrado.getAreaA());
        System.out.println("Área do segundo quadrado = "+ quadrado.getAreaB());
        System.out.println("Diferença das Áreas = "+ quadrado.getAreasDif());
        System.out.println("_______________________________________________");

        Retangulo retangulo=new Retangulo();
        retangulo.setA(7);
        retangulo.setB(9);
        retangulo.setAB(15);
        retangulo.setBA(8);
        
        System.out.println("Área do primeiro retangulo = "+retangulo.getSomaAreaA());
        System.out.println("Área do segundo retangulo = "+retangulo.getSomaAreaB());  
        System.out.println("Diferença das Áreas = "+retangulo.getAreasDif());
        System.out.println("_______________________________________________");
        }
    }
    