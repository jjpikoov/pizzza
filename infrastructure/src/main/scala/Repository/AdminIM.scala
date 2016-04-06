package main.scala.Repository
import pizzza.domain.admin.repository.IAdminRepository
import pizzza.domain.admin.Admin


/**
  * Created by jjpikoov on 3/30/16.
  */
class AdminIM extends IAdminRepository {
  var _admins: List[Admin] = Nil

  def AdminIM = {

    val a1 = new Admin
    a1.id = 1
    a1.email = "1@1.pl"
    a1.login = "l1"
    a1.password = "p1"

    _admins :+ a1


    val a2 = new Admin
    a2.id = 2
    a2.email = "2@2l"
    a2.login = "l2"
    a2.password = "p2"

    _admins :+ a2

  }

  override def insert(x: Admin): Unit = _admins :+ x

  override def findAll: List[Admin] = _admins

  override def delete(id: Int): Option[Admin] = {
    var res: Option[Admin] = None
    _admins = _admins.foldLeft(List[Admin]())((la, a) => if (a.id != id) la :+ a else {res = Some(a); la})
    return res;
  }

  override def find(id: Int): Option[Admin] = _admins.find(a => a.id == id)
}
