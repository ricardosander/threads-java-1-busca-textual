package br.com.br.threads;

public class Principal {

	public static void main(String[] args) {
		
		
		String nome = "(Dan|Chad)(\\s|\\w)*";
		
		Thread thread1 = new Thread(new TarefaBusca("assinaturas1.txt", nome));
		Thread thread2 = new Thread(new TarefaBusca("assinaturas2.txt", nome));
		Thread thread3 = new Thread(new TarefaBusca("autores.txt", nome));
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
