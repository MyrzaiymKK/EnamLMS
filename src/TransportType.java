public enum TransportType  {
    CAR{
        @Override
        public double calculateTravelCost(double distance) {
            return 0.1 * distance;
        }
    },
    BUS{
        @Override
        public double calculateTravelCost(double distance) {
             double n = 0.5 * distance;
            return n;
        }
    },
    TRUCK{
        @Override
        public double calculateTravelCost(double distance) {
            double n = 0.2 * distance;
            return 0;
        }
    };


    public abstract double calculateTravelCost(double distance);
}
