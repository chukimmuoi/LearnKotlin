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
abstract class Search<T> {
    abstract fun search(list: T, valueFind: Int) : Int
}