package transportsimulation;
public class Jegy {
    
    String jegyTipus;
    double jegyAr;

    public double JegyArSzorzo(){
        double szorzo = 1.00;
        if (getJegyTipus() == "Felnőtt") {
            System.out.println("Felnőtt");
            szorzo = 1.00;
        }
        if (getJegyTipus() == "Diák") {
            System.out.println("Diak");
            szorzo = 0.5;
        }
        else
        {
            System.out.println("Érvénytelen jegytípus! Teljes áru jeggyel számolok");
            setJegyTipus("ISMERETLEN");
        }
        return szorzo;
    }
    
    public String FizetendoJegyar(){
        jegyAr = getJegyAr()*JegyArSzorzo();
        String FizetendoJegyar = jegyAr + " Ft-ot kell fizetni a(z) " + getJegyTipus() + " jegyért";
        return FizetendoJegyar;
    }
    
    
    
    
    public Jegy(String jegyTipus, int jegyAr) {
        this.jegyTipus = jegyTipus;
        this.jegyAr = jegyAr;
        
    }

    public String getJegyTipus() {
        return jegyTipus;
    }

    public double getJegyAr() {
        return jegyAr;
    }

    public void setJegyTipus(String jegyTipus) {
        this.jegyTipus = jegyTipus;
    }

    public void setJegyAr(int jegyAr) {
        this.jegyAr = jegyAr;
    }
    
    
}
