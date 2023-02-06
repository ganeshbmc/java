public class NestedFor {
    public static void main(String[] args)
    {
           for (int i=0;i<=3 ; i++)
           {
                 for (int j=0;j<=3 ;j++)
                 {
                       if(j==1)
                       {
                             System.out.println();
                             break;
                       }
                       System.out.print(i);
                 }  
           }
    }
}
