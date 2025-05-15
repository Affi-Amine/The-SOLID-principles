package com.directi.training.ocp.exercise;

import java.util.HashMap;
import java.util.Map;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;
    private final Map<String, Resource> resourceMap = new HashMap<>();

    public ResourceAllocator() {
        resourceMap.put("TIME_SLOT", new TimeSlotResource());
        resourceMap.put("SPACE_SLOT", new SpaceSlotResource());
    }

    public int allocate(String resourceType) {
        Resource resource = resourceMap.get(resourceType);
        if (resource == null) {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            return INVALID_RESOURCE_ID;
        }
        return resource.allocate();
    }

    public void free(String resourceType, int resourceId) {
        Resource resource = resourceMap.get(resourceType);
        if (resource == null) {
            System.out.println("ERROR: attempted to free invalid resource");
            return;
        }
        resource.free(resourceId);
    }
}
