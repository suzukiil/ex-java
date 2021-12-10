package ex02e03;

public class Retangulo {
    int a,b;
    int ab,ba;

    public void setA(int x){
            this.a=x;
    }
    public void setB(int x){
            this.b=x;
    }
    public void setAB(int x){
            this.ab=x;
    }
    public void setBA(int x){
            this.ba=x;
    }
    public int getSomaAreaA(){
        if(a<0 || b<0){
            return 0;
        }
        int area = a*b;
        return area;
    }
    public int getSomaAreaB(){
        if(a<0 || b<0){
            return 0;
        }
        int area1 = ab*ba;
        return area1;
    }
    public int getAreasDif(){
        int area1 = a*b;
        int area2 = ab*ba;
        int dif = Math.abs(area1 - area2);
        return dif;
    }
}