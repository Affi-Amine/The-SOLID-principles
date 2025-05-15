# SOLID Principles Exercises Summary
## Single Responsibility Principle (SRP)
I refactored classes so that each one has only one responsibility. For example, I separated data management from formatting logic, making the code easier to maintain and extend.

## Open/Closed Principle (OCP)
I designed the code so that new features can be added by extending existing classes or interfaces, without modifying the core logic. This was achieved by introducing abstractions and removing conditional logic that checked for types.

## Liskov Substitution Principle (LSP)
I ensured that subclasses can be used in place of their parent classes without causing unexpected behavior. This involved creating concrete implementations for interfaces and making sure all subclasses followed the expected contract.

## Interface Segregation Principle (ISP)
I split large interfaces into smaller, more specific ones so that classes only implement the methods they actually use. This reduced unnecessary code and made the system more flexible.

## Dependency Inversion Principle (DIP)
I introduced abstractions (interfaces) so that high-level modules depend on these abstractions rather than concrete implementations. This decoupled the system, making it easier to swap out components and test the code.