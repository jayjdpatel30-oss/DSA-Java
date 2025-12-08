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

### 1️⃣ Sum of Digits

**Problem:** Calculate the sum of digits in a number
**Example:** `1234 → 10`

**Approach:**

```
sumOfDigits(1234)
= 4 + sumOfDigits(123)
= 4 + 3 + sumOfDigits(12)
= 4 + 3 + 2 + sumOfDigits(1)
= 4 + 3 + 2 + 1 + sumOfDigits(0)
= 10
```

**Key Learning:** Extract parts using `% 10` and `/ 10`.

---

### 2️⃣ Power Calculation

**Problem:** Compute base^exponent efficiently
**Example:** `2^10 = 1024`

**Two Approaches:**

* **Simple:** O(n)
* **Optimized (Binary Exponentiation):** O(log n)

**Magic of Binary Exponentiation:**

```
2^8 = (2^4)² = ((2²)²)² = (((2¹)²)²)²
```

Only **3 multiplications** instead of 7.

---

### 3️⃣ GCD (Euclidean Algorithm)

**Example:** `GCD(48, 18) = 6`

**Visualization:**

```
GCD(48, 18)
→ GCD(18, 12)
  → GCD(12, 6)
    → GCD(6, 0)
      → 6 ✓
```

**Key Learning:** Elegant divide-and-remainder method.

---

### 4️⃣ Decimal to Binary

**Example:** `10 → "1010"`

**Process:**

```
10 ÷ 2 = 5 remainder 0
5 ÷ 2 = 2 remainder 1
2 ÷ 2 = 1 remainder 0
1 ÷ 2 = 0 remainder 1

Bottom-up → 1010
```

**Key Learning:** Mutiplt reminder into 10 and add digit recursively.

---

### 5️⃣ Factorial

**Example:** `5! = 120`

```
5! = 5 × 4!
     = 5 × 4 × 3!
     = 5 × 4 × 3 × 2!
     = 5 × 4 × 3 × 2 × 1
     = 120
```

**Key Learning:** Classic recursion pattern.

---

### 6️⃣ Fibonacci 

**Sequence:** 0, 1, 1, 2, 3, 5...

**1. Naive Recursive — O(2^n)**

```
fib(n) = fib(n-1) + fib(n-2)
```

**Key Learning:**  IT DOESNT INCLUDE 0 SO GIVES N + 1th ELEMENT.

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
