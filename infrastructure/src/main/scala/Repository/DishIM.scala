package Repository

import pizzza.domain.dish.repository.IDishRepository
import pizzza.domain.dish.{Dish, Ingredient}

/**
  * Created by jjpikoov on 4/4/16.
  */
class DishIM extends IDishRepository{
  var _dishes : List[Dish] = List[Dish]()

  def DishIM() = {
    val d1 = new Dish
    d1.id = 1
    d1.name = "d1"
    d1.isAvaiable = true
    d1.cost = 10
    d1.totalWeight = 10
    val i1 = new Ingredient
    i1.id = 1
    i1.name = "i1"
    d1.ingredients :+ i1

    _dishes = _dishes :+ d1


    val d2 = new Dish
    d2.id = 2
    d2.name = "d2"
    d2.isAvaiable = false
    d2.cost = 20
    d2.totalWeight = 20
    val i2 = new Ingredient
    i2.id = 1
    i2.name = "i1"
    d2.ingredients :+ i1
    d2.ingredients :+ i2

    _dishes = _dishes :+ d2

  }

  override def insert(x: Dish): Unit = _dishes :+ x

  override def findAll() : List[Dish] = _dishes

  override def delete(id: Int): Option[Dish] = {
    var res: Option[Dish] = None
    _dishes = _dishes.foldLeft(List[Dish]())((la, a) => if (a.id != id) la :+ a else {res = Some(a); la})
    return res;
  }

  override def find(id: Int): Option[Dish] = _dishes.find(a => a.id == id)
}



