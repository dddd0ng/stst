package chap3;

public class class1 {

    public static void main(String[] args) {


        MusicPlayerData music = new MusicPlayerData();
        music.on();
        music.up();
        music.down();
        music.up();
        music.up();
        music.down();
        music.status();
        music.off();
    }

    }
//        static void on(MusicPlayerData data){
//            data.isOn = true;
//            System.out.println("음악 플레이어를 시작합니다.");
//        }
//
//
//        static void off(MusicPlayerData data){
//            data.isOn = false;
//            System.out.println("음악 플레이어를 종료합니다.");
//        }
//
//        static void up(MusicPlayerData data){
//            data.volume++;
//            System.out.println("음악 플레이어 볼륨 : "+ data.volume);
//        }
//
//        static void down(MusicPlayerData data){
//            data.volume--;
//            System.out.println("음악 플레이어 볼륨 : "+ data.volume);
//        }
//
//
//        static void status(MusicPlayerData data){
//            System.out.println("음악 플레이어 상태 확인");
//    if(data.isOn) {
//        System.out.println("음악 플레이어 ON, 볼륨 : "+data.volume);
//    }else {
//        System.out.println("음악 플레이어 OFF");
//        }








//    int volume=0;
//    boolean isOn = false;
//
//    isOn = true;
//    System.out.println("음악 플레이어를 시작합니다");
//
//    volume++;
//    System.out.println("음악 플레이어 볼륨 : "+ volume);
//
//    volume++;
//    System.out.println("음악 플레이어 볼륨 : "+ volume);
//
//    volume--;
//    System.out.println("음악 플레이어 볼륨 : "+ volume);
//
//    System.out.println("음악 플레이어 상태 확인");
//    if(isOn) {
//        System.out.println("음악 플레이어 ON, 볼륨 : "+volume);
//    }else {
//        System.out.println("음악 플레이어 OFF");
//    }
//
//    isOn=false;
//        System.out.println("음악 플레이어를 종료합니다.");


