/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pucrs.alpro2.geo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.viewer.GeoPosition;

/**
 *
 * @author Cohen
 */
public class JanelaConsulta extends javax.swing.JFrame {
    
    private GerenciadorMapa gerenciador;
    private EventosMouse mouse;
    
	private JPanel painelLateral;
	private JPanel painelMapa;    
    
    private JButton butConsulta;

    /**
     * Creates new form JanelaConsulta
     */
    public JanelaConsulta() {
    	super();              

        GeoPosition poa = new GeoPosition(-30.05, -51.18);
        gerenciador = new GerenciadorMapa(poa, GerenciadorMapa.FonteImagens.VirtualEarth);
        mouse = new EventosMouse();        		
        gerenciador.getMapKit().getMainMap().addMouseListener(mouse);
        gerenciador.getMapKit().getMainMap().addMouseMotionListener(mouse);       

        painelMapa = new JPanel();
        painelMapa.setLayout(new BorderLayout());
        painelMapa.setPreferredSize(new Dimension(800,600));
        painelMapa.setMinimumSize(new Dimension(800,600));        
        painelMapa.add(gerenciador.getMapKit());//, BorderLayout.CENTER);
                            
        getContentPane().add(painelMapa, BorderLayout.CENTER);
            
        painelLateral = new JPanel();
        getContentPane().add(painelLateral, BorderLayout.WEST);
          
        butConsulta = new JButton("Consulta");
        butConsulta.addActionListener(e -> consultaParada(e));
        painelLateral.add(butConsulta);
                
        this.setSize(800,600);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
    }

    // Exemplo de como obter as coordenadas do mouse e raio
    private void consultaParada(ActionEvent evt) {
    	
    	// Obtém o ponto clicado no mapa
    	GeoPosition pos = gerenciador.getSelecaoCentro();
    	// Obtém o raio escolhido pelo usuário (em metros)
    	double raio = gerenciador.getRaio();

    	// Como adicionar pontos na tela: cria-se uma lista...
        List<MyWaypoint> lstPoints = new ArrayList<>();       
        
        // .. e adiciona-se objetos MyWaypoint nela   
        // Neste exemplo, usamos o próprio ponto clicado pelo usuário
        lstPoints.add(new MyWaypoint(Color.BLUE, 1, pos));
        
        // Finamente, envia esta lista ao gerenciador
        gerenciador.setPontos(lstPoints);       
        
        // Redesenha a janela
        this.repaint();
    }
    
    // Classe interna para gerenciar os eventos do mouse (click e drag)
    private class EventosMouse extends MouseAdapter
    {
    	private int lastButton = -1;    	
    	
    	@Override
    	public void mousePressed(MouseEvent e) {
    		JXMapViewer mapa = gerenciador.getMapKit().getMainMap();
    		GeoPosition loc = mapa.convertPointToGeoPosition(e.getPoint());
//    		System.out.println(loc.getLatitude()+", "+loc.getLongitude());
    		lastButton = e.getButton();    		
    		if(lastButton==MouseEvent.BUTTON3) {  			
    			gerenciador.setSelecaoCentro(loc);
    			gerenciador.setSelecaoBorda(loc);
    			//gerenciador.getMapKit().setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
    			gerenciador.getMapKit().repaint();    			
    		}
    	}    
    	
    	public void mouseDragged(MouseEvent e) {
    		if(lastButton ==  MouseEvent.BUTTON3) {    			
    			JXMapViewer mapa = gerenciador.getMapKit().getMainMap();
    			gerenciador.setSelecaoBorda(mapa.convertPointToGeoPosition(e.getPoint()));
    			gerenciador.getMapKit().repaint();
    		}    			
    	}
    }
}
