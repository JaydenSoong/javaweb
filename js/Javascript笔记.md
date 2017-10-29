## 1、String对象
### 创建String对象
```
var str = "abc";
```
### 属性和方法
#### 属性 length: 字符串的长度
#### 方法
##### （1）与html相关的方法
* bold(): 加粗
* fontcolor(): 按指定颜色显示字符串
* fontsize(): 设置字体大小
* link(): 将字符串显示为超链接
```
var str1 = "百度";
document.write(str1.link("http://www.baidu.com"));
```
* sub(): 将文字显示为下标
* sup(): 将文字显示为上标

##### （2）与Java相似的方法
- concat(): 连接字符串(注意：通常使用"+"会更简便一些)                    
```
var str21 = "Jayden ";
var str22 = "Soong";
document.write(str21.concat(str22));
```
- chaAt(): 返回指定位置的字符，位置不存在，则返回空字符串
```
document.write(str.charAt(2));
document.write("<hr>");
document.write(str.charAt(4)); //位置不存在，返回空字符串
```
- indexOf(): 检索字符串，字符不存在，返回-1
```
document.write(str.indexOf("hn"));
document.write("<hr>");
document.write(str.indexOf("a")); //字符不存在，返回-1
```        
- split(): 分割字符串
```
var str23 = "What are you donging now?";
document.write(str23.split(" "));
```
- replace(): 替换字符串
```
var str24 = "John Soong";
document.write(str24.replace(/John/, "Jayden"));
```
- substr() 和 substring(): 截取字符串 
```                    
var str25 = "abcdefghijklmn";
document.write(str25.substr(6, 3)); //从第6个开始，截取长度为3的一个子字符串
document.write("<hr>");
document.write(str25.substring(3, 6)); //从第3个字符开始截取，到第6个字符。[3, 6)
```    
## 2、Array 数组 
### 创建数组（三种方式）
```
var arr1 = [1, 2, 3];
var arr2 = new Array(3) // 数组长度为3
var arr3 = new Array(1, 2, 3) // 数组元素
```
### 属性：length，数组长度。
### 方法：
- concat() 连接连个或多个数组
```
var arr1 = [4, 5, 6];
var arr2 = [7, 8, 9];
document.write(arr1.concat(arr2));
```
- join()方法用于把数组中的所有元素连接成一个字符串。元素是通过指定的分隔符进行分隔的。
```            
var arr3 =  ["Jim", "Green"];
document.write(arr3);
document.write("<br>");
document.write(arr3.join("."));
document.write("<hr>");
```
- push()方法向数组的末尾添加一个或多个元素，并返回新的长度。如果是添加的一个数组，则是把数组当成一个整体添加进去。
```            
var arr4 = ["Chinese", "English"];
document.write("原数组长度：" + arr4.length + "<br>");
document.write("新数组长度：" + arr4.push("Japanese") + "<hr>");
var arr41 = [1, 2, 3];
var arr42 = [4, 5, 6];
arr41.push(arr42);
for (var i = 0; i < arr41.length; i++) 
    alert(arr41[i]);
```            
- pop()方法，删除并返回数组的最后一个元素。。
```            
var arr5 = ["Java", "Python", "C#", "Javascript"];
document.write(arr5.pop()); //Javascript
```
- reverse() 方法用于颠倒数组中元素的顺序。
```
var arr6 = ["a", "b", "c", "d"];
document.write(arr6.reverse()); //d,c,b,a 
```

## 3、JS 的全局函数
### 由于不属于任何一个对象，直接写名称即可使用。
- eval() 函数可计算某个字符串，并执行其中的的 JavaScript 代码。
```
var str = "alert('Hello')";
//alert(str); 弹出整个str的内容
eval(str); // 执行str里的js语句 
```
- encodeURI() 函数可把字符串作为 URI 进行编码。
```
var str1 = "中文测试 & English Test";
var str11 = encodeURI(str1);
document.write(str11); //%E4%B8%AD%E6%96%87%E6%B5%8B%E8%AF%95%20&%20English%20Test
document.write("<hr>");
```
- decodeURI() 函数可对 encodeURI() 函数编码过的 URI 进行解码。
```
var str12 = decodeURI(str11);
document.write(str12); //中文测试 & English Test
```       
- isNaN() 函数用于检查其参数是否是非数字值。
```
document.write(isNaN(123)); //false
document.write("<br>");
document.write(isNaN("Hello")); //true 
```
- parseInt() 函数可解析一个字符串，并返回一个整数。
```
var str2 = "1234";
document.write(parseInt(str2) + 1); //1235
```
## 4、JS的Bom对象
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