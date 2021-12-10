package ex02e03;

public class Quadrado {
    int a;
    int b;
    
    
    public void setA(int x){
            this.a=x;
    }
    public void setB(int x){
        this.b=x;
    }
    
    
    public int getAreaA(){
        if(a<0){
            return 0;
        }
        int area = a*a;
        return area;
    }
    public int getAreaB(){
        if(b<0){
            return 0;
        }
        int area = b*b;
        return area;
    }
    public int getAreasDif(){
        int area1 = a*a;
        int area2 = b*b;
        int Dif = Math.abs(area1 - area2);
        return Dif;
    }

}