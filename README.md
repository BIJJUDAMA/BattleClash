# Battle Clash

## 📌 Project Overview
"Battle Clash: Fight for Survival" is a simple **turn-based battle game** built in Java using **Object-Oriented Programming (OOP) principles**. In this game, the player faces off against an enemy in a duel where both take turns attacking. The player has the option to:

✅ Perform a **normal attack**  
✅ Execute a **strong attack** (deals more damage)  
✅ **Heal** (limited number of times)  

The enemy has **random attack behavior**, sometimes using a strong attack. The game continues until either the player or the enemy is defeated.

---

## 🛠️ Technologies Used
- **Java** (Core Java, OOP Concepts)
- **Object-Oriented Design** (Encapsulation, Inheritance, Polymorphism, Abstraction)
- **Command-Line Interface (CLI)**

---

## 📂 Project Structure
```sh
BattleClash/
│── src/
│   ├── battleclash/
│   │   ├── Character.java   # Abstract base class
│   │   ├── Player.java      # Player class
│   │   ├── Enemy.java       # Enemy class
│   │   ├── Game.java        # Game loop and logic
│── README.md                # Documentation
```

---

## 🎮 How to Play
1️⃣ **Run the Game**
   - Open a terminal and navigate to the project folder.
   - Compile the Java files:
     ```sh
     javac battleclash/*.java
     ```
   - Run the game:
     ```sh
     java battleclash.Game
     ```

2️⃣ **Gameplay Instructions**
   - Enter your **player name**.
   - You and the enemy take turns attacking.
   - Choose an action on your turn:
     - **1** → Normal Attack
     - **2** → Strong Attack
     - **3** → Heal (Limited uses)
   - The game continues until either **you or the enemy is defeated**.

---

## 📌 Features & Concepts Used
### ✅ Object-Oriented Programming (OOP) Principles
- **Encapsulation**: Character attributes (health, attackPower, etc.) are private.
- **Inheritance**: Player and Enemy inherit from the Character base class.
- **Polymorphism**: `attack()` is overridden differently for Player and Enemy.
- **Abstraction**: The `Character` class is abstract to enforce implementation.

### ✅ Game Mechanics
- **Turn-based combat**
- **Randomized enemy behavior** (Enemy can use strong attacks randomly)
- **Healing system** (Limited number of heals)
- **Dynamic health updates**

---

## 🔥 Future Improvements
- [ ] Add multiple **enemy types** with different strengths.
- [ ] Introduce **weapons and abilities** for the player.
- [ ] Implement a **score or leveling system**.
- [ ] Add a graphical user interface (**GUI**) using JavaFX or Swing.

---

## 🤝 Contributing
If you'd like to improve this game, feel free to fork the repo and submit pull requests!

---

## 📜 License
This project is open-source and available under the **MIT License**.

---

🎮 **Enjoy the battle! May the strongest warrior win!** 🔥
