package JavaCompleto.Exercicios._18_Composicao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class _18_Order {

  private Date moment;
  _18_OrderStatus OrderStatus;

  List<_18_OrderItem> orderItemList = new ArrayList<>();

  public _18_Order(){}

  public _18_Order(Date moment, _18_OrderStatus orderStatus, List<_18_OrderItem> orderItemList) {
    this.moment = moment;
    OrderStatus = orderStatus;
    this.orderItemList = orderItemList;
  }

  public Date getMoment() {
    return moment;
  }

  public void setMoment(Date moment) {
    this.moment = moment;
  }

  public _18_OrderStatus getOrderStatus() {
    return OrderStatus;
  }

  public void setOrderStatus(_18_OrderStatus orderStatus) {
    OrderStatus = orderStatus;
  }

  public List<_18_OrderItem> getOrderItemList() {
    return orderItemList;
  }

  public void orderStatus(int status){
    switch (status){
      case 0:
        OrderStatus = _18_OrderStatus.valueOf("PENDING_PAYMENT");
        break;
      case 1:
        OrderStatus = _18_OrderStatus.valueOf("PROCESSING");
        break;
      case 2:
        OrderStatus = _18_OrderStatus.valueOf("SHIPPED");
        break;
      case 3:
        OrderStatus = _18_OrderStatus.valueOf("DELIVERED");
        break;
    }
  }

  public void addItem(_18_OrderItem orderItem){
    orderItemList.add(orderItem);
  }

  public void removeItem(_18_OrderItem orderItem){
    orderItemList.remove(orderItem);
  }

  public Double total(){
    Double total = 0.0;
    for (_18_OrderItem o : orderItemList) {
      total += o.getPriceTotal();
    }
    return total;
  };

}
