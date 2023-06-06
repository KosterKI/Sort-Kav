public class Main {

public static void main(String[]args) {
 Items[] item = {
         new Items("Graphic card", 13000),
         new Items("Processor", 4500),
         new Items("Ram", 800),
         new Items("HDD", 1250),
         new Items("Motherboard", 4300),
         new Items("Keyboard", 500),
         new Items("Mouse", 350),
         new Items("Display", 2100),
         new Items("Box", 680),
         new Items("Speakers", 300)
 };
 Sort sort = new Sort();
sort.ItemsSort(item,"price","asc");
 sort.printItems(item);
}
}