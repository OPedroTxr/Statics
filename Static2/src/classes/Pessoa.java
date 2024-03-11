package classes;

import java.util.Scanner;

public class Pessoa {

    private String nome;
    private int idade;
    private float altura;
    static int contador;
    private Scanner ler = new Scanner(System.in);

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.altura = 0.0f;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Pessoa.contador = contador;
    }

    public void printSummary() {
        System.out.println(
                "Numero total de pessoas cadastradas no sistema.: " + contador
                + "Nome: " + nome
                + ". idade: " + idade
                + ". altura: " + altura);
    }

    public void fill() {
        System.out.println("Preencha as informações da pessoa: ");
        //title
        System.out.print("Nome: ");
        this.nome = ler.nextLine();

        //author
        System.out.print("Idade: ");
        this.idade = Integer.parseInt(ler.nextLine());

        //number of pages
        System.out.print("Altura: ");
        this.altura = Float.parseFloat(ler.nextLine());

        System.out.println("Pessoa registrada com sucesso");
        contador++;
    }

}
