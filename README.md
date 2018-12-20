# spi-demo
SPI全称Service Provider Interface，是Java提供的一套用来被第三方实现或者扩展的API，它可以用来启用框架扩展和替换组件。

- animal 作为SPI 接口定义

- program 作为运行程序,在运行的时候讲实现类模块jar导入classpath中,由ServiceLoader 主动发现加载相应的实现类

- cat\dog 作为SPI接口的具体实现类,在classpath\META-INF\services\ 中新建 sunjx.Animal 文件,表示SPI接口
    文件内容为sunjx.Cat或者sunjx.Dog表示具体实现类

# 测试运行

```jshelllanguage
>java -cp animal-1.0-SNAPSHOT.jar;cat-1.0-SNAPSHOT.jar;program-1.0-SNAPSHOT.jar sunjx.Run

>Found Animal Service Name => cat
```
或者
```jshelllanguage
>java -Djava.ext.dirs=. sunjx.Run
>Found Animal Service Name => cat
>Found Animal Service Name => dog
```
