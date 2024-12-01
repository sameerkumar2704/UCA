public class Runner {
    public static void main(String[] args) {
        // CustomLinkedList<String> list = new CustomLinkedList<>();
        // list.addElement("sameer");
        // list.addElement("kumar");
        // list.addElement("Ajay");
        // list.addElement("kumar");
        // for (String value : list) {
        //     System.out.println(value);
        // }
        CustomBinarSerachTree<Integer> bntr = new CustomBinarSerachTree<>();
        bntr.addElement(10);
        bntr.addElement(3);
        bntr.addElement(4);
        bntr.addElement(1);
       
       
        bntr.PrintTree();
       
     
    }
}
