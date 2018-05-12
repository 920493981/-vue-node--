# SVN使用方法 #

svn 属于被淘汰的一类代码管理工具，相比于Git，svn在功能功能上面不是很突出，且不便于使用，在这里学习的目的完全是为了后面学习Git做比较。

_ 在现在的代码泛滥的时代 _

**代码的随取随用** 是非常关键的一点

***

## SVN中遇到的版本冲突 ##

_当代码迁出之后，在test文件1.md文件重新排版中进行文件提交之后
在SVN文件夹下进行了1.md文件的提交会出现下面的问题

```javascript

 Commit to file:///F:/Project/SVN/branches/1.md
F:\Project\SVNwc\branches\1.md
提交失败(细节如下):
文件 “F:\Project\SVNwc\branches\1.md” 已经过时
文件 “/branches/1.md” 已经过时
你必须先更新工作副本。

```

## 版本冲突解决方法 ##

_answer： 当不知道同一文件正在被操作的时候需要先更新本地文件，且需要将文件拷贝一份出去，以防同时提交导致的内容覆盖错误

***

## SVN文件创建顺序 ##

1.在任何一个地方右键，在出现的tortoiseSVN选项里面选择在此创建版本库， 会在点击目录下方创建SVN目录和SVNwc目录，SVN目录用来版本控制，SVNwc目录用来存放项目文件

## **当网络状况不是很好，且身处国外，如果要做好版本提交控制的解决方法** ##

answer: 使用离线提交方案，当本地开发完成的时候，立即提交，网络状况良好的时候自动上传到国内服务器版本控制中心，网络不好时会保存在本地仓， ok， 这就是解决方案之一

## 无序列表 ##

* item1
  * child item1.1
    * grandchild item1.1.1
    * child item1.2
* item4
* Nested item2
  * item3
* List item
* List item

1. List item1 此处有序表跟下面的无需表无法组成list

[百度](https://www.baidu.com)

<!-- [idrink]: <https://www.baidu.com> "Optional Title Here" -->

[idrink]: <https://www.baidu.com> 'Optional Title Here'
