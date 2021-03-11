public class Mandarin extends Canard{

    public Mandarin(){
        this.CompCanCan = new Cancan();
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
        System.out.println("Mandarin");
        CompVol.voler();
        CompCanCan.cancaner();
    }
}
