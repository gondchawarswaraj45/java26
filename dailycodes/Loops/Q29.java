int choice = 4;

switch (choice) {
    case 1:
        System.out.println("6 trophies");
        break;

    case 'a':
        System.out.println("5 trophies");
        break;

    case "RCB":   // ❌ ERROR
        System.out.println("only 1");
        break;

    default:
        System.out.println("wrong");
}
