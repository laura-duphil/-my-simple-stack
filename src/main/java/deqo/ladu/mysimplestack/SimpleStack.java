package deqo.ladu.mysimplestack;

import java.io.IOException;
import java.util.EmptyStackException;
import java.util.ArrayList;
import java.util.List;

public class SimpleStack implements ISimpleStack{
    private List<Item> stack;
    public SimpleStack(){
        this.stack=new ArrayList<>();
    }

    @Override
    public boolean isEmpty(){
        return this.stack.isEmpty();
    }

    @Override
    public int getSize(){
        return this.stack.size();
    }

    @Override
    public void push(Item item) {
        this.stack.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException { //renvoie le premier element
        Item it = new Item("-1");
        try {
            it= this.stack.get(0);
        } catch (Exception exception) {
            System.out.println ("ERROR, la pile est vide donc on ne peut pas PEEK");
        }
        return it;
    }

    @Override
    public Item pop() throws EmptyStackException {
        Item it = new Item("-1");
        try {
            it= this.stack.remove(0);
        } catch (Exception exception) {
            System.out.println ("ERROR, la pile est vide donc on ne peut pas POP");
        }
        return it;
    }
}
