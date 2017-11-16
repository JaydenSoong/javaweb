# Cookie
## 1. Http 协议与 Cookie(了解)
* Cookie 是 Http 协议制定的，先由服务器保存 Cookie 到浏览器，下次浏览器请求服务器时把上一次请求得到 Cookie 再归还给服务器。
* 由服务器创建保存到浏览器的一个键值对。服务器保存 Cookie 的响应头：Set-Cookie: aaa=AAA, Set-Cookie: bbb=BBB 
* 当浏览器请求服务器时，会把该服务器保存到的 Cookie 随请求发送给服务器。浏览器归还请求头。Cookie：aaa=AAA; bbb=BBB
* Http 协议规定：

    1 个 Cookie 最大 4KB
    
    1 个服务器最多向一个浏览器保存 20 个 Cookie

    1 个浏览器最多可以保存 300 个 Cookie
## 2. Cookie 的用途
* 服务器使用 Cookie 来跟踪客户端状态
* 保存购物车
* 显示上次登陆名
## 3. JavaWeb 中使用 Cookie
* 原始方式（了解）

    使用 response 发送 Set-Cookie 响应头