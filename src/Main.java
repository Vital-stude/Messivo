public class Main {
    public static void main(String[] args) {

                int[] arr = new int[3];
                arr[0] = 1;
                arr[1] = 2;
                arr[2] = 3;

                for (int i = 0; i < 1; i++) {
                    System.out.print(arr[0] + "\n" + arr[1] + "\n" + arr[2]);
                    System.out.println(" ");
                    for (int y = 2; y >= 0; y--) {
                        System.out.print(arr[y]+"," + " ");
                }
                System.out.println(" ");
                {
                    double[] doubleBear = new double[3];
                    doubleBear[0] = 1.57;
                    doubleBear[1] = 7.654;
                    doubleBear[2] = 9.986;
                    for (int t = 0; t < 3; t++) {
                        System.out.print(doubleBear[t] + "," + "  ");
                    }
                    System.out.println("   ");
                    for (int t = 2; t >=0; t--) {
                        System.out.print(doubleBear[t] + "," + "  ");}

                    System.out.println(" ");   {

                    char[] rem = new char[4];
                    rem[0] = 13323;
                    rem[1] = 1415;
                    rem[2] = 8987;
                    rem[3] = 790;
                    for (int g = 0; g < rem.length; g++) {
                        System.out.print(rem[g] + ","+" ");
                    }
                    for (int g = 3; g>=0; g--) {
                        System.out.print(rem[g] + ", " + " ");
                    }}}}}

}