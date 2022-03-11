package Iterator;

import java.util.Arrays;

public class CollectionofNames implements Container {

   // public String Student;
    public Person[] array;

    public CollectionofNames(Person[] array){
        this.array = array;
    }


    @Override
    public Iterator getIterator() {
        return new CollectionofNamesIterate() ;
    }

    private class CollectionofNamesIterate implements Iterator{
        int i;
        @Override
        public boolean hasNext() {
            if (i<name.length){
                return true;
            }
            return false;
        }
        @Override
        public Object next() {
            if(this.hasNext()){
                return name[i++];
            }
            return null;
        }
    }
}

