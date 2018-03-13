/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;
import java.awt.Color;

import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;

/**
 * Um waypoint que tem uma cor e um valor associado
 *
 * @author Felipe
 */
public class MyWaypoint extends DefaultWaypoint {

    private final Color color;
    private double value;

    /**
     * @param color a cor
     * @param coord a localização
     */
    public MyWaypoint(Color color, double value, GeoPosition coord) {
        super(coord);
        this.color = color;
        this.value = value;
    }

    /**
     * @returns a cor do waypoint
     */
    public Color getColor() {
        return color;
    }

    public double getValue() {
        return value;
    }
}
