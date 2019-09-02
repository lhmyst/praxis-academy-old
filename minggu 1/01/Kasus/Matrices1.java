package app;

public class Matrices1 {
    public static void main(String[] args) throws Exception {
        int c,d;
        int m=1;
        int n=9;

        int first[][] = new int[2][2];
        int second[][] = new int[2][2];
        int sum[][] = new int [2][2];

        for (c=0;c<2;c++){
            for(d=0;d<2;d++){
                first[c][d]=m;
                m++;
                second[c][d]=n;
                n--;
            }
        }

        for (c=0;c<2;c++){
            for(d=0;d<2;d++){
                System.out.print(first[c][d]+"\t");
            }
            System.out.println();
        }

        System.out.println();

        for (c=0;c<2;c++){
            for(d=0;d<2;d++){
                System.out.print(second[c][d]+"\t");
            }
            System.out.println();
        }

        System.out.println();

        for (c=0;c<2;c++){
            for(d=0;d<2;d++){
                sum[c][d]=first[c][d]+second[c][d];
            }
        }

        for (c=0;c<2;c++){
            for(d=0;d<2;d++){
                System.out.print(sum[c][d]+"\t");
            }
            System.out.println();
        }

    }
}