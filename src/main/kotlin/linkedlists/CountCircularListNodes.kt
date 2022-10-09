package linkedlists

fun ListNode?.numberOfNodes(): Int {
    if (this == null) return 0
    var count = 0

    var t = this
    while (t != this || count == 0) {
        count++
        t = t?.next
    }

    return count
}

fun main() {
    val list = circularLinkedListOf(1, 3, 5, 7, 8, 10)
    println(list.numberOfNodes())
}