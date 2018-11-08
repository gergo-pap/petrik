package transportsimulation;

public class TransportSimulation {

    public static void main(String[] args) {
        

        KozlekedesiEszkoz busz = new KozlekedesiEszkoz("busz", 4, 450);
        Utas Ancsi = new Utas("Ancsi", 20000, false);
        Utas Béla = new Utas("Béla", 5000, false);
        Utas Előd = new Utas("Előd", 500, true);
        Ellenor Jóska = new Ellenor("Jóska", 30000);
        Sofor Jean = new Sofor("Jean", 10000);
        Jegy diak = new Jegy("Diák", 3000);
        Jegy felnott = new Jegy("DASD", 3000);
        System.out.println(diak.FizetendoJegyar());
        System.out.println(felnott.FizetendoJegyar());
        System.out.println(Ancsi.UtasVanJegye());
        System.out.println(busz.Kapacitas());
        busz.FelSzallUtas(Ancsi, "Diák");
        busz.FelSzallUtas(Béla, "Felnőtt");
        busz.FelSzallEllenor(Jóska);
        System.out.println(busz.utasok);//kiiratás nem megfelelő
        System.out.println(busz.ellenorok);
        //busz.jegyEllenorzes(Béla.isUtasVanJegye(), Béla.setUtasVanJegye(true), Béla.setUtasEgyenleg(utasEgyenleg));
        busz.FelSzallUtas(Előd, "elírtam");
        System.out.println(busz.jegyEllenorzes(true, 9999));
    }
}