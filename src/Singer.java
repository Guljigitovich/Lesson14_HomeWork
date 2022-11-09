public class Singer extends Person{
    private String bandName;
    public Singer(String name, String designation,String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }public void singing (){
        System.out.println("Singing");
    }public void playGuitar (){
        System.out.println("Play guitar");
    }

    @Override
    public String toString() {
        return "Singer{" +"Name = "+super.getName()+" ,Designation = "+super.getDesignation()+
                "bandName='" + bandName + '\'' +
                '}';
    }
}
