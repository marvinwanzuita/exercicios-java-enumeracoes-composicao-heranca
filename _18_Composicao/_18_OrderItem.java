package JavaCompleto.Exercicios._18_Composicao;

import java.util.ArrayList;
import java.util.List;

public class _18_OrderItem {

  private Integer quantity;
  private Double priceTotal;

  private _18_Product product;

  public _18_OrderItem(Integer quantity, _18_Product product) {
    this.quantity = quantity;
    this.product = product;
  }


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getPriceTotal() {
    return priceTotal;
  }

  public void setPriceTotal(Double priceTotal) {
    this.priceTotal = priceTotal;
  }

  public _18_Product getProduct() {
    return product;
  }

  public void setProduct(_18_Product product) {
    this.product = product;
  }

  public Double subTotal(_18_Product product) {
    this.priceTotal = quantity * product.getPrice();
    return priceTotal;
  }

  @Override
  public String toString() {
    return product.getNameProduct() + ", $" +
            product.getPrice() +
            ", Quantity: " + quantity +
            ", Subtotal: " + priceTotal;
  }
}
