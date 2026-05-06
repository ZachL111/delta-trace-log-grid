# Field Notes

`delta-trace-log-grid` is easiest to review by starting with the fixture, not the prose.

The domain cases cover `span volume`, `latency skew`, `signal loss`, and `incident shape`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

The widest spread is between `incident shape` and `span volume`, so those are the first two cases I would preserve during a refactor.

The extra check gives the repository a behavior path that can fail for a domain reason, not only a syntax reason.
