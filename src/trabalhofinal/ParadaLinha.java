/*
 * Trabalho final da disciplina AlproII
 * Esta classe organiza os métodos relativos as linhas e paradas de ônibus.
 */
package trabalhofinal;

/**
 *
 * @author FLORES,Felipe; MEDEIROS, Temis.
 */
public class ParadaLinha {
    private int id;
    private int idParada;

    public ParadaLinha(int id, int idParada) {
        this.id = id;
        this.idParada = idParada;
    }

    public int getId() {
        return id;
    }

    public int getIdParada() {
        return idParada;
    }
    public String toString(){
        return "ID: "+id+" IDParada: "+idParada+"\n";
    }
}
