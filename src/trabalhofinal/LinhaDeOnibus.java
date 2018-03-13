/*
 * Trabalho final da disciplina AlproII
 * Esta classe organiza os métodos relativos as linhas de ônibus.
 */
package trabalhofinal;
/**
 *
 * @author FLORES,Felipe; MEDEIROS, Temis.
 */
public class LinhaDeOnibus {
    private int idLinha;
    private String nome, codigo, tipo;

    public LinhaDeOnibus(int idLinha, String nome, String codigo, String tipo) {
        this.idLinha = idLinha;
        this.nome = nome;
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public int getIdLinha() {
        return idLinha;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }
    
   public String toString(){
       return "ID Linha: "+idLinha+" Nome: "+nome+" Codigo: "+codigo+" Tipo: "+tipo+"\n";
   }
}
