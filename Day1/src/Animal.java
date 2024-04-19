public class Animal
{
  private  String name ;
  private boolean isEarAvailable;
  private  boolean tail;

   private  boolean legs ;
   private int id ;
   private boolean swim ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsEarAvailable() {
        return isEarAvailable;
    }

    public void setIsEarAvailable(boolean isEarAvailable) {
        this.isEarAvailable = isEarAvailable;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public boolean isLegs() {
        return legs;
    }

    public void setLegs(boolean legs) {
        this.legs = legs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    @Override
    public String  toString() {
        return "Animal{" +
                "name='" + name + '\'' +",\n"+
                " isEarAvailable=" + isEarAvailable +",\n" +
                " tail=" + tail + ",\n"+
                " legs=" + legs + ",\n"+
                " id=" + id + ",\n"+
                " swim=" + swim + " \n"+
                '}';
    }
}
