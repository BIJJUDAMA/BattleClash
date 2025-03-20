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
   - Compile the Java files 
     ```sh
     javac -d bin src/battleclash/*.java
     ```
   - Run the game:
     ```sh
     java -cp bin battleclash.Game
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
- [ ] Introduce **multiple enemy types** with unique strengths and abilities.  
- [ ] Implement a **stamina system** to limit the use of strong attacks.  
- [ ] Add **weapons and special abilities** to enhance gameplay variety.  
- [ ] Develop a **scoring and leveling system** for player progression.  
- [ ] Include a **turn timer**, skipping the turn if the player exceeds the limit.  
- [ ] Add **difficulty levels** (Easy, Medium, Hard) for a more customized experience.  
- [ ] Enhance the game with a **graphical user interface (GUI)** for improved visuals and accessibility.

---

## 🤝 Contributing
If you'd like to improve this game, feel free to fork the repo and submit pull requests!

---

## 📜 License
This project is open-source and available under the **MIT License**.

---

🎮 **Enjoy the battle! May the strongest warrior win!** 🔥
