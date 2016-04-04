package pizzza.domain.order

import pizzza.domain.dish.Dish


class Order() {
  private var _id : Int = _
  private var _dishes: List[Dish] = _
  private var _delivery: Delivery = _
  private var _takenAt: java.text.DateFormat = _
  private var _finishedAt: java.text.DateFormat = _
  private var _status: String = _

  def id = _id
  def dishes = _dishes
  def delivery = _delivery
  def takenAt = _takenAt
  def finishedAt = _finishedAt
  def status = _status

  def id_=(id : Int) : Unit = _id = id
  def dishes_=(dishes: List[Dish]): Unit = _dishes = dishes
  def delivery_=(delivery: Delivery): Unit = _delivery = delivery
  def takenAt_=(time: java.text.DateFormat): Unit = _takenAt = time
  def finishedAt_=(time: java.text.DateFormat): Unit = _finishedAt = time
  def status_=(status: String): Unit = _status = status

  def totalCost: Int = {
    5
  }
}
