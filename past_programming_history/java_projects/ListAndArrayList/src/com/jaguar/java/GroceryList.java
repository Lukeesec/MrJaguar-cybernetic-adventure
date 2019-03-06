package com.jaguar.java;

import java.util.ArrayList;

public class GroceryList {
    /**
     * Made a array list; then made a addGroceryItem method, With the parameter item.
     * <p>
     * Then we made a printGrocerylist method. We then used a for statement to print the items we have in the grocery list,
     * The for loop kept going until I was more then groceryList.size. We then printed What number a specific item is at +1;
     * because arrays start at 0 and humans start at 1.
     * <p>
     * Next we used a modifyGroceryItem override method with 2 parameters currentItem, newItem.
     * Then we used the findItem method and put currentItem as a parameter. If there is a item with the name entered then
     * we used the second modifyGroceryItem method to print out the item modified
     * <p>
     * ----Little confused but trying to explain in like a third person pov..
     *
     * The removeGroceryItem method with one parameter item.
     * We use the findItem method and put our parameter item in it.. If a value is returned then it will use its overloaded
     * method to remove the grocery item
     *
     * Finally we are on the findItem method with the parameter searchItem. This method checks if the index has
     * a given string entered by the user.
     */
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {

        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGrocerylist() {
        System.out.println("You have " + groceryList.size() + " Items in your grocery list ");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    public void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String     searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }


}
