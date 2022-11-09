public class Dancer extends Person {
    private String groupName;
    public Dancer(String name, String designation,String groupName) {
        super(name, designation);
        this.groupName=groupName;
    }public void dancing (){
        System.out.println("Dansing");
    }

    @Override
    public String toString() {
        return "Dancer{" +"Name = "+super.getName()+" ,Designation = "+super.getDesignation()+
                " ,groupName='" + groupName + '\'' +
                '}';
    }
}
