package PracticeInterview.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueEmail {
    //https://leetcode.com/problems/unique-email-addresses/description/
    public static void main(String[] args) {
        String[] emails={"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        Set<String> set=new HashSet<>();
        for(int i=0;i<=emails.length-1;i++)
        {
            String[] email=emails[i].split("@");
            String localname= email[0].split("\\+")[0].replace(".","");
            String domainname=email[1];
            set.add(localname+"@"+domainname);
        }
        System.out.println(set);
        System.out.print(set.size());
    }
}
