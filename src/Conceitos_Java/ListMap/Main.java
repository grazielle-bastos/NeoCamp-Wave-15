package Conceitos_Java.ListMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*Crie um programa que armazene uma lista de pessoas (nome e idade) usando um Map.
          Armazene as informações em um Map<String, Integer>, onde a chave é o nome e o valor é a idade.
          Use um Set para armazenar os nomes das pessoas com mais de 30 anos.
          Exiba os nomes das pessoas que possuem mais de 30 anos, ordenados em ordem alfabética.*/

        Map<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Maria", 18);
        pessoas.put("Pedro", 25);
        pessoas.put("Ana", 35);
        pessoas.put("Carlos", 40);
        pessoas.put("Fernanda", 22);
        pessoas.put("Carla", 45);
        pessoas.put("João", 32);

        Set<String> nomesComIdadeAcimaDe30 = new TreeSet<>();
        for (Map.Entry<String, Integer> entry: pessoas.entrySet()) {
            if (entry.getValue() > 30) {
                nomesComIdadeAcimaDe30.add(entry.getKey());
            }
        }
        System.out.println("Nomes com idade acima de 30: " + nomesComIdadeAcimaDe30);

    }
}
