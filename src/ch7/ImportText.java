package ch7;

public class ImportText {
    public static void main(String[] args) {
        java.util.Date today = new java.util.Date();
        java.text.SimpleDateFormat date = new java.text.SimpleDateFormat("dd/MM/yyyy");
        java.text.SimpleDateFormat time = new java.text.SimpleDateFormat("hh:mm:ss");

        System.out.println("오늘 날짜는 : " + date.format(today) );
        System.out.println("현재 시간은 : " + time.format(today) );
    }
}
