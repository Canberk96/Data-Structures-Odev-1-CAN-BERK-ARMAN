
public class Soru2 {
    private long[] stackArray;
       private int top; // yığının tepe değeri
       private int maxSize;// stack arrayinin  maksimum genişliği
       

       public Soru2(int s) // constructor
       {
          maxSize = s; // arrayimizin size ını yani genişliğini belirliyoruz
          stackArray = new long[maxSize]; // bir array oluşturuyoruz.
          top = -1; // henüz bir eleman yok
      }

      public void push(long j) // yığına eleman eklemek için fonksiyon açıyoruz
      { 
 
         stackArray[++top] = j; // topu 1 arttırıp, yeni bir eleman ekliyoruz
      }

      public long pop() // yığından bir eleman alıyoruz
     {
        return stackArray[top--]; 
        // access item, tepe değeri bir azaltıyoruz
      }
      public long peek() // yığının top yani tepe değerini için
      {
         return stackArray[top];
      }
      
      public boolean isEmpty() //yığının boş olduğu durum için
      
      {
         return (top == -1);
      }
      
      public boolean isFull() 
      // yığın tamamen dolu ise doğru
      {
          return (top == maxSize-1);
      }
         
        public void Sort(){ // bubble sort yaptım burada yığındaki elemanları sıralamak için.
            int out, in;
            // loop dışı
            for(out=maxSize-1; out>1; out--)
              for(in=0; in<out; in++) // içerdeki loop
                 if( stackArray[in] > stackArray[in+1] ) // arrayin in elemanın sonraki elemandan büyükse
                    swap(in, in+1); // bu 2 elemanı kendi içinde değiştir.
            } // sort etmenin sonlanması
            
            private void swap(int one, int two)//swap için private fonksiyonu
            {
               long temp = stackArray[one];//bir temp oluşturup bu elemanın ilkine eşitliyoruz
               stackArray[one] = stackArray[two]; //2.elemanın değerini ilkinin yerine yazıyoruz.
               stackArray[two] = temp;//temp e attığımız 1.elemanın değerini 2.elemana yazıyoruz.
            }
            


        }
       



        
        



        

	
      
        

