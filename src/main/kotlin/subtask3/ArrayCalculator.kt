package subtask3



class ArrayCalculator {

    // TODO: Complete the following function
    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        val arr = arrayListOf<Int>()
        var num = numberOfItems
        for (i in itemsFromArray){
            if (i is Int){
                arr.add(i)
            }
        }

        arr.sort()

        var result = 1
        if (numberOfItems>=arr.size&& arr.isNotEmpty()){
            for (i in arr){
                result*=i
            }
        } else if (arr.isEmpty()){
            result=0
        } else {
            while (num>0){
            val lastInd = arr.size-1
            var startPair = arr[0]*arr[1]
            var endPair = arr[lastInd]*arr[lastInd-1]
            if (num==1){
                result*=arr[lastInd]
                num-=1
            } else if (num > 1){
                if (startPair>endPair){
                    result*=startPair
                    arr.removeAt(0)
                    arr.removeAt(0)
                    num -= 2

                } else if (endPair>startPair){
                    result*=endPair
                    arr.removeAt(lastInd)
                    arr.removeAt(lastInd-1)
                    num -= 2
                }

            }
        }
        }

        return result

    }

}
