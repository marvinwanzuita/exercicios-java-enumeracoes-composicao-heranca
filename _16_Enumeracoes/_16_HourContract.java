package JavaCompleto.Exercicios._16_EX_Enumeracoes;

import java.util.Date;

public class _16_HourContract {

  private Date dateContract;
  private Double valuePerHour;
  private Integer hoursContract;

  public _16_HourContract(){}

  public _16_HourContract(Date dateContract, Double valuePerHour, Integer hoursContract) {
    this.dateContract = dateContract;
    this.valuePerHour = valuePerHour;
    this.hoursContract = hoursContract;
  }

  public Date getDateContract() {
    return dateContract;
  }

  public void setDateContract(Date dateContract) {
    this.dateContract = dateContract;
  }

  public Double getValuePerHour() {
    return valuePerHour;
  }

  public void setValuePerHour(Double valuePerHour) {
    this.valuePerHour = valuePerHour;
  }

  public Integer getHoursContract() {
    return hoursContract;
  }

  public void setHoursContract(Integer hoursContract) {
    this.hoursContract = hoursContract;
  }

  public Double totalValue(){
   return valuePerHour * hoursContract;
  }

  @Override
  public String toString() {
    return "_16_HourContract{" +
            "dateContract=" + dateContract +
            ", valuePerHour=" + valuePerHour +
            ", hoursContract=" + hoursContract +
            '}';
  }
}
