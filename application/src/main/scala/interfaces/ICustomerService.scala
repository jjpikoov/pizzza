package interfaces

import pizzza.domain.customer.Customer

/**
  * Created by jjpikoov on 4/4/16.
  */
trait ICustomerService {
  def getAllCustomers : List[Customer]
  def addCustomer(c : Customer) : Unit
  def removeCustomer(c : Customer) : Boolean
}
