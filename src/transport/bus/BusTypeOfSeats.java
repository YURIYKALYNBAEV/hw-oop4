package transport.bus;

public enum BusTypeOfSeats {
    BUS_TYPE_OF_SEATS1(0, 10) {
//        @Override
//        public String toString() {
//            return "Вместимость: до " + getMaxBound() + " мест";
//        }
    },

    BUS_TYPE_OF_SEATS2(0, 25) {
//        @Override
//        public String toString() {
//            return "Вместимость: до " + getMaxBound() + " мест";
//        }
    },
    BUS_TYPE_OF_SEATS3(40, 50) {
//        @Override
//        public String toString() {
//            return "Вместимость: " + getMinBound() +
//                    "-" + getMaxBound() + " мест";
//        }
    },
    BUS_TYPE_OF_SEATS4(60, 80) {
//        @Override
//        public String toString() {
//            return "Вместимость: " + getMinBound() +
//                    "-" + getMaxBound() + " мест";
//        }
    },
    BUS_TYPE_OF_SEATS5(100, 120) {
//        @Override
//        public String toString() {
//            return "Вместимость: " + getMinBound() +
//                    "-" + getMaxBound() + " мест";
//        }
    };

    private Integer minBound;
    private Integer maxBound;

    BusTypeOfSeats(Integer minBound, Integer maxBound) {
        setMinBound(minBound);
        setMaxBound(maxBound);
    }

    public Integer getMinBound() {
        return minBound;
    }

    public void setMinBound(Integer minBound) {
        this.minBound = minBound;
    }

    public Integer getMaxBound() {
        return maxBound;
    }

    public void setMaxBound(Integer maxBound) {
        this.maxBound = maxBound;
    }

    @Override
    public String toString() {
        String result = null;
        if (getMinBound() == 0 && getMaxBound() != 0) {
            result = "Вместимость: до " +
                    getMaxBound() + " мест";
        } else if (getMinBound() != 0 && getMaxBound() != 0) {
            result = "Вместимость: " + getMinBound() +
                    "-" + getMaxBound() + " мест";
        }
        return result;
    }
}
