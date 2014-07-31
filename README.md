what
=============

* 这是为了理解elasticsearch学习netty时照着文档实现 `discard` 协议练习代码

how
============

#### 创建maven项目
```
mvnapp.new netty discard
```
#### 在pom.xml增加netty

```
<dependency>
  <groupId>io.netty</groupId>
  <artifactId>netty</artifactId>
  <version>3.9.0.Final</version>
  <scope>compile</scope>
</dependency>
```

#### 编译打包项目
```
mvn package 
```
#### 运行代码
```
java -cp target/discard-1.0-SNAPSHOT.jar com.gnuhub.netty.discard.App
```

#### IDE
```
import project - pom.xml
```