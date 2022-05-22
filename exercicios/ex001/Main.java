package exercicios.ex001;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Igor Ricci");
        nomes.add("Jean Rayan");
        nomes.add("Caio Sobrinho");
        System.out.println(nomes.toString()); 

        nomes.add(1, "Dálmata");
        System.out.println(nomes.toString()); 

        nomes.remove("Igor Ricci");
        System.out.println(nomes.toString()); 

        nomes.remove(2);
        System.out.println(nomes.toString()); 

        nomes.clear();
        System.out.println(nomes.toString()); 

        nomes.add("Igor Ricci");
        nomes.add("Jean Rayan");
        nomes.add("Caio Sobrinho");
        System.out.println(nomes.get(0));   
        
        System.out.println(nomes.isEmpty());

        System.out.println(nomes.contains("Igor Ricci"));

        System.out.println(nomes.size());

    }
}
