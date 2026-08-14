# Java Backend Practice

A structured, daily practice log covering core Java, algorithmic problem-solving, and backend engineering fundamentals — built incrementally as a foundation for production-grade Spring Boot systems.

Each entry favors correctness verified through testing, clean naming, and single-responsibility methods over quick solutions.

## Stack
Java 25 (LTS) · IntelliJ IDEA

## Progress Log

| Day | Topics | Files |
|---|---|---|
| 01 | Conditionals, loop constructs (`for`/`while`/`do-while`), character/ASCII comparison, digit manipulation (Fibonacci sequence, digit counting, integer reversal), an interactive calculator with guarded division and invalid-input handling | [`week1/day1`](src/week1/day1) |
| 02 | Switch statements (classic, enhanced, nested), method design (pass-by-value semantics, variable scope, overloading), classic algorithms (factorial, GCD via Euclidean algorithm, primality testing, Armstrong numbers), manual string manipulation (reversal and palindrome checks via two-pointer technique) | [`week1/day2`](src/week1/day2) |
| 03 | Arrays and the stack/heap memory model, aggregation methods (max, min, sum), in-place reversal via two-pointer swapping | [`week1/day3`](src/week1/day3) |

## Conventions
- One method, one responsibility
- Every exercise includes tested edge cases, not just the happy path
- Package structure: `week{n}.day{n}`
- Commit messages follow `feat:` / `fix:` / `docs:` / `test:` / `chore:` prefixes