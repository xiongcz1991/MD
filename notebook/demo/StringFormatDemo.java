
public class StringFormatDemo{

  public static void main (String[] args){
     // 测试 format 的flags参数和width参数
     //test1();
     test2();
  }

  public static void test1(){
    int i = 5;
    int j = -4;
    String format1 = "%-4d";
    String format2 = "%+4d";
    String format3 = "%(4d";
    String format4 = "%04d";
    String format5 = "% 4d";
    System.out.println(String.format(format1,i).toString());
    System.out.println(String.format(format2,i).toString());
    System.out.println(String.format(format3,i).toString());
    System.out.println(String.format(format4,i).toString());
    System.out.println(String.format(format5,i).toString());
    System.out.println(String.format(format1,j).toString());
    System.out.println(String.format(format2,j).toString());
    System.out.println(String.format(format3,j).toString());
    System.out.println(String.format(format4,j).toString());
    System.out.println(String.format(format5,j).toString());
  }

  public static void test2(){
    float i = 5.5f;
    double j = 4.4;
    String format1 = "%-5.2f";
    String format2 = "%+5.2f";
    String format3 = "%(5.2f";
    String format4 = "%05.2f";
    String format5 = "% 5.2f";
    System.out.println(String.format(format1,i).toString());
    System.out.println(String.format(format2,i).toString());
    System.out.println(String.format(format3,i).toString());
    System.out.println(String.format(format4,i).toString());
    System.out.println(String.format(format5,i).toString());
    System.out.println(String.format(format1,j).toString());
    System.out.println(String.format(format2,j).toString());
    System.out.println(String.format(format3,j).toString());
    System.out.println(String.format(format4,j).toString());
    System.out.println(String.format(format5,j).toString());
  }



}
