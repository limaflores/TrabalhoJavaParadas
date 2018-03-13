/*
 * Trabalho final da disciplina AlproII
 * Esta classe roda a plicação do trabalho
 */
package trabalhofinal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jxmapviewer.viewer.GeoPosition;


/**
 * @author FLORES,Felipe; MEDEIROS, Temis.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //LeituraLinhasDeOnibus l = new LeituraLinhasDeOnibus();
        //l.leituraLinhasDeOnibus();
        //l.converteSomenteOnibus();
        
        //ArrayList<LinhaDeOnibus> linhas;
        //linhas = l.pegaLinhasDaParada(128420);;
        //for(int i = 0; i<linhas.size(); i++)
        //System.out.println(linhas);
        
        //LeituraParadasLinhas l = new LeituraParadasLinhas();
        //l.leituraParadasLinhas();
        //l.converteSomenteOnibus();
        
        //ArrayList<ParadaLinha> linhas;
        //linhas = l.pegaParadasOnibus(127621);
        //for(int i = 0; i<linhas.size(); i++)
        //System.out.println(linhas);
        
        
        //LeituraParadasLinhas pl = new LeituraParadasLinhas();
        //pl.leituraParadasLinhas();
        //LeituraParadas lp = new LeituraParadas();
        //lp.leituraParadas();
        //lei.listaLinhasPeloId();
        //System.out.println(l.size());
        //System.out.println(pl.size());
        //System.out.println(lp.size());
        
            
        JanelaInicial pop = new JanelaInicial();
        pop.setVisible(true);
        
    }  

        

}

//System.out.println(lei.listParadas());