package Tugas.tugas2;
class Cuboid {
    double height;
    double width;
    double length;
  
    double getVolume() {
      // Lengkapi
      return width * height * length;
    }
  }
  
  public class tp03 {
    public static void main(String[] args) {
      Cuboid cuboid = new Cuboid();
      cuboid.height = 15;
      cuboid.width = 30;
      cuboid.length = 10;
  
      System.out.println(String.format("Volume: %.2f", cuboid.getVolume()));
    }
  }
  