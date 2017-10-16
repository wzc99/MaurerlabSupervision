项目的codeline分为trunk和base,trunk用于开发，是不稳定的，所有开发工作在trunk上进行；base是基线，所有base中的codeline都是经过测试的稳定版本，
只有项目管理人员可以操作base中的codeline。

在trunk目录下，console目录下包含前端相关文件，core目录包含后台相关文件，lib目录包含所有jar包，database/spvisor.backup为数据库文件，详情请看document目录。

tag目录下为trunk baseline的标签，版本命名规范为：

前缀-v+版本.基线.开发

前缀：
tag	表示临时标记
br	表示分支
rel	表示发布
fix	表示热修复


