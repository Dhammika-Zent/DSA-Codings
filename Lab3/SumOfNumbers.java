class SumOfNumbers{

    public int sum (int number) {
        int sum = 0;
        for(int i = 1; i <= number; i++){
            sum += i; //sum=sum + i;
        }
        return sum;
        }

        public int recursionSum(int number) {
            int sum;
            if (number == 1) {
                return 1;
            }
            return number + recursionSum(number-1);
        }

    

    public static void main (String [] args){
        SumOfNumbers s = new SumOfNumbers();
        System.out.print( s.sum(15));
        

    }
}