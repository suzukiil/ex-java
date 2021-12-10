package ex01;
 public class JardimDeFlores{
    public static void main(String[] args) {
        
        Petala petala=new Petala();
        petala.setCorPetala("Rosa");

        Flor Rosa=new Flor();
        Rosa.setPetala(petala);

        Jardim jardim=new Jardim();
        jardim.setFlor(Rosa);
         
        Praca PracaFlores=new Praca();
        PracaFlores.setJardim(jardim);

        System.out.println("_________________________________________________");
        System.out.println("Usando a dependencia para chamar a cor da petala.");
        System.out.println("Cor:"+PracaFlores.getJardim().getFlor().getPetala().getCorPetala());
    }
}