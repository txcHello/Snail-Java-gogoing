Netty的核心组件:
1.Channel :
Java NIO的基本构造
代表一个到实体（一个硬件设备，一个文件，一个网络套接字）的开发连接，如读操作和写操作。
可以把Channel看作 传入和传出数据的载体。
2.回调
一个回调就是一个方法，一个指向已经被提供给另一个方法的方法的引用。
3.Future
Future 提供了另一种在操作完成时通知应用程序的方式。这个对象可以看作是一个异步操
作的结果的占位符；它将在未来的某个时刻完成，并提供对其结果的访问。
4.事件和 ChannelHandler
