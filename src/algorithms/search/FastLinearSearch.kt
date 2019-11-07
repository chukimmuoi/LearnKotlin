package algorithms.search

/**
 * @author  : Pos365
 * @Skype   : chukimmuoi
 * @Mobile  : +84 167 367 2505
 * @Email   : chukimmuoi@gmail.com
 * @Website : https://pos365.vn/
 * @Project : LearnKotlin
 * Created by chukimmuoi on 11/7/19.
 */
class FastLinearSearch : Search<MutableList<Int>>(){
    // Top 3
    // Not need sorted()
    override fun search(list: MutableList<Int>, valueFind: Int): Int {
        var index = 0
        val size = list.size
        list.add(valueFind)

        while (true) {
            if (list[index] == valueFind) {
                if (index < size) return index
                return -1
            }
            index++
        }
        list.removeAt(size)
    }
}