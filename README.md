# ⚔️ Battle Clash

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

## ✅ Game Mechanics

### 🎮 Player Mechanics

#### 🔹 Player Stats
| **Attribute** | **Value** |
|--------------|----------|
| Max Health | 100 |
| Normal Attack Power | 15 |
| Strong Attack Power | 30 |
| Defense | 5 |
| Heal | Restores **30 HP** (Max health cap: 100) |
| Heal Uses | **3 times per game** |

#### 🔹 Available Actions
1. **Normal Attack**  
   - Deals **15 damage** to the enemy.
2. **Strong Attack**  
   - Deals **30 damage**, but **takes up more energy**.
3. **Heal**  
   - Restores **30 HP** (but cannot exceed **100 HP**).
   - Can only be used **3 times per game**.

---

### 👿 Enemy (Dark Lord) Mechanics

#### 🔹 Enemy Stats
| **Attribute** | **Value** |
|--------------|----------|
| Max Health | 120 |
| Normal Attack Power | 20 |
| Strong Attack Power | 40 |
| Defense | 3 |

#### 🔹 Enemy AI Behavior
The Dark Lord has **randomized attack patterns**. On its turn, it may:
1. **Normal Attack** (80% chance)  
   - Deals **20 damage**.
2. **Strong Attack** (15% chance)  
   - Deals **40 damage**.
3. **Deadly Strike** (5% chance)  
   - **Removes 90% of the player’s health in one hit!**
4. **Attack Debuff** (30% chance)  
   - Weakens **player’s attack power** to **half** for **1-4 turns**.
5. **Regeneration Ability** (30% chance)  
   - If its **HP drops below 10% (12 HP)**, the Dark Lord can **heal back to 90 HP**.

---

### 🔐 Special Game Rules
#### ✅ Health Cap
- **Player health is capped at 100.** Even if the player heals, it cannot exceed this limit.

#### ✅ Attack Debuff
- If the Dark Lord **applies a debuff**, the player’s attack power **is cut in half** for **1 to 4 turns**.

#### ✅ Deadly Strike
- If the Dark Lord **triggers a Deadly Strike**, the player’s health is **immediately reduced by 90%**.

#### ✅ Healing Restriction
- The **player can only heal 3 times per game**.

#### ✅ Dark Lord’s Regeneration
- When the **Dark Lord’s HP drops below 12**, it has a **30% chance to restore 90 HP**.

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
