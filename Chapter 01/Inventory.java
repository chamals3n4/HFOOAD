import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec){
        Guitar guitar = new Guitar(serialNumber,price,spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator i = guitars.iterator();i.hasNext();){
            Guitar guitar = (Guitar)i.next();
            if(guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

//    public List search(GuitarSpec searchSpec) {
//        List matchingGuitars = new LinkedList();
//        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
//            Guitar guitar = (Guitar)i.next();
//            GuitarSpec guitarSpec = guitar.getSpec();
//            // ignore serial number since that's unique
//            // ignore price since that's unique
//            Builder builder = searchSpec.getBuilder();
//            if ((builder != null) && (!builder.equals("")) &&
//                    (!builder.equals(guitarSpec.getBuilder())))
//                continue;
//            String model = searchSpec.getModel().toLowerCase();
//            if ((model != null) && (!model.equals("")) &&
//                    (!model.equals(guitarSpec.getModel().toLowerCase())))
//                continue;
//            Type type = searchSpec.getType();
//            if ((type != null) && (!searchSpec.equals("")) &&
//                    (!type.equals(guitarSpec.getType())))
//                continue;
//            Wood backWood = searchSpec.getBackWood();
//            if ((backWood != null) && (!backWood.equals("")) &&
//                    (!backWood.equals(guitarSpec.getBackWood())))
//                continue;
//            Wood topWood = searchSpec.getTopWood();
//            if ((topWood != null) && (!topWood.equals("")) &&
//                    (!topWood.equals(guitarSpec.getTopWood())))
//                continue;
//            matchingGuitars.add(guitar);
//        }
//        return matchingGuitars;
//    }

    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            if(guitar.getSpec().matches(searchSpec))
                 matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

}

