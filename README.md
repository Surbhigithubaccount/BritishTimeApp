# British Time App

## 📌 Overview
The **British Time App** is a Java application that converts a given time (in hours and minutes) into its equivalent spoken English form in British style.  
Examples:
- `12:00` → **noon**
- `0:00` → **midnight**
- `7:30` → **half seven**
- `9:45` → **quarter to ten**

This project is implemented using **Design Patterns** for better scalability and maintainability.

---

## 🏗 Design Patterns Used
1. **Strategy Pattern** – Encapsulates the logic for different time conversion formats.
2. **Factory Pattern** – Provides appropriate time phrase generator based on the input.

---

## 🛠 Tech Stack
- **Java 17** (or above)
- **Gradle** for build automation
- **JUnit 5** for unit testing


---
## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/Surbhigithubaccount/BritishTimeApp.git
   cd BritishTimeApp
 2.Run the application BritishTimeApp.java

---
##  Example Test Cases
| Input | Expected Output |
| ----- | --------------- |
| 12:00 | noon            |
| 0:00  | midnight        |
| 7:30  | half seven      |
| 9:45  | quarter to ten  |
| 2:05  | five past two   |




## 📂 Project Structure
src/
└─ main/
   └─ java/
      └─ com/
         └─ example/
            ├─ BritishTimeApp.java
            ├─ TimeParser.java
            ├─ TimeFormatter.java
            ├─ BritishTimeFormatter.java
            └─ NumberToWords.java

└─ test/
   └─ java/
      └─ com/
         └─ example/
            └─ BritishTimeFormatterTest.java


