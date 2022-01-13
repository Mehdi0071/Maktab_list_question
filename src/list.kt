fun main() {
    val list = mutableListOf<MutableList<Int>>()
    val newlist = mutableListOf<Int>()

    println("lists for saving ... ")
    for (i in 10 downTo  5) {
        var j = 0
        while (j < i) {
            newlist += j
            j++
        }
        println(newlist)
        list += newlist
        newlist.clear()
    }

    println("lists after save ...")
    for (item in list)
        println(item)

    /* Don't resolved the problem with using map!!!
    val list = mutableMapOf<Int,MutableList<Int>>()
    val newlist = mutableListOf<Int>()
    for (i in 10 downTo 5) {
        var j = 0
        while (j < i) {
            newlist += j
            j++
        }
        list.put(i,newlist)
        newlist.clear()
    }

    for ((k,v) in list)
        println("$k ,  $v") */

}