// WITH_RUNTIME
// PARAM_DESCRIPTOR: value-parameter val it: kotlin.Int defined in foo.<anonymous>
// PARAM_TYPES: kotlin.Int
fun foo(a: Int): Int {
    a.let {
        <selection>if (it > 0) return@foo it else return -it</selection>
    }
    return 0
}