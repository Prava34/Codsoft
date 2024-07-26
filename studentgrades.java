import java.util.Scanner;
public class studentgrades{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of subjects: ");
        int numsubject=scanner.nextInt();
        int[] marks=new int[numsubject];
        for (int i=0;i<numsubject;i++){
            System.out.println("entermarks for subject"+(i+1)+": ");
            marks[i]=scanner.nextInt();
        }
        int totalmarks=0;
        for (int mark:marks){
            totalmarks+=mark;
        }
        double averagepercentage=(double) totalmarks/numsubject;
        String grade;
        if (averagepercentage>=90){
            grade="A+";
        }else if (averagepercentage>=80){
            grade="A";
        }else if (averagepercentage>=70){
            grade="B+";
        }else if (averagepercentage>=60){
            grade="B";
        }else if (averagepercentage>=50){
            grade="C+";
        }else if (averagepercentage>=40){
            grade="C";
        }else {
            grade="F";
        }
        System.out.println("Total Marks: "+totalmarks);
        System.out.println("Average Percentage: "+averagepercentage);
        System.out.println("Grade: "+grade);
        scanner.close();
    }
}