import java.util.ArrayList;

public class Menu {

    //Class Level Variables - Protect the data
    private int menuId;
    private String menuItem;
    private double price;

    //Constructor Method
    public Menu(int _menuId, String _menuItem, double price){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.price = price;
    }

    //Setters and Getters
    public int getmenuId() { return menuId; }
    public void setmenuId(int _menuId) {this.menuId = _menuId;}


    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}


    public String getmenuItem() { return menuItem; }
    public void setmenuItem(String _menuItem) {this.menuItem = _menuItem;}


    public static void listMenu(ArrayList<Menu> mList){
        for (Menu menu: mList){
            System.out.println(menu.getmenuItem());
        }
    }
}
