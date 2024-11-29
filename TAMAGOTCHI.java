public class taamagochi {
	

    private int hunger;
    private int energy;
    private int mood;
    
    
    
    
    public taamagochi() {
        this.hunger=4;
        this.energy=4;
        this.mood=4;
    }

    public String play(){
        hunger++;
        energy--;
        mood++;
        
        return getState();
        
        
    }
    
    public String eat() {
        hunger--;
        hunger--;
        energy--;
        return getState();
        
    }
    
    public String sleep() {
        energy++;
        energy++;
        
        return getState();
    }
    
    
public String getState() {
    if (energy == 0) {
        return "(-_-) zZZ";
    }else if (mood>8) {
        return ":-)";
    }else if(mood<2) {
        return "ఠ_ఠ";
    }else if (energy<2) {
        return "(-_-)";
    }else {
        return ":-|";
    }
        
        
    }
}
