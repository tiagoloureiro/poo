import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Terreno extends Imoveis{
    private double area_construcao;
    private String tipo; //Construção de Habitação ou Construção de Armazem
    private double diametro_canalizacao;
    private int kWh_maximo; // 0 -> se não estiver instalad rede eletrica
    private boolean acesso_esgotos;

}
