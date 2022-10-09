package linkedlists

fun josephusProblem(n: Int, m: Int): Int {
    val t = ListNode(1)
    t.next = t

    var x = t
    for (i in 2..n) {
        x.next = ListNode(i, t)
        x = x.next!!
    }

    while (x != x.next) {
        for (i in 1 until m) {
            x = x.next!!
        }
        x.next = x.next?.next
    }
    return x.data
}

fun josephusProblemArray(n: Int, m: Int): Int {
    val nodes = Array(n) { ListNodeArray(it + 1, it + 1) }
    nodes.last().next = 0

    var x = nodes.last()
    while (x != nodes[x.next]) {
        for (i in 1 until m) {
            x = nodes[x.next]
        }
        x.next = nodes[x.next].next
    }
    return x.data
}


fun main() {
    println(josephusProblem(9, 5))
    println(josephusProblemArray(9, 5))
    println(josephusProblem(10e3.toInt(), 2))
    println(josephusProblemArray(10e3.toInt(), 2))
    println(josephusProblem(10e4.toInt(), 3))
    println(josephusProblem(10e5.toInt(), 5))
    println(josephusProblem(10e6.toInt(), 10))

    val values = (2..1000).map {
        josephusProblem(it, 10)
    }
    println(values)
}