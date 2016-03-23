import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Loja extends Imoveis{
    private double area;
    private boolean possui_wc;
    private int num_porta;
    private String tipo_negocio;
    //Falta prever a situação em que a loja tem parte habitacional (talvez -> Extends Apartamento)
    public Loja(String rua, double preco_pedido, double preco_aceite,
                       double area, boolean possui_wc, int num_porta, String tipo_negocio){
        super(rua, preco_pedido, preco_aceite);
        this.area = area;
        this.possui_wc = possui_wc;
        this.num_porta = num_porta;
        this.tipo_negocio = tipo_negocio;
    }
    public Loja(Loja l){
        super(l.getRua(), l.getPreco_pedido(), l.getPreco_aceite());
        area = l.getArea();
        possui_wc  = l.getPossui_wc();
        num_porta = l.getNum_porta();
        tipo_negocio = l.getTipo_negocio();
    }
    
    public double getArea(){return area;}
    public boolean getPossui_wc(){return possui_wc;}
    public int getNum_porta(){return num_porta;}
    public String getTipo_negocio(){return tipo_negocio;}
    
    public void setArea(double area){this.area = area;}
    public void setPossui_wc(boolean possui_wc){this.possui_wc = possui_wc;}
    public void setNum_porta(int num_porta){this.num_porta = num_porta;}
    public void setTipo_negocio(String tipo_negocio){this.tipo_negocio = tipo_negocio;}

    public Loja clone(){
        return new Loja(this);
    }
}
