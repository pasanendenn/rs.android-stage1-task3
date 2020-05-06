package subtask2

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        var x = 1
        var res: Long = 0
        val m = array[0].toLong()
        val n = array[1]
        while (x<n){
            res = factorial(n)/(factorial(x)*factorial(n-x))
            if (res==m){
                break
            }
            x+=1
        }

        return if (x==n&&res!=m) {
            null
        } else{
            x
        }
    }

    private fun factorial(fac: Int):Long{
        var factorial: Long = 1
        for (i in 1..fac) {
            factorial *= i.toLong()
        }
        return factorial
    }
}

