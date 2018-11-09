package transportsimulation;

public class TransportSimulation {

    public static void main(String[] args) {
        

        
        Utas Ancsi = new Utas("Ancsi", 20000, true);
        Utas Bela = new Utas("Béla", 20000, true);
        Utas Elod = new Utas("Előd", 20000, false);
        Ellenor Joska = new Ellenor("Jóska", 30000);
        Ellenor Aladar = new Ellenor("Aladár", 15000);
        Sofor Jean = new Sofor("Jean", 10000);
        KozlekedesiEszkoz busz = new KozlekedesiEszkoz("Busz", Jean);
        //Jegy diak = new Jegy("Diák", 3000/*, 0.0*/);
        //Jegy felnott = new Jegy("Felnőtt", 3000/*, 0.0*/);
        //System.out.println(diak.FizetendoJegyar());
        //System.out.println(felnott.FizetendoJegyar());
        //System.out.println(Ancsi.UtasVanJegye());
        busz.FelSzallUtas(Ancsi, "Diák");
        busz.FelSzallUtas(Bela, "Felnőtt");
        busz.FelSzallUtas(Elod, "Felnőtt");
        busz.FelSzallEllenor(Joska);
        System.out.println(busz.utasok);//kiiratás nem megfelelő
        System.out.println(busz.ellenorok);
        KozlekedesiEszkoz Vonat = new KozlekedesiEszkoz("Vonat", Jean);
        Vonat.FelSzallUtas(Ancsi, "Diák");
        Vonat.FelSzallUtas(Bela, "Felnőtt");
        Vonat.FelSzallUtas(Elod, "Ismerssadetlen");
        Vonat.FelSzallEllenor(Aladar);
    }
}