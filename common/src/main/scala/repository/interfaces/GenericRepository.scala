package pizzza.common.repository.interfaces

trait GenericRepository[T] {
  def insert(x : T) : Unit
  def delete(id : Int) : Option[T]
  def find(id : Int) : Option[T]
  def findAll() : List[T]
}