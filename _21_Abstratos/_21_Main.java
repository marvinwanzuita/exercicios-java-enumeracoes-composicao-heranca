package JavaCompleto.Exercicios._21_Abstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _21_Main {

  public static void main(String[] args) {

    System.out.println();
    System.out.println("EXERCICIO - CLASSES E METODOS ABSTRATOS");
    System.out.println("Fazer um programa para ler os dados de N contibuintes " +
            "(N fornecido pelo usuário), os quais podem ser pessoa física ou " +
            "pessoa jurídica, e depois mostrar o valor do imposto pago por cada " +
            "um, bem como o total de imposto arrecadado.\n" +
            "Os dados de pessoa física são: nome, renda anual e gastos com saúde. " +
            "Os dados de pessoa jurídica são nome, renda anual e número de " +
            "funcionários. As regras para o cálculo de imposto são as seguintes: \n" +
            "Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de " +
            "imposto. Pessoas com renda de 20000.00 em diante pagam 25% de imposto. " +
            "Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no " +
            "imposto. Exemplo: uma pessoa cuja renda foi de 50000.00 e teve 2000.00 " +
            "em gastos com saúde, o imposto fica: (50000 * 25%) - (2000 * 50%) = 11500.00.\n" +
            "Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa " +
            "possuir mais de 10 funcionários, ela paga 14% de imposto. Exemplo: " +
            "uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto " +
            "fica: 400000 * 14% = 56000");

    Scanner sc = new Scanner(System.in);

    System.out.println();
    System.out.print("Digite o número de contribuintes: ");
    int numeroContribuintes = sc.nextInt();

    List<_21_Pessoa> pessoasLista = new ArrayList<>();

    for (int i = 1; i <= numeroContribuintes; i++){

      System.out.println("Dados do contribuinte #" + i + " : ");
      int definirPessoa;

      do {
        System.out.print("(1): Pessoa Física | (2): Pessoa Jurídica? ");
        definirPessoa = sc.nextInt();
        sc.nextLine();

        switch (definirPessoa){
          case 1:
            _21_PessoaFisica pessoaFisica = new _21_PessoaFisica();

            System.out.print("Nome: ");
            pessoaFisica.setNomePessoa(sc.nextLine());

            System.out.print("Renda anual: ");
            pessoaFisica.setRendaAnual(sc.nextDouble());

            System.out.print("Gastos com saúde: ");
            pessoaFisica.setGastosSaude(sc.nextDouble());

            pessoasLista.add(pessoaFisica);

            break;
          case 2:

            _21_PessoaJuridica pessoaJuridica = new _21_PessoaJuridica();

            System.out.print("Nome: ");
            pessoaJuridica.setNomePessoa(sc.nextLine());

            System.out.print("Renda anual: ");
            pessoaJuridica.setRendaAnual(sc.nextDouble());

            System.out.print("Número de empregados: ");
            pessoaJuridica.setNumeroFuncionarios(sc.nextInt());

            pessoasLista.add(pessoaJuridica);

            break;
          default:
            System.out.println("Dígito incorreto!");
        }
      } while (definirPessoa != 1 && definirPessoa != 2);

    }

    System.out.println();
    System.out.println("IMPOSTOS PAGOS: ");
    Double totalImpostos = 0.0;
    for (_21_Pessoa pessoa : pessoasLista) {
      System.out.println(pessoa.getNomePessoa() + ": $ " + String.format("%.2f", pessoa.pagarImposto()));
      totalImpostos += pessoa.pagarImposto();
    }

    System.out.println();
    System.out.println("TOTAL DE IMPOSTOS: " + String.format("%.2f", totalImpostos));


  }
}
