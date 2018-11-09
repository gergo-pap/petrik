package transportsimulation;

public class TransportSimulation {

    public static void main(String[] args) {
        

        KozlekedesiEszkoz busz = new KozlekedesiEszkoz("busz", 5, 450);
        Utas Ancsi = new Utas("Ancsi", 3000, false);
        Utas Béla = new Utas("Béla", 2000, false);
        Utas Előd = new Utas("Előd", 500, true);
        Ellenor Jóska = new Ellenor("Jóska", 30000);
        Sofor Jean = new Sofor("Jean", 10000);
        Jegy diak = new Jegy("Diák", 3000);
        Jegy felnott = new Jegy("DASD", 3000);
        System.out.println(diak.FizetendoJegyar());
        System.out.println(felnott.FizetendoJegyar());
        System.out.println(Ancsi.UtasVanJegye());
        System.out.println(busz.Kapacitas());
        System.out.println("Ancsi felszáll a buszra");
        busz.FelSzallUtas(Ancsi);
        System.out.println("Béla felszáll a buszra");
        busz.FelSzallUtas(Béla);

        System.out.println("Jóska(ellenőr) felszáll a buszra");
        busz.FelSzallEllenor(Jóska);
        System.out.println(busz.utasok);//kiiratás nem megfelelő
        System.out.println(busz.ellenorok);
        //busz.jegyEllenorzes(Béla.isUtasVanJegye(), Béla.setUtasVanJegye(true), Béla.setUtasEgyenleg(utasEgyenleg));
        busz.FelSzallUtas(Előd);
        System.out.println("Ancsi egyenlege: " + Ancsi.getUtasEgyenleg());
        System.out.println(busz.jegyEllenorzes(true, 9999));
    }
}