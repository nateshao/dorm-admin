# DormAdmin

####  介绍
使用SpringBoot+Vue前后端分离  简单实现的宿舍管理系统

涉及Spring Security, Mybatis


#### 使用

1.  导入sql文件
2.  使用ide导入项目dorm-admin 更新maven
3.  修改application.yml
4.  运行DormAdminApplication.java

---

1.  导入项目dorm-admin-page
2.  修改config/index.js
3.  打开命令行界面
4.  npm install
5.  npm run dev
6.  浏览器打开http://localhost:8080/

---



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

