import java.util.*;
import java.time.*;

class Station {

    static int totalStations;
    static String metroAuthority;

    int stationId;
    String stationName;
    String line;

    static {
        metroAuthority = "Pune Metro Rail Corporation Ltd.";
        totalStations = 0;
    }

    {
        totalStations++;
        stationId = totalStations;
    }

    Station() {
        this("Unknown", "Purple Line");
    }

    Station(String stationName, String line) {
        this.stationName = stationName;
        this.line = line;
    }

    void display() {
        System.out.println("  #" + stationId + " | " + stationName + " | " + line);
    }

    static void showAuthority() {
        System.out.println("  Authority      : " + metroAuthority);
        System.out.println("  Total Stations : " + totalStations);
    }

    String getSummary() {
        return String.join(" | ", stationName, line);
    }
}

class MetroCard {

    static int cardCount;
    static double minFare = 10.0;
    static double maxFare = 35.0;

    int cardNumber;
    String holderName;
    double balance;
    boolean isSenior;
    boolean hasDailyPass;

    static {
        cardCount = 1000;
    }

    {
        cardCount++;
        cardNumber = cardCount;
    }

    MetroCard(String holderName) {
        this(holderName, 0, false);
    }

    MetroCard(String holderName, double balance) {
        this(holderName, balance, false);
    }

    MetroCard(String holderName, double balance, boolean isSenior) {
        this.holderName = holderName;
        this.balance = balance;
        this.isSenior = isSenior;
        this.hasDailyPass = false;
    }

    void recharge(double amount) {
        balance += amount;
        System.out.println("  Recharged Rs." + amount + " | Balance: Rs." + balance);
    }

    void buyDailyPass() {
        if (balance >= 100.0) {
            balance -= 100.0;
            hasDailyPass = true;
            System.out.println("  Daily Pass activated! Rs.100 deducted. Balance: Rs." + balance);
        } else {
            System.out.println("  Low balance for Daily Pass. Need Rs.100.");
        }
    }

    boolean deductFare(double calculatedFare) {
        if (hasDailyPass) {
            System.out.println("  Daily Pass Active. Fare: Rs.0");
            return true;
        }

        double finalFare = calculatedFare;
        if (finalFare > maxFare)
            finalFare = maxFare;
        if (finalFare < minFare)
            finalFare = minFare;

        if (isSenior)
            finalFare /= 2;

        if (balance < finalFare) {
            System.out.println("  Low balance. Need Rs." + finalFare + ", Have Rs." + balance);
            return false;
        }
        balance -= finalFare;
        System.out.println("  Rs." + finalFare + " deducted. Balance: Rs." + balance);
        return true;
    }

    void displayCard() {
        System.out.println("  Card No : " + cardNumber);
        System.out.println("  Name    : " + holderName.toUpperCase());
        System.out.println("  Balance : Rs." + balance);
        System.out.println("  Senior  : " + (isSenior ? "Yes" : "No"));
        System.out.println("  DailyPass : " + (hasDailyPass ? "Active" : "Inactive"));
    }

    static void showFares() {
        System.out.println("  Minimum Fare : Rs." + minFare);
        System.out.println("  Maximum Fare : Rs." + maxFare);
        System.out.println("  Senior discount : 50%");
        System.out.println("  Daily Pass    : Rs.100");
    }
}

class Commuter {

    String name;
    MetroCard card;
    List<String> journeyLog;

    Commuter(String name, MetroCard card) {
        this.name = name;
        this.card = card;
        this.journeyLog = new ArrayList<>();
    }

    void travel(Station from, Station to, Station[] allStations) {
        System.out.println("\n  " + name + " : " + from.stationName + " -> " + to.stationName);

        boolean interchange = !from.line.equals(to.line) && !from.line.equals("Both") && !to.line.equals("Both");
        if (interchange) {
            System.out.println("  [Info] Please change metro at interchange station: Civil Court");
        }

        int fromIndex = -1, toIndex = -1;
        for (int i = 0; i < allStations.length; i++) {
            if (allStations[i] == from)
                fromIndex = i;
            if (allStations[i] == to)
                toIndex = i;
        }
        int distance = Math.abs(fromIndex - toIndex);
        double fare = 10.0 + (distance * 2.5); // Approximated real fare calculation

        boolean success = card.deductFare(fare);
        if (success) {
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            journeyLog.add(String.format("%s -> %s (at %s)", from.stationName, to.stationName, time));
        }
    }

    void showHistory() {
        System.out.println("\n  Journey History - " + name);
        if (journeyLog.isEmpty()) {
            System.out.println("  No journeys.");
            return;
        }
        java.util.stream.IntStream.range(0, journeyLog.size())
                .forEach(i -> System.out.println("  " + (i + 1) + ". " + journeyLog.get(i)));
    }
}

class PuneMetroSystem {

    static void printInColumns(List<String> items, int columns) {
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("  %-25s", items.get(i));
            if ((i + 1) % columns == 0) {
                System.out.println();
            }
        }
        if (items.size() % columns != 0) {
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Pune Metro System ===\n");

        Station[] stations = {
                // Purple Line
                new Station("PCMC", "Purple Line"),
                new Station("Sant Tukaram Nagar", "Purple Line"),
                new Station("Bhosari", "Purple Line"),
                new Station("Kasarwadi", "Purple Line"),
                new Station("Phugewadi", "Purple Line"),
                new Station("Dapodi", "Purple Line"),
                new Station("Bopodi", "Purple Line"),
                new Station("Khadki", "Purple Line"),
                new Station("Range Hill", "Purple Line"),
                new Station("Shivaji Nagar", "Purple Line"),
                new Station("Civil Court", "Both"), // Interchange
                new Station("Kasba Peth", "Purple Line"),
                new Station("Mandai", "Purple Line"),
                new Station("Swargate", "Purple Line"),

                // Aqua (Blue) Line
                new Station("Vanaz", "Blue Line"),
                new Station("Anand Nagar", "Blue Line"),
                new Station("Ideal Colony", "Blue Line"),
                new Station("Nal Stop", "Blue Line"),
                new Station("Garware College", "Blue Line"),
                new Station("Deccan Gymkhana", "Blue Line"),
                new Station("Chhatrapati Sambhaji Udyan", "Blue Line"),
                new Station("PMC Bhavan", "Blue Line"),
                new Station("Mangalwar Peth", "Blue Line"),
                new Station("Pune Railway Station", "Blue Line"),
                new Station("Ruby Hall Clinic", "Blue Line"),
                new Station("Bund Garden", "Blue Line"),
                new Station("Yerwada", "Blue Line"),
                new Station("Kalyani Nagar", "Blue Line"),
                new Station("Ramwadi", "Blue Line")
        };

        System.out.println("-- Fare Info --");
        MetroCard.showFares();

        System.out.println("\n-- Register Commuter --");
        System.out.print("  Name            : ");
        String name = sc.nextLine().trim();

        System.out.print("  Senior? (yes/no): ");
        boolean senior = sc.nextLine().trim().equalsIgnoreCase("yes");

        System.out.print("  Recharge amount : ");
        double amount = sc.nextDouble();
        sc.nextLine();

        MetroCard card = new MetroCard(name, amount, senior);

        System.out.print("  Buy Daily Pass (Rs.100)? (yes/no): ");
        boolean buyPass = sc.nextLine().trim().equalsIgnoreCase("yes");
        if (buyPass) {
            card.buyDailyPass();
        }

        System.out.println("\n-- Card Details --");
        card.displayCard();

        Commuter commuter = new Commuter(name, card);

        while (true) {
            System.out.println("\n-- Plan Journey -- (type 'exit' to stop)");

            List<String> purpleOptions = Arrays.stream(stations)
                    .filter(s -> s.line.equals("Purple Line") || s.line.equals("Both"))
                    .map(s -> s.stationName)
                    .collect(java.util.stream.Collectors.toList());

            List<String> blueOptions = Arrays.stream(stations)
                    .filter(s -> s.line.equals("Blue Line") || s.line.equals("Both"))
                    .map(s -> s.stationName)
                    .collect(java.util.stream.Collectors.toList());

            System.out.println("  -- Purple Line Options --");
            printInColumns(purpleOptions, 3);

            System.out.println("\n  -- Blue Line Options --");
            printInColumns(blueOptions, 3);

            System.out.println();
            System.out.print("  From Station : ");
            String fromName = sc.nextLine().trim();
            if (fromName.equalsIgnoreCase("exit"))
                break;

            System.out.print("  To Station   : ");
            String toName = sc.nextLine().trim();
            if (toName.equalsIgnoreCase("exit"))
                break;

            Optional<Station> fromOpt = Arrays.stream(stations)
                    .filter(s -> s.stationName.equalsIgnoreCase(fromName))
                    .findFirst();
            Optional<Station> toOpt = Arrays.stream(stations)
                    .filter(s -> s.stationName.equalsIgnoreCase(toName))
                    .findFirst();

            if (fromOpt.isPresent() && toOpt.isPresent()) {
                commuter.travel(fromOpt.get(), toOpt.get(), stations);
            } else {
                System.out.println("  Invalid station name(s). Please try again.");
            }
        }

        System.out.print("\n  Top-up amount (0 to skip) : ");
        double topup = sc.nextDouble();
        if (topup > 0) {
            card.recharge(topup);
        }

        commuter.showHistory();

        System.out.println("\n-- Final Card --");
        card.displayCard();

        System.out.println("\nThank you for using Pune Metro!");
        sc.close();
    }
}
