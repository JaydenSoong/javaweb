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
