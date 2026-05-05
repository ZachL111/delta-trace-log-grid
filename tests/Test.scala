object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(58, 75, 15, 22, 11)
    assert(Policy.score(signalcase_1) == 106)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(91, 94, 17, 20, 7)
    assert(Policy.score(signalcase_2) == 183)
    assert(Policy.classify(signalcase_2) == "accept")
    val signalcase_3 = Signal(69, 92, 23, 17, 11)
    assert(Policy.score(signalcase_3) == 149)
    assert(Policy.classify(signalcase_3) == "review")
  }
}
