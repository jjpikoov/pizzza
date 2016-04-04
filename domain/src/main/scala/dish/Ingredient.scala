package pizzza.domain.dish

class Ingredient(){
  private var _id : Int = _
  private var _name : String = _
  private var _description : String = _
  private var _weight : Int = _

  def id : Int  = _id
  def name = _name
  def description = _description
  def weight = _weight

  def id_=(id : Int) : Unit = _id = id
  def name_=(name : String) : Unit = _name = name
  def description_=(desc : String) : Unit = _description = desc
  def weight_=(weight : Int) : Unit = _weight = weight
}