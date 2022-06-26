package JavaCompleto.Exercicios._20_Heranca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class _20_Main {
  public static void main(String[] args) throws ParseException {

    System.out.println();
    System.out.println("EXERCICIO - HERANCA");
    System.out.println("Fazer um programa para ler os dados de N produtos " +
            "(N fornecido pelo usuário). Ao final, mostrar a etiqueta de " +
            "preço de cada produto na mesma ordem em que foram digitados.\n" +
            "Todo produto possui nome e preço. Produtos importados possuem " +
            "uma taxa de alfândega, e produtos usados possuem data de " +
            "fabricação. Estes dados especifícos devem ser acrescentados " +
            "na etiqueta de preço. Para produtos importados, a taxa de " +
            "alfândega deve ser acrescentada ao preço final do produto.");


    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println();
    System.out.print("Enter the number of products: ");
    int numberProducts = sc.nextInt();

    List<_20_Product> productList = new ArrayList<>();

    int chosenProduct;

    for (int i = 1; i <= numberProducts; i++) {

      System.out.println("--- \t Product #" + i + " data: \t---");
      do {
        System.out.println("Choose product type:\n" +
                "(1) Common;\n" +
                "(2) Used;\n" +
                "(3) Imported.");
        chosenProduct = sc.nextInt();
        sc.nextLine();
        if ((chosenProduct != 1) &&
            (chosenProduct != 2) &&
            (chosenProduct != 3)) {
          System.out.println("Incorrect digit.");
        }
      } while ((chosenProduct != 1) &&
              (chosenProduct != 2) &&
              (chosenProduct != 3));


      switch (chosenProduct) {
        case 1:

          _20_Product commonProduct = new _20_Product();
          System.out.print("Name: ");
          commonProduct.setName(sc.nextLine());

          System.out.print("Price: ");
          commonProduct.setPriceProduct(sc.nextDouble());

          productList.add(commonProduct);

          break;

        case 2:

          _20_UsedProduct usedProduct = new _20_UsedProduct();
          Calendar cal = Calendar.getInstance();

          System.out.print("Name: ");
          usedProduct.setName(sc.nextLine());

          System.out.print("Price: ");
          usedProduct.setPriceProduct(sc.nextDouble());

          System.out.print("Manufacture date: (DD/MM/YYYY)");
          usedProduct.setManufactureDate(sdf.parse(sc.next()));

          productList.add(usedProduct);

          break;

        case 3:
          _20_ImportedProduct importedProduct = new _20_ImportedProduct();
          System.out.print("Name: ");
          importedProduct.setName(sc.nextLine());

          System.out.print("Price: ");
          importedProduct.setPriceProduct(sc.nextDouble());

          System.out.print("Customs fee: ");
          importedProduct.setCustomsFee(sc.nextDouble());

          productList.add(importedProduct);

          break;
      }

    }

    System.out.println("--- \tPRICE TAGS: \t---");
    for (_20_Product product : productList) {
      System.out.println(product.priceTag());
    }


  }
}
