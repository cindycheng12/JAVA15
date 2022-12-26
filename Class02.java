class CTest extends Thread
{
   private String id;
   public CTest(String str)  //(a)
   {
        id=str;    
   }
   public void run()  //(b)
   {
      for(int i=1;i<=5;i++)
      {
         for(int j=0;j<100000000;j++);
         System.out.println(id+" "+i);
      }
   }
}

public class Class02
{
   public static void main(String args[])
   {
      CTest hi=new CTest("Hello");    //(c)
      CTest bye=new CTest("Good bye");
      hi.run();
      bye.run();
   }
}

//執行結果
Hello 1
Hello 2
Hello 3
Hello 4
Hello 5
Good bye 1
Good bye 2
Good bye 3
Good bye 4
Good bye 5
(d)由Hello開始依序的印出1~5後，再換 Good bye
