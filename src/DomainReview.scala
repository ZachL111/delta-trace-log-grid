case class DomainReview(signal: Int, slack: Int, drag: Int, confidence: Int)

object DomainReviewLens {
  def score(item: DomainReview): Int = item.signal * 2 + item.slack + item.confidence - item.drag * 3

  def lane(item: DomainReview): String = {
    val value = score(item)
    if (value >= 140) "ship" else if (value >= 105) "watch" else "hold"
  }
}
