package transportsimulation;
public class Ellenor {
    String ellenorNev;
    int ellenorEgyenleg;

    public Ellenor(String ellenorNev, int ellenorEgyenleg) {
        this.ellenorNev = ellenorNev;
        this.ellenorEgyenleg = ellenorEgyenleg;
    }

    public String getEllenorNev() {
        return ellenorNev;
    }

    public int getEllenorEgyenleg() {
        return ellenorEgyenleg;
    }

    public void setEllenorNev(String ellenorNev) {
        this.ellenorNev = ellenorNev;
    }

    public void setEllenorEgyenleg(int ellenorEgyenleg) {
        this.ellenorEgyenleg = ellenorEgyenleg;
    }
    
    
}
