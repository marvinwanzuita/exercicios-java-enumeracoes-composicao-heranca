package JavaCompleto.Exercicios._19_Heranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _19_Main {

  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCICIO - HERANÇA");
    System.out.println("Uma empresa possui funcionários próprios e terceirizados. " +
            "Para cada funcionário, deseja-se registrar nome, horas trabalhadas " +
            "e valor por hora. Funcionários terceirizado possuem ainda uma " +
            "despesa adicional.\n" +
            "O pagamento dos funcionários corresponde ao valor da hora multiplicado " +
            "pelas horas trabalhadas, sendo que os funcionários terceirizados ainda " +
            "recebem um bônus correspodente a 110% de sua despesa adicional.\n" +
            "Fazer um programa para ler os dados de N funcionários (N fornecido " +
            "pelo usuário) e armazená-los em uma lista. Depois de ler todos os " +
            "dados, mostrar nome e pagamento de cada funcinário na mesma ordem " +
            "em que foram digitados.");

    Scanner sc = new Scanner(System.in);

    List<_19_Employee> employees = new ArrayList<>();

    System.out.println();
    System.out.print("Enter the number of employees: ");
    int numberEmployees = sc.nextInt();

    for (int i = 1; i <= numberEmployees; i++){

      System.out.println("Employee #" + i + " data: ");
      int isEmployee;
      do{
        System.out.print("Outsourced: (1: yes | 2: no) ");
        isEmployee = sc.nextInt();
        sc.nextLine();
        switch (isEmployee){
          case 2:

            _19_Employee employee = new _19_Employee();
            System.out.print("Name: ");
            employee.setEmployeeName(sc.nextLine());

            System.out.print("Hours: ");
            employee.setHours(sc.nextInt());

            System.out.print("Value per hour: ");
            employee.setValuePerHour(sc.nextDouble());

            employees.add(employee);

            break;

          case 1:

            _19_OutsourcedEmployee outsourcedEmployee = new _19_OutsourcedEmployee();
            System.out.print("Name: ");
            outsourcedEmployee.setEmployeeName(sc.nextLine());

            System.out.print("Hours: ");
            outsourcedEmployee.setHours(sc.nextInt());

            System.out.print("Value per hour: ");
            outsourcedEmployee.setValuePerHour(sc.nextDouble());

            System.out.print("Adicional charge: ");
            outsourcedEmployee.setAdditionalCharge(sc.nextDouble());

            employees.add(outsourcedEmployee);

            break;
          default:
            System.out.println("Incorrect digit.");
        }
      } while (isEmployee != 1 && isEmployee != 2);

    }

    System.out.println();
    System.out.println("PAYMENTS: ");
    for (_19_Employee employee : employees) {
      System.out.println(employee);
    }

  }
}
