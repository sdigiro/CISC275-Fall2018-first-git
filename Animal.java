import java.util.Comparator;

public class Animal implements Comparator<Animal>{

	public int legs;
	
	public int getLegs() {
		return this.legs;
	}

	@Override
	public int compare(Animal a1, Animal a2) {
		return a1.getLegs() - a2.getLegs();
	}
	
}
