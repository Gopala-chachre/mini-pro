# 🎯 Number Guessing Game

A simple **Java console-based Number Guessing Game** where the computer randomly selects a number between **1 and 1000**, and the user tries to guess it.

After every guess, the program gives a hint telling the user whether their guess is **HIGH** or **LOW** until they find the correct number.

---

## 🎮 How It Works

1. The system generates a random number between **1 and 1000**.
2. The user enters a number as their guess.
3. The program compares the guess with the system's number.
4. If the guess is higher than the selected number, it displays:

   ```text
   Your guess is HIGH
   ```
5. If the guess is lower, it displays:

   ```text
   Your guess is LOW
   ```
6. The process continues until the user guesses the correct number.
7. Finally, the program displays the total number of attempts.

---

## 🛠️ Technologies Used

* **Java**
* `Scanner` — for taking user input
* `Random` — for generating the random number
* `while` loop — for repeatedly taking guesses
* `if-else` — for comparing the user's guess with the system number

---

## 🧠 Concepts Practiced

This project helped me practice:

* Java basics
* Variables and data types
* User input using `Scanner`
* Random number generation
* Conditional statements
* `while` loops
* Comparison operators
* Counters
* Basic problem-solving and program logic

---

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone <your-repository-url>
```

### 2. Navigate to the project directory

```bash
cd Number-Guessing
```

### 3. Compile the program

```bash
javac NumberGuessing.java
```

### 4. Run the program

```bash
java NumberGuessing
```

---

## 💻 Example Output

```text
Try to guess the NUMBER!
System has selected a number between 1 and 1000.

Guess the number: 500
Your guess is LOW

Guess the number: 750
Your guess is HIGH

Guess the number: 625
Your guess is LOW

Guess the number: 680
Your guess is LOW

Guess the number: 700
Correct! 🎉

You guessed the number in 5 attempts.
```

---

## 📂 Project Structure

```text
Number-Guessing/
│
├── NumberGuessing.java
└── README.md
```

---

## 🚀 Possible Improvements

Some features that can be added in the future:

* 🎚️ Allow the user to choose the number range
* ❤️ Add a limited number of attempts
* 🏆 Add a scoring system
* 🔄 Add a "Play Again" option
* 📊 Track the best score
* 🎮 Add different difficulty levels
* 🖥️ Create a GUI version using Java Swing or JavaFX

---

## 📌 Project Status

**Completed ✅**

This is one of my mini projects built while practicing Java programming and problem-solving.

---

## 👨‍💻 Author

**Gopala Chachre**

> Learning by building — one mini project at a time. 🚀
