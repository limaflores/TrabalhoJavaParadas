/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhofinal;
//@author FLORES,Felipe; MEDEIROS, Temis.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeituraLinhasDeOnibus {

    private ArrayList<LinhaDeOnibus> listaLinhasDeOnibus;
    private ArrayList<LinhaDeOnibus> lis = new ArrayList<LinhaDeOnibus>();

    public LeituraLinhasDeOnibus() {
        this.listaLinhasDeOnibus = new ArrayList<LinhaDeOnibus>();
    }

    public void leituraLinhasDeOnibus() throws FileNotFoundException {
        int idLinha;
        String nome, codigo, tipo;
        String divisor = ";";
        LinhaDeOnibus lo = null;

        File arquivoCSV = new File("linhas.csv");
        Scanner leitor = new Scanner(arquivoCSV);
        String linhasDoArquivo = new String();
        leitor.nextLine();

        while (leitor.hasNext()) {
            linhasDoArquivo = leitor.nextLine();
            String[] valoresEntreVirgulas = elimina_aspas(linhasDoArquivo.split(divisor), 4);
            idLinha = Integer.parseInt(valoresEntreVirgulas[0]);
            nome = valoresEntreVirgulas[1];
            codigo = valoresEntreVirgulas[2];
            tipo = valoresEntreVirgulas[3];
            lo = new LinhaDeOnibus(idLinha, nome, codigo, tipo);
            
            if (lo.getTipo().equalsIgnoreCase("o")) { //Add somente linhas de onibus!
                listaLinhasDeOnibus.add(lo);
            }
                  
        }
        //System.out.println("" + listaLinhasDeOnibus.toString());

    }

    // Função que elimina as aspas de um array
    public static String[] elimina_aspas(String dados[],int col){
      for(int i=0;i<col;i++){
        dados[i]= dados[i].replaceAll("\"", "");
      }      
      return dados;
    }
    public static void main(String[] args) throws IOException {
        LeituraLinhasDeOnibus l = new LeituraLinhasDeOnibus();
        l.leituraLinhasDeOnibus();
    }
    
    
    public void converteSomenteOnibus(){
        for(int i = 0; i<lis.size(); i++){
            if(lis.get(i).getTipo().equalsIgnoreCase("O"))
                listaLinhasDeOnibus.add(lis.get(i));
        }
        System.out.println(listaLinhasDeOnibus.toString());
    }
    
    
    
    //retorna uma lista com as linhas
    public ArrayList<LinhaDeOnibus> pegaLinhasDaParada(){
        ArrayList<LinhaDeOnibus> linhas = new ArrayList<LinhaDeOnibus>();
        for(int i = 0; i < listaLinhasDeOnibus.size(); i++){            
                linhas.add(listaLinhasDeOnibus.get(i));            
        }
        return linhas;
    }
    
    //retorna uma lista com as linhas que passam em uma parada passada por id
    public ArrayList<LinhaDeOnibus> pegaLinhasDaParada(int id){
        ArrayList<LinhaDeOnibus> linhasQPassam = new ArrayList<LinhaDeOnibus>();
        for(int i = 0; i<listaLinhasDeOnibus.size(); i++){
            if(listaLinhasDeOnibus.get(i).getIdLinha() == id)
                linhasQPassam.add(listaLinhasDeOnibus.get(i));
        }
        return linhasQPassam;
    }
    
    /**
    public ArrayList<LinhaDeOnibus> pegaSomenteOnibus(){
        for(int i = 0; i<lis.size(); i++){
            if(lis.get(i).getTipo().equalsIgnoreCase("O"))
                listaLinhasDeOnibus.add(lis.get(i));
        }
        return listaLinhasDeOnibus;
    }
    
    */ 
    public int size() {
        return listaLinhasDeOnibus.size();
    }

 
}
//*/
/**
 public void listaParadas() {
        int n = listaLinhasDeOnibus.size();
        for (int i = 0; i < n; i++) {
            System.out.print("Posição"+ listaLinhasDeOnibus.get(i));
        }  
    }
*/




//-------------------------------------------------------------------------------------

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
package trabalhofinal;
//@author FLORES,Felipe; MEDEIROS, Temis.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeituraLinhasDeOnibus {

    private ArrayList<LinhaDeOnibus> listaLinhasDeOnibus;
    private ArrayList<LinhaDeOnibus> lis = new ArrayList<LinhaDeOnibus>();

    public LeituraLinhasDeOnibus() {
        this.listaLinhasDeOnibus = new ArrayList<LinhaDeOnibus>();
    }

    public void leituraLinhasDeOnibus() throws FileNotFoundException {
        int idLinha;
        String nome, codigo, tipo;
        String divisor = ";";
        LinhaDeOnibus lo = null;

        File arquivoCSV = new File("linhas.csv");
        Scanner leitor = new Scanner(arquivoCSV);
        String linhasDoArquivo = new String();
        leitor.nextLine();

        while (leitor.hasNext()) {
            linhasDoArquivo = leitor.nextLine();
            String[] valoresEntreVirgulas = linhasDoArquivo.split(divisor);
            idLinha = Integer.parseInt(valoresEntreVirgulas[0]);
            nome = valoresEntreVirgulas[1];
            codigo = valoresEntreVirgulas[2];
            tipo = valoresEntreVirgulas[3];
            lo = new LinhaDeOnibus(idLinha, nome, codigo, tipo);
            if (lo.getTipo().equalsIgnoreCase("O")) { //Add somente linhas de onibus!
                lis.add(lo);
            }
                  
        }
        //converteSomenteOnibus();
        System.out.println("" + listaLinhasDeOnibus.toString());

    }

    public static void main(String[] args) throws IOException {
        LeituraLinhasDeOnibus l = new LeituraLinhasDeOnibus();
        l.leituraLinhasDeOnibus();
    }
    /**
    public void converteSomenteOnibus(){
        for(int i = 0; i<lis.size(); i++){
            if(lis.get(i).getTipo().equalsIgnoreCase("O"))
                listaLinhasDeOnibus.add(lis.get(i));
        }
        System.out.println(listaLinhasDeOnibus);
    }
  
    public ArrayList<LinhaDeOnibus> pegaSomenteOnibus(){
        for(int i = 0; i<lis.size(); i++){
            if(lis.get(i).getTipo().equalsIgnoreCase("O"))
                listaLinhasDeOnibus.add(lis.get(i));
        }
        return listaLinhasDeOnibus;
    }
*/  
/**
    public int size() {
        return listaLinhasDeOnibus.size();
    }

 
}
//*/
/**
 public void listaParadas() {
        int n = listaLinhasDeOnibus.size();
        for (int i = 0; i < n; i++) {
            System.out.print("Posição"+ listaLinhasDeOnibus.get(i));
        }  
    }
*/







