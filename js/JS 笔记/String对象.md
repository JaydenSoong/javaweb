## 创建String对象
```
var str = "abc";
```
#### 属性 
- length: 字符串的长度
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