import java.util.Stack;
public class Soru3 {

    static class Queue { // kuyruk isimli bir static class oluşturuyoruz.
        Stack<Integer> stack1;//stack1 isimli class 
        Stack<Integer> stack2;//stack2 isimli class
    }
  
    /* Eleman eklemek için fonksiyon oluşturuyoruz*/
    static void push(Stack<Integer> top_ref, int new_data)
    {
        // stack a eleman ekliyoruz
        top_ref.push(new_data);
    }
  
    /* Stackdan eleman almak için fonksiyon*/
    static int pop(Stack<Integer> top_ref)
    {
        /*Eğer yığın doluysa true */
        if (top_ref.isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(0);
        }
        // yığından elemanları pop yapıyoruz
        return top_ref.pop();
    }
  
    // Yığın elemanlarını encode etmek için fonksiyon yazıyoruz.
    static void enQueue(Queue q, int x)
    {
        push(q.stack1, x);
    }
  
    /* Yığındaki elemanları encode etmek için fonksiyon oluşturuyoruz. */
    static int deQueue(Queue q)
    {
        int x;// bir x değişkeni oluşturuyoruz.
  
        /* Eğer 2 yığında dolu ise hata vermeli */
        if (q.stack1.isEmpty() && q.stack2.isEmpty()) {
            System.out.println("Q is empty");
            System.exit(0);
        }
        /* 1.yığınımızdan 2.yığınımıza eleman eklemesi yapıyoruz eğer 2.yığınımız tamamen boş ise */
        if (q.stack2.isEmpty()) {
            while (!q.stack1.isEmpty()) {
                x = pop(q.stack1);
                push(q.stack2, x);
            }
        }
        x = pop(q.stack2);
        return x;
    }
}
