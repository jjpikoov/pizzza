package pizzza.domain.admin

class Admin(){
  private var _id : Int = _
  private var _login : String = _
  private var _password : String = _
  private var _email : String = _

  def id = _id
  def login = _login
  def password = _password
  def email = _email

  def id_=(id : Int) : Unit = _id = id
  def login_=(login : String) : Unit = _login = login
  def password_=(password : String) : Unit = _password = password
  def email_=(email : String) : Unit = _email = email

}