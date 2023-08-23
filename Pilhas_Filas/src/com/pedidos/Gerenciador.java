package com.pedidos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Gerenciador {

	    public static void main(String[] args) {
	        Queue<Pedido> filaDePedidos = new LinkedList<>();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("=== Sistema de Gerenciamento de Pedidos ===");
	            System.out.println("1. Adicionar Pedido");
	            System.out.println("2. Processar Pedido");
	            System.out.println("3. Listar Pedidos");
	            System.out.println("4. Sair");
	            System.out.print("Escolha uma opção: ");
	            int opcao = scanner.nextInt();

	            if (opcao == 1) {
	                System.out.print("Digite o número do pedido: ");
	                int numeroPedido = scanner.nextInt();
	                Pedido pedido = new Pedido(numeroPedido);
	                filaDePedidos.offer(pedido); //tem a msm função de um enqueue
	                System.out.println("Pedido adicionado com sucesso!");
	            } else if (opcao == 2) {
	                if (!filaDePedidos.isEmpty()) {
	                    Pedido pedidoProcessado = filaDePedidos.poll(); //tem a msm função de um dequeue
	                    System.out.println("Pedido " + pedidoProcessado.getNumeroPedido() + " foi processado.");
	                } else {
	                    System.out.println("Nenhum pedido na fila para processar.");
	                }
	            }	else if (opcao == 4) {
		                mostrarPedidos(filaDePedidos);
	            } else if (opcao == 4) {
	                System.out.println("Saindo do sistema...");
	                break;
	            } else {
	                System.out.println("Opção inválida. Por favor, escolha novamente.");
	            }
	            
	        }

	        scanner.close();
	    }
	    
	    public static void mostrarPedidos(Queue<Pedido> fila) {
	        if (fila.isEmpty()) {
	            System.out.println("Nenhum pedido na fila.");
	        } else {
	            System.out.println("Pedidos na fila:");
	            for (Pedido pedido : fila) {
	                System.out.println("Pedido " + pedido.getNumeroPedido());
	            }
	        }
	    }
}