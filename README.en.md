# Dorm Admin - Dormitory Management System

Dorm Admin is an enterprise-grade, cloud-native, full-stack dormitory management system. It features a modern frontend-backend separation architecture, comprehensive dormitory business modules, robust permission system, automated DevOps, monitoring & alerting, and third-party platform integration. It is suitable for universities, enterprise campuses, and other digital dormitory management scenarios.

---

## 🌟 Key Features

- **Frontend-Backend Separation**: Modern Vue + Element UI frontend, high-performance Spring Boot + MyBatis backend
- **Multi-Role Permission System**: Fine-grained permissions for students, dorm managers, maintenance staff, administrators, etc.
- **Comprehensive Business Modules**: Student, dormitory, building, repair, announcement, attendance, lost & found, visitor registration, dorm evaluation & points, and more
- **Third-Party Integration**: Connects to campus card, access control, SMS platforms, and extensible to more
- **Automated DevOps**: CI/CD, one-click Docker deployment, Prometheus + Grafana monitoring & alerting
- **Data Import/Export**: Excel batch import/export for easy data migration and analysis
- **API Documentation & Testing**: Auto-generated Swagger API docs, curl test examples, and unit test coverage

---

## 🏗️ Architecture

- **Frontend**: Vue2, Element UI, ECharts, Axios
- **Backend**: Spring Boot, Spring Security, MyBatis, Swagger, EasyExcel, Micrometer
- **Database**: MySQL, Redis
- **DevOps**: Docker, docker-compose, Prometheus, Grafana, Alertmanager, CI/CD

---

## 🚀 Quick Start

### 1. One-Click Deployment (Recommended)

```bash
git clone <repo-url>
cd dorm-admin
docker-compose up --build
```
- Frontend: http://localhost
- Backend: http://localhost:8081
- Swagger API Docs: http://localhost:8081/swagger-ui/
- Prometheus: http://localhost:9090
- Grafana: http://localhost:3000

### 2. Manual Deployment

#### Backend
1. Import database scripts from `sql/`
2. Configure `dorm-admin-server/src/main/resources/application.yml`
3. `mvn clean package` and run `target/*.jar`

#### Frontend
1. Enter `dorm-admin-page`, run `npm install && npm run build`
2. Deploy `dist/` to Nginx or any static server

#### Monitoring & Alerting
- Prometheus, Grafana, and Alertmanager are integrated in docker-compose, supporting multi-channel alerts (e.g., email)

---

## 📦 Main Modules

- Student/Dormitory/Building Management
- Repair Management, Announcements, Attendance
- Lost & Found, Visitor Registration, Dorm Evaluation & Points
- Permission & Role Management, Operation Logs, Data Import/Export
- Third-Party Integration (SMS, Campus Card, Access Control, etc.)
- Monitoring & Alerting, API Docs, Automated Testing

---

## 🔒 Production Security & Ops Best Practices
- Restrict management ports (Prometheus, Grafana, Swagger) to internal/VPN access
- Manage sensitive configs via environment variables or config center
- Output logs to files with rotation, recommend ELK/Loki for log analysis
- Regularly backup database, Redis, and test recovery
- Use CI/CD for automated build, test, deploy; set Docker containers to read-only and resource-limited where possible

---

## 🧪 API Docs & Testing
- Swagger auto-generates API docs at `/swagger-ui/`
- `api-curl-examples.md` provides curl test examples for common APIs
- Backend includes unit tests covering main business flows

---

## 📞 Contact & Support
For custom development, deployment support, or suggestions, please contact the project maintainer.

#### Gitee Feature

1.  You can use Readme\_XXX.md to support different languages, such as Readme\_en.md, Readme\_zh.md
2.  Gitee blog [blog.gitee.com](https://blog.gitee.com)
3.  Explore open source project [https://gitee.com/explore](https://gitee.com/explore)
4.  The most valuable open source project [GVP](https://gitee.com/gvp)
5.  The manual of Gitee [https://gitee.com/help](https://gitee.com/help)
6.  The most popular members  [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
