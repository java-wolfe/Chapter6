package Assignment;

public class CountByThrees {
    public static void main(String[] args){

        int count = 0;

        while(count < 301){
            System.out.println(" " + count);
            if(count % 30 == 0){
                System.out.println();
            }
            count = count + 3;
        }

    }
}
