package Classes;

class Gamer implements Comparable<Gamer> {  
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
        return jog.score - this.score;  
    }

    public String toString(){
    	return "Nome: " + this.name + "| Pontuacao: " + this.score;
    }
}  