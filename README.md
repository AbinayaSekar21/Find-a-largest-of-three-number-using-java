# Find-a-largest-of-three-number-using-java
int max;
        if(num1>=num2 &&  num1>=num3){
            max=num1;
        }
        else if(num2>=num3 && num2>=num1){
            max=num2;
        }
        else{
            max=num3;
        }
        System.out.println("Result:"+max);
