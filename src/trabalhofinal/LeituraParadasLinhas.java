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
public class LeituraParadasLinhas {
    private ArrayList<ParadaLinha> listaParadasLinhas;

    public LeituraParadasLinhas() {
        listaParadasLinhas = new ArrayList<ParadaLinha>();
    }
    
    public void leituraParadasLinhas() throws FileNotFoundException{
        int id, idLinha;        
        String divisor = ";";
        ParadaLinha pl = null;
        
        File arquivoCSV = new File ("paradalinha.csv");
        Scanner leitor = new Scanner(arquivoCSV);
        String linhasDoArquivo = new String();
        leitor.nextLine();
        
        while (leitor.hasNext()){
            linhasDoArquivo = leitor.nextLine();
            String[] valoresEntreVirgulas = elimina_aspas(linhasDoArquivo.split(divisor), 2);
            id = Integer.parseInt(valoresEntreVirgulas[0]);
            idLinha = Integer.parseInt(valoresEntreVirgulas[1]);
            pl = new ParadaLinha(id, idLinha);
            listaParadasLinhas.add(pl);
            
        }
            //System.out.println(""+listaParadasLinhas.toString());
    }
    
    //retorna uma lista com as linhas que passam em uma parada passada por id
    public ArrayList<ParadaLinha> pegaParadasOnibus(int id){
        ArrayList<ParadaLinha> paradasOnibus = new ArrayList<ParadaLinha>();
        for(int i = 0; i < listaParadasLinhas.size(); i++){
            if(listaParadasLinhas.get(i).getId() == id)
                paradasOnibus.add(listaParadasLinhas.get(i));
        }
        return paradasOnibus;
    }
    
    public ArrayList<ParadaLinha> pegaLinhasOnibus(int id) {
        ArrayList<ParadaLinha> linhasOnibus = new ArrayList<ParadaLinha>();
        for(int i = 0; i < listaParadasLinhas.size(); i++){
            if(listaParadasLinhas.get(i).getIdParada() == id)
                linhasOnibus.add(listaParadasLinhas.get(i));
        }
        return linhasOnibus;
    }
    
    public static void main (String[] args) throws IOException{
        LeituraParadasLinhas l = new LeituraParadasLinhas();
        l.leituraParadasLinhas();
    }
    // Função que elimina as aspas de um array
    public static String[] elimina_aspas(String dados[],int col){
      for(int i=0;i<col;i++){
        dados[i]= dados[i].replaceAll("\"", "");
      }      
      return dados;
    }
    public int size() {
        return listaParadasLinhas.size();
    }

    
}
