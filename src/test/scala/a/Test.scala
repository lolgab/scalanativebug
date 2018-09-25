package a

import org.scalatest.FunSuite

import scala.annotation.tailrec
import scala.util.{Failure, Try}

class Test extends FunSuite {
  @tailrec
  final def loop[T](a: Try[T]): T = {
    a.get
    loop(a)
  }

  test("test") {
    loop(Failure(new Exception))
  }
}
