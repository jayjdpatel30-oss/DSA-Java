# 🔄 Recursion – A function that calls itself to solve smaller versions of the same problem.

## 📚 Table of Contents

| # | Problem                                      | Time Complexity | Key Concept             |
| - | -------------------------------------------- | --------------- | ----------------------- |
| 1 | [Sum of Digits](./SumOfDigits.java)          | O(log n)        | Basic recursion         |
| 2 | [Power Calculation](./PowerCalculation.java) | O(log n)        | Optimization techniques |
| 3 | [GCD](./GCD.java)                            | O(log min(a,b)) | Euclidean algorithm     |
| 4 | [Decimal to Binary](./DecimalToBinary.java)  | O(log n)        | Base conversion         |
| 5 | [Factorial](./Factorial.java)                | O(n)            | Classic recursion       |
| 6 | [Fibonacci](./Fibonacci.java)                | O(2^n) → O(n)   | Memoization             |

## 🎯 Problem Summaries

> *“How did we come up with the recursion?”*
> *“Why that base case?”*
> *“Why this recursive call?”*

---

# 1️⃣ Sum of Digits — How We Got the Logic

### 🔍 **How do we break the problem?**

A number is made of **last digit + remaining digits**:

Example: `1234`

* Last digit = `4` → `n % 10`
* Remaining number = `123` → `n / 10`

### 🧠 **Recursive logic idea**

Sum of digits of N =
➡ last digit + sum of digits of the remaining number

```
sumOfDigits(n) = (n % 10) + sumOfDigits(n / 10)
```

### 🛑 **Base case — how did we think of it?**

When the number becomes `0`, there are **no digits left**.

→ So return `0`.

### ✔ Final recursion

```
sum(n) = n%10 + sum(n/10)
base: n == 0
```

---

# 2️⃣ Power Calculation — How We Got the Logic

### 🔍 **How do we break the problem?**

`a^b` can be seen as:

```
a * a^(b-1)
```

So reduce exponent by 1.

### 🧠 **Optimized logic (divide exponent by 2)**

If exponent is even:

```
a^8 = (a^4) * (a^4)
```

If exponent is odd:

```
a^9 = a * (a^8)
```

So recursive structure:

```
power(a, b/2)
```

### 🛑 **Base case**

Any number power 0 is 1 → `a^0 = 1`.

### ✔ Final recursion

```
if b is even: a^(b/2)^2
if b is odd : a * a^(b-1)
base: b == 0
```

---

# 3️⃣ GCD — How We Got the Logic

### 🔍 **How do we break the problem?**

Euclid discovered:

> GCD(a, b) = GCD(b, a % b)

because remainder keeps reducing until it becomes 0.

### 🧠 **Recursive logic idea**

We reduce the problem size by replacing:

```
(a, b) → (b, a % b)
```

### 🛑 **Base case**

When second number becomes 0 → GCD found.

### ✔ Final recursion

```
gcd(a, b) = gcd(b, a % b)
base: b == 0
```

---

# 4️⃣ Decimal → Binary — How We Got the Logic

### 🔍 **How do we break the problem?**

Binary conversion is based on continuous division by 2.

Each step gives:

* Remainder → last binary digit
* Quotient → smaller number to convert

### 🧠 **Recursive logic idea**

Binary of N =
binary of (N / 2) + last digit (`N % 2`)

### 🛑 **Base case**

When the number becomes `0`, stop.

### ✔ Final recursion

```
binary(n) = binary(n/2) + (n % 2)
base: n == 0
```

---

# 5️⃣ Factorial — How We Got the Logic

### 🔍 **How do we break the problem?**

`n! = n × (n-1)!` → directly recursive in definition.

### 🧠 **Recursive logic idea**

Factorial naturally splits into a smaller factorial.

### 🛑 **Base case**

`1! = 1`
And also `0! = 1`.

So:

```
if n == 0 or n == 1 → return 1
```

### ✔ Final recursion

```
fact(n) = n * fact(n-1)
base: n == 0 or 1
```

---

# 6️⃣ Fibonacci — How We Got the Logic

### 🔍 **How do we break the problem?**

Fibonacci definition itself is:

```
fib(n) = fib(n-1) + fib(n-2)
```

So recursion is direct.

### 🧠 **Recursive logic idea**

Every Fibonacci term depends on previous two terms.

Smaller subproblems:

* fib(n-1)
* fib(n-2)

### 🛑 **Base case**

Sequence starts with:

```
fib(0) = 0
fib(1) = 1
```

These don’t need recursion.

### ✔ Final recursion

```
fib(n) = fib(n-1) + fib(n-2)
base: n == 0 or 1
```

---

## 🔑 Key Insights & Patterns

### 🎨 Anatomy of Recursion

```java
public static returnType recursiveFunction(parameters) {
    // Base case
    if (baseCondition) return baseValue;

    // Recursive case
    return someOperation(
        recursiveFunction(smallerProblem)
    );
}
```

### ⚡ Time Complexity Patterns

| Pattern                  | Complexity | Example           |
| ------------------------ | ---------- | ----------------- |
| Single call, reduce by 1 | O(n)       | Factorial         |
| Single call, divide by 2 | O(log n)   | GCD               |
| Two calls, reduce by 1   | O(2^n)     | Fibonacci (naive) |
| Divide recursively       | O(log n)   | Fast Power        |

---

### 🧠 When to Use Recursion

**Good for:**

* Trees / graphs
* Divide & conquer
* Backtracking
* Natural recursive definitions

**Avoid when:**

* Simple loops are enough
* Depth too large (stack overflow risk)
* Heavy redundant computations

---

### 💡 Pro Tips

1. Write the base case first
2. Visualize call-stack
3. Ensure smaller subproblem each time
4. Use memoization when repeated calls seen
5. Java recursion depth ≈ 1000
6. Test 0, 1, negatives

---

## 📊 Complexity Comparison

| Problem           | Time            | Space           | Optimized?       |
| ----------------- | --------------- | --------------- | ---------------- |
| Sum of Digits     | O(log n)        | O(log n)        | —                |
| Power (Simple)    | O(n)            | O(n)            | Yes              |
| Power (Fast)      | O(log n)        | O(log n)        | ✓                |
| GCD               | O(log min(a,b)) | O(log min(a,b)) | ✓                |
| Decimal → Binary  | O(log n)        | O(log n)        | —                |
| Factorial         | O(n)            | O(n)            | Iterative better |
| Fibonacci (Basic) | O(2^n)          | O(n)            | Yes              |

---
