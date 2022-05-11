package Pratica5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String nome;
        double peso, altura;
        Pessoa[] pessoas = new Pessoa[2];
        Scanner Scan = new Scanner(System.in);
        for(int i = 0; i<pessoas.length; i++){
            System.out.println("Escreva o nome");
            nome = Scan.next();
            System.out.println("Escreva a altura");
            altura = Scan.nextDouble();
            System.out.println("Escreva o peso");
            peso = Scan.nextDouble();

            pessoas[i]=new Pessoa(nome,altura,peso);

        }
        for(int i = 0;i<pessoas.length;i++){
            System.out.println(pessoas[i].imprimir());
        }
    }
}
