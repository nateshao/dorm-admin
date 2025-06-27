# Dorm Admin 宿舍管理系统

Dorm Admin 是一套企业级、云原生、全栈一体化的宿舍管理系统，采用前后端分离架构，具备丰富的宿舍业务功能、完善的权限体系、自动化运维、监控告警、第三方平台集成等特性，适用于高校、企业园区等多场景宿舍数字化管理。

---

## 🌟 主要特性

- **前后端分离**：Vue + Element UI 现代化前端，Spring Boot + MyBatis 高性能后端
- **多角色权限体系**：支持学生、宿管、维修员、管理员等多角色细粒度权限
- **宿舍业务全覆盖**：学生、宿舍、楼宇、报修、公告、考勤、失物招领、访客登记、宿舍评比与积分等
- **第三方集成**：对接校园一卡通、门禁系统、短信平台等，支持扩展
- **自动化运维**：CI/CD、Docker一键部署、Prometheus+Grafana监控告警
- **数据导入导出**：支持Excel批量导入导出，便于数据迁移与分析
- **接口文档与测试**：Swagger自动生成API文档，配套curl测试与单元测试用例

---

## 🏗️ 技术架构

- **前端**：Vue2、Element UI、ECharts、Axios
- **后端**：Spring Boot、Spring Security、MyBatis、Swagger、EasyExcel、Micrometer
- **数据库**：MySQL、Redis
- **运维**：Docker、docker-compose、Prometheus、Grafana、Alertmanager、CI/CD

---

## 🚀 快速启动

### 1. 一键部署（推荐）

```bash
git clone <repo-url>
cd dorm-admin
docker-compose up --build
```
- 前端：http://localhost
- 后端：http://localhost:8081
- Swagger接口文档：http://localhost:8081/swagger-ui/
- Prometheus监控：http://localhost:9090
- Grafana大盘：http://localhost:3000

### 2. 手动部署

#### 后端
1. 导入`sql/`下数据库脚本
2. 配置`dorm-admin-server/src/main/resources/application.yml`
3. `mvn clean package`，运行`target/*.jar`

#### 前端
1. 进入`dorm-admin-page`，`npm install && npm run build`
2. 部署`dist/`目录到Nginx或静态服务器

#### 监控与告警
- Prometheus、Grafana、Alertmanager已集成于docker-compose，支持邮件等多渠道告警

---

## 📦 主要功能模块

- 学生/宿舍/楼宇管理
- 报修管理、公告通知、考勤打卡
- 失物招领、访客登记、宿舍评比与积分
- 权限与角色管理、操作日志、数据导入导出
- 第三方平台对接（短信、一卡通、门禁等）
- 监控告警、接口文档、自动化测试

---

## 🔒 生产级安全与运维建议
- 管理端口（如Prometheus、Grafana、Swagger）建议仅内网或VPN访问
- 敏感配置用环境变量或配置中心管理
- 日志输出到文件并定期轮转，建议接入ELK/Loki等日志平台
- 定期备份数据库、Redis等关键数据，测试恢复流程
- CI/CD自动化构建、测试、部署，Docker容器建议加只读文件系统、资源限制等参数

---

## 🧪 API文档与测试
- Swagger自动生成API文档，详见`/swagger-ui/`
- `api-curl-examples.md`提供常用接口curl测试示例
- 后端配套单元测试，覆盖主要业务流程

---

## 📞 交流与支持
如需定制开发、部署支持或有任何建议，欢迎联系项目维护者。

## 数据库导入错误

```java
[ERR] 1273 - Unknown collation: 'utf8mb4_0900_ai_ci'
使用navicate12运行sql文件出错

报错：

[ERR] 1273 - Unknown collation: 'utf8mb4_0900_ai_ci'
1
报错原因：
生成转储文件的数据库版本为8.0,要导入sql文件的数据库版本为5.6,因为是高版本导入到低版本，引起1273错误

解决方法：
打开sql文件，将文件中的所有
utf8mb4_0900_ai_ci替换为utf8_general_ci
utf8mb4替换为utf8
保存后再次运行sql文件，运行成功
```


fsdfds9:34 2022/5/20
1111













根据对项目结构和主要代码目录的分析，初步总结该"宿舍管理系统"项目可能存在的不足如下：
1. 功能和架构层面
功能覆盖有限：从前端页面和后端接口来看，主要围绕学生、宿舍、楼宇、用户、菜单等基础管理，缺乏更丰富的宿舍管理功能（如报修、公告、考勤、统计分析等）。
权限与角色管理简单：虽然有Role、Menu等实体，但权限体系可能较为基础，缺乏细粒度的权限控制和多角色协作机制。
缺少单元测试：后端src目录下只有test文件夹，没有具体测试代码，说明自动化测试覆盖不足，影响代码质量保障。
前后端分离但未见API文档：未发现Swagger等API文档工具，前后端协作和后期维护会有不便。
2. 技术实现层面
前端页面结构较为简单：前端views下页面数量有限，且每个页面体量较大，可能存在代码复用性不高、维护难度大的问题。
后端业务逻辑分层较粗：Service、Mapper、Controller分层明确，但业务逻辑实现可能偏简单，缺乏复杂业务场景的处理和异常管理。
实体类设计较为基础：实体类字段较少，未见复杂关联和扩展性设计，后续功能扩展可能受限。
Redis使用未详细说明：虽然集成了Redis，但未见具体的缓存策略、分布式锁等高级用法，利用率可能不高。
3. 工程与部署层面
缺少CI/CD配置：未见Jenkins、GitHub Actions等持续集成配置，自动化部署和测试流程缺失。
数据库兼容性问题：README中提到SQL文件存在MySQL版本兼容问题，说明数据库脚本未做版本适配，易导致部署失败。
文档不完善：英文README未补充，中文README也未详细说明系统功能、接口、部署细节和常见问题。
4. 其他建议
缺少前端UI/UX优化：未见UI组件库或响应式设计说明，界面美观性和用户体验可能有提升空间。
安全性考虑有限：虽然用到Spring Security，但未见更细致的安全措施（如防止XSS/CSRF、操作日志、异常审计等）。
如果需要针对某一方面（如安全性、功能扩展、代码规范等）做更深入的分析，可以进一步指定查看相关代码或配置文件。
