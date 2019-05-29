package ordenamento;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ordenamento {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Periodico> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\511142157\\Documents\\NetBeansProjects\\Ordenamento\\src\\ordenamento\\QualisCapes.csv"))) {
            String line = br.readLine(); // lê o cabecalho
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                Periodico per = new Periodico(values[0], values[1], values[2], values[3]);
                lista.add(per);
            }
        }
        // converte a lista em um vetor
        Periodico[] vet = lista.toArray(new Periodico[lista.size()]);
        // ordena o vetor
        Sort.oddEvenSort(vet);
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
}
