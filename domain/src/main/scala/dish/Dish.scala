package pizzza.domain.dish

class Dish(){
  private var _id : Int = _
  private var _name : String = _
  private var _isAvaiable : Boolean = _
  private var _cost : Int = _
  private var _totalWeight : Int = _
  private var _ingredients : List[Ingredient] = _

  def id = _id
  def name = _name
  def isAvaiable = _isAvaiable
  def cost = _cost
  def totalWeight = _totalWeight
  def ingredients = _ingredients

  def id_=(id : Int) = _id = id
  def name_=(name : String) : Unit = _name = name
  def isAvaiable_=(isAvaiable : Boolean) : Unit = _isAvaiable = isAvaiable
  def cost_=(cost : Int) : Unit = _cost = cost
  def total_=(totalWeight : Int ) : Unit = _totalWeight = totalWeight
  def ingredients_=(ingredients : List[Ingredient]) = _ingredients = ingredients
}