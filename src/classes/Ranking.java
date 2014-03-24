package classes;

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
	private static Ranking instance = null;

	public Ranking() {
		this.ranking = new ArrayList<Gamer>();
	}

	public static Ranking getInstance() {
		if (instance == null) {
			instance = new Ranking();
		}
		return instance;
	}

	public void CheckRanking(String name, Integer score) {
		Gamer gam = new Gamer(name, score);

		this.ranking.add(gam);
		Collections.sort(ranking);
		if (ranking.size() >= 5) {
			this.ranking.remove(5);
		}
	}

	public List<Gamer> getRank() {
		return ranking;
	}

	@Override
	public String toString() {
		String saida = "";
		for (int i = 0; i < ranking.size(); i++) {
			saida += i + 1 + "º" + " - " + ranking.get(i).getName() + " - "
					+ ranking.get(i).getScore() + "\n";
		}
		return saida;
	}
}