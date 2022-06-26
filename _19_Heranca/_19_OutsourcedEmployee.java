package JavaCompleto.Exercicios._19_Heranca;

public class _19_OutsourcedEmployee extends _19_Employee{

  private Double additionalCharge;

  public _19_OutsourcedEmployee(){}
  public _19_OutsourcedEmployee(String employeeName, Integer hours, Double valuePerHour) {
    super(employeeName, hours, valuePerHour);
  }


  public Double getAdditionalCharge() {
    return additionalCharge;
  }

  public void setAdditionalCharge(Double additionalCharge) {
    this.additionalCharge = additionalCharge;
  }

  @Override
  public String toString() {
    return employeeName + " - $ " + (payment() + (additionalCharge * 1.1));
  }
}
