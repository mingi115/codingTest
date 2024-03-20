package org.mingi.lvOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class FailedRunner {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String result = new FailedRunner().solution(participant,completion);

        if(result.equals("mislav")){
            System.out.println("통과");
        }else{
            System.out.println("실패");
            System.out.println(result);
        }
    }

    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> participantMap = new HashMap<>();

        for (String parti : participant) {
            participantMap.computeIfPresent(parti, (key, val) -> val+1);
            participantMap.putIfAbsent(parti, 1);
        }
        ArrayList<String> completionList =  new ArrayList<>(Arrays.asList(completion));
        for (String comple : completionList) {
            Integer cnt = participantMap.get(comple);
            if(cnt == 1){
                participantMap.remove(comple);
            }else{
                participantMap.put(comple, --cnt);
            }
        }

        StringBuilder sb = new StringBuilder();
        Set<String> ks = participantMap.keySet();
        for (String key : ks) {
            sb.append(key);
        }
        return sb.toString();
    }
}
