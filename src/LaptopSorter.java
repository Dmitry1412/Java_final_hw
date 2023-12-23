import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LaptopSorter {
    public static Set<Laptop> sortRAM(Set<Laptop> list) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> uniqValues = new HashSet<>();
        Set<Laptop> result = new HashSet<>();
        System.out.println("введите критерий поиска по ОЗУ (например: <8 или >2 или =4)");
        for (Laptop laptop : list) {
            uniqValues.add(laptop.ram);
        }
        System.out.println("возможные варианты: " + uniqValues.toString());
        System.out.println(">>> ");
        String userString = scanner.next();
        int tmp = Integer.parseInt(String.valueOf(userString.charAt(1)));
        switch (userString.charAt(0)) {
            case (char) '<':
                for (Laptop laptop : list) {
                    if (laptop.ram < tmp) {
                        result.add(laptop);
                    }
                }
                System.out.println("case < отработал ram!");
                break;
            case (char) '>':
                for (Laptop laptop : list) {
                    if (laptop.ram > tmp) {
                        result.add(laptop);
                    }
                }
                System.out.println("case > отработал ram!");
                break;
            case (char) '=':
                for (Laptop laptop : list) {
                    if (laptop.ram == tmp) {
                        result.add(laptop);
                    }
                }
                System.out.println("case = отработал ram!");
                break;
        }
        return result;
    }

    public static Set<Laptop> sortHDD(Set<Laptop> list) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> uniqValues = new HashSet<>();
        Set<Laptop> result = new HashSet<>();
        System.out.println("введите критерий поиска по объему HDD (например: <1024 или >256 или =512");
        for (Laptop laptop : list) {
            uniqValues.add(laptop.hdd);
        }
        System.out.println("возможные варианты: " + uniqValues.toString());
        System.out.println(">>> ");
        String userString = scanner.next();
        int tmp = Integer.parseInt(String.valueOf(userString.charAt(1)));
        switch (userString.charAt(0)) {
            case (char) '<':
                for (Laptop laptop : list) {
                    if (laptop.hdd < tmp) {
                        result.add(laptop);
                    }
                }
                System.out.println("case < отработал!");
                break;
            case (char) '>':
                for (Laptop laptop : list) {
                    if (laptop.hdd > tmp) {
                        result.add(laptop);
                    }
                }
                System.out.println("case > отработал!");
                break;
            case (char) '=':
                for (Laptop laptop : list) {
                    if (laptop.hdd == tmp) {
                        result.add(laptop);
                    }
                }
                System.out.println("case = отработал!");
                break;
        }
        return result;
    }

    public static Set<Laptop> sortOS(Set<Laptop> list) {
        Scanner scanner = new Scanner(System.in);
        Set<String> uniqValues = new HashSet<>();
        Set<Laptop> result = new HashSet<>();
        System.out.println("введите операционную систему: ");
        for (Laptop laptop : list) {
            uniqValues.add(laptop.operationSystem);
        }
        System.out.println("возможные варианты: " + uniqValues.toString());
        System.out.println(">>> ");
        String userString = scanner.next();
        for (Laptop laptop : list) {
            if (laptop.operationSystem.equals(userString)) {
                list.add(laptop);
            }
        }
        return result;
    }

    public static Set<Laptop> sortColor(Set<Laptop> list) {
        Scanner scanner = new Scanner(System.in);
        Set<String> uniqValues = new HashSet<>();
        Set<Laptop> result = new HashSet<>();
        System.out.println("введите цвет: ");
        for (Laptop laptop : list) {
            uniqValues.add(laptop.color);
        }
        System.out.println("возможные варианты: " + uniqValues.toString());
        System.out.println(">>> ");
        String userString = scanner.next();
        for (Laptop laptop : list) {
            if (laptop.color.equals(userString)) {
                list.add(laptop);
            }
        }
        return result;
    }
}
