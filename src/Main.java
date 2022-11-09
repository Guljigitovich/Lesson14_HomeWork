public class Main {
    public static void main(String[] args) {
    Programmer programmer = new Programmer("Syimyk Saparov","backend","War gameing");
    Dancer dancer = new Dancer("Jan Voinov","Hip hop","Quik Crew");
    Singer singer = new Singer("Anatolii Soi","Hip hop","M-Band");
        System.out.println(programmer);
        System.out.println(dancer);
        System.out.println(singer);
        System.out.println("Programmer :");
        programmer.learn(); programmer.eat(); programmer.walk(); programmer.coding();
        System.out.printf("""
                ---------
                Dancer :
                """);
        dancer.learn(); dancer.walk(); dancer.eat(); dancer.dancing();
        System.out.printf("""
                ---------
                Singer :
                """);
        singer.learn(); singer.walk(); singer.eat(); singer.singing(); singer.playGuitar();

    }
}