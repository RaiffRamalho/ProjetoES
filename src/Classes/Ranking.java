package Classes;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ranking implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1495427580801884007L;
	private SortedSet<Gamer> ranking;

	public Ranking() {
		this.ranking = new TreeSet<Gamer>();
	}

	public void CheckRanking(String name, Integer score) {
		Gamer gam = new Gamer(name, score);
		if(this.ranking.contains(gam)){
			this.ranking.remove(gam);
		}
		this.ranking.add(gam);			
		if(this.ranking.size() > 5){
			this.ranking.remove(this.ranking.last());
		}
	}
}
