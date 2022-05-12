package components;

public class Client {

    private String name;
    private String documentNumber;

    public Client(String name, String documentNumber) {
        this.name = name;
        this.documentNumber = documentNumber;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
}
