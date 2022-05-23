package main;
public class TorepdoTeszt {
    public static void main(String[] args) {
        System.out.println("Ez egy sikeres teszt!");
        //assert 3==5 : "Tesó! Nem jó a találat ellenőrzése!";
        new TorepdoTeszt().tesztLoves(4);
        
    }
    
    
    public String tesztLoves(int poz){
        Hajo hajo = new Hajo();
        String loves = hajo.talalat(poz);
        assert loves.equals("talált"): "Nem jó a találat ellenőrzése";
        return loves;
    }
}
