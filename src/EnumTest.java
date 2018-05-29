public enum EnumTest {
    EnumTest1("栾桂明",12),EnumTest2("石涛",23),EnumTest("气节",12);
    private String name;
    private int age;
     EnumTest(String name,int age){
       this.age = age;
       this.name = name;
    }
    public String getName(){
         return EnumTest1.name;
    }
}
