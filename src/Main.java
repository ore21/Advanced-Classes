public class Main {
    enum PositionTittle {
        Administration("Administration", "A"),
        Production("Production", "P"),
        Sales("Sales", "S"),
        Maintenance("Maintenance", "M"),
        Technical("Technical", "T"),
        Secretarial("Secretarial", "S");

        private final String ShortDir;
        private final String ProperCase;

        PositionTittle(String name, String code) {
            this.ShortDir = code;
            this.ProperCase = name;
        }

        public String getShortDir() {
            return this.ShortDir;
        }
        public String getProperCase() {
            return this.ProperCase;
        }






        public static void main(String[] args) {
            PositionTittle myPos = PositionTittle.Administration;

            System.out.println(myPos.ProperCase);
            System.out.println(myPos.ShortDir);
        }

    }

}
