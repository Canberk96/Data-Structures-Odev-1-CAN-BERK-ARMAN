public class Soru1 {
    private int maxSize;
             private long[] queArray;
             private int front;
             private int rear;
             private int nItems;
    
             public Soru1(int s) // constructor
            {
               maxSize = s;
               queArray = new long[maxSize];
               front = 0;
               rear = -1;
               nItems = 0;
            }
            public void insert(long j) 
           // kuyruğa rear ekliyoruz
           {
               if(rear == maxSize-1)
                  rear = -1; // değiştirme amaçlı rearı 1 azaltıyoruz
               // rearı 1 arttırıp ekliyoruz
               if (nItems<maxSize)
               { queArray[++rear] = j; 
               nItems++; }
               else
                   System.out.println("Queue full for "+ j +"!!!");
            }
    
            public long remove() // kuyruktan eleman eksiltiyoruz
            {
                // get value and incr front
                 long temp = queArray[front++]; 
                 if(front == maxSize) // deal with wraparound
                      front = 0;
                 nItems--; // eleman sayısını 1 azaltıyoruz
                 return temp;
            }
            public long peekFront() 
            {        return queArray[front]; 
            }
    
            public boolean isEmpty() // kuyruk boşsa true yapıyoruz
            { return (nItems==0); 
            }
    
            public boolean isFull() // kuyruk dolduysa true yapıyoruz
            { return (nItems==maxSize);
            }
    
            public int size() // kuyruktaki eleman sayısını yazdırıyoruz
            { return nItems;
            }
           
            public void display() {
             int i=0; int f=front;
             while (i++<nItems)	
              {
                System.out.print(queArray[f] + "[" + f + "]" + " ");
                if (f==maxSize-1)
                    f=0; else
                f++;
              }              	            
            System.out.println();
                    
            }
            public void TicketTime(Long t){   //Ticket zamanı için fonksiyon açtım.
             int m=(maxSize-1);  //m değişkeni oluşturup bunu mazsize-1 e eşitledim.
                while(m>0){ //m 0 dan büyük olduğu şekilde devam etmesi gereken bir while döngüsü oluşturdum.
                    t=t+(queArray[m]*queArray[m-1]); //t değişkeni bu geçen zaman için arrayin m inci elemanı ile m-1 inci elemanın çarpımını t ye ekledim
                    m--;// m yi yani maxsize ı 1 azalttım.

                    
                    

                }//while döngüsü sonu
                System.out.println(t); // zamanı yazdırdım .

            }
    
}//class sonu
