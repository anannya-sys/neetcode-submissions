// class Solution {
//     public boolean isAnagram(String s, String t) {

//         if(s.length()!=t.length()){
//         return false;}

//         char[] s1=s.toCharArray();
//         char[] t1=t.toCharArray();
//     int f=0,f1=0;
//         Arrays.sort(s1);
//         Arrays.sort(t1);
    
//             for(int i=0;i<s1.length;i++)
//             {
//                 if(s1[i]==t1[i])
//                 f=f+1;
//                 else
//                 f1=f1+1;

//             }
//             if(f1==0)
//             return true;
//             else
//             return false;
        


//     }
// }

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer> countS=new HashMap<>();
        HashMap<Character,Integer> countT=new HashMap<>();

for(int i=0;i<s.length();i++)
{
    countS.put(s.charAt(i),countS.getOrDefault(s.charAt(i),0)+1);
    countT.put(t.charAt(i),countT.getOrDefault(t.charAt(i),0)+1);
}
return countS.equals(countT);
    }
}