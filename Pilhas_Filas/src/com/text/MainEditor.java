package com.text;

import java.util.Scanner;

public class MainEditor {
	
	Editor editor;
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Editor editor = new Editor();

        while (true) {
            System.out.println("Editor de Texto Simples");
            System.out.println("1. Inserir Texto");
            System.out.println("2. Desfazer");
            System.out.println("3. Sair");
            System.out.println("Texto Atual: " + "" + editor.getTexto());
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o texto a ser inserido: ");
                    String novoTexto = scanner.nextLine();
                    editor.inserirTexto(novoTexto);
                    break;
                case 2:
                    editor.desfazer();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}

