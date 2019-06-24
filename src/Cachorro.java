public class Cachorro extends Mamifero{
    private boolean Latealto;
    
    public Cachorro(String n, int p, boolean LT){
    
        super(n, p);
        this.setLatealto(LT);
    }

    public boolean getLatealto() {
        return this.Latealto;
    }

    private void setLatealto(boolean LT) {
        this.Latealto = LT;
    }
    @Override
    public void talk(){
    
        System.out.println("Au");
    }  
}
