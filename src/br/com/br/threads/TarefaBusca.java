package br.com.br.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBusca implements Runnable {

	private String nomeArquivo;
	private String nome;

	public TarefaBusca(String nomeArquivo, String nome) {
		this.nomeArquivo = nomeArquivo;
		this.nome = nome;
	}

	@Override
	public void run() {
		
		try {
			Scanner scanner = new Scanner(new File(this.nomeArquivo));
			
			String linha;
			int numeroLinha = 0;
			while (scanner.hasNextLine()) {
				
				numeroLinha++;
				linha = scanner.nextLine();
				if (linha.toLowerCase().matches(this.nome.toLowerCase())) {
					System.out.println(this.nomeArquivo + " - " + numeroLinha + " - " + linha + ": " + Thread.currentThread().getId());
				}
				
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
