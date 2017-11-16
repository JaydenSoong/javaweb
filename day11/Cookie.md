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

注意：Cookie 是不能跨浏览器的。
## 3. JavaWeb 中使用 Cookie
* 原始方式（了解）

    使用 response 发送 Set-Cookie 响应头

    使用 request 获取 Cookie 请求头
* 便捷方式（精通）

    使用 response.addCookie() 方法向浏览器保存 Cookie

    使用 request.getCookies() 方法获取浏览器归还的 Cookie
## 4. Cookie 详解
* Cookie 的 maxAge 属性（掌握）：Cookie 的最大生命，以秒为单位。

    maxAge > 0：浏览器会把 Cookie 保存到客户机的硬盘上。有效时长由 maxAge 的值决定。

    maxAge < 0：Cookie 只在浏览器的内存中存在。浏览器进程结束，Cookie 也就死亡了。
    
    maxAge = 0：浏览器会马上删除这个 Cookie
* Cookie 的 path (理解)

    Cookie 的 Path 并不是设置 Cookie 在客户端的保存路径。

    Cookie 的 path 由服务器创建 Cookie 时设置

    当浏览器访问服务器某个路径时，需要归还哪些 Cookie 给服务器呢？这就由 Cookie 的 Path 决定。

    浏览器访问服务器的路径，如果包含某个 Cookie 的路径，那么就会归还这个 Cookie。例如：

        aCookie.path=/day11_1/; bCookie.path=/day11_1/jsps/; cCookie.path=/day11_1/jsps/cookie/;
        访问：/day11_1/index.jsp 时，归还 aCookie
        访问：/day11_1/jsps/a.jsp 时，归还 aCookie, bCookie
        访问：/day11_1/jsps/cookie/b.jsp 时，归还 aCookie, bCookie, cCookie

    Cookie 的 Path 默认值：当前访问路径的父路径。例如在访问 /day11_1/jsps/a.jsp, 响应的 Cookie，那么这个 Cookie 的默认路径为 /day11_1/japs/
* Cookie 的 domain (了解)

    domain 用来指定 Cookie 的域名，有多个二级域名共享 Cookie 时才有用。

    例如 www.baidu.com, zhidao.baidu.com, news.baidu.com 之间共享 Cookie 可以使用 domain

    设置 domain: cookie.setDomain(".baidu.com");

    设置 path: cooke.setPath("/");
