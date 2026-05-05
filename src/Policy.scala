case class Signal(demand: Int, capacity: Int, latency: Int, risk: Int, weight: Int)

object Policy {
  private val threshold = 150
  private val riskPenalty = 4
  private val latencyPenalty = 2
  private val weightBonus = 3

  def score(signal: Signal): Int =
    signal.demand * 2 + signal.capacity + signal.weight * weightBonus -
      signal.latency * latencyPenalty - signal.risk * riskPenalty

  def classify(signal: Signal): String =
    if (score(signal) >= threshold) "accept" else "review"
}
