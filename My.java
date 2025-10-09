class My {
    public static void main(String[] args) {
        // decimalToBinary(5);
        // binaryTodecimal(101);
        // evenOrOdd(11);
        // reverseNum(7654);
        // countDigit(2345);
      // armStrong(153);
      // printDivisor(36);
        // primeNumber(13);
        sieveAlgo( 100 );
    }
    static void decimalToBinary(int decimalNum){
        int resNum = 0;
        int power = 0;
        while(decimalNum>0){
            int rem = decimalNum%2;
            decimalNum/=2; 
            resNum += rem*Math.pow(10, power);
            power++ ; 
        }
        System.out.println("you result is : " + resNum);
    }

    static void binaryTodecimal(int binaryNum){

        int resNum = 0;
        int power = 0;
        while(binaryNum>0){
           
            
            int unitdigit = binaryNum%10;
            binaryNum/=10; 
            resNum += unitdigit*Math.pow(2, power);
            power++ ; 
        }
        System.out.println("you result is : " + resNum);
    }

    static void evenOrOdd(int num){
        if (num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("No.is odd");
        }
    }

    static void reverseNum( int num){
        System.out.println("your no is :" + num);
        int revNum = 0 ; 

        while(num>0){    
            int digit = num%10;
            revNum = revNum*10 + digit;
            num/=10 ;
        }
        
        System.out.println("Your no is reversed : " + revNum );
    }

    static void countDigit(int num){
        int count = 0 ;
        while(num>0){
            num/=10;
            count++;
        }
        System.out.println("no are "+ count);
    }

    static void armStrong(int num){
        int count = 0 ; 
        int copy = num;
        while(num>0){
            int digit = num%10;
            count = count + (int)Math.pow( digit , 3);
            num/=10;
        }
        System.out.println(copy==count);
    }

     static void printDivisor(int num){
        int counter = 1 ;
        int sqroot = (int)Math.sqrt(num);
        while(counter <= sqroot){
           if(num%counter==0){
            System.out.println(counter + "is a divisor of " + num);
            int otherNumber = num/counter;
            if(otherNumber!=counter)
            System.out.println(otherNumber + " is a divisor of " + num);
           } 
           counter++;
        }
    }

    static void primeNumber(int num){
        int counter = 2 ;
        int sqroot = (int)Math.sqrt(num);
        while(counter <= sqroot){
           if(num%counter==0){
           System.out.println( num + " is not a prime number");
           return ; 
           } 
           counter++;
        }
        System.out.println( num + " is a prime number");
    }
    static void sieveAlgo(int n)
    {boolean[]p=new boolean[n+1];for(int i=2;i*i<=n;i++)
        if(!p[i])for(int j=i*i;j<=n;j+=i)p[j]=true;for(int i=2;i<=n;i++)if(!p[i])System.out.print(i+" ");} 

// }
}
