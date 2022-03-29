package lesson1;

import java.util.ArrayList;

public class Box<E> extends ArrayList<E> {
   Apple a = new Apple();
   Orange o = new Orange();

    public float getWeight(Box<E> box){
        int count = box.size();
        float weight = 0;
        if (box.size() == 0) {
            return weight;
        }
        else if (box.get(0) instanceof Apple) {
            weight = count * 1.0f;
        } else if (box.get(0) instanceof Orange){
            weight = count * 1.5f;
        }
        return weight;
    }

    public boolean compare(Box box) {
        if (this.getWeight(this) == box.getWeight(box)){
            return true;
        }
        return false;
    }

    public void doEmpty(Box<E> box) {
        for (int i = 0; i < this.size(); i++) {
            box.add(this.get(i));
        }

        this.removeAll(this);
    }
}
