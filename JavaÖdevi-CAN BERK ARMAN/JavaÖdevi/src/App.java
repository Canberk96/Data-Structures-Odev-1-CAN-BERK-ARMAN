

public class App {
    public static void main(String[] args) throws Exception {
        
        
        Soru1 yenisoru1 = new Soru1(10);
        yenisoru1.insert(3);
        yenisoru1.insert(2);
        yenisoru1.insert(1);
        yenisoru1.TicketTime(null);
     

        Soru2 yenisoru2 = new Soru2(10);
        yenisoru2.push(9);
        yenisoru2.push(4);
        yenisoru2.push(3);
        yenisoru2.push(-2);
        yenisoru2.push(7);
        yenisoru2.push(1);
        yenisoru2.Sort();
        

    }
}
