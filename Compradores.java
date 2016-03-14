import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Compradores extends User{
    private ArrayList<Imoveis> lista_imoveis;

    public Compradores(String email, String nome, String password, String morada, GregorianCalendar data_nascimento, ArrayList<Imoveis> lista_imoveis) {
        super(email, nome, password, morada, data_nascimento);
        this.lista_imoveis = lista_imoveis.clone();
    }

    public ArrayList<Imoveis> getLista_imoveis() {
        return lista_imoveis;
    }

    public void setLista_imoveis(ArrayList<Imoveis> lista_imoveis) {
        this.lista_imoveis = lista_imoveis;
    }
}


