package transportsimulation;
public class Sofor {
    
    String soforNev;
    int soforEgyenleg;

    public Sofor(String soforNev, int soforEgyenleg) {
        this.soforNev = soforNev;
        this.soforEgyenleg = soforEgyenleg;
    }

    public String getSoforNev() {
        return soforNev;
    }

    public int getSoforEgyenleg() {
        return soforEgyenleg;
    }

    public void setSoforNev(String soforNev) {
        this.soforNev = soforNev;
    }

    public void setSoforEgyenleg(int soforEgyenleg) {
        this.soforEgyenleg = soforEgyenleg;
    }
    
    
}
