package com.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static String arquivo = "ativos.csv";
    public static void main(String[] args) throws IOException {
        desafio1();
        desafio2();
        desafio3();
        desafio4();
        desafioFinal();
    }

    static void desafio1() throws IOException {
        System.out.println("===== DESAFIO 1 - HOSTS =====");

        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha;

        leitor.readLine(); 
        while ((linha = leitor.readLine()) != null) {
            String[] dados = linha.split(",");
            String host = dados[0];

            System.out.println(host);
        }

        leitor.close();
        System.out.println();
    }

    static void desafio2() throws IOException {
        System.out.println("===== DESAFIO 2 - TOTAL DE DISPOSITIVOS =====");

        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha;
        int total = 0;

        leitor.readLine(); 

        while ((linha = leitor.readLine()) != null) {
            total++; 
        }

        leitor.close();
        System.out.println("Total de dispositivos: " + total);
        System.out.println();
    }

  
    static void desafio3() throws IOException {
        System.out.println("===== DESAFIO 3 - HOSTS LINUX =====");

        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha;

        leitor.readLine(); 

        while ((linha = leitor.readLine()) != null) {
            String[] dados = linha.split(",");
            String host = dados[0];
            String sistema = dados[2];

            if (sistema.contains("Linux")) {
                System.out.println(host);
            }
        }

        leitor.close();
        System.out.println();
    }

    static void desafio4() throws IOException {
        System.out.println("===== DESAFIO 4 - IPs WINDOWS =====");

        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha;

        leitor.readLine(); 

        while ((linha = leitor.readLine()) != null) {
            String[] dados = linha.split(",");
            String ip = dados[1];
            String sistema = dados[2];

            if (sistema.contains("Windows")) {
                System.out.println(ip);
            }
        }

        leitor.close();
        System.out.println();
    }

   
    static void desafioFinal() throws IOException {
        System.out.println("===== DESAFIO FINAL - RELATÓRIO DE ATIVOS =====");

        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha;

        int total = 0;
        int linux = 0;
        int windows = 0;
        int firewall = 0;
        int outros = 0; 

        leitor.readLine();

        while ((linha = leitor.readLine()) != null) {
            String[] dados = linha.split(",");
            String sistema = dados[2];

            total++;

            if (sistema.contains("Linux")) {
                linux++;
            } else if (sistema.contains("Windows")) {
                windows++;
            } else if (sistema.contains("Firewall")) {
                firewall++;
            } else {
                outros++;
            }
        }

        leitor.close();

        System.out.println("Total de ativos: " + total);
        System.out.println("Linux:    " + linux);
        System.out.println("Windows:  " + windows);
        System.out.println("Firewall: " + firewall);
        System.out.println("Outros:   " + outros);
    }
}
