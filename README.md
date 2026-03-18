# 🎮 Multiplayer Matchmaking API

A backend REST API for a multiplayer matchmaking system, built with Java and Spring Boot.

This project simulates how players join a queue and are stored in a database, forming the foundation for a scalable matchmaking system (similar to games like Rocket League or Overwatch).

---

## 🚀 Features

* Join matchmaking queue
* Store players in database (JPA + H2)
* Retrieve current queue
* Layered architecture (Controller → Service → Repository)
* RESTful API design

---

## 🏗️ Architecture

This project follows a **modular monolith architecture**:

```
Controller → Service → Repository → Database
```

* **Controller** → Handles HTTP requests
* **Service** → Business logic
* **Repository** → Data access (Spring Data JPA)
* **Model** → Entity definitions
* **DTO** → API request objects

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database (in-memory)
* Maven
* Git & GitHub

---

## 📡 API Endpoints

### ➤ Join matchmaking

```
POST /matchmaking/join
```

**Request Body:**

```json
{
  "username": "Player1",
  "skill": 1200
}
```

---

### ➤ Get queue

```
GET /matchmaking/queue
```

---

## ▶️ How to Run

1. Clone the repository:

```bash
git clone https://github.com/Historn/MatchmakingAPI.git
```

2. Navigate to the project:

```bash
cd MatchmakingAPI
```

3. Run the application:

```bash
mvn spring-boot:run
```

4. Open in browser:

```
http://localhost:8081/matchmaking/queue
```

---

## 🧪 H2 Database Console

Access the database UI:

```
http://localhost:8081/h2-console
```

Use:

```
JDBC URL: jdbc:h2:mem:testdb
```

---

## 📈 Future Improvements

* Matchmaking algorithm (group players by skill)
* Persistent database (PostgreSQL)
* Docker containerization
* CI/CD pipeline (GitHub Actions)
* Authentication system
* WebSocket support for real-time updates

---

## 👨‍💻 Author

Arnau Jimenez
Bachelor’s in Game Design & Development + Computer Science student

---

## 💡 Motivation

This project combines backend engineering with game development concepts, focusing on building scalable systems for multiplayer environments.
