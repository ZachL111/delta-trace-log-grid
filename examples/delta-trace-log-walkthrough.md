# Delta Trace Log Grid Walkthrough

I use this file as a small checklist before changing the Scala implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 105 | watch |
| stress | latency skew | 156 | ship |
| edge | signal loss | 161 | ship |
| recovery | incident shape | 234 | ship |
| stale | span volume | 196 | ship |

Start with `recovery` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

`recovery` is the optimistic case; use it to make sure the scoring path still rewards strong signal.
