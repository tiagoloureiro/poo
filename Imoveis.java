import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Imoveis {
    public String rua;
    public double preco_pedido;
    public double preco_aceite;

    public Imoveis(){
        this("", 0, 0);
    }

    public Imoveis(String rua, double preco_pedido, double preco_aceite){
        this.rua = rua;
        this.preco_pedido = preco_pedido;
        this.preco_aceite = preco_aceite;
    }

    public Imoveis(Imoveis i){
        this.rua = i.getRua();
        this.preco_pedido = i.getPreco_pedido();
        this.preco_aceite = i.getPreco_aceite();
    }

    public String getRua() {
        return rua;
    }
    public double getPreco_pedido() {
        return preco_pedido;
    }
    public double getPreco_aceite() {
        return preco_aceite;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setPreco_pedido(double preco_pedido) {
        this.preco_pedido = preco_pedido;
    }
    public void setPreco_aceite(double preco_aceite) {
        this.preco_aceite = preco_aceite;
    }
}
