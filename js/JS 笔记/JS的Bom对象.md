### Bom: Browser object model, 浏览器对象模型。
#### 有那些对象？
- navigator: 获取客户机信息。
1. navigator.appName:返回浏览器的名称
```    
document.write(navigator.appName);
```
- screen: 获取屏幕信息
```
document.write(screen.width);
document.write("<br>");
document.write(screen.height);
```
- location: 对象包含有关当前 URL 的信息。Location 对象是 Window 对象的一个部分，可通过 window.location 属性来访问。
```
//获取url地址
document.write(location.href);
document.write("<hr>");
//设置url地址        
function changelocation(){
    location.href = "String.html";
}
```
- History: 对象包含用户（在浏览器窗口中）访问过的 URL。History 对象是 window 对象的一部分，可通过 window.history 属性对其进行访问。
1. 创建三个页面
   
   a.html 超链接到 b.html，b.html 超链接到 c.html
2. 访问上一个页面
```
//第一种方式
history.back();
//第二种方式
history.go(-1);
```
3. 访问下一个页面
```
//第一种方式
history.forward();
//第二种方式
history.go(1);
```
- window: 表示浏览器中打开的窗口。顶层对象
1. alert() 显示带有一段消息和一个确认按钮的警告框。
2. confirm() 方法用于显示一个带有指定消息和 OK 及取消按钮的对话框。
```
var r = window.confirm("Press a button");
```
3. rompt() 方法用于显示可提示用户进行输入的对话框。
```
var x = window.prompt([要在对话框中显示的纯文本], [默认的输入文本]);
```
4. open() 方法用于打开一个新的浏览器窗口或查找一个已命名的窗口。
```
window.open([URL], [name], [features], [replace])
window.open([新窗口中显示的文档的URL], [新窗口的名称], [新窗口要显示的标准浏览器的特征], [规定了装载到窗口的 URL 是在窗口的浏览历史中创建一个新条目，还是替换浏览历史中的当前条目])
```
5. close() 方法用于关闭浏览器窗口。兼容性较差
```
window.close();
```
#### 下面方法常用作做定时器
6. setInterval() 方法可按照指定的周期（以毫秒计）来调用函数或计算表达式。
```
//表示每4秒执行一次
window.setTimeout("alert('abce')", 4000);
```
7. setTimeout() 方法用于在指定的毫秒数后调用函数或计算表达式
```
//表示4秒钟之后执行，只会执行一次
 window.setTimeout("alert('abce')", 4000);
```
8. clearInterval() 方法可取消由 setInterval() 设置的 timeout。
```
var id1 = window.setIntervar("alert('1234')", 3000);
window.clearInterval(id1);
```
9. clearTimeout() 方法可取消由 setTimeout() 方法设置的 timeout。
```
var id2 = window.setTimeout("alert('1234')", 3000);
window.clearTimeout(id2);
```