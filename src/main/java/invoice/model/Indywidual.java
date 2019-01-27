package invoice.model;

public class Indywidual extends Client {
    String pesel;

    public Indywidual(int id, ClientType clientType, String shortName, String name, Adress adress);
    super(id,clientType,shortName,name,adress);
    this.pesel=pesel;

    public String pesel() {
        return pesel;
    }


}