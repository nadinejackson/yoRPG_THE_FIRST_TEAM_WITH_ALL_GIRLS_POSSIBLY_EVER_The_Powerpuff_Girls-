//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Nadine Jackson the Bold, T Fabiha, Soojin Choi
//APCS1 pd2
//HW28 -- Ye Olde Role Playing Game
//2017-11-08   
public class Protagonist extends Character{
    //Attributes
    //private String name;
    //private int HP;
    //private int strength;
    //private int defense;
    private int defenseStor;
    //private double attackRate;
    private double attackStor;
	
    //Constructors
    public Protagonist(){
	super("Pat", 100, 50, 50, 0.5);
        
    }
    public Protagonist (String newName){
	super(newName, 100, 50, 50, 0.5);
        }
	
    //Methods
    public void specialize(){
        setDefense((int)(getDefense() / 2));
	setAttackRate(getAttackRate() * 2);
    }
    public void normalize(){
	setDefense(defenseStor);
	setAttackRate(attackStor);
    }
    //start of main method
    public static void main(String [] args){
	System.out.println(" This works");
    }//end of the main method
}
