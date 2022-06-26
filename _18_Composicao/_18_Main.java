package JavaCompleto.Exercicios._18_Composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class _18_Main {

  public static void main(String[] args) throws ParseException {

    System.out.println();
    System.out.println("EXERCÍCIO - COMPOSIÇÃO");
    System.out.println("Ler os dados de um pedido com N itens (N fornecido pelo usuário). " +
            "Depois, mostrar um sumário do pedido conforme exemplo (próxima página)." +
            "Nota: o instante do pedido deve ser o instante do sistema: new Date().");

    Scanner sc = new Scanner(System.in);
    _18_Client client = new _18_Client();
    _18_Order order = new _18_Order();

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdfMoment = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
    Calendar cal = Calendar.getInstance();

    System.out.println();
    System.out.println("Enter client data:");
    System.out.print("Name: ");
    client.setNameClient(sc.nextLine());

    System.out.print("Email: ");
    client.setEmail(sc.nextLine());

    System.out.print("Birth date (DD/MM/YYYY): ");
    client.setBirthDate(sdf.parse(sc.next()));

    int statusSelection;
    do {
      System.out.println("Enter order data: \n" +
              "0: Pending Payment;\n" +
              "1: Processing;\n" +
              "2: Shipped;\n" +
              "3: Delivered.");
      System.out.print("Status: ");
      statusSelection = sc.nextInt();
      if ((statusSelection != 0) &&
          (statusSelection != 1) &&
          (statusSelection != 2) &&
          (statusSelection != 3)) {
        System.out.println("Incorrect digit.");
      }
      order.orderStatus(statusSelection);
    } while ((statusSelection != 0) &&
             (statusSelection != 1) &&
             (statusSelection != 2) &&
             (statusSelection != 3));

    System.out.print("How many items to this order: ");
    int quantityOrders = sc.nextInt();


    for (int i = 1; i <= quantityOrders; i++){
      System.out.println("Enter #" + i + " item data: ");
      System.out.print("Product name: ");
      sc.nextLine();
      String productName = sc.nextLine();
      System.out.print("Product price: ");
      Double productPrice = sc.nextDouble();
      System.out.print("Quantity: ");
      int productQuantity = sc.nextInt();

      _18_Product product = new _18_Product(productName, productPrice);
      _18_OrderItem orderItem = new _18_OrderItem(productQuantity, product);
      orderItem.subTotal(product);
      order.addItem(orderItem);
    }

    System.out.println();
    System.out.println("ORDER SUMMARY: ");
    Date dateMoment = new Date();
    System.out.println("Order moment: " + sdfMoment.format(dateMoment));
    System.out.println("Order status: " + order.getOrderStatus());
    System.out.println("Client: " + client.getNameClient() +
                     " - " + sdf.format(client.getBirthDate()) +
                     " - " + client.getEmail());
    System.out.println("Order items: ");
    for (_18_OrderItem o : order.getOrderItemList()) {
      System.out.println(o);
    }
    System.out.println("Total price: $" + order.total());
  }


}
