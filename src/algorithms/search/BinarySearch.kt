package algorithms.search

/**
 * @author  : Pos365
 * @Skype   : chukimmuoi
 * @Mobile  : +84 167 367 2505
 * @Email   : chukimmuoi@gmail.com
 * @Website : https://pos365.vn/
 * @Project : LearnKotlin
 * Created by chukimmuoi on 11/6/19.
 */
class BinarySearch : Search<List<Int>>() {
    // Top 2
    // Need sorted()
    override fun search(list: List<Int>, valueFind: Int): Int {
        var index = 0
        var size = list.size

        while (index != size) {
            var center = (index + size) / 2

            if (valueFind == list[center]) return center
            if (valueFind < list[center])
                size = center
            else
                index = center + 1
        }
        return -1
    }
}