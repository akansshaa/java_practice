public class student {
    String name;
    int age,rollNumber;
    
    public student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "student [name= " + name + ", age= " + age + ", rollNumber= " + rollNumber + "]";
       /* return "student details: {name :"+ name 
                                +" ,age :"+ age 
                                +" ,roll number :"+rollNumber
                                +" 
        }";*/ 
    }
    
    public static void main(String[] args) {
        student st = new student("aakash", 22,211264);
        System.out.println(st.toString());
        //System.out.println(st); same output
    }
}
