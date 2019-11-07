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
class LinearSearch : Search<List<Int>>(){
    // Top 4
    // Not need sorted()
    override fun search(list: List<Int>, valueFind: Int): Int {
        var index = 0
        val size = list.size

        while (index < size) {
            if (list[index] == valueFind) return index
            index++
        }
        return -1
    }
}