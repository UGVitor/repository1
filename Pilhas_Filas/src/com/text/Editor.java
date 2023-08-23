package com.text;

import java.util.Stack;



public class Editor {
    private StringBuilder texto;
    private Stack<String> undoStack;

    public Editor() {
        texto = new StringBuilder();
        undoStack = new Stack<>();
    }

    public void inserirTexto(String novoTexto) {
        undoStack.push(texto.toString()); // Salva o estado atual para desfazer
        texto.append(novoTexto);
    }

    public void desfazer() {
        if (!undoStack.isEmpty()) {
            texto = new StringBuilder(undoStack.pop());
        }
    }

    public String getTexto() {
        return texto.toString();
    }

}
