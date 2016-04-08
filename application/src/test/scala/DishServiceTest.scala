import Repository.DishIM
import main.scala.interfaces.IDishService
import org.scalatest._
import pizzza.domain.dish.Dish
/**
  * Created by jjpikoov on 4/6/16.
  */
class DishServiceTest extends FlatSpec {


  "New instance's dishes list" should "be empty" in {
    val dishService = new DishService()

//    print(dishService)
//    assert(dishService.getAllDishes == null)
//    assert(dishService.getAllDishes.size == 2)
//    assert()
    info(dishService.getAllDishes().size.toString)
//    val dim = new DishIM()
//    assert(dim.findAll().size == 0)
//    var d = new Dish
//
//    dim.insert(d)
//    assert(dim.findAll().size == 1)
  }
}