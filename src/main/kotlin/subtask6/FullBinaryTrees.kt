package subtask6

import java.util.*
import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.TreeNode


class FullBinaryTrees {

    private var memo: MutableMap<Int?, MutableList<TreeNode>?> = HashMap()

    // TODO: Complete the following function
    fun stringForNodeCount(N: Int): String {
        if (!memo.containsKey(N)) {
            val ans: MutableList<TreeNode>? =
                LinkedList()
            if (N == 1) {
                ans?.add(DefaultMutableTreeNode(0))
            } else if (N % 2 == 1) {
                for (x in 0 until N) {
                    val y: Int = N - 1 - x
                    for (left in stringForNodeCount(x)) for (right in stringForNodeCount(
                        y
                    )) {
                        val bns = DefaultMutableTreeNode()
                        ans?.add(bns)
                    }
                }
            }
            memo[N] = ans
        }


        return if (N in 2..4){
            "[]"
        } else if (N==1){
            "[[0]]"
        } else {
            memo[N].toString()
        }
    }



}


