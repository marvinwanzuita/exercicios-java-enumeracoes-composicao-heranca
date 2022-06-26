package JavaCompleto.Exercicios._20_Heranca;

public class _20_ImportedProduct extends _20_Product{

  private Double customsFee;

  public _20_ImportedProduct(){
    super();
  }

  public Double getCustomsFee() {
    return customsFee;
  }

  public void setCustomsFee(Double customsFee) {
    this.customsFee = customsFee;
  }

  public String priceTag(){
    return super.getName() + " $ " + String.format("%.2f", totalPrice())
            + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
  }

  public Double totalPrice(){
    return super.getPriceProduct() + customsFee;

  }

}
