public class MainApp
 {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Arduino",8,1.8f);
        perangkat.informasi();
        System.out.println();

        Laptop laptop = new Laptop("Windows",8,3.9f,false);
        laptop.informasi();
        laptop.bukaGame("CSGO");
        laptop.kirimEmail("pokoknyaben@pokoknyaben.com");
        laptop.kirimEmail("pokoknyaben@pokoknyaben.com", "noni@noni.com");
        System.out.println();
        
        Handphone handphone = new Handphone("Android",8,1.8f,true);
        handphone.informasi();
        handphone.telfon(62851550);
        handphone.kirimSMS(62851550);
        handphone.kirimSMS(62851550, 62812817);
    }
}
