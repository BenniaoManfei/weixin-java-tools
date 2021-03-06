# Weixin Java Tools 微信公众号/企业号开发Java SDK
## [![Join QQ Group](http://pub.idqqimg.com/wpa/images/group.png)](http://shang.qq.com/wpa/qunwpa?idkey=078f7a153d243853e24cf2b542e7a6ccbf2a592bc138080f84d11297f736ec46)  [![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badge/)     ![Maven Central](https://img.shields.io/maven-central/v/com.github.binarywang/weixin-java-parent.svg)  [![Build Status](https://travis-ci.org/binarywang/weixin-java-tools.svg?branch=develop)](https://travis-ci.org/binarywang/weixin-java-tools)


### 声明：本项目Fork自chanjarster/weixin-java-tools，但由于原项目已停止维护，故单独维护和发布，且发布到maven上的groupId也会不同，详细信息见下文。

### 最新更新：2.0.0版发布！！！ on 2016-07-31
####　由于本次更新涉及接口调整比较大，主要是公众号的调整，企业号无过多调整，主要是为了解决主接口类过于庞大不方便管理的问题，将接口实现代码按模块进行拆分。因此版本号直接从1.X.X直接升级到2.0.0，所以如果习惯于1.X.X版本的同学不想做过多更改的话，请慎重考虑升级到最新版本。
---

#### 本项目主要存放在github上，地址为 :
* https://github.com/wechat-group/weixin-java-tools
* ===========但同时会在其他几个网站同步更新，地址分别是:
* https://bitbucket.org/binarywang/weixin-java-tools
* http://git.oschina.net/binary/weixin-java-tools
* https://git.coding.net/binarywang/weixin-java-tools.git

### 详细开发文档请看 [wiki](https://github.com/chanjarster/weixin-java-tools/wiki)。

## 目前可参考的Demo项目:
* https://github.com/wechat-group/weixin-java-tools-springmvc
* https://github.com/wechat-group/weixin-mp-demo
* ===========以下为备份仓库，会保持跟主仓库同步
* http://git.oschina.net/binary/weixin-mp-demo
* https://bitbucket.org/binarywang/weixin-mp-demo

===========
## 开发交流工具：
* QQ群：343954419 [![Join QQ Group](http://pub.idqqimg.com/wpa/images/group.png)](http://shang.qq.com/wpa/qunwpa?idkey=078f7a153d243853e24cf2b542e7a6ccbf2a592bc138080f84d11297f736ec46)
*  注意：为保证入群成员质量，请申请入群时认真输入Github帐号ID，即你的github主页地址https://github.com/XXXX 中最后的部分XXXX的内容，谢谢~
* 微信群： 因二维码有时间限制，如有想加入微信群的，请入QQ群后咨询获取最新入群二维码。
 
===========

## 版本说明
* 本项目定为每月发布一次正式版，版本号格式为X.X.0（如2.0.0，2.1.0等），月初或月底发布新版本，遇到重大问题需修复会及时提交新版本，欢迎大家随时提交Pull Request。
* BUG修复和新特性一般会先发布成小版本作为临时版本（如2.0.1，2.0.2等，即尾号不为0，以区别于正式版）。
* 目前最新版本号为 ![Maven Central](https://img.shields.io/maven-central/v/com.github.binarywang/weixin-java-parent.svg) ，也可以通过访问如下地址查看所有最新的版本：
- [【公众号】](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.github.binarywang%22%20AND%20a%3A%22weixin-java-mp%22)
- [【企业号】](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.github.binarywang%22%20AND%20a%3A%22weixin-java-cp%22)


## Quick Start

* 如果要开发公众号（订阅号、服务号）应用，在你的maven项目中添加：

```xml
<dependency>
  <groupId>com.github.binarywang</groupId>
  <artifactId>weixin-java-mp</artifactId>
  <version>2.0.0</version>
</dependency>
```

* 如果要开发企业号应用，在你的maven项目中添加：

```xml
<dependency>
  <groupId>com.github.binarywang</groupId>
  <artifactId>weixin-java-cp</artifactId>
  <version>2.0.0</version>
</dependency>
```

## 关于Pull Request

* 非常欢迎和感谢对本项目发起Pull Request的同学，不过本项目基于[git flow](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow)开发流程，因此在发起Pull Request的时候请选择develop分支。
* 本项目代码风格是用2个空格代表一个Tab，因此在发起PR时请注意一下，否则很容易在IDE格式化代码后与原代码产生大量diff，这样在阅读PR的时候就比较困难。
