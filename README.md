# Java Backend Practice

A structured, daily practice log covering core Java, algorithmic problem-solving, and backend engineering fundamentals — built incrementally as a foundation for production-grade Spring Boot systems.

Each entry favors correctness verified through testing, clean naming, and single-responsibility methods over quick solutions.

## Stack
Java 25 (LTS) · IntelliJ IDEA

## Fundamentals

Conditionals, loop constructs (`for`/`while`/`do-while`), method design (pass-by-value semantics, variable scope, overloading), classic algorithms (factorial, GCD via Euclidean algorithm, primality testing, Armstrong numbers), manual string manipulation (reversal and palindrome checks via two-pointer technique), arrays and the stack/heap memory model, 2D arrays and matrix operations (diagonal sum, transpose), ArrayList with full CRUD, and an interactive calculator with guarded division and invalid-input handling.

| Topic | Files |
|---|---|
| Conditionals | [`fundamentals/conditionals`](src/fundamentals/conditionals) |
| Loops | [`fundamentals/loops`](src/fundamentals/loops) |
| Methods & algorithms | [`fundamentals/methods`](src/fundamentals/methods) |
| Arrays & 2D arrays | [`fundamentals/arrays`](src/fundamentals/arrays) |
| ArrayList | [`fundamentals/arraylist`](src/fundamentals/arraylist) |
| Calculator (loops, break, safe division) | [`fundamentals/calculator`](src/fundamentals/calculator) |

## Object-Oriented Programming

Encapsulation (private fields with validated access), constructors and constructor overloading via `this(...)` chaining, inheritance via `extends` and `super`, method overriding with `@Override`, polymorphism through dynamic method dispatch, abstract classes and interfaces, and composition (HAS-A relationships) as an alternative to inheritance.

| Topic | Files |
|---|---|
| Encapsulation, constructors, `this` | [`oop/encapsulation`](src/oop/encapsulation) |
| Inheritance, polymorphism, abstract classes, interfaces | [`oop/shapes`](src/oop/shapes) |

## Collections

HashMap fundamentals — CRUD operations and the key-value counting pattern applied to real text processing, including why iteration order is not guaranteed. HashSet for O(n) deduplication of a real user list, replacing the O(n²) nested-loop comparison used earlier.

| Topic | Files |
|---|---|
| HashMap | [`collections/hashmap`](src/collections/hashmap) |

## Generics

A generic `Stack<T>` built entirely from scratch — no `java.util.Stack`, no Collections API — backed by a plain `Object[]` array with manual resizing when capacity is exceeded. Demonstrates type parameters, unchecked casting with `@SuppressWarnings`, and LIFO (Last In, First Out) semantics.

| Topic | Files |
|---|---|
| Generic Stack | [`generics/stack`](src/generics/stack) |

## Applied Projects

Larger builds combining multiple concepts into a single working system, tested against edge cases rather than just the happy path.

| Project | Description | Files |
|---|---|---|
| Student Tracker | Menu-driven CLI on parallel ArrayLists — full CRUD with duplicate-name and grade-range validation, linear search, a manual highest-to-lowest sort with synchronized swaps, and aggregate statistics | [`projects/studenttracker`](src/projects/studenttracker) |
| Library System | Composition-based design — `Loan` holds references to `Book` and `Member`, mutating the book's availability state on borrow and return, with a guard preventing a double loan on an already-borrowed book | [`projects/librarysystem`](src/projects/librarysystem) |

## Conventions
- One method, one responsibility
- Every exercise includes tested edge cases, not just the happy path
- Package structure organized by topic (`fundamentals`, `oop`, `collections`, `projects`), not by day or week
- Commit messages follow `feat:` / `fix:` / `docs:` / `test:` / `chore:` prefixes