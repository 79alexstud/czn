package Lab7;

public class User {
    private String fio;
    private String login;
    private String phone;

    public User(String fio, String login, String phone) {
        this.fio = fio;
        this.login = login;
        this.phone = phone;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String login) {
        this.phone = login;
    }


    public String getInfo(){
        return "{"+ "fio" +fio +'\''+
                ", login=" +login+
                ", phone="+phone+'\''+'}';
    }

}