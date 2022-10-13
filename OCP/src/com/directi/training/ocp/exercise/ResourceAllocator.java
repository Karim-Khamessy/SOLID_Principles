
public class ResourceAllocator {
    public int allocate(Resource resource) {
        int resourceId = resource.findSlotFree();
        resource.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(Resource resource, int resourceId) {
        resource.markSlotFree(resourceId);
    }
}