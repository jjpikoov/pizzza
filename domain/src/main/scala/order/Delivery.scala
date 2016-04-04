package pizzza.domain.order

class Delivery(){
  private var _id : Int = _
  private var _clientId : Int = _
  private var _courierId : Int = _
  private var _city : String = _
  private var _address : String = _
  private var _status : String = _
  private var _courierContactNumber : Int = _

  def id = _id
  def clientId = _clientId
  def courierId = _courierId
  def city = _city
  def address = _address
  def status = _status
  def courierContactNumber = _courierContactNumber

  def id_=(id : Int) : Unit = _id = id
  def clientId_=(id : Int) : Unit = _clientId = id
  def courierId_=(courierId : Int) :Unit = _courierId = courierId
  def city_=(city:String):Unit = _city = city
  def address_=(address : String) : Unit = _address = address
  def status_=(status : String) : Unit = _status = status
  def courierContactNumber_=(contactNumber : Int) : Unit = _courierContactNumber = contactNumber
}