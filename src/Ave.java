
public abstract class Ave extends Animal {
     private boolean Voa;
    
    public Ave(String n, boolean v){
    
        super(n);
        this.setVoa(v);
    }
    public boolean getVoa(){
    
        return this.Voa;
    }
    private void setVoa(boolean v){
  
        this.Voa = v;
    }
     @Override
    public void talk(){
    
        System.out.println("Piu-Piu");
    }
}
    

