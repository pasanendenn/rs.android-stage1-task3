package subtask1

class PolynomialConverter {

    // TODO: Complete the following function
    fun convertToStringFrom(numbers: Array<Int>): String? {
        var n = numbers.size-1
        var s = ""
        for (i in numbers.indices){
            if (i == 0){
                if (numbers[i]<0){
                    numbers[i] = -numbers[i]
                    if (n==1){
                        s = s + "-" + numbers[i].toString()+"x"

                    } else if (n==0){
                        s = s + "-" + numbers[i].toString()
                    } else {
                        s = s + "-" + numbers[i].toString()+"x^"+n.toString()

                    }
                } else if (numbers[i]==0){
                    s += ""

                } else if (numbers[i]==-1){
                    if (n==1){
                        s += "-x"

                    } else if (n==0){
                        s += "-1"


                    } else {
                        s = s + "-x^"+n.toString()

                    }
                }
                else if (numbers[i]==1){
                    if (n==1){
                        s += "x"

                    } else if (n==0){
                        s += "1"


                    } else {
                        s = s + "x^"+n.toString()

                    }
                } else {
                    if (n==1){
                        s = s + numbers[i].toString()+"x"

                    } else if (n==0){
                        s = s + numbers[i].toString()

                    } else {
                        s = s + numbers[i].toString()+"x^"+n.toString()

                    }
                }

            } else {
                if (numbers[i]<-1){
                    numbers[i] = -numbers[i]
                    if (n==1){
                        s = s + " - " + numbers[i].toString()+"x"

                    } else if (n==0){
                        s = s + " - " + numbers[i].toString()
                    } else {
                        s = s + " - " + numbers[i].toString()+"x^"+n.toString()

                    }
                } else if (numbers[i]==0){
                    s += ""

                } else if (numbers[i]==-1){
                    if (n==1){
                        s += " - x"

                    } else if (n==0){
                        s += " - 1"


                    } else {
                        s = s + " - x^"+n.toString()

                    }
                } else if (numbers[i]==1){
                    if (n==1){
                        s += " + x"

                    } else if (n==0){
                        s += " + 1"


                    } else {
                        s = s + " + x^"+n.toString()

                    }
                } else {
                    if (n==1){
                        s = s + " + " + numbers[i].toString()+"x"

                    } else if (n==0){
                        s = s + " + " + numbers[i].toString()

                    } else {
                        s = s + " + " + numbers[i].toString()+"x^"+n.toString()

                    }
                }

            }



            n-=1
        }
        return if (numbers.isEmpty()){
            null
        } else {
            s
        }
    }
}
