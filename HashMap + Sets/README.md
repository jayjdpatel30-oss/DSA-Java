# HashMap + Sets (Java)

This folder contains Data Structures & Algorithms problems solved using HashMap and HashSet in Java.  
All problems are implemented with optimized approaches, focusing on time and space efficiency.

---

## 🧠 Concepts & Logic Covered

- **HashMap** for frequency counting
- **HashSet** for duplicate detection
- **Sliding Window** technique
- **Cycle detection** using sets
- **Intersection** of sets
- **Constant-time lookups** (O(1) average)

---

## 📋 Problems Covered

| # | Problem | Difficulty | Key Concept | Time | Space |
|---|---------|-----------|-------------|------|-------|
| 1 | Intersection of Two Arrays | Easy | HashSet | O(n+m) | O(n) |
| 2 | Majority Element | Easy | HashMap/Boyer-Moore | O(n) | O(n)/O(1) |
| 3 | Single Number | Easy | XOR Bit Manipulation | O(n) | O(1) |
| 4 | Happy Number | Easy | HashSet/Cycle Detection | O(log n) | O(log n) |
| 5 | Contains Duplicate II | Easy | HashMap/Sliding Window | O(n) | O(k) |

---

## 🧩 Problem Explanations

### ✅ 1. Intersection of Two Arrays (LeetCode 349)

#### Problem Statement
Given two integer arrays `nums1` and `nums2`, return an array containing their intersection.  
Each element in the result must be unique, and the result can be returned in any order.

#### 🧠 Data Structures Used
- **HashSet<Integer>**
  - To store unique elements
  - To perform constant-time lookups

#### 💡 Approach
1. Store all unique elements of `nums1` in a HashSet
2. Traverse `nums2` and check if elements exist in the first set
3. Use another HashSet to store intersection elements (ensures uniqueness)
4. Convert the result set into an array

#### 🔍 Logic Explanation (Step-by-Step)
1. Insert all elements of `nums1` into a HashSet  
   → removes duplicates automatically
2. Traverse `nums2`
   - If an element exists in `nums1` set
   - Add it to the intersection set
3. Convert the intersection set into an integer array

#### 🧪 Example Walkthrough

**Input:**
```
nums1 = [4, 9, 5]
nums2 = [9, 4, 9, 8, 4]
```

**Processing:**
- Unique elements from `nums1` → `{4, 9, 5}`
- Matching elements in `nums2` → `{9, 4}`

**Output:**
```
[9, 4]  (order may vary)
```

#### ⏱️ Time Complexity
- Building first HashSet → O(n)
- Checking second array → O(m)
- **Total: O(n + m)**

#### 🧮 Space Complexity
- HashSet for `nums1` → O(n)
- HashSet for intersection → O(min(n, m))
- **Total: O(n)**

#### ⚠️ Edge Cases Handled
- Duplicate elements in input arrays
- No common elements → returns empty array
- Order of output not required
- Works for unsorted arrays

#### 🎯 Why This Approach Is Optimal
- HashSet provides O(1) average lookup time
- Avoids nested loops (O(n × m))
- Automatically handles uniqueness

#### 📂 Java File
`IntersectionArrays.java`

---

### ✅ 2. Majority Element (LeetCode 169)

#### 📝 Problem Statement
Given an array `nums` of size `n`, return the majority element. The majority element is the element that appears more than ⌊n / 2⌋ times.  
You may assume that the majority element always exists in the array.

#### 🧠 Concepts & Data Structures Used
- HashMap (frequency counting)
- Sorting
- Boyer–Moore Voting Algorithm
- Array traversal

#### 💡 Approaches Implemented
This solution demonstrates three different approaches, ordered from basic → optimal.

#### 🔹 Approach 1: Sorting Method

**🔍 Idea**  
If the array is sorted, the element appearing more than `n/2` times must be present at the middle index.

**🧠 Logic**
1. Sort the array
2. Return element at index `n / 2`

**⏱️ Complexity**
- **Time:** `O(n log n)`
- **Space:** `O(1)` (in-place sort)

#### 🔹 Approach 2: HashMap (Frequency Count)

**🔍 Idea**  
Count occurrences of each number and return the one exceeding `n / 2`.

**🧠 Logic**
1. Use `HashMap<Integer, Integer>` to store frequency
2. Traverse the array and update counts
3. Identify element with frequency > `n / 2`

**⏱️ Complexity**
- **Time:** `O(n)`
- **Space:** `O(n)`

#### 🔹 Approach 3: Boyer–Moore Voting Algorithm (Optimal)

**🔍 Idea**  
The majority element cancels out all other elements.

**🧠 Logic (Step-by-Step)**
1. Initialize:
   - `candidate = nums[0]`
   - `count = 1`
2. Traverse the array:
   - If `count == 0`, update candidate
   - If current number equals candidate → increment count
   - Else → decrement count
3. Final candidate is the majority element

**✅ Why This Works**
- Majority element appears more than `n/2` times
- It cannot be fully canceled out by other elements

**⏱️ Complexity**
- **Time:** `O(n)`
- **Space:** `O(1)`

#### 🧪 Example Walkthrough

**Input:**
```
nums = [2,2,1,1,1,2,2]
```

**Processing:**
- Votes cancel out minority elements
- Final candidate → `2`

**Output:**
```
2
```

#### ⚠️ Edge Cases Covered
- Majority element always exists
- Works for unsorted arrays
- Handles repeated values efficiently

#### 🎯 Why Boyer–Moore Is Preferred

| Approach | Time | Space | Interview Friendly |
|----------|------|-------|--------------------|
| Sorting | O(n log n) | O(1) | ❌ |
| HashMap | O(n) | O(n) | ✅ |
| Boyer–Moore | O(n) | O(1) | ⭐ BEST |

#### 📂 Java File
`MajorityElement.java`

### ✅ 3. Single Number (LeetCode 136)

#### 📌 Problem Name
**Single Number**  
**LeetCode ID:** 136

#### 📝 Problem Statement
Given a non-empty array of integers `nums`, every element appears twice except for one. Find that single one.  
You must implement a solution with O(n) time and O(1) space complexity.

#### 🧠 Concepts & Data Structures Used
- XOR Bit Manipulation
- HashSet (alternative approach)
- Array traversal

#### 💡 Approaches Implemented
This solution demonstrates two different approaches, ordered from basic → optimal.

#### 🔹 Approach 1: HashSet Method

**🔍 Idea**  
Use a HashSet to track numbers. Add numbers that aren't present, remove numbers that are present. The remaining number is the single one.

**🧠 Logic**
1. Create a `HashSet<Integer>`
2. For each number in the array:
   - If it exists in the set → remove it (found the duplicate)
   - If it doesn't exist → add it
3. The remaining element in the set is the single number

**⏱️ Complexity**
- **Time:** `O(n)`
- **Space:** `O(n)` (HashSet storage)

#### 🔹 Approach 2: XOR Bit Manipulation (Optimal)

**🔍 Idea**  
Use XOR (Exclusive OR) properties to cancel out duplicate numbers.

**🧠 XOR Properties**
- XOR of two same numbers is 0: `a ^ a = 0`
- XOR of a number with 0 is the number itself: `a ^ 0 = a`
- XOR is commutative and associative

**🧠 Logic (Step-by-Step)**
1. Initialize `result = 0`
2. XOR all numbers in the array
3. Duplicate numbers cancel out (become 0)
4. The single number remains

**✅ Why This Works**
```
a ^ b ^ a ^ c ^ b = (a ^ a) ^ (b ^ b) ^ c
                  = 0 ^ 0 ^ c
                  = c
```

**⏱️ Complexity**
- **Time:** `O(n)` - single pass through array
- **Space:** `O(1)` - only using one variable

#### 🧪 Example Walkthrough

**Example :**

**Input:**
```
nums = [4,1,2,1,2]
```

**Processing (XOR):**
```
result = 0
0 ^ 4 = 4
4 ^ 1 = 5
5 ^ 2 = 7
7 ^ 1 = 6
6 ^ 2 = 4
```

**Output:**
```
4
```

#### ⚠️ Edge Cases Covered
- Array with only one element
- Single number at any position
- Works regardless of order
- Handles large arrays efficiently

#### 🎯 Why XOR Is Preferred

| Approach | Time | Space | Interview Friendly |
|----------|------|-------|--------------------|
| HashSet | O(n) | O(n) | ✅ |
| XOR Bit Manipulation | O(n) | O(1) | ⭐ BEST |

**Key Advantages of XOR:**
- Meets the O(1) space requirement
- Elegant mathematical solution
- No additional data structures needed
- Optimal for the constraint

#### 📂 Java File
`singleNumber.java`

---

### ✅ 4. Happy Number (LeetCode 202)

#### 📌 Problem Name
**Happy Number**  
**LeetCode ID:** 202

#### 📝 Problem Statement
A happy number is a number defined by the following process:
- Starting with any positive integer, replace the number by the sum of the squares of its digits.
- Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
- Those numbers for which this process ends in 1 are happy.

Return `true` if `n` is a happy number, and `false` if not.

#### 🧠 Concepts & Data Structures Used
- HashSet (cycle detection)
- Mathematical computation
- Loop detection
- Digit manipulation

#### 💡 Approach: HashSet for Cycle Detection

**🔍 Idea**  
Use a HashSet to track previously seen sums. If we encounter a sum we've seen before, we've found a cycle and the number is not happy.

**🧠 Logic (Step-by-Step)**
1. Create a `HashSet<Integer>` to store seen numbers
2. Calculate the sum of squares of digits
3. Check conditions:
   - If sum equals 1 → return `true` (happy number!)
   - If sum is already in the set → return `false` (cycle detected)
   - Otherwise → add sum to set and continue
4. Repeat until one of the above conditions is met

**🔧 Helper Function: `digitCount()`**
```java
1. Initialize sum = 0
2. While num != 0:
   - Extract last digit: digit = num % 10
   - Add square to sum: sum += digit * digit
   - Remove last digit: num /= 10
3. Return sum
```

**⏱️ Complexity**
- **Time:** `O(log n)` - depends on the number of digits in n and cycle length
- **Space:** `O(log n)` - HashSet stores intermediate values

#### 🧪 Example Walkthrough

**Example 1: Happy Number**

**Input:**
```
n = 19
```

**Processing:**
```
Step 1: 1² + 9² = 1 + 81 = 82
Step 2: 8² + 2² = 64 + 4 = 68
Step 3: 6² + 8² = 36 + 64 = 100
Step 4: 1² + 0² + 0² = 1 + 0 + 0 = 1 ✓
```

**Output:**
```
true
```

**Example 2: Unhappy Number**

**Input:**
```
n = 2
```

**Processing:**
```
Step 1: 2² = 4
Step 2: 4² = 16
Step 3: 1² + 6² = 1 + 36 = 37
Step 4: 3² + 7² = 9 + 49 = 58
Step 5: 5² + 8² = 25 + 64 = 89
Step 6: 8² + 9² = 64 + 81 = 145
Step 7: 1² + 4² + 5² = 1 + 16 + 25 = 42
Step 8: 4² + 2² = 16 + 4 = 20
Step 9: 2² + 0² = 4 + 0 = 4 (cycle detected!) ✗
```

**Output:**
```
false
```

#### ⚠️ Edge Cases Covered
- Single digit numbers (e.g., 1 is happy, 2 is not)
- Numbers that quickly reach 1
- Numbers that enter cycles
- Large numbers with many digits

#### 🎯 Why HashSet Is Optimal

**Key Advantages:**
- **O(1) lookup time** to detect cycles instantly
- Prevents infinite loops efficiently
- Simple and intuitive approach
- Space-efficient for this problem

**Alternative Approach:**
- **Floyd's Cycle Detection** (slow/fast pointer) - O(1) space but more complex to implement

#### 📊 Algorithm Visualization

```
n = 19

19 → 82 → 68 → 100 → 1 ✓ (Happy!)
     ↓
   seen = {82, 68, 100}

n = 2

2 → 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 ✗ (Cycle!)
    ↓
  Already in seen set = cycle detected
```

#### 📂 Java File
`HappyNumber.java`

---

---
