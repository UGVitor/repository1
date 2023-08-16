package pifi;

public class Pilha {

    private int[] vetor;  
    private int topo;     

    public Pilha(int capacidade) {
        vetor = new int[capacidade];
        topo = -1;  
    }
    
    public int tamanhoPilha() {
        return topo + 1;
    }
    
    public boolean pilhaVazia() {
        return topo == -1;
    }

    public void adicionarElemento(int elemento) { //push
        if (topo < vetor.length - 1) {
            topo++;
            vetor[topo] = elemento;
        } else {
            System.out.println("A pilha está cheia. Não é possível adicionar mais elementos.");
        }
    }

    public int pop() {
        if (!pilhaVazia()) {
            int elementoRemovido = vetor[topo];
            topo--;
            return elementoRemovido;
        } else {
            throw new IllegalStateException("A pilha está vazia. Não é possível remover elementos.");
        }
    }

    public int peek() {
        if (!pilhaVazia()) {
            return vetor[topo];
        } else {
            throw new IllegalStateException("A pilha está vazia. Não há elementos para visualizar.");
        }
    }


    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.adicionarElemento(84);
        pilha.adicionarElemento(97);
        pilha.adicionarElemento(25);
        
        System.out.println("Tamanho da pilha: " + pilha.tamanhoPilha());
        
        System.out.println("Elemento no topo da Pilha: " + pilha.peek());

        System.out.println("Removendo elemento: " + pilha.pop());
 
    }
}
