//Driver Class --> butuh main method
public class FriendTest {
    public static void main(String[] args) {
        //membuat object
        Friends riyu = new Friends("riyu", 15, "web desinger", "main game");
        riyu.print();
        Friends rafa = new Friends("rafa", 15, "programer", "maraton anime");
        rafa.print();
        Friends alfon = new Friends("alfon", 15, "kerja di google", "main game");
        alfon.print();
        Friends elang = new Friends("elang", 15, "software engineering", "membaca manga");
        elang.print();
        Friends alfian = new Friends("alfian", 16, "gamers", "main game");
        alfian.print();


    }
}
