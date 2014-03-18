package Classes;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Ranking implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1495427580801884007L;
	private List<Gamer> ranking;

	public Ranking() {
		this.ranking = new ArrayList<Gamer>();
	}

	public void CheckRanking(String name, Integer score) {
		Gamer gam = new Gamer(name, score);

		this.ranking.add(gam);
		Collections.sort(ranking);
		if (this.ranking.size() > 5)this.ranking.remove(5);
	}
}