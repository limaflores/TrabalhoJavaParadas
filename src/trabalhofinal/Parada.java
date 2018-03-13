/*
 * Trabalho final da disciplina AlproII
 * Esta classe organiza os métodos relativos as paradas.
 */
package trabalhofinal;

/**
 *
 * @author FLORES,Felipe; MEDEIROS, Temis.
 */
public class Parada {

    private int idParada;
    private int codigo;
    private double longitude;
    private double latitude;
    private String terminal;
    
    public Parada(int idParada, int codigo, double longitude, double latitude, String terminal) {

        this.idParada = idParada;
        this.codigo = codigo;
        this.longitude = longitude;
        this.latitude = latitude;
        this.terminal = terminal;
    }


    public int getIdParada() {
        return idParada;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getTerminal() {
        return terminal;
    }
    public String toString(){
        return "ID: "+idParada+" Código: "+codigo+" Longitude: "+longitude+
                " Latitude: "+latitude+" Terminal: "+terminal+"\n";
    }
    

    
}
