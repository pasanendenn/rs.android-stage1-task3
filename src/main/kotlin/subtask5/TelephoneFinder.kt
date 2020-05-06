package subtask5

import java.lang.StringBuilder

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {

        var arr = StringBuilder(number)

        var str = arrayListOf<String>()
        for (i in arr.indices){

            when (arr[i]) {
                '9' -> {
                    arr.setCharAt(i, '8')
                    str.add(arr.toString())
                    arr[i]='6'
                    str.add(arr.toString())

                }
                '0' -> {
                    arr[i]='8'
                    str.add(arr.toString())
                }
                '1' -> {
                    arr[i]='2'
                    str.add(arr.toString())
                    arr[i]='4'
                    str.add(arr.toString())
                }
                '2' -> {
                    arr[i]='1'
                    str.add(arr.toString())
                    arr[i]='5'
                    str.add(arr.toString())
                    arr[i]='3'
                    str.add(arr.toString())

                }
                '3' -> {
                    arr[i]='2'
                    str.add(arr.toString())
                    arr[i]='6'
                    str.add(arr.toString())

                }
                '4' -> {
                    arr[i]='1'
                    str.add(arr.toString())
                    arr[i]='5'
                    str.add(arr.toString())
                    arr[i]='7'
                    str.add(arr.toString())

                }
                '5' -> {
                    arr[i]='8'
                    str.add(arr.toString())
                    arr[i]='2'
                    str.add(arr.toString())
                    arr[i]='4'
                    str.add(arr.toString())
                    arr[i]='6'
                    str.add(arr.toString())

                }
                '6' -> {
                    arr.setCharAt(i, '3')
                    str.add(arr.toString())
                    arr.setCharAt(i, '5')
                    str.add(arr.toString())
                    arr.setCharAt(i, '9')
                    str.add(arr.toString())

                }
                '7' -> {
                    arr[i]='8'
                    str.add(arr.toString())
                    arr[i]='4'
                    str.add(arr.toString())

                }
                '8' -> {
                    arr.setCharAt(i, '0')
                    str.add(arr.toString())
                    arr.setCharAt(i, '5')
                    str.add(arr.toString())
                    arr.setCharAt(i, '7')
                    str.add(arr.toString())
                    arr.setCharAt(i, '9')
                    str.add(arr.toString())

                }
            }
            arr = StringBuilder(number)
        }
        return if (number.toInt()<0){
            null
        } else {str.toTypedArray()}
    }
}
