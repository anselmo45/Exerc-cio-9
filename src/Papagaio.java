public class Papagaio extends Ave{
    private String Frase;
    
    public Papagaio(String n, boolean v, String F){
    
        super(n, v);
        this.setFrase(F);
    }

    public String getFrase() {
        return Frase;
    }

    private void setFrase(String F) {
        this.Frase = F;
    }

    @Override
    public void talk(){
    
        System.out.println(this.Frase);
    }
}
