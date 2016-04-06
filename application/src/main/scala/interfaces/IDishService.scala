package main.scala.interfaces

import pizzza.domain.dish.Dish

/**
  * Created by jjpikoov on 4/4/16.
  */
trait IDishService {
  def getAllDishes : List[Dish]
  def addDish(d : Dish) : Unit
  def removeDish(d : Dish) : Boolean
}
