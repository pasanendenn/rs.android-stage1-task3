package subtask4

import kotlin.math.roundToInt
import kotlin.math.sqrt


class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        val result = mutableListOf<Int>()
        if (number>10000){
            val v0 = (number*number)-((number-1)*(number-1))
            val v = sqrt(v0.toDouble()).toInt()
            val v1 = sqrt(v0-v*v.toDouble()).roundToInt()

                for (c in v1-20 downTo 8){
                    for (u in v1-2 downTo 2){
                        if (c*c+u*u==v0-v*v-(v1-1)*(v1-1)&&u!=c){
                            result.add(u)
                            result.add(c)
                            break
                        }
                    }
                }


            result.add(v1-1)
            result.add(v)
            result.add(number-1)

            return result.toTypedArray()
        } else if (number<0){
            return null
        } else {
            val decomposeArray = decomposer(number, number * number)
            decomposeArray?.removeAt(decomposeArray.size - 1)
            val result = mutableListOf<Int>()

            if(decomposeArray == null) {return null}
            else {
                for (e in decomposeArray) {
                    result.add(e)
                }
            }
            return decomposeArray.toTypedArray()
        }
    }


    private fun decomposer(n: Int, remain: Int): MutableList<Int>? {

        // basic case
        if (remain==0 ) {
            val r= mutableListOf<Int>()
            r.add(n)
            return r
        }

        // iterate all element less than n
        //n1= sqrt(((n1 * n1) - ((n - 1) * (n - 1))).toDouble()).roundToInt()

            for (i in n - 1 downTo 1) {
            if (remain - i * i >= 0) {
                val r = decomposer(i, remain - i * i)

                // only get the answer
                if (r != null) {
                    r.add(n)
                    return r
                }
            }
        }

        // no answer
        return null
    }
}

