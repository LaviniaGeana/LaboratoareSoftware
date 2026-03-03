package lab1;

public class Main
{
    public static void main(String[] args)
    {
        String alfabet="";
        for(char i='a';i<='z';i++)
        {
            alfabet+=i;
        }
        System.out.println(alfabet.toLowerCase());
        System.out.println(alfabet.toUpperCase());

        String vocale="aeiou";
        String[] array=new String[10];
        int start=0;
        int k=0;

        for(int i=0;i<alfabet.length();i++)
          {
              char c=alfabet.charAt(i);
              if(vocale.contains(""+c))
              {
                  array[k]=alfabet.substring(start,i);
                  k++;
                  start=i;
              }
          }
        array[k]=alfabet.substring(start);
        for(int i=0;i<=k;i++)
        {
            System.out.print("array["+i+"]= "+array[i]);
            System.out.println();
        }
    }
}
