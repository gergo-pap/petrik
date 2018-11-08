package transportsimulation;

public class Utas {
    String utasNev;
    int utasEgyenleg;
    boolean utasVanJegye;

    public Utas(String utasNev, int utasEgyenleg, boolean isUtasVanJegye) {
        this.utasNev = utasNev;
        this.utasEgyenleg = utasEgyenleg;
        this.utasVanJegye = isUtasVanJegye;
    }

    
    
    public String getUtasNev() {
        return utasNev;
    }

    public int getUtasEgyenleg() {
        return utasEgyenleg;
    }

    public boolean isUtasVanJegye() {
        return utasVanJegye;
    }

    public void setUtasNev(String utasNev) {
        this.utasNev = utasNev;
    }

    public void setUtasEgyenleg(int utasEgyenleg) {
        this.utasEgyenleg = utasEgyenleg;
    }

    public String UtasVanJegye() {
        
        String vanE;
        if (utasVanJegye) {
            vanE = "Van jegye ";
        }else vanE = "Nincs jegye a(z) ";
        return vanE +  getUtasNev() + " nevű utasnak";
    }

    public void setUtasVanJegye(boolean utasVanJegye) {
        this.utasVanJegye = utasVanJegye;
    }





    

    
    
    

    
    
}
