package transportsimulation;

import java.util.ArrayList;

public class KozlekedesiEszkoz {
    String tipus;
    int kapacitas;
    int jegyar;
    ArrayList<Utas> utasok = new ArrayList<>();
    ArrayList<Ellenor> ellenorok = new ArrayList<>();
    Jegy diak = new Jegy("Diák", 3000);
    Jegy felnott = new Jegy("Felnőtt", 3000);
    Jegy ismeretlen = new Jegy("xyz", 3000);
            

    public KozlekedesiEszkoz(String tipus, int kapacitas, int jegyar) {
        this.tipus = tipus;
        this.kapacitas = kapacitas;
        this.jegyar = jegyar;
    }

    public String Kapacitas(){
        String kapacitas = getTipus() + " kapacitása: " + getKapacitas();
        return kapacitas;
    }
    
    public String jegyEllenorzes(boolean isUtasVanJegye, int utasEgyenleg){
        String kimenet = "";
        for (int i = 0; i < utasok.size(); i++) {
            isUtasVanJegye = utasok.get(i).isUtasVanJegye();
            utasEgyenleg = utasok.get(i).getUtasEgyenleg();

            if (isUtasVanJegye == false) {
                utasEgyenleg -= 16000;
            }
            if (isUtasVanJegye == true) {
                isUtasVanJegye = false;
            }
            isUtasVanJegye = utasok.get(i).isUtasVanJegye();
            //utasEgyenleg = utasok.get(i).getUtasEgyenleg();
            System.out.println("Az " + utasok.get(i).utasNev + " utasnak az új egyenlege: " + utasEgyenleg);
            
        }

        return kimenet;
    }
    
    
    public void FelSzallUtas(Utas utas, String jegy){
        int kapacitas = getKapacitas();
        if (getKapacitas() == 0){
            System.out.println("Nincs elég hely a " + getTipus()+ "-on, " + utas.getUtasNev() + " nem tudott felszállni a " + getTipus() + "-ra");
        }
        else if (getKapacitas()>=1) {
            kapacitas--;
            setKapacitas(kapacitas);
            System.out.println(utas.utasNev + " felszáll a buszra");
            System.out.println("A " + getTipus()+ " új kapacitása: " + getKapacitas());
            utasok.add(utas);
        } 

    }
    public void FelSzallEllenor(Ellenor ellenor){
        int kapacitas = getKapacitas();
        if (getKapacitas() == 0){
            System.out.println("Nincs elég hely a " + getTipus()+ "-on, " + ellenor.getEllenorNev() + " nem tudott felszállni a " + getTipus() + "-ra");
        }
        else if (getKapacitas()>=1) {
            kapacitas--;
            setKapacitas(kapacitas);
            System.out.println("A " + getTipus()+ " új kapacitása: " + getKapacitas());
            ellenorok.add(ellenor);
        } 

    }

    public String getTipus() {
        return tipus;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public int getJegyar() {
        return jegyar;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setKapacitas(int kapacitas) {
        this.kapacitas = kapacitas;
    }

    public void setJegyar(int jegyar) {
        this.jegyar = jegyar;
    }
    
    
}
