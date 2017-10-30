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