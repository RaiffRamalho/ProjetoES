package Classes;

public class Gamer implements Comparable<Gamer> {  
    private String name;  
    private int score;  
  
    public Gamer(String name, int score) {  
        super();  
        this.name = name;  
        this.score = score;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public int getScore() {  
        return score;  
    }  
  
    public int compareTo(Gamer jog) {
    	int retorno =  jog.score - this.score;
    	if(retorno == 0){
    		return - 1;
    	}
        return retorno;  
    }

    public String toString(){
    	return "Nome: " + this.name + "| Pontuacao: " + this.score;
    }
}  