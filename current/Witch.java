//THE FIRST TEAM WITH ALL GIRLS POSSIBLY EVER (The Powerpuff Girls) -- Nadine Jackson the Bold, T Fabiha, Soojin Choi
//APCS1 pd2
//HW33 -- Ye Olde Role Playing Game, Realized
//2017-11-15

public class Witch extends Protagonist{

    public Witch(){
	super();
	defense += 25;
    }

    public Witch(String newName){
	this();
	name = newName;
    }
    public void specialize(){
	setDefense((int)(getDefense() / 2));
	setAttackRate(getAttackRate() * 2);
    }
    public void specialAttack(){
	attackRate = attackRate * 1.5;
	defense = defense * 2 + 10;// specialize in defense.
    }
    public void normalize(){
	defense = defenseStor;
	attackRate = attackStor;
    }
    public String about(){
	return "She was hanged for her crimes of \"existing\" and \"being annoying\", but she somehow managed to survive. She talks to herself and animals, and she says she's never been happier, attributing her power to those who tried to kill her. When asked if she felt bad about worshipping the devil for her power, she claimed that Earth during her trials was already Hell enough for her.";
    }

    public static void main(String [] args){
    }
}
