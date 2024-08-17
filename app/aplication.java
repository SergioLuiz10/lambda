package app;

import pack.aumentar;
import pack.obj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aplication  {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("Digite quantos produtos desejados:");
        int quantidade= ler.nextInt();
        ler.nextLine();

        List<obj> list = new ArrayList<>();
        for (int i=0; i < quantidade; i++) {
            System.out.println("Digite o nome do produto:");
            String produto= ler.nextLine();

            System.out.println("Digite o preço do produto:");
            double preco= ler.nextDouble();
            ler.nextLine();
            list.add(new obj(produto,preco));

            aumentar up=new aumentar();
            double soma= up.aumentare(list, O -> O.getProduto().charAt(0) == 't');

            System.out.println("Soma dos preços dos produtos que começam com 't': " + soma);
        }
    }
}


