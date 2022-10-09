package linkedlists

fun joinToLists(x: ListNode?, t: ListNode?) {
    var tailT = t
    while (tailT?.next != t) {
        tailT = tailT?.next
    }
    tailT?.next = x?.next
    x?.next = t
}

fun main() {
    val list1 = circularLinkedListOf(1, 3, 5, 7, 9)
    val list2 = circularLinkedListOf(2, 4, 6, 8, 10)

    joinToLists(list1, list2)
    var t = list1
    repeat(11) {
        println(t?.data)
        t = t?.next
    }
}

/*
 x
 1 3
9   5
  7

  t
  2 4
10   6
   8

1 2 4 6 9 10 3 5 7 9 ....1
 */