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
}
fun main(ar:Array<String>){
   var b= arrayOf<Int>(6,5,3,43,2,3,4,65,45,12,447,1)
   BubbleSort(b)
}
