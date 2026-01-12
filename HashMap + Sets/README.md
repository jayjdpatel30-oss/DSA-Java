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

---
