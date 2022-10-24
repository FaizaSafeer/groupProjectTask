package groupProject;

public class Task2 {
    /*
    We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code
     */
}
 abstract class Marks {
     int maths;
     int english;
     int coding;
     Marks(int maths, int english, int coding) {
         this.maths = maths;
         this.english = english;
         this.coding = coding;
     }
     abstract double getPercentage();
 }
class A extends Marks{
   // int totalMarks=300;
    A(int maths,int english,int coding){
        super(maths, english, coding);
    }

    @Override
    double getPercentage() {
        int totalMarks=300;
        double sum=maths+english+coding;
      double  getPercentage=(sum/totalMarks)*100;
        return getPercentage;
    }
}
class B extends Marks{
    //int totalMarks=400;
    int geo;
    B(int maths,int english,int coding,int geo){
        super(maths, english, coding);
        this.geo=geo;
    }
    @Override
    double getPercentage() {
        int totalMarks=400;
        double sum=maths+english+coding+geo;
        double  getPercentage=(sum/totalMarks)*100;
        return getPercentage;
    }
}
class MarksTest{
    public static void main(String[] args) {
        Marks faiza=new A(55,65,56);
        System.out.println(faiza.getPercentage());
        Marks Yousuf=new B(77,88,99,88);
        System.out.println(Yousuf.getPercentage());
    }
}