package Arrays;

public class W13_02_BasicArrays {
    public static void main(String[] args) {
        //แบบที่1ระบุสมาชิกในปีกกา
        String animals[] ={"Dog","Cat","Lion"};
        int dice[] = {1,2,3,4,5,6};
        float avgScore[] = {3.50f,4.00f,2.75f};

        //หาขนาดของArrays
        System.out.println("Size of animals array : "+ animals.length);

        System.out.println("Animal at index 0 "+ " "+ animals[0]);
        System.out.println("Animal at index 2 "+ " "+ animals[2]);
        //วนลูป
        System.out.println("Show all average scores");
        for (int i=0;i<avgScore.length ;i++){
            System.out.println(avgScore[i]);
        }
//=====================================================================================
        //แบบที่2ระบุขนาด
        String colors[] = new String[4];
        colors[2] = "Red";
        colors[0] = "Green";
        colors[3] = "Blue";

        System.out.println("Size of colors array : " + colors.length);

        System.out.println("Show all colors");
        int j = 1;
        for (int i = 0 ; i<colors.length ; i++){
            System.out.println("Block "+ (i+1) + ":" +" "+ colors[i]);
            //j++;
        }
        
        System.out.println("Colors at index 0 "+ " "+ colors[0]);
        System.out.println("Colcrs at index 2 "+ " "+ colors[2]);
//=======================================================================================


        int  scores[] = new int[5];
        scores[0] = 50;
        System.out.println("Score at index 4 : " + scores[4]);

    }
}
