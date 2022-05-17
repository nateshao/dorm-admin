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

