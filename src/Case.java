public class Case {
    private boolean contientUneBombe;
    private boolean estDecouverte;
    private boolean estMarquee;
    
    public Case() {
        this.contientUneBombe = false;
        this.estDecouverte = false;
        this.estMarquee = false;
    }

    public void reset(){
        this.contientUneBombe = false;
        this.estDecouverte = false;
        this.estMarquee = false;
    }

    public void poseBombe(){
        this.contientUneBombe = true;
    }

    public contientUneBombe(){
        return this.contientUneBombe;
    }

    public boolean estDecouverte(){
        return this.estDecouverte;
    }

    public boolean estMarquee(){
        return this.estMarquee;
    }

    public reveler(){
        this.estMarquee = true;
    }

    public marquer(){
        this.estMarquee = true;
    }
}
