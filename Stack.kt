class Stack(tam:Int){
    var last:Int
    var A:IntArray
    init {
        println("My length is: ${tam}")  
        A=IntArray(tam)
        last=-1;
        println(A.size)
    }
    fun isFull():Boolean{
        return last==A.size-1
    }
    fun isEmpty():Boolean{
        return last==-1
    }
    fun push(num:Int){
        if(!isFull()){
            A[++last]=num
        }else{
            println("");
            println("Ya no puedes ingresar datos")
            println("Pinche zhou")
        }
        
    }
    fun pop(){
        if(!isEmpty()){
            A[last--]=0
        }
    }
    fun peek(): Int{
        return A[last]
    }
    fun search(n:Int):Int{
        for(i in 0..A.size-1){
            if(n==A[i]){
                return i
                }
        }
        return -1
    }
    fun print(){
        for(p in A){
            print(p.toString()+",")
        }
    }
}