// IGNORE_BACKEND: JVM_IR
class A {
    public var prop = "OK"
        private set


    fun test(): String {
        return { prop }()
    }
}

fun box(): String = A().test()