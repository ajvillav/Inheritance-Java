package domain;

import java.util.Date;

public class Client extends Person {

    private int idClient;
    private Date registerDate;
    private boolean vip;
    private static int clientCounter;

    public Client() {
    }

    public Client(String nombre, boolean vip) {
        super(nombre);
        this.idClient = ++Client.clientCounter;
        this.vip = vip;
    }

    public Client(boolean vip,Date registerDate, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idClient = ++Client.clientCounter;
        this.vip = vip;
        this.registerDate = registerDate;
    }

    public int getIdClient() {
        return idClient;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client{idClient=").append(idClient);
        sb.append(", registerDate=").append(registerDate);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
