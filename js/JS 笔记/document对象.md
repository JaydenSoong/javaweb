>表示整个文档
### 常用方法
- write() 方法可向文档写入 HTML 表达式或 JavaScript 代码。
- getElementById() 返回对拥有指定 ID 的第一个对象的引用。
```
//通过 getElementById 得到对象
var inputx = document.getElementById("input1");
// 获取所得对象的 value 值
alert(inputx.value);
// 更改得对象的 value 值 
inputx.value = "BBBBB";
```
- getElementsByName() 返回带有指定名称的对象的集合。
```
// 通过 getElementsByName() 得到相同名称的对象集合
var x = document.getElementsByName("input1");
// 验证得到的数据类型 [object NodeList]
alert(x);
alert(x.length);
// 遍历集合
for(var i=0; i<x.length; i++)
    alert(x[i].value);

```
- getElementsByTagName() 方法可返回带有指定标签名的对象的集合。
```
// 通过 getElementsByTagName() 得到相同名称的对象集合
var x = document.getElementsByTagName("input");
// 验证得到的数据类型 [object HTMLCollection]
alert(x);
alert(x.length);
// 遍历集合
for(var i=0; i<x.length; i++)
    alert(x[i].value);
```
注意：当通过 getElementsByName() 或 getElementsByTagName() 获取的集合只有一个元素时，可不需遍历，直接通过下标取到值。
```
var x = document.getElementsByName("input1")[0];
alert(x.value);
```
