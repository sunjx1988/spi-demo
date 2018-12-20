package sunjx;

import java.util.ServiceLoader;


/**
 * @Auther: sunjx
 * @Date: 2018/12/20 0020 16:35
 * @Description:
 */
public class Run {

    public static void main(String[] args) {
        ServiceLoader<Animal> animalServiceLoader = ServiceLoader.load(Animal.class);
        if(animalServiceLoader == null || !animalServiceLoader.iterator().hasNext()){
            System.out.println("Not Found Animal Service !!");
        }else{
            for (Animal animal: animalServiceLoader){
                System.out.println("Found Animal Service Name => " + animal.getName());
            }
        }
    }
}
