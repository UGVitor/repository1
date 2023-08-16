package pifi;

public class Fila {

	private int[] vetor;   
	private int tamanho; 
	private int inicio; 
	private int fim;     

	public Fila(int capacidade) {
		vetor = new int[capacidade];
		tamanho = 0;  
		inicio = 0;
		fim = -1;     
	}
	
	public boolean filaVazia() {
		return tamanho == 0;
	}

	public int tamanho() {
		return tamanho;
	}

	public void enqueue(int elemento) {
		if (tamanho < vetor.length) {
			fim = (fim + 1) % vetor.length;
			vetor[fim] = elemento;
			tamanho++;
		} else {
			System.out.println("A fila está cheia. Não é possível adicionar mais elementos.");
		}
	}

	public int dequeue() {
		if (!filaVazia()) {
			int elementoRemovido = vetor[inicio];
			inicio = (inicio + 1) % vetor.length;
			tamanho--;
			return elementoRemovido;
		} else {
			throw new IllegalStateException("A fila está vazia. Não é possível remover elementos.");
		}
	}

	public int front() {
		if (!filaVazia()) {
			return vetor[inicio];
		} else {
			throw new IllegalStateException("A fila está vazia. Não há elementos para visualizar.");
		}
	}



    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.enqueue(37);
        fila.enqueue(48);
        fila.enqueue(59);

        System.out.println("Tamanho da fila: " + fila.tamanho());
        
        System.out.println("Primeiro Elemento: " + fila.front());

        System.out.println("Elemento removido: " + fila.dequeue());
      
       
    }
}
