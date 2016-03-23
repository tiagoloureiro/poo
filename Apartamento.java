import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Apartamento extends Imoveis{
    private String tipo; //Simples, Duplex, Triplex
    private double area_total;
    private int num_quartos;
    private int num_wcs;
    private int num_porta;
    private int andar;
    private boolean possui_garagem;

    public Apartamento(String rua, double preco_pedido, double preco_aceite,
                       String tipo, double area_total, int num_quartos, int num_wcs, int num_porta, int andar, boolean possui_garagem){
        super(rua, preco_pedido, preco_aceite);
        this.tipo = tipo;
        this.area_total = area_total;
        this.num_quartos = num_quartos;
        this.num_wcs = num_wcs;
        this.num_porta = num_porta;
        this.andar = andar;
        this.possui_garagem = possui_garagem;
    }

    public Apartamento(Apartamento a){
        super(a.getRua(), a.getPreco_pedido(), a.getPreco_aceite());
        this.tipo = a.getTipo();
        this.area_total = a.getArea_total();
        this.num_quartos = a.getNum_quartos();
        this.num_wcs = a.getNum_wcs();
        this.num_porta = a.getNum_porta();
        this.andar = a.getAndar();
        this.possui_garagem = a.getPossuiGaragem();
    }

    public String getTipo() {
        return tipo;
    }
    public double getArea_total() {
        return area_total;
    }
    public int getNum_quartos() {
        return num_quartos;
    }
    public int getNum_wcs() {
        return num_wcs;
    }
    public int getNum_porta() {
        return num_porta;
    }
    public int getAndar() {
        return andar;
    }
    public boolean getPossuiGaragem(){
        return possui_garagem;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setArea_total(double area_total) {
        this.area_total = area_total;
    }
    public void setNum_quartos(int num_quartos) {
        this.num_quartos = num_quartos;
    }
    public void setNum_wcs(int num_wcs) {
        this.num_wcs = num_wcs;
    }
    public void setNum_porta(int num_porta) {
        this.num_porta = num_porta;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }
    public void setPossui_garagem(boolean possui_garagem) {
        this.possui_garagem = possui_garagem;
    }

    public Apartamento clone(){
        return new Apartamento(this);
    }
}
