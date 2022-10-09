package linkedlists

fun movePointers(x: ListNode?, t: ListNode?) {
    val tempT = t?.next
    t?.next = t?.next?.next

    tempT?.next = x?.next
    x?.next = tempT
}


fun main() {
    val list = circularLinkedListOf(1, 2, 3, 4, 5, 6, 7, 8)
    val t = list?.next?.next?.next
    movePointers(list, t)

    var x = list
    repeat(8) {
        println(x?.data)
        x = x?.next
    }
}

/*
  x
  1 2
8     3
7     4 t
  6 5

  x
  1 5
8     2
7     3 t
  6 4
 */