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

	@Override
	public String toString() {
		String saida = "";
		for (int i = 0; i < ranking.size(); i++) {
			saida+= i+"º" +" " +ranking.get(i).getName() +" "+ranking.get(i).getScore();
		}
		return saida;
	}

	public Ranking() {
		this.ranking = new ArrayList<Gamer>();
	}


	public boolean CheckRanking(String name, Integer score) {
		Gamer gam = new Gamer(name, score);
		
		this.ranking.add(gam);
		if(ranking.size()<5) return true;
		Collections.sort(ranking);
		if (this.ranking.size() > 5){
			this.ranking.remove(5);
			return true;
		}
		return false;
		
	}
	
	public List<Gamer> getRank(){
		return ranking;

	}
}