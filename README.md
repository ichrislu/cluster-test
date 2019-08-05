实验：
1，go实现id，order
2，java实现user

user为用户模块，order订单模块

order和user入库调用id
order和user互相调用，如
1，order中查询用户基本信息（调用user模块）
2，user中查询用户所有订单（调用order模块）

模块调用使用gRPC