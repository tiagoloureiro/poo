import java.util.GregorianCalendar;
import java.util.ArrayList;

public class User {
    public String email, nome, password, morada;
    public GregorianCalendar data_nascimento;

    public User(){
        this("","","","",new GregorianCalendar());
    }

    public User(String email, String nome, String password, String morada, GregorianCalendar data_nascimento){
        this.email = email;
        this.nome = nome;
        this.password = password;
        this.morada = morada;
        this.data_nascimento = data_nascimento;
    }

    public User(User g){
        email = g.getEmail();
        nome = g.getNome();
        password = g.getPassword();
        morada = g.getMorada();
        data_nascimento = g.getData_nascimento();
    }

    public String getEmail() {
        return email;
    }
    public String getNome() {
        return nome;
    }
    public String getPassword() {
        return password;
    }
    public String getMorada() {
        return morada;
    }
    public GregorianCalendar getData_nascimento() {
        return data_nascimento;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setMorada(String morada) {
        this.morada = morada;
    }
    public void setData_nascimento(GregorianCalendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
