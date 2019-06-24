public abstract class Mamifero extends Animal{
 private int Patas;
    
    public Mamifero(String n, int p){
    
        super(n);
        this.setPatas(p);
    }
    public int getPatas(){
    
        return this.Patas;
    }
    private void setPatas(int p){
    
        this.Patas = p;
    }   
}
