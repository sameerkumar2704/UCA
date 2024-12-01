class CustomData<T>{
    T UserName;
    public CustomData(T username) {
        this.UserName = username;
    }
    public T getUserData(){
        return UserName;
    }
    
}
public class FirstSample{
    public  static void main(String [] arg){
        // try (Scanner sc = new Scanner(System.in)) {
        //     System.out.println("Enter your name : ");
        //     String username = sc.nextLine();
        //     System.out.println("Enter your age");
        //     sc.next();
        //     int age = sc.nextInt();
        //     String question = sc.nextLine();
        //     System.out.println("User name is "+username+"\nAge of use name "+age+"\nQuestion is Asked by User "+question);
        // }
        CustomData student = new CustomData<>("sameer");
        System.out.println(((String)student.getUserData()).hashCode());

    }
}