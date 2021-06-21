package chapter7;

public class Chapter7Demo {
    public static void main(String[] args){
        int[][] jaggedArray = {
                {1,2,3,4},
                {1,2,3,4,5,6},
                {1,2,3,4,5}
        };
        int[][] arr = {
                {1,2,3},
                {1,2,3},
                {1,2,3}
        };

        Chapter7Assignment test = new Chapter7Assignment(jaggedArray);
        //System.out.println(test.getFirstRowWithColumnIndex(5));

    }

}
