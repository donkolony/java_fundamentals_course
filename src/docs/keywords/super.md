# The `super` Keyword

The `super` keyword is a reference variable used to refer to the immediate parent (superclass) instance.

## When to Use It

### Overriding
To call a method in the parent class that has been rewritten (overridden) in the child class.

### Parent Constructor
To invoke the parent’s constructor using `super()`.

**Rule:** This is often required if the parent class does not have a default "no-args" constructor.

### Field Access
To access a field in the parent class if the child class has a field with the same name (shadowing).

---

## The Analogy: The High Shelf
Imagine a child has their own jar of cookies, but the parent also has a jar of cookies kept on a high shelf. If the child asks for a "cookie," they will naturally get one from their own jar.
If the child specifically wants the "parent's version" of the cookie, they must reference the superior shelf to get it. In Java, `super` is the step-stool that lets the child reach the parent's version of a method or constructor.