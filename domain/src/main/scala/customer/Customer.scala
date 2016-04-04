package pizzza.domain.customer

import pizzza.domain.order.Order


class Customer(){
  private var _id : Int = _
  private var _firstName : String = _
  private var _surname : String = _
  private var _email : String = _
  private var _password : String = _
  private var _confirmedEmail : Boolean = _
  private var _phoneNumber : Int = _
  private var _orders : List[Order] = _

  def id : Int = _id
  def firstName = _firstName
  def surname = _surname
  def email = _email
  def password = _password
  def confirmedEmail = _confirmedEmail
  def phoneNumber = _phoneNumber
  def orders = _orders

  def id_=(id : Int) = _id = id
  def firstName_=(firstName : String) : Unit = _firstName = firstName
  def surname_=(surname : String) : Unit = _surname = surname
  def email_=(email : String) : Unit = _email = email
  def password_=(password : String) : Unit = _password = password
  def confirmedEmail_=(confirmed : Boolean) : Unit  = _confirmedEmail = confirmed
  def phoneNumber_=(number : Int) : Unit = _phoneNumber = number
  def orders_=(orders : List[Order]) : Unit = _orders = orders

}