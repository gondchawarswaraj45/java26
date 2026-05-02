// WRONG
switch (ch) {
    case 'a':
        System.out.println("A");
        break;

    case 97:   // ❌ duplicate (ASCII of 'a')
        System.out.println("ASCII");
        break;
}
