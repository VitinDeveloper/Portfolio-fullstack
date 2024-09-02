package com.main;

public class VerificadorDeLetras {
    private String texto;
    private int numeroDeLetras;
    
    public VerificadorDeLetras(String texto) {
        this.texto = texto;
        this.numeroDeLetras = 0;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getNumeroDeLetras() {
        return numeroDeLetras;
    }

    public void contarLetra(char letra) {
        numeroDeLetras = 0;
        for (int i = 0; i < this.texto.length(); i++) {
            char c = this.texto.charAt(i);
            if (Character.toLowerCase(c) == Character.toLowerCase(letra)) {
                numeroDeLetras++;
            }
        }
    }
}