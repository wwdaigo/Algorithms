package linkedlists

fun ListNode?.reverse(): ListNode? {
    var prev: ListNode? = null
    var next: ListNode? = null
    var current = this

    while (current != null) {
        next = current.next
        current.next = prev
        prev = current
        current = next
    }

    return prev
}

fun main() {
    val list = linkedListOf(1, 2, 3, 4, 5, 6)
    val reversed = list.reverse()

    var t = reversed
    while (t != null) {
        println(t.data)
        t = t.next
    }
}