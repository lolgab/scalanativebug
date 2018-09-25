object Main {
  def f[T]: T = throw new Exception

  def f2[T](a: => T) = ()

  def main(args: Array[String]): Unit = f2(f)
}