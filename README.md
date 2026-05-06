# delta-trace-log-grid

`delta-trace-log-grid` keeps a focused Scala implementation around observability. The project goal is to package a Scala local lab for log analysis with round-trip fixtures, lossless normalization checks, and documented operating limits.

## Reason For The Project

I want this repository to be useful as a quick reading exercise: fixtures first, implementation second, verifier last.

## Delta Trace Log Grid Review Notes

The first comparison I would make is `incident shape` against `span volume` because it shows where the rule is most opinionated.

## What It Does

- `fixtures/domain_review.csv` adds cases for span volume and latency skew.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/delta-trace-log-walkthrough.md` walks through the case spread.
- The Scala code includes a review path for `incident shape` and `span volume`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## How It Is Put Together

The repository has two validation layers: the original compact policy fixture and the domain review fixture. They are separate so one can change without hiding failures in the other.

The Scala implementation avoids hidden state so fixture changes are easy to reason about.

## Run It

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Check It

The check exercises the source code and the review fixture. `recovery` is the high score at 234; `baseline` is the low score at 105.

## Boundaries

The fixture set is small enough to audit by hand. The next useful expansion is malformed input coverage, not extra surface area.
