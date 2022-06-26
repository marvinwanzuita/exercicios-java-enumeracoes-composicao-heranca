package JavaCompleto.Exercicios._16_EX_Enumeracoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class _16_Main {

  public static void main(String[] args) throws ParseException {

    System.out.println("EXERCICÍO: ENUMERAÇÕES E COMPOSIÇÃO ");
    System.out.println("Ler os dados de um trabalhador com N contratos\n" +
            "(N fornecido pelo usuário). Depois, solicitar do usuário um mês\n" +
            "e mostrar qual foi o salário do funcionário nesse mês: ");

    Scanner sc = new Scanner(System.in);
    Scanner scDate = new Scanner(System.in);
    Calendar cal = Calendar.getInstance();

    _16_Departament departament = new _16_Departament();
    _16_Worker worker = new _16_Worker();
    SimpleDateFormat sdfContract = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdfIncome = new SimpleDateFormat("MM/yyyy");

    System.out.println();
    System.out.print("Enter department's name: ");
    departament.setNameDepartament(sc.nextLine());

    System.out.println("Enter worker data:");
    System.out.print("Name: ");
    worker.setNameWorker(sc.nextLine());

    System.out.print("Level: ");
    _16_WorkerLevel level = _16_WorkerLevel.valueOf(sc.nextLine());

    System.out.print("Base salary: ");
    worker.setBaseSalary(sc.nextDouble());

    System.out.print("How many contracts to this worker? ");
    int quantityContracts = sc.nextInt();

    List<_16_HourContract> listHourContracts = new ArrayList<>();

    for (int i = 0; i < quantityContracts; i++){
      System.out.println("Enter contract #" + (i + 1) + " data: ");
      _16_HourContract contract = new _16_HourContract();

      System.out.print("Date (DD/MM/YYYY): ");
      String dateString = scDate.nextLine();
      Date dateContract = sdfContract.parse(dateString);
      sdfContract.format(dateContract);
      contract.setDateContract(dateContract);

      System.out.print("Value per hour: $ ");
      contract.setValuePerHour(sc.nextDouble());

      System.out.print("Duration: (hours): ");
      contract.setHoursContract(sc.nextInt());

      listHourContracts.add(contract);
    }

    System.out.println();
    System.out.println("Enter month and year to calculate income" +
            "(MM/YYYY");
    String dateString = scDate.nextLine();
    Date dateIncome = sdfIncome.parse(dateString);
    sdfIncome.format(dateIncome);
    cal.setTime(dateIncome);

    int monthIncome = 1 + cal.get(Calendar.MONTH);
    int yearIncome = cal.get(Calendar.YEAR);
    Double totalIncome = worker.getBaseSalary();

    for (_16_HourContract hourContract : listHourContracts) {
      cal.setTime(hourContract.getDateContract());
      int monthContract = 1 + cal.get(Calendar.MONTH);
      int yearContract = cal.get(Calendar.YEAR);

      if((monthContract == monthIncome) && (yearContract == yearIncome)){

        totalIncome += hourContract.totalValue();

      }

    }

    System.out.println("Name: " + worker.getNameWorker());
    System.out.println("Departament: " + departament.getNameDepartament());
    System.out.println("Income for " + monthIncome + "/" + yearIncome + ": "
                      + totalIncome);

  }




}
