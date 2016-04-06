import pizzza.domain.dish.{Dish, Ingredient}

class DishObjectMother {
  def DishWithoutIngredients : Dish = {
    val dish = new Dish
    dish.ingredients = List[Ingredient]()
//    d.id = 1
//    d.name = "name"
//    d.isAvaiable = true
//    d.cost = 1
    return dish
    }
}