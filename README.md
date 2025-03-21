# SOLID Principles 

## Overview

This repository demonstrates the application of SOLID principles in Java. Each principle is exemplified through dedicated code examples to illustrate proper software design practices.

## SOLID Principles

SOLID is an acronym representing five key principles of object-oriented design:

1. **Single Responsibility Principle (SRP):**
   - A class should have only one reason to change, meaning it should have only one job or responsibility.
   - *Example:* A class that handles user authentication should not also handle logging or data validation.

2. **Open/Closed Principle (OCP):**
   - Software entities should be open for extension but closed for modification.
   - *Example:* Adding new functionality should be achieved by adding new code, not by altering existing code.

3. **Liskov Substitution Principle (LSP):**
   - Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.
   - *Example:* If a function uses a base class, it should work with any derived class without knowing it.

4. **Interface Segregation Principle (ISP):**
   - Clients should not be forced to depend upon interfaces they do not use.
   - *Example:* Instead of one large interface, create smaller, more specific interfaces so that implementing classes only need to be concerned with the methods that are of interest to them.

5. **Dependency Inversion Principle (DIP):**
   - High-level modules should not depend on low-level modules; both should depend on abstractions.
   - *Example:* A high-level class should rely on an interface rather than a concrete class, promoting loose coupling.

<!--
## Repository Structure

The repository is organized into directories corresponding to each SOLID principle:

- `1/`: Contains examples demonstrating SRP.
- `2/`: Includes code illustrating OCP.
- `3/`: Showcases scenarios adhering to LSP.
- `4/`: Provides examples for ISP.
- `5/`: Demonstrates DIP through practical code samples.
-->
