<<<<<<< HEAD
/*  Starts in the beginning of the array and swapping the first two 
    elements only if the first element is greater than the second element
    This comparison is then moved onto the next pair and so on and so forth
    This is done until the array is completely sorted

 */
=======
>>>>>>> 34e46f062614b4b56416357bcd7b9f22a60daa9a
fun BubbleSort(A:Array<Int>){
    for(l in A){
        print(l.toString()+",")
    }
    for(i in 0..A.size-1){
        for(j in 0..A.size-2){
            if(A[j]>A[j+1]){
                var temp=A[j]
                A[j]=A[j+1]
                A[j+1]=temp
            }
        }
    }
    println("")
    for(v in A){
        print(v.toString()+",")
    }
<<<<<<< HEAD
=======
}
fun main(ar:Array<String>){
   var b= arrayOf<Int>(6,5,3,43,2,3,4,65,45,12,447,1)
   BubbleSort(b)
>>>>>>> 34e46f062614b4b56416357bcd7b9f22a60daa9a
}
fun main(ar:Array<String>){
   var b= arrayOf<Int>(6,5,3,43,2,3,4,65,45,12,447,1)
   BubbleSort(b)
}