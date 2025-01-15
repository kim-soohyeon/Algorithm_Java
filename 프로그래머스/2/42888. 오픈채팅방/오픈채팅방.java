import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> userMap = new HashMap<>();
        for(String rec : record) {
            String[] recs = rec.split(" ");
            if(recs[0].equals("Enter") || recs[0].equals("Change")){
                userMap.put(recs[1], recs[2]);
            }
        }

        ArrayList<String> arrayList = new ArrayList<>();
        for(String rec : record) {
            String[] recs = rec.split(" ");
            if(recs[0].equals("Enter")){
                arrayList.add(userMap.get(recs[1]) + "님이 들어왔습니다.");
            }else if(recs[0].equals("Leave")){
                arrayList.add(userMap.get(recs[1]) + "님이 나갔습니다.");
            }
        }

        return arrayList.toArray(new String[0]);
    }
}