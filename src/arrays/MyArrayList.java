package arrays;

public class MyArrayList {

    Student[] students = new Student[10];
    int counter = 0;
//    i f i take counter thent fitst time wil take value then next time if i will write counter++ will take the value in next position 

    public void add(Student s) {

        students[counter] = s;
        counter++;

    }
    
    public Student get(int pos)
    {
        return students[pos];
    }
}
