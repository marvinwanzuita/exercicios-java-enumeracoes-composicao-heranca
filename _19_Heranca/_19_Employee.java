package JavaCompleto.Exercicios._19_Heranca;

public class _19_Employee {

  protected String employeeName;
  private Integer hours;
  private Double valuePerHour;


  public _19_Employee(){}
  public _19_Employee(String employeeName, Integer hours, Double valuePerHour) {
    this.employeeName = employeeName;
    this.hours = hours;
    this.valuePerHour = valuePerHour;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public Integer getHours() {
    return hours;
  }

  public void setHours(Integer hours) {
    this.hours = hours;
  }

  public Double getValuePerHour() {
    return valuePerHour;
  }

  public void setValuePerHour(Double valuePerHour) {
    this.valuePerHour = valuePerHour;
  }

  public Double payment(){
    return hours * valuePerHour;
  }

  @Override
  public String toString() {
    return employeeName + " - $ " + payment();
  }
}
