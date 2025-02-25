# 🛡️ AI-Powered Cybersecurity Threat Analyzer

## 📌 Overview
This project is an **AI-powered cybersecurity threat analyzer** that helps **detect security threats, analyze log data, and identify potential cyberattacks** using **machine learning and anomaly detection**.

## 🚀 Features
- ✅ **AI-Based Threat Detection** – Uses **machine learning** to analyze security logs.  
- ✅ **Anomaly Detection in Network Traffic** – Identifies **suspicious activity** using AI.  
- ✅ **Log Monitoring System** – Real-time **security log collection & analysis**.  
- ✅ **Alerts & Incident Reports** – Notifies security teams of **potential threats**.  
- ✅ **Integration with SIEM Tools** – Works with **Splunk, ELK Stack, and Security APIs**.  
- ✅ **Docker Support** – Deploy using Docker.

## 🏗️ Tech Stack
- **Backend:** Java (Spring Boot)  
- **Machine Learning:** Python (Scikit-learn, Isolation Forest)  
- **Database:** PostgreSQL  
- **Authentication:** Spring Security + JWT (Future Enhancement)  
- **Deployment:** Docker & Kubernetes  

## 📂 Project Structure
```
├── backend/
│   ├── src/main/java/com/cybersecurity/
│   │   ├── Application.java
│   │   ├── controller/ThreatLogController.java
│   │   ├── service/ThreatLogService.java
│   │   ├── model/ThreatLog.java
│   │   ├── repository/ThreatLogRepository.java
│   ├── resources/application.properties
├── database/
│   ├── schema.sql
├── ai_model/
│   ├── threat_detection.py
├── docker-compose.yml
├── README.md
```

## 🛠️ Setup & Installation
### **1️⃣ Clone the Repository**
```bash
git clone https://github.com/YOUR_GITHUB_USERNAME/AI-Powered-Cybersecurity-Threat-Analyzer.git
cd AI-Powered-Cybersecurity-Threat-Analyzer
```

### **2️⃣ Run PostgreSQL Database**
```bash
docker-compose up --build
```

### **3️⃣ Run the Backend (Spring Boot)**
```bash
cd backend
./mvnw spring-boot:run
```

### **4️⃣ Train the AI Model (Optional)**
```bash
cd ai_model
python threat_detection.py
```

## 📡 API Endpoints (Spring Boot)
| Method | Endpoint                  | Description                           |
|--------|----------------------------|---------------------------------------|
| POST   | `/api/threat-logs`         | Add a new security log entry          |
| GET    | `/api/threat-logs`         | Retrieve all security logs            |
| GET    | `/api/threat-logs/detect`  | Analyze logs and detect threats       |

### **Example API Request**
```json
POST /api/threat-logs
{
  "sourceIP": "192.168.1.1",
  "message": "Multiple failed login attempts detected.",
  "severity": 9
}
```

#### **Example API Response**
```json
{
  "id": 1,
  "sourceIP": "192.168.1.1",
  "message": "Multiple failed login attempts detected.",
  "severity": 9
}
```

## 📝 Future Enhancements
- 🚀 **Advanced AI Detection with Deep Learning**  
- 🔍 **SIEM Dashboard with React.js & Kibana**  
- 🔒 **User Authentication (Spring Security + JWT)**  

---
🚀 **Like this project? Star it on GitHub!** ⭐  
