public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        if (x.length()<=1)
            {
                return false;
            }
        if(x.substring(x.length()-2).equals("ly"))
            {
                return true;
            }
        return false;
    }

    public String conCat(String s1, String s2) {
        if (s1.isEmpty()||s2.isEmpty())
        {
                System.out.println("ARE YOU SERIOUS? WHY? WHY EVEN USE ME?");
                return s1+s2;
        }else if((s1.charAt(s1.length()-1)==s2.charAt(0)))
        {
            
            return s1.substring(0,s1.length()-1)+s2;
        }
        else
        {
            return s1+s2;
        }    
    }
    public String withoutX(String s1) {
        if(s1.substring(0,1).equals("x"))
            {
                s1=s1.substring(1);
            }
        if(s1.substring(s1.length()-1).equals("x")) 
            {
                s1=s1.substring(0,s1.length()-1);
            }
        return s1;
    }

    public String fizzString(String s1) {
        String temp="";
        if (s1.substring(0,1).equals("f"))
        {
            temp+="Fizz";
        }
        if (s1.substring(s1.length()-1).equals("b"))
        {
            temp+="Buzz";
        }
        return temp;
    }

    public String fizzString2(int x) {
        String temp="";
        if(x%3==0)
        {
            temp+="Fizz";
        }else if(x%5==0)
        {
            temp+="Buzz";
        }
        else
        {
            temp+=x;                    
        }
        return temp+"!";
    }
}
