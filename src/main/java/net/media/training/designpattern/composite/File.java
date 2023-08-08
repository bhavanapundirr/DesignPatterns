package net.media.training.designpattern.composite;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:04 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class File implements FileSystemComponent{
    private final String name;
    private int size;
    private Directory parent;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }
    public Directory getParent(){
        return parent;
    }

    @Override
    public void delete() {

    }


    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    public boolean exists(String name) {
        return this.name.equals(name);
    }
}
