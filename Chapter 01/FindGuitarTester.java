import java.util.List;
import java.util.Iterator;

public class FindGuitarTester {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec("Stratocastor",Builder.FENDER,
                Type.ELECTRIC,Wood.ALDER,Wood.ALDER,6);

        //Guitar guitar = inventory.search(whatErinLikes);
        List matchingGuitars = inventory.search(whatErinLikes);

        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println("  We have a " +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + " guitar:\n     " +
                        spec.getBackWood() + " back and sides,\n     " +
                        spec.getTopWood() + " top.\n  You can have it for only $" +
                        guitar.getPrice() + "!\n  ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }


    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("11277", 3999.95,
                new GuitarSpec("CJ",Builder.COLLINGS, Type.ACOUSTIC,
                        Wood.BRAZILIAN_ROSEWOOD, Wood.SITKA,12));
        inventory.addGuitar("V9512", 1549.95,
                new GuitarSpec("Stratocastor", Builder.FENDER,  Type.ELECTRIC,
                        Wood.ALDER, Wood.ALDER,6));
        inventory.addGuitar("V95693", 1499.95,
                new GuitarSpec("Stratocastor", Builder.FENDER,  Type.ELECTRIC,
                        Wood.ALDER, Wood.ALDER,6));
        inventory.addGuitar("122784", 5495.95,
                new GuitarSpec("D-18", Builder.MARTIN,  Type.ACOUSTIC,
                        Wood.MAHOGANY, Wood.ADIRONDACK,10));
        inventory.addGuitar("76531", 6295.95,
                new GuitarSpec("OM-28",Builder.MARTIN,  Type.ACOUSTIC,
                        Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK,12));
        inventory.addGuitar("70108276", 2295.95,
                new GuitarSpec("Les Paul",Builder.GIBSON,  Type.ELECTRIC,
                        Wood.MAHOGANY, Wood.MAPLE,8));
        inventory.addGuitar("82765501", 1890.95,
                new GuitarSpec("SG '61 Reissue", Builder.GIBSON,
                        Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY,9));
        inventory.addGuitar("77023", 6275.95,
                new GuitarSpec("D-28",Builder.MARTIN,  Type.ACOUSTIC,
                        Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK,12));
        inventory.addGuitar("1092", 12995.95,
                new GuitarSpec("SJ",Builder.OLSON, Type.ACOUSTIC,
                        Wood.BRAZILIAN_ROSEWOOD, Wood.CEDAR,12));
        inventory.addGuitar("566-62", 8999.95,
                new GuitarSpec("Cathedral",Builder.RYAN,  Type.ACOUSTIC,
                        Wood.COCOBOLO, Wood.CEDAR,12));
        inventory.addGuitar("6 29584", 2100.95,
                new GuitarSpec("Dave Navarro Signature", Builder.PRS,
                        Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE,12));
    }
}

