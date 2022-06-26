package JavaCompleto.Exercicios._16_EX_Enumeracoes;

import java.util.List;

public class _16_Worker {

  private String nameWorker;
  private _16_WorkerLevel level;
  private Double baseSalary;

  public _16_Worker(){}

  public _16_Worker(String nameWorker, _16_WorkerLevel level, Double baseSalary) {
    this.nameWorker = nameWorker;
    this.level = level;
    this.baseSalary = baseSalary;
  }

  public String getNameWorker() {
    return nameWorker;
  }

  public void setNameWorker(String nameWorker) {
    this.nameWorker = nameWorker;
  }

  public _16_WorkerLevel getLevel() {
    return level;
  }

  public void setLevel(_16_WorkerLevel level) {
    this.level = level;
  }

  public Double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }


//  public void addContract(_16_HourContract contract){
//    contractLists.add(contract);
//  }
//
//
//  public void removeContract(_16_HourContract contract){
//    contractLists.remove(contract);
//  }

//  public Double income(Integer year, Integer month){
//
//  }



}
