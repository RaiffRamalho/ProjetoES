package Classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Persistencia {

	private String NOME_DO_ARQUIVO;

	public Persistencia(String NOME_DO_ARQUIVO) {
		this.NOME_DO_ARQUIVO = NOME_DO_ARQUIVO;
	}

	public void persistirDados(Ranking ranking) throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(NOME_DO_ARQUIVO);
			out = new ObjectOutputStream(fos);
			out.writeObject(ranking);
			out.close();
		} catch (IOException e) {
		}
	}

	public Ranking lerDados(Ranking ranking)
			throws IOException {
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis = new FileInputStream(NOME_DO_ARQUIVO);
			in = new ObjectInputStream(fis);
			ranking = (Ranking) in.readObject();
			in.close();
		} catch (IOException ex) {
			ranking = new Ranking();
			persistirDados(ranking);
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}

		return ranking;
	}

}