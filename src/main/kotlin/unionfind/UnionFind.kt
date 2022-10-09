package unionfind

class UnionFind {
    private val id = IntArray(N) { it }

    fun quickUnion(p: Int, q: Int) {
        val t = id[p]
        if (t == id[q]) return

        for (i in 0 until N) {
            if (id[i] == t) {
                id[i] = id[q]
            }
        }

        println("union $p $q")
        println(id.joinToString())
    }

    fun quickFind(p: Int, q: Int) {
        var i = p
        while (i != id[i]) i = id[i]

        var j = q
        while (j != id[j]) j = id[j]

        if (i == j) return

        id[i] = j

        println("union $p $q")
        println(id.joinToString())
    }

    companion object {
        private const val N = 10
    }
}

data class Sample(
    val p: Int,
    val q: Int
)

private val samples = listOf(
    Sample(3, 4),
    Sample(4, 9),
    Sample(6, 0),
    Sample(2, 3),
    Sample(5, 6),
    Sample(2, 9),
    Sample(5, 9),
    Sample(7, 3),
    Sample(4, 8),
    Sample(5, 6),
    Sample(0, 2),
    Sample(6, 1),
)

fun main() {
    val unionFind = UnionFind()
    samples.forEach {
        val (p, q) = it
        unionFind.quickFind(p, q)
    }
}