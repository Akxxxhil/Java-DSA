//question 1 :==== Given an array of mark of students,
//if the mark of any student is less than 35.print roll numbers.rollnumber
//is the index number


package array_Basics;

public class ArrayQues1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []marks= {81,17,95,36,31,100,60};
		for (int i=0;i<marks.length;i++) {
			if(marks[i]<=35) {
				System.out.println(i);
			}
		}

	}

}
