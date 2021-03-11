public class Leurre extends Canard{
    public Leurre(){
        this.CompCanCan = new CancanMuet();
        this.CompVol = new NePasVoler();
    }
    @Override
    public void effectuerVol(ComportementVol CompVol) {
        this.CompVol = CompVol;
    }

    @Override
    public void effectuerCancan(ComportementCancan CompCancan) {
        this.CompCanCan = CompCancan;
    }

    @Override
    public  void afficher(){
        System.out.println("Leurre");
        CompVol.voler();
        CompCanCan.cancaner();
    }
}
