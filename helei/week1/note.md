#week_1
 ---
###  1. Java class/interface的extends/implements的知识点，包括各种内部类
* ##### class&extends

class
每个类文件最多只能有一个public类，且与文件名同名。


```
//类定义
  class Father{        
      数据成员：
       [修饰符] 类型 变量名 [=?]     
      成员函数：
       访问控制符 [修饰符] 返回值类型 方法名称(参数列表){  
         方法体
       }
      构造器
    }
```  
```
//创建类型新对象
  Father f=new Father()；
```

```
//extends(子类继承父类)
class Son1 extends Father{

  }
```

abstract:抽象（类&方法）
abstract类不能被实例化，abstract类里有abstract方法（没有方法体）。（abstract和final，private（一个类里）不能共用）
子类继承 extends，只能单继承。
方法的重写（方法体补充），继承类可以在类里添加更多的方法。
多重继承可以借助内部类。




* ##### interface&implements
接口： interface，
接口中，所有的方法为public abstract，属性为public、static、final。
接口没有构造方法，不能被实例化，在接口中定义构造方法是非法的。
一个接口不能实现另一个接口，但它可以继承多个其他接口。interface C extends A, B{} // A，B，C都是接口
当类实现某个接口时，它必须实现接口中所有的抽象方法，否则这个类必须被定义为抽象类，并且在实现类的方法前加public。接口中的默认修饰符是public。
接口中没有方法体

一个类可以实现多个接口（implements）




* ##### 内部类
在外部类的内部定义的类，成员内部类(Inner1)、局部内部类(在内部方法里)、匿名内部类(Inner3)和静态内部类。
静态内部类可参考static，内部类里不能访问外部的非静态成员。
的。


### 2.静态变量 （StaticDemo）
static，用于成员，函数，代码块，内部类，将对象相关的变成类相关的，static修饰的东西在类加载的时候自动初始化。

静态变量（&局部变量&实例变量）：
局部变量是指不直接声明在类体括号里面的变量，只作用在定义它的代码块里。
实例变量无static修饰，但需要借助实例对象。
static变量只会被创建一次。

静态函数：类内直接调用方法，不需借助对象；类外直接用类名.方法名 调用。

静态内部类：直接new，非静态类需创建一个父类的实例。
非静态成员需要借助类实例访问，因为类的构造函数里自动加入非静态成员，若直接访问，是找不到的。

### 3. final的使用
final <br>
修饰变量，基本数据类型不可以改变，句柄不可以改变指向位置，但指向位置的值可以改变<br>
修饰方法，方法不能被重写<br>（方法重写为子类方法覆盖父类方法，重载为同一方法名不同参数不同方法体）
修饰类，该类不能被其他类继承。


### 4.public/private/protected的说明
修饰符>访问控制修饰符

|  |   |  |
| ------------- |:-------------:| -----:|-----:|
|public|（类，成员，函数，接口）|对所有包可见|
|protected|（成员，函数）| 包内以及子类可见
|default（friendly）|（类，成员，函数，接口）| 同一包内可见
| private|（成员，函数）|同一个类可见


### 5.原始数据类型，自动装箱机制
* ##### 原始数据类型

| 主类型         |bit            | 封装器类型 |默认值|
| ------------- |:-------------:| -----:|-----:|
| byte     | 8| Byte|null |
| short   | 16  | Short|  0|
| int | 32     | **Integer**|  0|
| long|64    | Long|   0|
| float     |32  |Float|  0|
| double|64      |Double |  0|
| char     | 16    |**Character** |  0|
| boolean| 1     |Boolean |false|



> 复杂类型和基本类型的内存模型本质上是不一样的，简单数据类型的存储原理是这样的：所有的简单数据类型不存在“引用”的概念，简单数据类型都是直接存储在内存中的内存栈上的，数据本身的值就是存储在栈空间里面，而Java语言里面只有这八种数据类型是这种存储模型；而其他的只要是继承于Object类的复杂数据类型都是按照Java里面存储对象的内存模型来进行数据存储的，<br>Integer a = new Integer(1);
表示一个Integer类型的引用a引用了一块内存，这块内存中的数据是1; 而a中所存的则是这块内存的引用（地址），把a传给别的方法或对象时，则是把a的引用传递过去了。
使用Java内存堆和内存栈来进行这种类型的数据存储，简单地讲，“引用”(Integer a)是存储在有序的内存栈上的，而对象本身的值(new Integer())存储在内存堆上的。
栈是线程私用，堆是全局共用。

基本类型按值传递，封装器按引用传递。

基本类据类型速度快（不涉及到对象的构造和回收），但不是对象，不能调用对象的方法。

> 不同内存区域的功能和特点：<br>
栈区：存放局部变量（变量名，对象的引用等）特点：内存随着函数的调用而开辟，随着函数调用结束而释放。
堆区：存放对象（也就是new出来的东西）特点：可以跨函数使用，每个对象有自己对应的存储空间。<br>
静态域：存放在对象中用static定义的静态成员。<br>
常量池：存放常量。（常量池指的是在编译期被确定，并被保存在已编译的.class文件中的一些数据）

[Java中String类的内存分配](https://jingyan.baidu.com/article/8275fc869a070346a03cf6f4.html)

> Java中，所有基本数据类型的实现类都按照String类的方式重写了equals方法，这些类都符合”==比较对象，equals比较值“这一结论。
如果一个类是你自己定义的，那么如果你不重写equals方法，它还是默认比较对象。（直接调用Object类中的方法）。

[按值传递与按引用传递](http://blog.csdn.net/zzp_403184692/article/details/8184751)

要注意，不是所有的引用都在栈上，要看引用是否依附在实例上。



* ##### 自动装箱机制
自动装箱：基本类型用它们对应的封装器包装起来，使它们具有对象的特质，可以调用方法。
```
Integer a = 1;//装箱,底层实现：Integer a = Integer.valueOf(1);
int b = a; //拆箱,底层实现：int b = a.intValue();
```


system.out.println(a+" "),当检测到要转为string类型时，stringbuffer ，.append ,tostring

### 6. Android Activity的基本使用
activity  app/src/main/java/包内创建,所有活动都需重写onCreat()方法
layout    app/src/main/res Text/Design
activity里加载布局   setContentView(R.layout.xxx)项目中任何资源都会在R文件中生成资源ID
AndroidManifest文件中注册acticity，android_label指定活动中标题栏内容，主活动即app名字，<intent-filter>里注明主活动，action&category。

*Toast 提醒

Button作为Toast触发点，findViewById Button实例化+强制转型，setOnClickListener（）为按钮注册一个监听器，重写onClick()，Toast.makeText().show()

*Menu
res目录下新建Directory：menu，menu下新建Menu resource file，<item>创建具体的菜单项
acticity里重写onCreateOptionsMenu（），getMenuInflate().inflate(menu ID,)，onOptionsItemSelected()


*销毁活动
finish（）

*intent 跳转
显式intent
新建Intent实例:new Intent(上下文，跳转.class),startActivity(intent);

隐形intnt：
manifest活动标签下配置action&category（类似配置主活动，但action&category不同），
新建Intent实例:new Intent("action字符"),intent.addCategory(""),startActivity(intent);






### 7. Android BroadcastReceiver的基本使用
对感兴趣的广播进行注册  发送（intent）接收（Broadcast Receiver）
标准广播（异步执行，同时收到，不可阻断）&有序广播（优先级）
* BroadcastReceiver
动态注册（代码里写，新建一个继承自BroadcastReceiver的类，重写onReceive()方法）
onCreate（）方法里，新建IntentFilter实例，加入（addAction）要监听的广播，新建继承类的实例，registerReceiver（）传入两个实例，receiver实例就能接受指定广播。
receiver需要取消注册，onDestory（）方法。
静态注册
java包里新建 Broadcast Receiver,里面onReceive()方法。在Manifest里<intent-filter>添加相应的action。（部分需要加入权限uses-permission）

发送标准广播：
新建BR（onReceiver里toast显示，manifest里添加action,Button实例setOnClickListener重写onClick(),新建intent实例，增加广播action，sendBroadcast该实例。（新项目下新BR,可以看到两次Toast显示，比较直观。）

有序广播：
onClick方法里sendBroadcast改成sendOrderedBroadcast（intent，null），manifest里注册android：priority标优先级，onReceiver里abortBroadcast，截断。

本地广播：需要建立localReceiver实例。




### 8. 常见布局的使用
基本控件：TextView，Button，EditText，ImageView
activity里findViewById，强制转型


android:id="@+id/"
android:layout_width(height)    match-parent(fill-parent)/wrap-content
andorid:gravity top/bottom/right/left/center  |
android:textSize sp
android:textColor

Button：
android：textAllCaps

EditText：
android：hint
android：maxLines
String inputText=editText.getText().toString();


ImageView:res下"drawable"开头的目录下放置照片
android：src="@drawable/".

example：按钮更改图片 button imageView.setImageResource();


基本布局：布局里放置布局&控件
LinearLayout:
android:orientation     vertical/horizontal
android:layout_gravity 控件在布局中的位置（top，bottom，center_vertical  在horizontal方向上）
android：layout_weight 在空间里除去已设置宽度（所以一般设置为0dp），按比例划分空间（除去不设置layout_weight的控件）


			
RelativeLayout:
android:layout_alignParentBottom/alignParentTop/alignParentRight/alignParentLeft/centerInParent="true"
android:layout_(above/below/toLeftOf/toRightOf)="+"


FrameLayout:(左上角，下覆盖上)
android:layout_gravity

PercentFrameLayout/PercentRelativeLayout:
build.gradle中dependencies闭包中增加百分比支持包；
layout文件中写出完整包路径，且定义一个app的命名空间
app:layout_widthPercent="  %"
