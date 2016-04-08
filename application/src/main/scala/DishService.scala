import Repository.DishIM
import main.scala.interfaces.IDishService
import pizzza.domain.dish.Dish
import pizzza.domain.dish.repository.IDishRepository

/**
  * Created by jjpikoov on 4/4/16.
  */
class DishService extends IDishService{

  private var _dishRepository : IDishRepository = new DishIM()
  def DishService() = {
    _dishRepository = new DishIM()
  }
  def DishService(repository : IDishRepository) = {_dishRepository = repository}

  override def getAllDishes() : List[Dish] = _dishRepository.findAll()
  override def removeDish(d: Dish): Boolean = {
    val x = _dishRepository.delete(d.id)
    x match {
      case Some(d) => true
      case None => false
    }
  }

  override def addDish(d: Dish): Unit = _dishRepository.insert(d)
}
