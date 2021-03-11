public class App {
    public static void main(String [] args){
        Canard CPlastique = new CanardEnPlastique();
        CPlastique.afficher();

        Canard CColvert =  new Colvert();
        CColvert.afficher();

        CColvert.effectuerCancan(new CancanMuet());
        CColvert.afficher();
    }
}
