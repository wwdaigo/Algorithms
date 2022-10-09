package linkedlists

fun circularLinkedListOf(vararg value: Int): ListNode? {
    var head: ListNode? = null
    var tail = head

    value.forEach {
        if (head == null) {
            head = ListNode(it)
            head?.next = head
            tail = head
        } else {
            val node = ListNode(it, head)
            tail?.next = node
            tail = tail?.next
        }
    }

    return head
}

fun linkedListOf(vararg value: Int): ListNode? {
    var head: ListNode? = null
    var tail = head

    value.forEach {
        if (head == null) {
            head = ListNode(it)
            tail = head
        } else {
            val node = ListNode(it)
            tail?.next = node
            tail = tail?.next
        }
    }

    return head
}

fun randomNumbersList(size: Int, max: Int): ListNode? {
    var head: ListNode? = null
    var tail = head

    repeat(size) {
        val node = ListNode((0..max).random())
        if (head == null) {
            head = node
            tail = node
        } else {
            tail?.next = node
            tail = tail?.next
        }
    }

    return head
}