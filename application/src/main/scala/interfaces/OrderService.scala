package interfaces

import pizzza.domain.order.Order

/**
  * Created by jjpikoov on 4/4/16.
  */
trait OrderService {
  def getAllOrders : List[Order]
  def addOrder(o : Order) : Unit
  def removeOrder(o : Order) : Boolean
}
