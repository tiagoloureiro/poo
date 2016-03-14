import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Vendedores {
    private ArrayList<Imoveis> imoveis_mercado;
    private ArrayList<Imoveis> imoveis_vendidos;

    public Vendedores(String email, String nome, String password, String morada, GregorianCalendar data_nascimento, ArrayList<Imoveis> imoveis_mercado, ArrayList<Imoveis> imoveis_vendidos) {
        super(email, nome, password, morada, data_nascimento);
        this.imoveis_mercado = imoveis_mercado.clone();
        this.imoveis_vendidos = imoveis_vendidos.clone();
    }

    public ArrayList<Imoveis> getImoveis_mercado() {
        return imoveis_mercado;
    }
    public ArrayList<Imoveis> getImoveis_vendidos() {
        return imoveis_vendidos;
    }

    public void setImoveis_mercado(ArrayList<Imoveis> imoveis_mercado) {
        this.imoveis_mercado = imoveis_mercado;
    }
    public void setImoveis_vendidos(ArrayList<Imoveis> imoveis_vendidos) {
        this.imoveis_vendidos = imoveis_vendidos;
    }
}
