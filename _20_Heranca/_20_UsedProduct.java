package JavaCompleto.Exercicios._20_Heranca;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _20_UsedProduct extends _20_Product{

  private Date manufactureDate;

  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public _20_UsedProduct(){
    super();
  }

  public Date getManufactureDate() {
    return manufactureDate;
  }

  public void setManufactureDate(Date manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  public String priceTag(){
    return super.getName() + " (used) $ " + String.format("%.2f", super.getPriceProduct()) +
            " (Manufacture date: " + sdf.format(manufactureDate) + ")";
  }
}
