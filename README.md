# AndroidUtils
继承android开发过程中常用的工具类，便于开发过程直接使用，提高开发效率。如果觉得对你有用的话，点一下右上的星星赞一下吧!

#基本使用
###1.添加Gradle依赖
先在 build.gradle 的 repositories 添加:

     allprojects {
         repositories {
            ...
            maven { url "https://jitpack.io" }
        }
    }

    
 然后在dependencies添加:
 
        dependencies {
        ...
        compile 'com.github.lygttpod:AndroidUtils:1.0.0'
        }


###2.都有哪些功能？

* ActivityCollector.java

     * addActivity
     
     * removeActivity
     
     * finishAll
     
* DisplayUtils.java

     * dip2px
     
     * px2dip

* FileUtils.java

     * getFromAsset
     
* GsonUtils.java

     * getObject
     
     * getArray
     
     * listKeyMaps
     
     * objKeyMaps

* LogUtils.java



* MathUtils.java

* MD5.java

*  NetUtils.java

* SPUtils.java

* StringUtils.java

* ToastUtils.java

* VerifyUtils.java

* DividerItemDecoration



#更新日志

### V1.0.0
* android开发工具类

#意见反馈
如果遇到问题或者好的建议，请反馈到我的邮箱：lygttpod@163.com 或者lygttpod@gmail.com 或者QQ：460605805

如果觉得对你有用的话，点一下右上的星星赞一下吧!

#License
         Copyright 2016 Allen

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

          http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
