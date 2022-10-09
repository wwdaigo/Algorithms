package linkedlists

fun numberOfNodesBetween(node1: ListNode, node2: ListNode): Int {
    if (node1 === node2) return 0
    var t = node1
    var count = 0
    while (t.next !== node2) {
        count++
        t = t.next!!
    }
    return count
}

fun main() {
    val list = circularLinkedListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val node1 = list?.next?.next // 3
    val node2 = node1?.next?.next?.next?.next // 7

    println(numberOfNodesBetween(node1!!, node2!!))
}