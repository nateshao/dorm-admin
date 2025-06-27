# API curl 测试示例

## 发送短信
```
curl -X POST "http://localhost:8081/api/thirdparty/sms/send" -d "phone=13800000000&content=hello"
```

## 同步一卡通信息
```
curl -X POST "http://localhost:8081/api/thirdparty/card/sync" -d "studentNo=20230001"
```

## 校验门禁权限
```
curl -G "http://localhost:8081/api/thirdparty/card/check" --data-urlencode "cardNo=CARD123" --data-urlencode "doorId=DOOR1"
``` 