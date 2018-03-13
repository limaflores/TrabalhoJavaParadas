/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FLORES,Felipe; MEDEIROS, Temis.
 */
public class LeituraParadas {
    
    private ArrayList<Parada> listaParadas;
    public LeituraParadas() {
        listaParadas = new ArrayList<Parada>();
    }
    
    public void leituraParadas() throws FileNotFoundException, IOException {
        int idParada, codigo;
        double longitude, latitude;
        String convertString;
        String terminal;
        String divisor = ";";
        Parada p = null;

        File arquivoCSV = new File ("paradas.csv");
        Scanner leitor = new Scanner(arquivoCSV);
        String linhasDoArquivo = new String();
        leitor.nextLine();
     
        while (leitor.hasNext()){
            linhasDoArquivo = leitor.nextLine();            
            String[] valoresEntreVirgulas = elimina_aspas(linhasDoArquivo.split(divisor), 5);
            idParada = Integer.parseInt(valoresEntreVirgulas[0]);
            convertString = valoresEntreVirgulas[1];
            convertString = convertString.replaceAll("\"","");
            codigo = Integer.parseInt(convertString);
            convertString = valoresEntreVirgulas[2];
            convertString = convertString.replace(",", ".");
            longitude = Double.parseDouble(convertString);
            convertString = valoresEntreVirgulas[3];
            convertString = convertString.replace(",", ".");
            latitude = Double.parseDouble(convertString);
            terminal = valoresEntreVirgulas[4];
            terminal = terminal.replaceAll("\"","");
            
            p = new Parada(idParada, codigo, longitude, latitude, terminal);
            listaParadas.add(p);
        }        
        
            //System.out.println(""+listaParadas.toString());
    }
 
    //retorna uma lista com as paradas
    public ArrayList<Parada> pegaParadas(){
        ArrayList<Parada> paradas = new ArrayList<Parada>();
        for(int i = 0; i < listaParadas.size(); i++){
            paradas.add(listaParadas.get(i));
        }
        return paradas;
    }

    public ArrayList<Parada> getListaParadas() {
        return listaParadas;
    }
    
    public static void main (String[] args) throws IOException{
        LeituraParadas l = new LeituraParadas();
        l.leituraParadas();
    }
    // Função que elimina as aspas de um array
    public static String[] elimina_aspas(String dados[],int col){
      for(int i=0;i<col;i++){
        dados[i]= dados[i].replaceAll("\"", "");
      }      
      return dados;
    }
    public int size() {
        return listaParadas.size();
    }
}
