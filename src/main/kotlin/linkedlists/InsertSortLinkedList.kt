package linkedlists

fun ListNode?.insertSort(): ListNode? {
    if (this == null) return null

    val dummyHead = ListNode(0)

    var t = this
    while (t != null) {
        var x: ListNode? = dummyHead
        while (x != null) {
            if (x.next == null || x.next!!.data > t.data) break
            x = x.next
        }
        val u = t.next
        t.next = x?.next
        x?.next = t
        t = u
    }

    return dummyHead.next
}

fun main() {
    val list = randomNumbersList(999, 999).insertSort()
    var t = list
    while (t != null) {
        println(t.data)
        t = t.next
    }
}

/*
t u
5N1 4 2 3

x
0->



node heada(0,0);
link a = &heada;
link t = a;

for (int i = 0; i < N; i ++) {
    t = (t->next = new node(rand() % 1000, 0));
}

node headb(0, 0);
link u, x, b = &headb;

for (t = a->next; t != 0; t = u) {
    u = t->next;
    for (x = b; x->next != 0; x = x->next)
        if (x->next->item > t -> item) break;
    t->next = x->next;
    x->next = t;
}
 */