package multiDimensionalArrays;

public class Main {
    public static void main(String[] args) {
        String[] [] kentler=new String [3] [3];

        kentler [0] [0] = "Konya";
        kentler [0] [1] = "Kayseri";
        kentler [0] [2] = "Nevşehir";
        kentler [1] [0] = "Trabzon";
        kentler [1] [1] = "Samsun";
        kentler [1] [2] = "Rize";
        kentler [2] [0] = "İzmir";
        kentler [2] [1] = "Aydın";
        kentler [2] [2] = "Muğla";

        for(int i =0;i<=2;i++){
            System.out.println(i +". Bölge");
            for(int j =0;j<=2;j++)
                System.out.println(kentler[i][j]);
        }

        


    }    
}
