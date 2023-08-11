import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should;

class GreeterTest extends AnyFlatSpec with should.Matchers {
  "Greeter" should "return the appropriate greeting" in {
    val greeter = new Greeter()
    greeter.sayHello("Dorian") should equal("Hello, Dorian!")
  }
}