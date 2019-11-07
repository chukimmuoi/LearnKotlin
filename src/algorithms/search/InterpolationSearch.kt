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
class InterpolationSearch : Search<List<Int>>(){
    // Top 1
    // Need sorted()
    override fun search(list: List<Int>, valueFind: Int): Int {
        var low = 0
        var high = list.size - 1

        while ((list[low] < valueFind) && (valueFind < list[high])) {
            var mid = low + ((valueFind - list[low]) * (high - low))/(list[high] - list[low])

            when {
                list[mid] < valueFind -> low = mid + 1
                list[mid] > valueFind -> high = mid - 1
                else -> return mid
            }
        }
        if (list[low] == valueFind)
            return low
        if (list[high] == valueFind)
            return high
        return -1
    }
}