package main;
public class TorepdoTeszt {
    public static void main(String[] args) {
        System.out.println("Ez egy sikeres teszt!");
        //assert 3==5 : "Tesó! Nem jó a találat ellenőrzése!";
        new TorepdoTeszt().tesztLovesTalalat(4);
        
    }
    
    
    public String tesztLovesTalalat(int poz){
        Hajo hajo = new Hajo(new int[] {2,3,4});
        String loves = hajo.talalat(poz);
        assert loves.equals("talált"): "Nem jó a találat ellenőrzése";
        return "";
    }
}
