//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Nadine Jackson the Bold, T Fabiha, Soojin Choi
//APCS1 pd2
//HW32 -- Ye Olde Role Playing Game, Unchained
//2017-11-14
public class Mafia extends Protagonist {
    
    public Mafia() {
        super();
	strength += 25;
    }

    public Mafia(String newName) {
	this();
	name = newName;
    }
    public void specialize(){
	defense = defense / 2;
	attackRate = attackRate * 2;
	//setDefense((int)(getDefense() / 2));
	//setAttackRate(getAttackRate() * 2);
    }
    public void normalize(){
	defense = defenseStor;
	attackRate = attackStor;
	//setDefense(defenseStor);
	//setAttackRate(attackStor);
    }
    public String about() {
	return "The Mafia is cruel and unrelenting in every battle he/she faces. No one can escape the Mafia's grasp. The Mafia is prone to strike at night, when no one is around to hear their victims' screams. The Mafia can employ a wide range of bloody methods to attacc his/her victims, including stabbing them to death with a butter knife, one stab at a time, while the victim is tied to a chair with a pair of scissors kept just out of arm's reach. Bloodcurdling screams are the primary motivation of this beloved protagonist.";
    }
 
    public static void main(String[] args) {
	//System.out.println(about());
    }
}
