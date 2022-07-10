object q3b {
    def main(Args: Array[String]) : Unit = {
        var a = 2; var b = 3; var c = 4; var d = 5;
        var k = 4.3f;
        var g = 4.0f;

        //a.)
        //println( - -b * a + c *d - -);
        //scala does not support prefix increment
        b += 1;
        //scala does not support postfix decrement
        println(b*a + c*d);
        b -= 1;
        //above lines changes the variables and gives 
        //outputs same as println( - -b * a + c *d - -);

        

        //b.)
        println(a)
        a+=1;
        //above three lines changes the variables and gives 
        //outputs same as println(a++);


        //c.)
        println(-2*(g-k)+c)

        //d.)
        println(c);
        c+=1;
        //above lines changes the variables and gives 
        //outputs same as println (c=c++);

        //e.)
        c+=1;
        println(c*a)
        a+=1;
        //above lines changes the variables and gives 
        //outputs same as println (c=++c*a++);

    }
}