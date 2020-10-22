package deqo.ladu.mysimplestack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SimpleStackTest {
    SimpleStack stack;

    @Test
    public void PileVide(){
        stack=new SimpleStack();
        assertEquals("La pile est vide", true, stack.isEmpty()); //verif que la pile est vid
    }

    @Test
    public void AjouteraPile(){
        stack = new SimpleStack();
        Item v = new Item ("toto");
        stack.push(v);
        assertEquals("La pile créé est non vide : ajout d'un item", false, stack.isEmpty());

    }
    @Test
    public void PlusieursAjouts(){
        stack = new SimpleStack();
        Item v = new Item ("toto");
        stack.push(v);
        Item v2 = new Item ("tata");
        stack.push(v2);
        Item v3 = new Item ("titi");
        stack.push(v3);
        assertEquals("Ajout de 3 items dans la pile",false, stack.isEmpty());
    }

    @Test
    public void taillePileNonVide(){
        stack=new SimpleStack();
        Item v=new Item("tot");
        stack.push(v);
        assertEquals("Pile de taille 1", 1, stack.getSize());
    }
    @Test
    public void taillePileVide(){
        stack=new SimpleStack();
        assertEquals("Pile de taille 0", 0, stack.getSize());
    }

    @Test
    public void EnleveraPile(){
        stack = new SimpleStack();
        Item v = new Item("toto");
        stack.push(v);
        Item v2;
        v2 = stack.pop();
        assertEquals("La pile devient vide après l'enlevement de"+v2, true, stack.isEmpty());
    }

    @Test
    public void EnlPileVide(){
        stack = new SimpleStack();
        Item v = new Item("toto");
        v = stack.pop();
        assertEquals("La pile était déjà vide ! "+v, true, stack.isEmpty());
    }

    @Test
    public void testPeekPile(){ //premier element
        stack = new SimpleStack();
        Item val = new Item("1elem");
        stack.push(val);
        Item val2 = new Item("2elem");
        stack.push(val2);
        assertEquals("Le premier element est ! "+val, val, stack.peek());
    }

    @Test
    public void testPileVidePremierElException() throws EmptyStackException {
        stack = new SimpleStack();
        Item v = new Item("toto");
        stack.push(v);
        Item v2;
        v2 = stack.pop();
        assertTrue("Pile vide : on a pas de 1er el",stack.isEmpty());
        Item valRetour = stack.peek();
    }


}

