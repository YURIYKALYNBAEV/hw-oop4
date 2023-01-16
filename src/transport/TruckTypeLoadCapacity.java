package transport;

public enum TruckTypeLoadCapacity {
    CAPACITY_TYPE1(0, 3.5f),
    CAPACITY_TYPE2(3.5f,12),
    CAPACITY_TYPE3(12,0);

    private float minBound;
    private float maxBound;

    TruckTypeLoadCapacity(float minBound, float maxBound) {
        setMinBound(minBound);
        setMaxBound(maxBound);
    }

    public float getMinBound() {
        return minBound;
    }

    public void setMinBound(float minBound) {
        this.minBound = minBound;
    }

    public float getMaxBound() {
        return maxBound;
    }

    public void setMaxBound(float maxBound) {
        this.maxBound = maxBound;
    }

    @Override
    public String toString() {
        String result = null;
        if (minBound == 0 && maxBound != 0) {
            result =  "Грузоподъемность: до " +
                    maxBound + " тонн";
        } else if (minBound != 0 && maxBound != 0) {
            result =   "Грузоподъемность: от " +
                    minBound + " тонн до " +
                    maxBound + " тонн";
        } else if (minBound != 0 && maxBound == 0) {
            result =   "Грузоподъемность: свыше " +
                    minBound + " тонн";
        }
        return result;
    }
}
