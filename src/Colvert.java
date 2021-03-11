public class Colvert extends Canard{

    public Colvert(){
        this.CompCanCan = new Cancan();
        this.CompVol = new VolerAvecDesAiles();
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
        System.out.println("Colvert");
        CompVol.voler();
        CompCanCan.cancaner();
    }

}
