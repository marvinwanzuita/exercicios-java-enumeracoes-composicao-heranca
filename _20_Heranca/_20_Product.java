package JavaCompleto.Exercicios._20_Heranca;

public class _20_Product {

  private String name;
  private Double priceProduct;

  public _20_Product(){}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPriceProduct() {
    return priceProduct;
  }

  public void setPriceProduct(Double priceProduct) {
    this.priceProduct = priceProduct;
  }

  public String priceTag(){
    return name + " $ " + String.format("%.2f", priceProduct);
  }


}
