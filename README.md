# dorm-admin

SpringBoot+SpringSecurity+Mybatis+Vue前后端分离 简单实现的宿舍管理系统。


#### 启动后端

1.  导入sql文件
2.  使用ide导入项目dorm-admin-server 更新maven
3.  修改application.yml
4.  运行DormAdminServerApplication.java

####  启动前端

1.  导入项目dorm-admin-page
2.  修改config/index.js
3.  打开命令行界面
4.  npm install
5.  npm run dev
6.  浏览器打开http://localhost:8080/

#### 启动redis

---

## 技术栈：

- 前端：Vue
- 后端：Spring boot + Spring security + Mybatis
- 数据库：MySQL+Redis





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













根据对项目结构和主要代码目录的分析，初步总结该“宿舍管理系统”项目可能存在的不足如下：
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
