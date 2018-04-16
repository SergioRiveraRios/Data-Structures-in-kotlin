fun main(ar:Array<String>){
   var A= arrayOf<Int>(1,5,3,43,2,3,4,65,45,7)
    for(i in 0..A.size-1){
        for(j in 0..A.size-3){
            if(A[j]>A[j+1]){
                var temp=A[j]
                A[j]=A[j+1]
                A[j+1]=temp
            }
        }
    }
    for(v in A){
        print(v.toString()+",")
        }
}
