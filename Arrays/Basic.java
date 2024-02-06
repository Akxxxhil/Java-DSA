public class Basic{
    public static void main(String[] args) {
        int marks[]=new int [3];
        marks[0]=34;
        marks[1]=67;
        marks[2]=89;
        for (int i=0;i<marks.length;i++){
            System.out.print(marks[i]+ " ");
        }
    }
}

// Note :-

// 1.Array size can be defined through Array.length
//2. Array values can be Updated but Array size can not be changed at the Run time.
//3.Array can be created ,updated, and we can also print the value of Array.
//4. Array's value always go through Pass by Refernce.