package idcard;

import framework.Factory;
import framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    private Map map = new HashMap();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
        map.put(((IDCard)product).getOwner(), ((IDCard)product).getID());
    }

    public List getOwners() {
        return owners;
    }

    public Map getMap() {
        return map;
    }
}
