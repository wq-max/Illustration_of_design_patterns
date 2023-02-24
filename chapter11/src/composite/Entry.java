package composite;

public abstract class Entry {
    protected Entry parent;
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatMentException {
        throw new FileTreatMentException();
    }

    public String getPath() {
        StringBuilder stringBuilder = new StringBuilder();
        Entry entry = this;
        do {
            stringBuilder.insert(0, "/" + entry.getName());
            entry = entry.parent;
        } while (entry != null);
        return stringBuilder.toString();
    }


    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ") ";
    }
}
