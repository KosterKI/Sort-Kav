public class Sort {
    Items[] item;
    public static void ItemsSort(Items[] items, String field, String sortOrder) {
        quickSort(items, 0, items.length - 1, field, sortOrder);
    }

    public static void quickSort(Items[] items, int low, int high, String field, String sortOrder) {
        if (low < high) {
            int partitionIndex = partition(items, low, high, field, sortOrder);
            quickSort(items, low, partitionIndex - 1, field, sortOrder);
            quickSort(items, partitionIndex + 1, high, field, sortOrder);
        }
    }

    public static int partition(Items[] items, int low, int high, String field, String sortOrder) {
        Items pivot = items[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compareItems(items[j], pivot, field, sortOrder) <= 0) {
                i++;
                Items temp = items[i];
                items[i] = items[j];
                items[j] = temp;
            }
        }

        Items temp = items[i + 1];
        items[i + 1] = items[high];
        items[high] = temp;

        return i + 1;
    }
    public static int compareItems(Items item1, Items item2, String field, String sortOrder) {
        if (field.equals("price")) {
            if (sortOrder.equals("asc")) {
                return Integer.compare(item1.getPrice(), item2.getPrice());
            } else {
                return Integer.compare(item2.getPrice(), item1.getPrice());
            }
        } else if (field.equals("name")) {
            if (sortOrder.equals("asc")) {
                return item1.getName().compareTo(item2.getName());
            } else {
                return item2.getName().compareTo(item1.getName());
            }
        }
        return 0;
    }

    public static void printItems(Items[] items) {
        for (Items item : items) {
            System.out.println(item.getName() + ": " + item.getPrice());
        }
        System.out.println();
    }
}



