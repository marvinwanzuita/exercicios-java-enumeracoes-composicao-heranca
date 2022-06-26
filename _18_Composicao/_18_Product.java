package JavaCompleto.Exercicios._18_Composicao;

public class _18_Product {

  private String nameProduct;
  private Double price;

  public _18_Product(){}

  public _18_Product(String nameProduct, Double price) {
    this.nameProduct = nameProduct;
    this.price = price;
  }

  public String getNameProduct() {
    return nameProduct;
  }

  public void setNameProduct(String nameProduct) {
    this.nameProduct = nameProduct;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }
}
