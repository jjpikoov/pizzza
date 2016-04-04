package interfaces

import pizzza.domain.dish.Ingredient

/**
  * Created by jjpikoov on 4/4/16.
  */
trait IngredientService {
    def getAllIngredient : List[Ingredient]
    def addIngredient(i : Ingredient) : Unit
    def removeIngredient(i : Ingredient) : Boolean
}
