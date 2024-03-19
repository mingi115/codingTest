package org.mingi.lvOne;


public class StrangeCharacters {

    public static void main(String[] args) {
        String result = new StrangeCharacters().solution("TRY HELLO WORLD ");

        if(result.equals("TrY HeLlO WoRlD ")){
            System.out.println("통과");
        }else{
            System.out.println("실패");
            System.out.println(result);
        }
    }

    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        char[] charArr = s.toCharArray();
        int cnt = 0;
        for(char cha : charArr){
            if(cha == ' '){
                result.append(' ');
                cnt =0;
            }else if(cnt%2 == 0 && 97 <= cha && cha <= 122){
                result.append((char) (cha - 32));
                cnt++;
            }else if(cnt%2 != 0 && 65 <= cha && cha <= 90){
                result.append((char) (cha + 32));
                cnt++;
            }else{
                result.append(cha);
                cnt++;
            }
        }

        return result.toString();
    }
}
