import java.util.ArrayList;
import java.util.List;

public class CaseIntelligente {
    private List<Case> lesVoisines;

    public CaseIntelligente() {
        this.lesVoisines = new ArrayList<Case>();
    }
    public void ajouteVoisines(Case lesVoisines) { 
        for (int x = 0; x < this.getNbLignes(); x++){
            for (int y = 0; y < this.getNbColonnes(); y++){
                if(y-1 % this.getNbColonnes() == 0) {
                    
            }
    }
}
