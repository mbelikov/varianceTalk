trait Ingredients {
  def isVegan: Boolean
}
trait Vegetables extends Ingredients {
  val isVegan: Boolean = true
}

trait Meat extends Ingredients {
  val isVegan: Boolean = false
}

case object Apple extends Vegetables
case object Banana extends Vegetables
case object Onion extends Vegetables
case object Garlic extends Vegetables

case object RedMeat extends Meat
case object Fish extends Meat

trait Food
case object Pizza extends Food
case object Soup extends Food
case object XmasGoose extends Food

object Main extends App {
  type Cooking = Ingredients => Food
  type VeganCooking = Vegetables => Food
  type PizzaCooking = Ingredients => Pizza.type

  trait BuyList[T]

  val listOfVegetables: BuyList[Vegetables] = ???
//  val listOfIngridients: BuyList[Ingredients] = listOfVegetables

  def fx1(cook: VeganCooking): Food = ???
  def fx2(cook: PizzaCooking): Food = ???

  val pizzaCook: PizzaCooking = ???
  val veganCook: VeganCooking = ???

  fx1(veganCook) // ok per def

  fx1(pizzaCook)
//  fx2(veganCook) // compilation error

  // i.e. pizzaCook can be veganCook but
  // veganCook cannot be a pizzaCook
  // does it make sense for you?

//  type ZIO[-R, +E, +A]
}
