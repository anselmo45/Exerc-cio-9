public class Vaca extends Mamifero{
 private boolean TemLeite;
    
    public Vaca(String n, int p, boolean TL){
        super( n, p );
        this.setTemLeite(TL);
    }

    public boolean getTemLeite() {
        return this.TemLeite;
    }

    private void setTemLeite(boolean TL) {
        this.TemLeite = TL;
    }

    @Override
    public void talk(){
    
        System.out.println("Malhada");
    }   
}
