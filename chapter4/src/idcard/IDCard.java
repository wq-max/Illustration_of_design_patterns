package idcard;

import framework.Product;

import java.util.Random;


public class IDCard extends Product {
    private String owner;
    private Integer ID;
    IDCard(String owner) {
        this.owner = owner;
        this.ID = new Random().nextInt(999999);
        System.out.println(" 制作 " + owner + " 的ID卡。" + " ID：" + ID);
    }
    @Override
    public void use() {
        System.out.println(" 使用 " + owner + " 的ID卡。" + " ID：" + ID);
    }

    public String getOwner() {
        return owner;
    }

    public Integer getID() {
        return ID;
    }
}
