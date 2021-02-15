public class Resize2X extends Resizer {
    @Override
    public int getNewSize(int size) {
        return size * 2;
    }
}
