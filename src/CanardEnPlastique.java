public class CanardEnPlastique extends Canard{

    public CanardEnPlastique(){
        this.CompVol = new NePasVoler();
        this.CompCanCan = new CancanMuet();
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
        System.out.println("Canard en plastique");
        CompVol.voler();
        CompCanCan.cancaner();
    }
}
