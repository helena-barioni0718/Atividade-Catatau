package Aplicacao;
import Entidade.Pessoa;

import java.util.Scanner;
public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Deseja cadastrar um aluno ou uma pessoa?");
        System.out.println("Digite 1 para pessoa ou 2 para aulno");
        int opcao = sc.nextInt();
        if (opcao == 2){
            sc.nextLine();
            System.out.println("Digite o nome do aluno:");
            String nome= sc.nextLine();
            System.out.println("Digite a idade do aluno:");
            int idade = sc.nextInt();
            System.out.println("Curso:");
            String curso = sc.nextLine();
            System.out.println("Digte a matrícula do aluno:");
            String matricula = sc.nextLine();

        }

        if (opcao == 1){
            sc.nextLine();
            System.out.println("Nome:");
            String nome = sc.nextLine();
            System.out.println("Idade da pessoa:");
            int idade = sc.nextInt();
            Pessoa pessoa = new Pessoa (nome, idade);

        }
    }
}
