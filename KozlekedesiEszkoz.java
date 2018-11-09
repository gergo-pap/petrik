package transportsimulation;

import java.util.ArrayList;

public class KozlekedesiEszkoz {
    String tipus;
    int kapacitas;
    int jegyar;
    ArrayList<Utas> utasok = new ArrayList<>();
    ArrayList<Ellenor> ellenorok = new ArrayList<>();
    boolean isUtasVanJegye;        
    int utasEgyenleg;
    
    public KozlekedesiEszkoz(String tipus, Sofor sofor) {
        this.tipus = tipus;
        this.kapacitas = kapacitas;
        if (getTipus() == "Busz") {
            setKapacitas(50);
        }
        else if (getTipus() == "Vonat"){
            setKapacitas(200);
        }
        System.out.println(getTipus()+ " " + getKapacitas() + " kapacitással létrejött");
    }

    public String Kapacitas(){
        String kapacitas = getTipus() + " kapacitása: " + getKapacitas();
        return kapacitas;
    }
    
    public String jegyEllenorzes(){
        String kimenet = "";
        if(getTipus()!= "Vonat"){
        for (int i = 0; i < utasok.size(); i++) {
            Utas utas = utasok.get(i);
            isUtasVanJegye = utasok.get(i).isUtasVanJegye();
            utasEgyenleg = utasok.get(i).getUtasEgyenleg();

            if (isUtasVanJegye == false) {
                System.out.println("Az utasnak ( "+ utas.getUtasNev()+ ") nem volt jegye, ezért meg lett büntetve és le lett szállítva a " + getTipus() + "-ról" );
                
                utasEgyenleg -= 16000;
                System.out.println("A(z) " + utasok.get(i).utasNev + " utasnak az új egyenlege: " + utasEgyenleg);
                utasok.remove(utas);
                kapacitas++;
                System.out.println("A " + getTipus()+ " új kapacitása: " + getKapacitas());
                
            }
            if (isUtasVanJegye == true) {
                isUtasVanJegye = false;
            }
            //isUtasVanJegye = utasok.get(i).isUtasVanJegye();
            utasEgyenleg = utasok.get(i).getUtasEgyenleg();
            //System.out.println("A(z) " + utasok.get(i).utasNev + " utasnak az új egyenlege: " + utasEgyenleg);
            utasok.get(i).setUtasEgyenleg(utasEgyenleg);
            
        }
        }
        else {};
       
        return kimenet;
    }
    
    
    public void FelSzallUtas(Utas utas, String jegy){
        int kapacitas = getKapacitas();
        String kozlekedeiEszkoz = getTipus();
        if (getKapacitas() == 0){
            System.out.println("Nincs elég hely a " + getTipus()+ "-on, " + utas.getUtasNev() + " nem tudott felszállni a " + getTipus() + "-ra");
        }
        else if (getKapacitas()>=1) {
            kapacitas--;
            setKapacitas(kapacitas);
            System.out.println(utas.utasNev + " felszáll a "  + getTipus() + "-ra");
            System.out.println("A " + getTipus()+ " új kapacitása: " + getKapacitas());
            utasok.add(utas);
            if (kozlekedeiEszkoz == "vonat" || kozlekedeiEszkoz == "Vonat") {
                if (jegy == "Diák" && utas.getUtasEgyenleg()> 0) {
                    
                    jegyar = 500;
                    System.out.println("Sikeres diákjegy jegyvásárlás");
                    utas.setUtasEgyenleg(utas.getUtasEgyenleg()- jegyar);
                    System.out.println("A(z) " + utas.getUtasNev()+  " utasnak az új egyenlege: " + utas.getUtasEgyenleg());
                }
                else if (jegy == "Felnőtt" && utas.getUtasEgyenleg()> 0){
                    jegyar = 1000;
                    System.out.println("Sikeres felnőttjegy jegyvásárlás");
                    utas.setUtasEgyenleg(utas.getUtasEgyenleg()- jegyar);
                    System.out.println("A(z) " + utas.getUtasNev() + " utasnak az új egyenlege: " + utas.getUtasEgyenleg());
                }
                else {
                    jegyar = 1000;
                    System.out.println("Ismeretlen jegytípus miatt teljes érétű jegyárral számolva");
                    utas.setUtasEgyenleg(utas.getUtasEgyenleg()- jegyar);
                    System.out.println("A(z) " + utas.getUtasNev() + " utasnak az új egyenlege: " + utas.getUtasEgyenleg());
                }
                if(utas.getUtasEgyenleg()<=0){
                    System.out.println("Az utasnak ( " + utas.getUtasNev() + "+)nics elég pénze jegyet vásárolni ezért nem tudott felszállni a " + getTipus()+ "-ra");
                }
            }


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
            System.out.println(ellenor.ellenorNev + "(ellenőr)" + " felszáll a "  + getTipus() + "-ra");
            System.out.println("A " + getTipus()+ " új kapacitása: " + getKapacitas());
            ellenorok.add(ellenor);
        } 
        jegyEllenorzes();
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
