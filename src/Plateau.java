import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Plateau{
    private int nbLignes;
    private int nbColonnes;
    private int pourcentageDeBombes;
    private int nbBombes;
    private List<lePlateau> lesCases;

    public Plateau(int nbLignes, int nbColonnes, int pourcentageDeBombes){
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.pourcentageDeBombes = pourcentageDeBombes;
        this.nbBombes = 0;
    }

    private void creerLesCasesVides(){
        for (int x = 0; x < this.getNbLignes(); x++){
            for (int y = 0; y < this.getNbColonnes(); y++){
                ;
            }
        }
    }

    private void rendLesCasesIntelligentes(){
        for (int x = 0; x < this.getNbLignes(); x++){
            for (int y = 0; y < this.getNbColonnes(); y++){
                ;
            }
        }
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
