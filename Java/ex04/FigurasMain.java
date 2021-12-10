package ex04;

public class FigurasMain {

    public static void main(String[] args) {
        
        Figura1 quadrado=new Figura1();
        quadrado.draw();
        
        Figura2 triangulo=new Figura2();
        triangulo.draw();

        Desenha(quadrado);
        Desenha(triangulo);
    }
    
    public static void Desenha(Figuras figura){
        figura.drawFigura();
    }
}
        
        
        
        
        
        
        
        
        
        


       /*Figura fig1=new Figura();
        fig1.setNomeFigura("Circulo");
        
        Figura fig2=new Figura();
        fig2.setNomeFigura("Quadrado");
        
        Figura fig3=new Figura();
        fig3.setNomeFigura("Triangulo");
        
        Figura fig4=new Figura();
        fig4.setNomeFigura("Retângulo");
        
        Parede p1=new Parede();
        p1.setParede(fig4);
       
        
        System.out.println("Figura 1: "+fig1.getNomeFigura());
        System.out.println("Figura 2: "+fig2.getNomeFigura());
        System.out.println("Figura 3: "+fig3.getNomeFigura());
        System.out.println("Figura 4: "+fig4.getNomeFigura());
        
        System.out.println("Paredes formadas por "+p1.getParede().getNomeFigura());*/
    
    

