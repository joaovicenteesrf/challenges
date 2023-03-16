package Challenges;

public class ChangeHours {

    /*
    Given a time in -hour AM/PM format, convert it to military (24-hour) time.
    Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
    12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
     */
    public static String changeHours() {
        String s = "07:05:45PM";

        String[] arrOfStr = s.split(":");

        //Convertendo String para int
        int hour = Integer.parseInt(arrOfStr[0])%12;
        int min = Integer.parseInt(arrOfStr[1]);
        //Substring necessário para remover o AM/PM
        int sec = Integer.parseInt(arrOfStr[2].substring(0,2));

        System.out.println(hour + ":" + min + ":" + sec);

        if (s.charAt(8) == 'P') {
            hour += 12;
        }

        return s.format("%02d:%02d:%02d", hour, min, sec);
    }

}
