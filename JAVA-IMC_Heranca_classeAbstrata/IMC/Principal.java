package IMC;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Você quer verificar o IMC de quantas pessoas?");
        String str = scanner.nextLine();
        ArrayList<PessoaIMC> pessoasImc = new ArrayList<PessoaIMC>();


        for (int i = 0; i < Integer.parseInt(str); i++) {
            System.out.println("Digite o sexo da pessoa ("+ i+1+  "), 1-Homem ou 2-Mulher");
            String strNum = scanner.nextLine();

            System.out.println("Digite o nome:");
            String nome = scanner.nextLine();

            System.out.println("Digite a data de nascimento:");
            String dataNascimento = scanner.nextLine();

            System.out.println("Digite o peso:");
            String peso = scanner.nextLine();

            System.out.println("Digite a altura:");
            String altura = scanner.nextLine();


            if (Integer.parseInt(strNum) == 1) {
                Homem homem = new Homem(nome, dataNascimento, Double.parseDouble(peso), Double.parseDouble(altura));
                pessoasImc.add(homem);
            } else if (Integer.parseInt(strNum) == 2) {
                Mulher mulher = new Mulher(nome, dataNascimento, Double.parseDouble(peso), Double.parseDouble(altura));
                pessoasImc.add(mulher);
            }
        }

        for (PessoaIMC pessoaIMC : pessoasImc) {
            System.out.println(pessoaIMC.toString());
            System.out.println(pessoaIMC.resultIMC());
        }
    }
}