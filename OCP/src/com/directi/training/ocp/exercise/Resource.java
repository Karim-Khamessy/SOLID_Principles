
public interface Resource {
    int findSlotFree();

    void markSlotBusy(int resourceId);

    void markSlotFree(int resourceId);
}