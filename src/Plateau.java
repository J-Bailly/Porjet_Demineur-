import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Plateau{
    protected int nbLignes;
    protected int nbColonnes;
    protected int pourcentageDeBombes;
    protected int nbBombes;
    protected CaseIntelligente[][] plateau;

    public Plateau(int nbLignes, int nbColonnes, int pourcentageDeBombes){
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.pourcentageDeBombes = pourcentageDeBombes;
        this.nbBombes = 0;
    }

    private void creerLesCasesVides(){
        plateau = new CaseIntelligente[nbLignes][nbColonnes];
        for (int x = 0; x < this.getNbLignes(); x++){
            for (int y = 0; y < this.getNbColonnes(); y++){
                plateau[x][y] = new CaseIntelligente();
            }
        }
        rendLesCasesIntelligentes();
    }

    private void rendLesCasesIntelligentes(){
        for (int x = 0; x < this.getNbLignes(); x++){
            for (int y = 0; y < this.getNbColonnes(); y++){
                for (int dx = -1; dx <= 1; dx++){
                    for (int dy = -1; dy <= 1; dy++){
                        try{
                            plateau[x][y].ajouteVoisine(plateau[x+dx][y+dy]);
                        } catch (ArrayIndexOutOfBoundsException ignored){}
                    }
                }
            }
        }
    }

    public int getNbLignes(){
        return this.nbLignes;
    }

    public int getNbColonnes(){
        return this.nbColonnes;
    }

    public int getNbTotalBombes(){
        return this.nbBombes;
    }

    public CaseIntelligente getCase(int numLigne, int numColonne){
        return this.lePlateau.get(numLigne).get(numColonne);
    }
    
    public int getCaseMarquees(){
        int nbMarquees = 0;
        for (int x = 0; x < this.getNbLignes(); x++){
            for (int y = 0; y < this.getNbColonnes(); y++){
                if (this.getCase(x, y).estMarquee()){
                    nbMarquees = nbMarquees + 1;
                }
            }
        }
        return nbMarquees;
    }

    public void poseBombe(int x, int y){    
    }

    protected void poseDesBombesAleatoirement(){
        Random generateur = new Random();
        for (int x = 0; x < this.getNbLignes(); x++){
            for (int y = 0; y < this.getNbColonnes(); y++){
                if (generateur.nextInt(100)+1 < this.pourcentageDeBombes){
                    this.poseBombe(x, y);
                    this.nbBombes = this.nbBombes + 1;
                }
            }
        }
    }


}
