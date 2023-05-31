import electronics.Laptops;
import electronics.OS;
import electronics.Processors;
import electronics.SmartWatches;
import fashion.mensFashion.Cloths;
import fashion.mensFashion.Shoes;
import fashion.mensFashion.Watches;
import fashion.womensFashion.Footwear;
import fashion.womensFashion.Jewellery;

import javax.annotation.processing.Processor;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static <Cloth> void main(String[] args) {

        Laptops laptops = new Laptops();
        laptops.setBrand("Dell");
        laptops.setPrice(60000);
        laptops.setStorage(8);
        laptops.setOs(OS.LINUX);
        laptops.setProcessor(Processors.CORE);


        SmartWatches smartWatches = new SmartWatches();

        smartWatches.setInternalStorage(4);
        smartWatches.setBrand("boat");
        smartWatches.setOs(OS.ANDROID);
        smartWatches.setTrackingFitnessGoals("you are tracking record reaches 500 kilometers");

        Cloths cloth = new Cloths();
        cloth.setPrice(5000);
        cloth.setClothSize("medium");
        cloth.setClothType("jeens");
        cloth.setBrand("PVH");
        cloth.velvet();


        Shoes s = new Shoes();
        s.setBrand("bata");
        s.setPrice(2000);
        s.setShoesColor("black");
        s.setShoesSize(6);

        Footwear footwear = new Footwear();
        footwear.setPrice(10000);
        footwear.setFootwearType("flat");
        footwear.setColor("red");
        footwear.setFootwearSize(5);
        footwear.setBrand("puma");

        Jewellery jewellery = new Jewellery();
        jewellery.setPrice(100000);
        jewellery.setJewelleryType("gold");
        jewellery.setJewelleryDesign("bridal jewelry");
        jewellery.setBrand("Stone Cutters");


        System.out.println(laptops);
        System.out.println(smartWatches);
        System.out.println(cloth);
        System.out.println(s);
        System.out.println(footwear);
        System.out.println(jewellery);






    }
}