package ScalaProgramming.chapter6

/**
 * @Author Administrator
 * @Date 2022/8/29 21:11
 * @Version 1.0
 *          Desc:
 *
 *          //因为对象是不可变的，将要求使用者，在构造Rational实例的时候提供所需数据
 *          // 不可变对象设计
 *
 *          不可变对象的设计取舍
 *          跟可变对象相比，不可变对象具有若干优势和一个潜在的劣势。首
 *          先，不可变对象通常比可变对象更容易推理，因为它们没有随着时
 *          间变化而变化的复杂的状态空间。其次，可以相当自由地传递不可
 *          变对象，而对于可变对象，在传递给其他代码之前，你可能需要对
 *          它们做保护式的拷贝。再次，假如有两个并发的线程同时访问某个
 *          不可变对象，它们没有机会在对象正确构造以后破坏其状态，因为
 *          没有线程可以改变某个不可变对象的状态。最后，不可变对象可以
 *          被安全地用作哈希表里的键。举例来说，如果某个可变的对象在被
 *          加到HashSet以后被改变了，当你下次再检索该HashSet的时候，你
 *          可能就找不到这个对象了。
 *          不可变对象的主要劣势是它们有时候会需要拷贝一个大的对象图，
 *          而实际上也许一个局部的更新也能满足要求。在某些场景下，不可
 *          变对象可能用起来比较别扭，同时还带来性能瓶颈。因此，类库对
 *          于不可变的类也提供可变的版本这样的做法并不罕见。例如，
 *          StringBuilder类就是对不可变的String类的一个可变的替代。
 */


// n、d 为类参数 编译器会采集这两个参数，作为主构造方法


class RationalNumber(n: Int, d: Int) {
  //对构造方法定义前置条件 对主构造方法的参数进行限制
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  print(g)
  val number: Int = n / g
  val denom: Int = d / g

  def this(n: Int) {
    this(n, 1)
  }
  //创建对象就会触发执行
  println("created:" + n + "/" + d)

  //重写toString方法
  override def toString: String = s"$number/$denom"

  //添加加法
  def +(other: RationalNumber): RationalNumber = {
    new RationalNumber(this.number * other.denom + other.number * this.denom, this.denom * other.denom)

  }

  def +(i: Int): RationalNumber = new RationalNumber(number + i * denom, denom)

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

}
