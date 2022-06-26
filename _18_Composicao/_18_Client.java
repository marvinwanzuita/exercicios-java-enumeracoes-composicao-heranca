package JavaCompleto.Exercicios._18_Composicao;

import java.util.Date;

public class _18_Client {

  String nameClient;
  String email;
  Date birthDate;

  public _18_Client(){}

  public _18_Client(String nameClient, String email, Date birthDate) {
    this.nameClient = nameClient;
    this.email = email;
    this.birthDate = birthDate;
  }

  public String getNameClient() {
    return nameClient;
  }

  public void setNameClient(String nameClient) {
    this.nameClient = nameClient;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }
}
