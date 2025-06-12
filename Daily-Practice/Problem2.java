import java.util.*;
public class Problem2{
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;
        int pensDivided = totalPens / totalStudents;
        int pensNotDivided = totalPens % totalStudents;
        System.out.println("The Pen Per Student is "+ pensDivided +" and the remaining pen not distributed is "+ pensNotDivided);
    }
}