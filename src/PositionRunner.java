public class PositionRunner {

        public static void main(String[] args) {
            int[][] intArr = new int[][]{
                    {15, 5, 9, 10},
                    {12, 16, 11, 6},
                    {14, 8, 13, 7}
            };
            //Should print (2,1)
            System.out.println(Successors.findPosition(8, intArr));

            //Should print null
            System.out.println(Successors.findPosition(17, intArr));

            System.out.println();

            //Should print Successor Array on Handout
            Position[][] successors = Successors.getSuccessorArray(intArr);
            for (int r = 0; r < successors.length; r++) {
                for (int c = 0; c < successors[r].length; c++) {
                    Position current = successors[r][c];
                    System.out.print(current + "  ");
                }
                System.out.println();
            }
        }
    }

