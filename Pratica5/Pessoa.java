package Pratica5;

public class Pessoa {

    private String nome;
    private double altura;
    private double peso;
    private int idade;

    public Pessoa(String nome, double altura, double peso, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;

    }
    public String imprimir(){
        return " Nome: "+getNome()+", Altura: "+getAltura()+", Peso: "+getPeso();
    }


}