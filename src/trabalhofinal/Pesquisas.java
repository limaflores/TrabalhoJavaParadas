
package trabalhofinal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class Pesquisas {
    private LeituraLinhasDeOnibus linhas = new LeituraLinhasDeOnibus();
    private LeituraParadas paradas = new LeituraParadas();
    private LeituraParadasLinhas paralinha = new LeituraParadasLinhas();

    
    
    
    
    /**
    public LeituraLinhasDeOnibus listaTodas(){
        ListDoubleLinked<LinhaDeOnibus> lo = linhas.getLista();
    
    }
    */
    
    
    
    /**
    public void lerCSV() throws FileNotFoundException, IOException {
        linhas.leituraLinhasDeOnibus();
        paradas.leituraParadas();
        paralinha.leituraParadasLinhas();

    }
    
    //Seleção de uma parada no mapa e exibir os nomes das linhas.
    public String paradaExibeLinhasDela(){
            
        linhas.ListDoubleLinked.
            Nodo atual = inicio;
            while (atual.prox!=null){
            System.out.println(atual.info);
            atual = atual.prox;

    }
    */
    /** 
    public boolean Procura(String titulo){
        No aux = getPrimeiro();		
        while(aux != null){
            if(titulo.equals(aux.getTitulo())){
                return true;
            }
            aux = aux.getProximo();
        }
        return false;
    }
    
    //Seleção de uma linha de ônibus a partir de uma lista, e apresenta no mapa
    //(de forma diferenciada) as paradas desta linha.
    public String linhaExibeParadasDela(){
        
    }
    
    //Localização e um raio no mapa, exibe as linhas de ônibus que passam nas
    //paradas que estiverem na região selecionada.
    
    
    //Permite a escolha de uma localização qualquer no mapa, e apresenta a
    //parada mais próxima.
    */
    
}
