## innerHTML 属性
这个属性不是 Dom 的组成部分，但是大多数浏览器都支持。
### 第一个作用：获取文本内容
```
//通过innerHTML获取内容
alert(document.getElementById("spanid").innerHTML);
```
### 第二个作用：向标签里设置内容（可以是 html 代码）；
```
//向标签里设置内容
var tab = "<table border=1>" + "<tr><td>001</td><td>疯狂Java讲义</td></tr>" 
+ "<tr><td>001</td><td>疯狂Java讲义</td></tr>"
+ "<tr><td>001</td><td>疯狂Java讲义</td></tr></table>"
document.getElementById("divid").innerHTML = tab;
```
