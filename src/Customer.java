import java.util.Date;

public class Customer{
    public String name;
    private Date birthDate;
    private int cpf;

    public void Customer(String name, Date birthDate, int cpf) {
        this.name = name;
        this.birthDate = birthDate;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
