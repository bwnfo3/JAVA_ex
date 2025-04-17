package ch11;
import java.util.*;
class HashMapEx3 {
    static HashMap phoneBook = new HashMap();
    public static void main(String[] args) {
        addPhoneNo("친구", "엄준식", "010-0000-0000");
        addPhoneNo("친구", "어쩌구", "010-9999-0000");
        addPhoneNo("친구", "저쩌구", "010-9999-5555");
        addPhoneNo("회사", "사장님", "010-1234-6643");
        addPhoneNo("회사", "실장님", "010-5463-2574");
        addPhoneNo("회사", "팀장님", "010-1111-2222");
        addPhoneNo("누구세요", "010-3333-5555");
        addPhoneNo("누구", "010-7777-5555");
        addPhoneNo("누구?", "010-4444-5555");

        printPhoneBook();
    }
    static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName); //addGroup()에서 중복 검사 다 함
        HashMap group = (HashMap) phoneBook.get(groupName); //해당 그룹의 HashMap 가져옴
        group.put(tel, name);
    }
    static void addGroup(String groupName) {
        if(!phoneBook.containsKey(groupName)) { //그룹 중복 체크
            phoneBook.put(groupName, new HashMap());
        }
    }
    static void addPhoneNo(String name, String tel) {
        addPhoneNo("기타", name, tel);
    }

    static void printPhoneBook() {
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            Set groupSet = ((HashMap) entry.getValue()).entrySet();
            Iterator groupIt = groupSet.iterator();
            System.out.println("===" + entry.getKey() +"(" +groupSet.size() + ")"+ "===");
            while(groupIt.hasNext()) {
                System.out.print(groupIt.next());
            }
        }
    }
}
