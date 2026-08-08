class SimpleWhile{
    public static void main(String args[]){
        
        int num=255;
        int n=5;
        int count=0;
        while(num>=5){
            count++;
            num=num/n;
        }
        System.out.println(count);
    }

}